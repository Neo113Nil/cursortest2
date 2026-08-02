package io.sentry.vendor.gson.stream;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f68641i = new String[UserVerificationMethods.USER_VERIFY_PATTERN];

    /* renamed from: a, reason: collision with root package name */
    private final Writer f68642a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f68643b;

    /* renamed from: c, reason: collision with root package name */
    private int f68644c;

    /* renamed from: d, reason: collision with root package name */
    private String f68645d;

    /* renamed from: e, reason: collision with root package name */
    private String f68646e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f68647f;

    /* renamed from: g, reason: collision with root package name */
    private String f68648g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f68649h;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f68641i[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f68641i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f68643b = iArr;
        this.f68644c = 0;
        if (iArr.length == 0) {
            this.f68643b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f68643b;
        int i11 = this.f68644c;
        this.f68644c = i11 + 1;
        iArr2[i11] = 6;
        this.f68646e = ProductContainerDTO.RATIO_DELIMITER;
        this.f68649h = true;
        this.f68642a = writer;
    }

    private void B() throws IOException {
        if (this.f68648g != null) {
            int q11 = q();
            if (q11 == 5) {
                this.f68642a.write(44);
            } else if (q11 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            o();
            this.f68643b[this.f68644c - 1] = 4;
            s(this.f68648g);
            this.f68648g = null;
        }
    }

    private void c() throws IOException {
        int q11 = q();
        if (q11 == 1) {
            this.f68643b[this.f68644c - 1] = 2;
            o();
            return;
        }
        Writer writer = this.f68642a;
        if (q11 == 2) {
            writer.append(',');
            o();
        } else {
            if (q11 == 4) {
                writer.append((CharSequence) this.f68646e);
                this.f68643b[this.f68644c - 1] = 5;
                return;
            }
            if (q11 != 6) {
                if (q11 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f68647f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f68643b[this.f68644c - 1] = 7;
        }
    }

    private void d(int i11, char c11, int i12) throws IOException {
        int q11 = q();
        if (q11 != i12 && q11 != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f68648g != null) {
            throw new IllegalStateException("Dangling name: " + this.f68648g);
        }
        this.f68644c--;
        if (q11 == i12) {
            o();
        }
        this.f68642a.write(c11);
    }

    private void o() throws IOException {
        if (this.f68645d == null) {
            return;
        }
        Writer writer = this.f68642a;
        writer.write(10);
        int i11 = this.f68644c;
        for (int i12 = 1; i12 < i11; i12++) {
            writer.write(this.f68645d);
        }
    }

    private int q() {
        int i11 = this.f68644c;
        if (i11 != 0) {
            return this.f68643b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void s(String str) throws IOException {
        int i11;
        String str2;
        String[] strArr = f68641i;
        Writer writer = this.f68642a;
        writer.write(34);
        int length = str.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i11 = str2 == null ? i11 + 1 : 0;
                if (i12 < i11) {
                    writer.write(str, i12, i11 - i12);
                }
                writer.write(str2);
                i12 = i11 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i12 < i11) {
                }
                writer.write(str2);
                i12 = i11 + 1;
            }
        }
        if (i12 < length) {
            writer.write(str, i12, length - i12);
        }
        writer.write(34);
    }

    public final void beginArray() throws IOException {
        B();
        c();
        int i11 = this.f68644c;
        int[] iArr = this.f68643b;
        if (i11 == iArr.length) {
            this.f68643b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f68643b;
        int i12 = this.f68644c;
        this.f68644c = i12 + 1;
        iArr2[i12] = 1;
        this.f68642a.write(91);
    }

    public final void beginObject() throws IOException {
        B();
        c();
        int i11 = this.f68644c;
        int[] iArr = this.f68643b;
        if (i11 == iArr.length) {
            this.f68643b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f68643b;
        int i12 = this.f68644c;
        this.f68644c = i12 + 1;
        iArr2[i12] = 3;
        this.f68642a.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f68642a.close();
        int i11 = this.f68644c;
        if (i11 > 1 || (i11 == 1 && this.f68643b[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f68644c = 0;
    }

    public final void endArray() throws IOException {
        d(1, ']', 2);
    }

    public final void endObject() throws IOException {
        d(3, '}', 5);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f68644c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f68642a.flush();
    }

    public final String j() {
        return this.f68645d;
    }

    public final void k() throws IOException {
        B();
        c();
        this.f68642a.append((CharSequence) "\n");
    }

    public final void m(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f68648g != null) {
            throw new IllegalStateException();
        }
        if (this.f68644c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f68648g = str;
    }

    public final void p() throws IOException {
        if (this.f68648g != null) {
            if (!this.f68649h) {
                this.f68648g = null;
                return;
            }
            B();
        }
        c();
        this.f68642a.write("null");
    }

    public final void r(String str) {
        if (str == null || str.length() == 0) {
            this.f68645d = null;
            this.f68646e = ProductContainerDTO.RATIO_DELIMITER;
        } else {
            this.f68645d = str;
            this.f68646e = ": ";
        }
    }

    public final void setLenient(boolean z11) {
        this.f68647f = z11;
    }

    public final void t(double d11) throws IOException {
        B();
        if (this.f68647f || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
            c();
            this.f68642a.append((CharSequence) Double.toString(d11));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        }
    }

    public final void v(long j11) throws IOException {
        B();
        c();
        this.f68642a.write(Long.toString(j11));
    }

    public final void w(Boolean bool) throws IOException {
        if (bool == null) {
            p();
            return;
        }
        B();
        c();
        this.f68642a.write(bool.booleanValue() ? "true" : "false");
    }

    public final void x(Number number) throws IOException {
        if (number == null) {
            p();
            return;
        }
        B();
        String obj = number.toString();
        if (this.f68647f || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            c();
            this.f68642a.append((CharSequence) obj);
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
    }

    public final void y(String str) throws IOException {
        if (str == null) {
            p();
            return;
        }
        B();
        c();
        s(str);
    }

    public final void z(boolean z11) throws IOException {
        B();
        c();
        this.f68642a.write(z11 ? "true" : "false");
    }
}
