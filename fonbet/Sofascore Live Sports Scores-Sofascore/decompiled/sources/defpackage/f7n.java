package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class f7n implements Closeable, Flushable {
    public static final Pattern l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] m = new String[128];
    public static final String[] n;
    public final Writer a;
    public int[] b;
    public int c;
    public c9p d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public boolean i;
    public String j;
    public boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public f7n(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            iArr = Arrays.copyOf(iArr, 0);
            this.b = iArr;
        }
        int i = this.c;
        this.c = i + 1;
        iArr[i] = 6;
        this.h = 2;
        this.k = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        g0(c9p.d);
    }

    public void C(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.j != null) {
            a70.r("Already wrote a name, expecting a value.");
            return;
        }
        int n0 = n0();
        if (n0 == 3 || n0 == 5) {
            this.j = str;
        } else {
            a70.r("Please begin an object before writing a name.");
        }
    }

    public void H(String str) {
        if (str == null) {
            f0();
            return;
        }
        r0();
        k();
        e(str);
    }

    public void M(boolean z) {
        r0();
        k();
        this.a.write(true != z ? "false" : "true");
    }

    public void T(Boolean bool) {
        if (bool == null) {
            f0();
            return;
        }
        r0();
        k();
        this.a.write(true != bool.booleanValue() ? "false" : "true");
    }

    public void Z(double d) {
        r0();
        if (this.h != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            zzl.f(String.valueOf(d).length() + 39, "Numeric values must be finite, but was ", d);
        } else {
            k();
            this.a.append((CharSequence) Double.toString(d));
        }
    }

    public void a0(long j) {
        r0();
        k();
        this.a.write(Long.toString(j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[0] != 7)) {
            is8.e("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(String str) {
        int i;
        String str2;
        String[] strArr = this.i ? n : m;
        Writer writer = this.a;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i3 : 0;
                if (i2 < i) {
                    writer.write(str, i2, i - i2);
                }
                writer.write(str2);
                i2 = i3;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                writer.write(str2);
                i2 = i3;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    public void e0(Number number) {
        if (number == null) {
            f0();
            return;
        }
        r0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.h != 1) {
                    a70.p("Numeric values must be finite, but was ".concat(obj));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !l.matcher(obj).matches()) {
                String valueOf = String.valueOf(cls);
                a70.p(fc6.o(new StringBuilder(valueOf.length() + 47 + obj.length()), "String created by ", valueOf, " is not a valid JSON number: ", obj));
                return;
            }
        }
        k();
        this.a.append((CharSequence) obj);
    }

    public void f0() {
        if (this.j != null) {
            if (!this.k) {
                this.j = null;
                return;
            }
            r0();
        }
        k();
        this.a.write("null");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.c != 0) {
            this.a.flush();
        } else {
            a70.r("JsonWriter is closed.");
        }
    }

    public final void g0(c9p c9pVar) {
        Objects.requireNonNull(c9pVar);
        this.d = c9pVar;
        this.f = BlazeDataSourcePersonalizedType.STRING_SEPARATOR;
        if (c9pVar.c) {
            this.e = ": ";
            if (c9pVar.a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        boolean z = false;
        if (this.d.a.isEmpty() && this.d.b.isEmpty()) {
            z = true;
        }
        this.g = z;
    }

    public final void h() {
        if (this.g) {
            return;
        }
        String str = this.d.a;
        Writer writer = this.a;
        writer.write(str);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.d.b);
        }
    }

    public final void j0(int i, int i2, char c) {
        int n0 = n0();
        if (n0 != i2 && n0 != i) {
            a70.r("Nesting problem.");
            return;
        }
        String str = this.j;
        if (str != null) {
            a70.r("Dangling name: ".concat(str));
            return;
        }
        this.c--;
        if (n0 == i2) {
            h();
        }
        this.a.write(c);
    }

    public final void k() {
        int n0 = n0();
        if (n0 == 1) {
            this.b[this.c - 1] = 2;
            h();
            return;
        }
        Writer writer = this.a;
        if (n0 == 2) {
            writer.append((CharSequence) this.f);
            h();
            return;
        }
        if (n0 == 4) {
            writer.append((CharSequence) this.e);
            this.b[this.c - 1] = 5;
            return;
        }
        if (n0 != 6) {
            if (n0 != 7) {
                a70.r("Nesting problem.");
                return;
            } else if (this.h != 1) {
                a70.r("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.c - 1] = 7;
    }

    public void m() {
        r0();
        k();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            iArr = Arrays.copyOf(iArr, i + i);
            this.b = iArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = 1;
        this.a.write(91);
    }

    public void n() {
        j0(1, 2, ']');
    }

    public final int n0() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        a70.r("JsonWriter is closed.");
        return 0;
    }

    public void p() {
        r0();
        k();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            iArr = Arrays.copyOf(iArr, i + i);
            this.b = iArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = 3;
        this.a.write(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
    }

    public final void r0() {
        if (this.j != null) {
            int n0 = n0();
            if (n0 == 5) {
                this.a.write(this.f);
            } else if (n0 != 3) {
                a70.r("Nesting problem.");
                return;
            }
            h();
            this.b[this.c - 1] = 4;
            e(this.j);
            this.j = null;
        }
    }

    public void t() {
        j0(3, 5, '}');
    }
}
