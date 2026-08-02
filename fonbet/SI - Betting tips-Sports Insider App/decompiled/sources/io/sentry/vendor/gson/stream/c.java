package io.sentry.vendor.gson.stream;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f17217i = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public final Writer f17218a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f17219b;

    /* renamed from: c, reason: collision with root package name */
    public int f17220c;

    /* renamed from: d, reason: collision with root package name */
    public String f17221d;

    /* renamed from: e, reason: collision with root package name */
    public String f17222e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17223f;

    /* renamed from: g, reason: collision with root package name */
    public String f17224g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17225h;

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            f17217i[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = f17217i;
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
        this.f17219b = iArr;
        this.f17220c = 0;
        if (iArr.length == 0) {
            this.f17219b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f17219b;
        int i5 = this.f17220c;
        this.f17220c = i5 + 1;
        iArr2[i5] = 6;
        this.f17222e = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.f17225h = true;
        this.f17218a = writer;
    }

    public final void c() {
        int t3 = t();
        if (t3 == 1) {
            this.f17219b[this.f17220c - 1] = 2;
            n();
            return;
        }
        Writer writer = this.f17218a;
        if (t3 == 2) {
            writer.append(',');
            n();
        } else {
            if (t3 == 4) {
                writer.append((CharSequence) this.f17222e);
                this.f17219b[this.f17220c - 1] = 5;
                return;
            }
            if (t3 != 6) {
                if (t3 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f17223f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f17219b[this.f17220c - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17218a.close();
        int i5 = this.f17220c;
        if (i5 > 1 || (i5 == 1 && this.f17219b[i5 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f17220c = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f17220c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f17218a.flush();
    }

    public final void k(char c2, int i5, int i10) {
        int t3 = t();
        if (t3 != i10 && t3 != i5) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f17224g != null) {
            throw new IllegalStateException("Dangling name: " + this.f17224g);
        }
        this.f17220c--;
        if (t3 == i10) {
            n();
        }
        this.f17218a.write(c2);
    }

    public final void n() {
        if (this.f17221d == null) {
            return;
        }
        Writer writer = this.f17218a;
        writer.write(10);
        int i5 = this.f17220c;
        for (int i10 = 1; i10 < i5; i10++) {
            writer.write(this.f17221d);
        }
    }

    public final void r() {
        if (this.f17224g != null) {
            if (!this.f17225h) {
                this.f17224g = null;
                return;
            }
            y();
        }
        c();
        this.f17218a.write("null");
    }

    public final int t() {
        int i5 = this.f17220c;
        if (i5 != 0) {
            return this.f17219b[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(String str) {
        int i5;
        String str2;
        Writer writer = this.f17218a;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        while (i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                str2 = f17217i[charAt];
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

    public final void y() {
        if (this.f17224g != null) {
            int t3 = t();
            if (t3 == 5) {
                this.f17218a.write(44);
            } else if (t3 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            n();
            this.f17219b[this.f17220c - 1] = 4;
            w(this.f17224g);
            this.f17224g = null;
        }
    }
}
