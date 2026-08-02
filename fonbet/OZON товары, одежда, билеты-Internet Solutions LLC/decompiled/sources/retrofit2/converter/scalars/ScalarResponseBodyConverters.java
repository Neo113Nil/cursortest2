package retrofit2.converter.scalars;

import We.M;
import java.io.IOException;
import retrofit2.Converter;

/* loaded from: classes10.dex */
final class ScalarResponseBodyConverters {

    static final class BooleanResponseBodyConverter implements Converter<M, Boolean> {
        static final BooleanResponseBodyConverter INSTANCE = new BooleanResponseBodyConverter();

        BooleanResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Boolean convert(M m11) throws IOException {
            return Boolean.valueOf(m11.string());
        }
    }

    static final class ByteResponseBodyConverter implements Converter<M, Byte> {
        static final ByteResponseBodyConverter INSTANCE = new ByteResponseBodyConverter();

        ByteResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Byte convert(M m11) throws IOException {
            return Byte.valueOf(m11.string());
        }
    }

    static final class CharacterResponseBodyConverter implements Converter<M, Character> {
        static final CharacterResponseBodyConverter INSTANCE = new CharacterResponseBodyConverter();

        CharacterResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Character convert(M m11) throws IOException {
            String string = m11.string();
            if (string.length() == 1) {
                return Character.valueOf(string.charAt(0));
            }
            throw new IOException("Expected body of length 1 for Character conversion but was " + string.length());
        }
    }

    static final class DoubleResponseBodyConverter implements Converter<M, Double> {
        static final DoubleResponseBodyConverter INSTANCE = new DoubleResponseBodyConverter();

        DoubleResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Double convert(M m11) throws IOException {
            return Double.valueOf(m11.string());
        }
    }

    static final class FloatResponseBodyConverter implements Converter<M, Float> {
        static final FloatResponseBodyConverter INSTANCE = new FloatResponseBodyConverter();

        FloatResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Float convert(M m11) throws IOException {
            return Float.valueOf(m11.string());
        }
    }

    static final class IntegerResponseBodyConverter implements Converter<M, Integer> {
        static final IntegerResponseBodyConverter INSTANCE = new IntegerResponseBodyConverter();

        IntegerResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Integer convert(M m11) throws IOException {
            return Integer.valueOf(m11.string());
        }
    }

    static final class LongResponseBodyConverter implements Converter<M, Long> {
        static final LongResponseBodyConverter INSTANCE = new LongResponseBodyConverter();

        LongResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Long convert(M m11) throws IOException {
            return Long.valueOf(m11.string());
        }
    }

    static final class ShortResponseBodyConverter implements Converter<M, Short> {
        static final ShortResponseBodyConverter INSTANCE = new ShortResponseBodyConverter();

        ShortResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Short convert(M m11) throws IOException {
            return Short.valueOf(m11.string());
        }
    }

    static final class StringResponseBodyConverter implements Converter<M, String> {
        static final StringResponseBodyConverter INSTANCE = new StringResponseBodyConverter();

        StringResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public String convert(M m11) throws IOException {
            return m11.string();
        }
    }

    private ScalarResponseBodyConverters() {
    }
}
