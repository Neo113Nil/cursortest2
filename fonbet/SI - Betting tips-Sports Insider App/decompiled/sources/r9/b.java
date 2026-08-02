package r9;

import com.google.gson.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f22333l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f22334m = new String[128];

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f22335n;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f22336a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f22337b;

    /* renamed from: c, reason: collision with root package name */
    public int f22338c;

    /* renamed from: d, reason: collision with root package name */
    public i f22339d;

    /* renamed from: e, reason: collision with root package name */
    public String f22340e;

    /* renamed from: f, reason: collision with root package name */
    public String f22341f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22342g;

    /* renamed from: h, reason: collision with root package name */
    public int f22343h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22344i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22345k;

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            f22334m[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = f22334m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f22335n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f22337b = iArr;
        this.f22338c = 0;
        if (iArr.length == 0) {
            this.f22337b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f22337b;
        int i5 = this.f22338c;
        this.f22338c = i5 + 1;
        iArr2[i5] = 6;
        this.f22343h = 2;
        this.f22345k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f22336a = writer;
        K(i.f6209d);
    }

    public b C() {
        if (this.j != null) {
            if (!this.f22345k) {
                this.j = null;
                return this;
            }
            c0();
        }
        c();
        this.f22336a.write("null");
        return this;
    }

    public final int J() {
        int i5 = this.f22338c;
        if (i5 != 0) {
            return this.f22337b[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void K(i iVar) {
        Objects.requireNonNull(iVar);
        this.f22339d = iVar;
        this.f22341f = StringUtils.COMMA;
        if (iVar.f6212c) {
            this.f22340e = ": ";
            if (iVar.f6210a.isEmpty()) {
                this.f22341f = ", ";
            }
        } else {
            this.f22340e = StringUtils.PROCESS_POSTFIX_DELIMITER;
        }
        this.f22342g = this.f22339d.f6210a.isEmpty() && this.f22339d.f6211b.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(String str) {
        int i5;
        String str2;
        String[] strArr = this.f22344i ? f22335n : f22334m;
        Writer writer = this.f22336a;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        while (i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i5 = str2 == null ? i5 + 1 : 0;
                if (i10 < i5) {
                    writer.write(str, i10, i5 - i10);
                }
                writer.write(str2);
                i10 = i5 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i5) {
                }
                writer.write(str2);
                i10 = i5 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void O(double d10) {
        c0();
        if (this.f22343h == 1 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            c();
            this.f22336a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void R(long j) {
        c0();
        c();
        this.f22336a.write(Long.toString(j));
    }

    public void U(Number number) {
        if (number == null) {
            C();
            return;
        }
        c0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.f22343h != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                }
            } else if (cls != Float.class && cls != Double.class && !f22333l.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        }
        c();
        this.f22336a.append((CharSequence) obj);
    }

    public void W(String str) {
        if (str == null) {
            C();
            return;
        }
        c0();
        c();
        N(str);
    }

    public void Y(boolean z5) {
        c0();
        c();
        this.f22336a.write(z5 ? "true" : "false");
    }

    public final void c() {
        int J = J();
        if (J == 1) {
            this.f22337b[this.f22338c - 1] = 2;
            z();
            return;
        }
        Writer writer = this.f22336a;
        if (J == 2) {
            writer.append((CharSequence) this.f22341f);
            z();
        } else {
            if (J == 4) {
                writer.append((CharSequence) this.f22340e);
                this.f22337b[this.f22338c - 1] = 5;
                return;
            }
            if (J != 6) {
                if (J != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f22343h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f22337b[this.f22338c - 1] = 7;
        }
    }

    public final void c0() {
        if (this.j != null) {
            int J = J();
            if (J == 5) {
                this.f22336a.write(this.f22341f);
            } else if (J != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            z();
            this.f22337b[this.f22338c - 1] = 4;
            N(this.j);
            this.j = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22336a.close();
        int i5 = this.f22338c;
        if (i5 > 1 || (i5 == 1 && this.f22337b[i5 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f22338c = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f22338c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f22336a.flush();
    }

    public void k() {
        c0();
        c();
        int i5 = this.f22338c;
        int[] iArr = this.f22337b;
        if (i5 == iArr.length) {
            this.f22337b = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.f22337b;
        int i10 = this.f22338c;
        this.f22338c = i10 + 1;
        iArr2[i10] = 1;
        this.f22336a.write(91);
    }

    public void n() {
        c0();
        c();
        int i5 = this.f22338c;
        int[] iArr = this.f22337b;
        if (i5 == iArr.length) {
            this.f22337b = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.f22337b;
        int i10 = this.f22338c;
        this.f22338c = i10 + 1;
        iArr2[i10] = 3;
        this.f22336a.write(123);
    }

    public final void r(char c2, int i5, int i10) {
        int J = J();
        if (J != i10 && J != i5) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        this.f22338c--;
        if (J == i10) {
            z();
        }
        this.f22336a.write(c2);
    }

    public void t() {
        r(']', 1, 2);
    }

    public void w() {
        r('}', 3, 5);
    }

    public void y(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int J = J();
        if (J != 3 && J != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.j = str;
    }

    public final void z() {
        if (this.f22342g) {
            return;
        }
        String str = this.f22339d.f6210a;
        Writer writer = this.f22336a;
        writer.write(str);
        int i5 = this.f22338c;
        for (int i10 = 1; i10 < i5; i10++) {
            writer.write(this.f22339d.f6211b);
        }
    }
}
