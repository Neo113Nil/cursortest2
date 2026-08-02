package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import xsna.qj90;
import xsna.vua0;

/* loaded from: classes12.dex */
public abstract class JsonParser implements Closeable {
    public int b = JsonFactory.e;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true),
        USE_FAST_DOUBLE_PARSER(false),
        USE_FAST_BIG_NUMBER_PARSER(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int h() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature._defaultState) {
                    i |= feature._mask;
                }
            }
            return i;
        }

        public final boolean i() {
            return this._defaultState;
        }

        public final boolean j(int i) {
            return (i & this._mask) != 0;
        }

        public final int k() {
            return this._mask;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NumberType {
        private static final /* synthetic */ NumberType[] $VALUES;
        public static final NumberType BIG_DECIMAL;
        public static final NumberType BIG_INTEGER;
        public static final NumberType DOUBLE;
        public static final NumberType FLOAT;
        public static final NumberType INT;
        public static final NumberType LONG;

        static {
            NumberType numberType = new NumberType("INT", 0);
            INT = numberType;
            NumberType numberType2 = new NumberType("LONG", 1);
            LONG = numberType2;
            NumberType numberType3 = new NumberType("BIG_INTEGER", 2);
            BIG_INTEGER = numberType3;
            NumberType numberType4 = new NumberType("FLOAT", 3);
            FLOAT = numberType4;
            NumberType numberType5 = new NumberType("DOUBLE", 4);
            DOUBLE = numberType5;
            NumberType numberType6 = new NumberType("BIG_DECIMAL", 5);
            BIG_DECIMAL = numberType6;
            $VALUES = new NumberType[]{numberType, numberType2, numberType3, numberType4, numberType5, numberType6};
        }

        public NumberType() {
            throw null;
        }

        public static NumberType valueOf(String str) {
            return (NumberType) Enum.valueOf(NumberType.class, str);
        }

        public static NumberType[] values() {
            return (NumberType[]) $VALUES.clone();
        }
    }

    static {
        vua0.h(StreamReadCapability.values());
    }

    public abstract Number A() throws IOException;

    public abstract String E() throws IOException;

    public abstract char[] H() throws IOException;

    public abstract int I() throws IOException;

    public abstract int J() throws IOException;

    public abstract boolean L();

    public abstract JsonToken N() throws IOException;

    public abstract qj90 O() throws IOException;

    public final JsonParseException b(String str) {
        JsonParseException jsonParseException = new JsonParseException(this, str);
        jsonParseException.d();
        return jsonParseException;
    }

    public JsonToken m() {
        return r();
    }

    public int n() {
        return s();
    }

    public abstract BigInteger o() throws IOException;

    public abstract JsonLocation p();

    public abstract String q() throws IOException;

    public abstract JsonToken r();

    @Deprecated
    public abstract int s();

    public abstract BigDecimal t() throws IOException;

    public abstract double v() throws IOException;

    public abstract float w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract NumberType z() throws IOException;
}
