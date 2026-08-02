package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import xsna.jjt;
import xsna.vua0;

/* loaded from: classes12.dex */
public abstract class JsonGenerator implements Closeable, Flushable {

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true);

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

        public final boolean i(int i) {
            return (i & this._mask) != 0;
        }

        public final int j() {
            return this._mask;
        }
    }

    static {
        vua0.h(StreamWriteCapability.values());
        StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS.h();
        StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY.h();
    }

    public static void i(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, null, null);
    }

    public abstract void A(String str) throws IOException;

    public abstract void E(char[] cArr, int i, int i2) throws IOException;

    public final void b(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken N = jsonParser.N();
            if (N == null) {
                return;
            }
            switch (N._id) {
                case 1:
                    z();
                    break;
                case 2:
                    n();
                    i--;
                    if (i == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 3:
                    y();
                    break;
                case 4:
                    m();
                    i--;
                    if (i == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 5:
                    o(jsonParser.q());
                    continue;
                case 6:
                    if (jsonParser.L()) {
                        E(jsonParser.H(), jsonParser.J(), jsonParser.I());
                    } else {
                        A(jsonParser.E());
                        continue;
                    }
                case 7:
                    h(jsonParser);
                    continue;
                case 8:
                    c(jsonParser);
                    continue;
                case 9:
                    k(true);
                    continue;
                case 10:
                    k(false);
                    continue;
                case 11:
                    p();
                    continue;
                case 12:
                    x();
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + N);
            }
            i++;
        }
    }

    public final void c(JsonParser jsonParser) throws IOException {
        JsonParser.NumberType z = jsonParser.z();
        if (z == JsonParser.NumberType.BIG_DECIMAL) {
            v(jsonParser.t());
        } else if (z == JsonParser.NumberType.FLOAT) {
            r(jsonParser.w());
        } else {
            q(jsonParser.v());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public final void h(JsonParser jsonParser) throws IOException {
        JsonParser.NumberType z = jsonParser.z();
        if (z == JsonParser.NumberType.INT) {
            s(jsonParser.x());
        } else if (z == JsonParser.NumberType.LONG) {
            t(jsonParser.y());
        } else {
            w(jsonParser.o());
        }
    }

    public final void j(JsonParser jsonParser) throws IOException {
        JsonToken m = jsonParser.m();
        int i = m == null ? -1 : m._id;
        if (i == 5) {
            o(jsonParser.q());
            JsonToken N = jsonParser.N();
            i = N == null ? -1 : N._id;
        }
        if (i == 1) {
            z();
            b(jsonParser);
            return;
        }
        if (i == 3) {
            y();
            b(jsonParser);
            return;
        }
        JsonToken m2 = jsonParser.m();
        switch (m2 != null ? m2._id : -1) {
            case -1:
                i("No current event to copy");
                throw null;
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + m2);
            case 1:
                z();
                return;
            case 2:
                n();
                return;
            case 3:
                y();
                return;
            case 4:
                m();
                return;
            case 5:
                o(jsonParser.q());
                return;
            case 6:
                if (jsonParser.L()) {
                    E(jsonParser.H(), jsonParser.J(), jsonParser.I());
                    return;
                } else {
                    A(jsonParser.E());
                    return;
                }
            case 7:
                h(jsonParser);
                return;
            case 8:
                c(jsonParser);
                return;
            case 9:
                k(true);
                return;
            case 10:
                k(false);
                return;
            case 11:
                p();
                return;
            case 12:
                ((jjt) this).p();
                return;
        }
    }

    public abstract void k(boolean z) throws IOException;

    public abstract void m() throws IOException;

    public abstract void n() throws IOException;

    public abstract void o(String str) throws IOException;

    public abstract void p() throws IOException;

    public abstract void q(double d) throws IOException;

    public abstract void r(float f) throws IOException;

    public abstract void s(int i) throws IOException;

    public abstract void t(long j) throws IOException;

    public abstract void v(BigDecimal bigDecimal) throws IOException;

    public abstract void w(BigInteger bigInteger) throws IOException;

    public abstract void x() throws IOException;

    public abstract void y() throws IOException;

    public abstract void z() throws IOException;
}
