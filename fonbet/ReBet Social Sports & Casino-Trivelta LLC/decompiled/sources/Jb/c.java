package Jb;

import com.facebook.hermes.intl.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class c implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f6089a;

    /* renamed from: c, reason: collision with root package name */
    public String f6091c;

    /* renamed from: d, reason: collision with root package name */
    public String f6092d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6093e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6094f;

    /* renamed from: g, reason: collision with root package name */
    public String f6095g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6096h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f6088i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private int[] stack = new int[32];

    /* renamed from: b, reason: collision with root package name */
    public int f6090b = 0;

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
        a2(6);
        this.f6092d = ":";
        this.f6096h = true;
        Objects.requireNonNull(writer, "out == null");
        this.f6089a = writer;
    }

    public static boolean m1(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public final boolean A0() {
        return this.f6094f;
    }

    public c B() {
        m2();
        return Y1(3, '{');
    }

    public boolean D0() {
        return this.f6093e;
    }

    public final c J(int i10, int i11, char c10) {
        int Z12 = Z1();
        if (Z12 != i11 && Z12 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f6095g != null) {
            throw new IllegalStateException("Dangling name: " + this.f6095g);
        }
        this.f6090b--;
        if (Z12 == i11) {
            y1();
        }
        this.f6089a.write(c10);
        return this;
    }

    public c T1() {
        if (this.f6095g != null) {
            if (!this.f6096h) {
                this.f6095g = null;
                return this;
            }
            m2();
        }
        k();
        this.f6089a.write("null");
        return this;
    }

    public c U() {
        return J(1, 2, ']');
    }

    public final c Y1(int i10, char c10) {
        k();
        a2(i10);
        this.f6089a.write(c10);
        return this;
    }

    public final int Z1() {
        int i10 = this.f6090b;
        if (i10 != 0) {
            return this.stack[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void a2(int i10) {
        int i11 = this.f6090b;
        int[] iArr = this.stack;
        if (i11 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.stack;
        int i12 = this.f6090b;
        this.f6090b = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void b2(int i10) {
        this.stack[this.f6090b - 1] = i10;
    }

    public final void c2(boolean z10) {
        this.f6094f = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6089a.close();
        int i10 = this.f6090b;
        if (i10 > 1 || (i10 == 1 && this.stack[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6090b = 0;
    }

    public final void d() {
        int Z12 = Z1();
        if (Z12 == 5) {
            this.f6089a.write(44);
        } else if (Z12 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        y1();
        b2(4);
    }

    public final void d2(String str) {
        if (str.length() == 0) {
            this.f6091c = null;
            this.f6092d = ":";
        } else {
            this.f6091c = str;
            this.f6092d = ": ";
        }
    }

    public final void e2(boolean z10) {
        this.f6096h = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f2(String str) {
        int i10;
        String str2;
        String[] strArr = this.f6094f ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.f6089a.write(34);
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i10 = str2 == null ? i10 + 1 : 0;
                if (i11 < i10) {
                    this.f6089a.write(str, i11, i10 - i11);
                }
                this.f6089a.write(str2);
                i11 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                }
                this.f6089a.write(str2);
                i11 = i10 + 1;
            }
        }
        if (i11 < length) {
            this.f6089a.write(str, i11, length - i11);
        }
        this.f6089a.write(34);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f6090b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6089a.flush();
    }

    public c g2(double d10) {
        m2();
        if (this.f6093e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            k();
            this.f6089a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c h2(long j10) {
        m2();
        k();
        this.f6089a.write(Long.toString(j10));
        return this;
    }

    public c i2(Boolean bool) {
        if (bool == null) {
            return T1();
        }
        m2();
        k();
        this.f6089a.write(bool.booleanValue() ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public c j2(Number number) {
        if (number == null) {
            return T1();
        }
        m2();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!m1(cls) && !f6088i.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f6093e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        k();
        this.f6089a.append((CharSequence) obj);
        return this;
    }

    public final void k() {
        int Z12 = Z1();
        if (Z12 == 1) {
            b2(2);
            y1();
            return;
        }
        if (Z12 == 2) {
            this.f6089a.append(',');
            y1();
        } else {
            if (Z12 == 4) {
                this.f6089a.append((CharSequence) this.f6092d);
                b2(5);
                return;
            }
            if (Z12 != 6) {
                if (Z12 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f6093e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            b2(7);
        }
    }

    public c k2(String str) {
        if (str == null) {
            return T1();
        }
        m2();
        k();
        f2(str);
        return this;
    }

    public c l2(boolean z10) {
        m2();
        k();
        this.f6089a.write(z10 ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public final void m2() {
        if (this.f6095g != null) {
            d();
            f2(this.f6095g);
            this.f6095g = null;
        }
    }

    public c n1(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6095g != null) {
            throw new IllegalStateException();
        }
        if (this.f6090b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6095g = str;
        return this;
    }

    public final void q(boolean z10) {
        this.f6093e = z10;
    }

    public c r() {
        m2();
        return Y1(1, '[');
    }

    public c w0() {
        return J(3, 5, '}');
    }

    public final void y1() {
        if (this.f6091c == null) {
            return;
        }
        this.f6089a.write(10);
        int i10 = this.f6090b;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f6089a.write(this.f6091c);
        }
    }

    public final boolean z0() {
        return this.f6096h;
    }
}
