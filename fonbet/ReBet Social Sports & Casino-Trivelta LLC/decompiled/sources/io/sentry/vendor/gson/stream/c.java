package io.sentry.vendor.gson.stream;

import com.facebook.hermes.intl.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class c implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final String[] REPLACEMENT_CHARS = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public final Writer f52855a;

    /* renamed from: c, reason: collision with root package name */
    public String f52857c;

    /* renamed from: d, reason: collision with root package name */
    public String f52858d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52859e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52860f;

    /* renamed from: g, reason: collision with root package name */
    public String f52861g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52862h;
    private int[] stack = new int[8];

    /* renamed from: b, reason: collision with root package name */
    public int f52856b = 0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            REPLACEMENT_CHARS[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        Y1(6);
        this.f52858d = ":";
        this.f52862h = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f52855a = writer;
    }

    public c A0(String str) {
        if (str == null) {
            return n1();
        }
        i2();
        k();
        this.f52855a.append((CharSequence) str);
        return this;
    }

    public c B() {
        i2();
        return y1(3, '{');
    }

    public c D0(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f52861g != null) {
            throw new IllegalStateException();
        }
        if (this.f52856b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f52861g = str;
        return this;
    }

    public final c J(int i10, int i11, char c10) {
        int T12 = T1();
        if (T12 != i11 && T12 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f52861g != null) {
            throw new IllegalStateException("Dangling name: " + this.f52861g);
        }
        this.f52856b--;
        if (T12 == i11) {
            m1();
        }
        this.f52855a.write(c10);
        return this;
    }

    public final int T1() {
        int i10 = this.f52856b;
        if (i10 != 0) {
            return this.stack[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c U() {
        return J(1, 2, ']');
    }

    public final void Y1(int i10) {
        int i11 = this.f52856b;
        int[] iArr = this.stack;
        if (i11 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.stack;
        int i12 = this.f52856b;
        this.f52856b = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void Z1(int i10) {
        this.stack[this.f52856b - 1] = i10;
    }

    public final void a2(String str) {
        if (str == null || str.length() == 0) {
            this.f52857c = null;
            this.f52858d = ":";
        } else {
            this.f52857c = str;
            this.f52858d = ": ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b2(String str) {
        int i10;
        String str2;
        String[] strArr = this.f52860f ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.f52855a.write(34);
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i10 = str2 == null ? i10 + 1 : 0;
                if (i11 < i10) {
                    this.f52855a.write(str, i11, i10 - i11);
                }
                this.f52855a.write(str2);
                i11 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                }
                this.f52855a.write(str2);
                i11 = i10 + 1;
            }
        }
        if (i11 < length) {
            this.f52855a.write(str, i11, length - i11);
        }
        this.f52855a.write(34);
    }

    public c c2(double d10) {
        i2();
        if (this.f52859e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            k();
            this.f52855a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52855a.close();
        int i10 = this.f52856b;
        if (i10 > 1 || (i10 == 1 && this.stack[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f52856b = 0;
    }

    public final void d() {
        int T12 = T1();
        if (T12 == 5) {
            this.f52855a.write(44);
        } else if (T12 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m1();
        Z1(4);
    }

    public c d2(long j10) {
        i2();
        k();
        this.f52855a.write(Long.toString(j10));
        return this;
    }

    public c e2(Boolean bool) {
        if (bool == null) {
            return n1();
        }
        i2();
        k();
        this.f52855a.write(bool.booleanValue() ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public c f2(Number number) {
        if (number == null) {
            return n1();
        }
        i2();
        String obj = number.toString();
        if (this.f52859e || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            k();
            this.f52855a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f52856b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f52855a.flush();
    }

    public c g2(String str) {
        if (str == null) {
            return n1();
        }
        i2();
        k();
        b2(str);
        return this;
    }

    public c h2(boolean z10) {
        i2();
        k();
        this.f52855a.write(z10 ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public final void i2() {
        if (this.f52861g != null) {
            d();
            b2(this.f52861g);
            this.f52861g = null;
        }
    }

    public final void k() {
        int T12 = T1();
        if (T12 == 1) {
            Z1(2);
            m1();
            return;
        }
        if (T12 == 2) {
            this.f52855a.append(',');
            m1();
        } else {
            if (T12 == 4) {
                this.f52855a.append((CharSequence) this.f52858d);
                Z1(5);
                return;
            }
            if (T12 != 6) {
                if (T12 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f52859e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            Z1(7);
        }
    }

    public final void m1() {
        if (this.f52857c == null) {
            return;
        }
        this.f52855a.write(10);
        int i10 = this.f52856b;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f52855a.write(this.f52857c);
        }
    }

    public c n1() {
        if (this.f52861g != null) {
            if (!this.f52862h) {
                this.f52861g = null;
                return this;
            }
            i2();
        }
        k();
        this.f52855a.write("null");
        return this;
    }

    public final void q(boolean z10) {
        this.f52859e = z10;
    }

    public c r() {
        i2();
        return y1(1, '[');
    }

    public c w0() {
        return J(3, 5, '}');
    }

    public final c y1(int i10, char c10) {
        k();
        Y1(i10);
        this.f52855a.write(c10);
        return this;
    }

    public String z0() {
        return this.f52857c;
    }
}
