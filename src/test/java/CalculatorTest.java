import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CalculatorTest {

    @Test
    void add_numbersGetAdded() {
        // given
        Calculator calculator = new Calculator();
        int first = -1;
        int second = 123;

        // when
        int sum = calculator.add(first, second);

        // then
        assertThat(sum, is(equalTo(122)));
    }
}