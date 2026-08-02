package com.google.android.gms.internal.pal;

import defpackage.a70;
import defpackage.is8;
import java.io.Closeable;
import java.io.Flushable;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabe implements Closeable, Flushable {
    public static final Pattern g = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] h = new String[128];
    public final StringWriter a;
    public int[] b;
    public int c;
    public final String d;
    public boolean e;
    public String f;

    static {
        for (int i = 0; i <= 31; i++) {
            h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = h;
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

    public zzabe(StringWriter stringWriter) {
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
        this.d = ":";
        this.a = stringWriter;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[0] != 7)) {
            is8.e("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.c != 0) {
            this.a.flush();
        } else {
            a70.r("JsonWriter is closed.");
        }
    }

    public final int h() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        a70.r("JsonWriter is closed.");
        return 0;
    }

    public final void i(int i, int i2, char c) {
        int h2 = h();
        if (h2 != i2 && h2 != i) {
            a70.r("Nesting problem.");
            return;
        }
        String str = this.f;
        if (str != null) {
            a70.r("Dangling name: ".concat(str));
        } else {
            this.c--;
            this.a.write(c);
        }
    }

    public final void k() {
        int h2 = h();
        if (h2 == 1) {
            this.b[this.c - 1] = 2;
            return;
        }
        StringWriter stringWriter = this.a;
        if (h2 == 2) {
            stringWriter.append(',');
            return;
        }
        if (h2 == 4) {
            stringWriter.append((CharSequence) this.d);
            this.b[this.c - 1] = 5;
            return;
        }
        if (h2 != 6) {
            if (h2 != 7) {
                a70.r("Nesting problem.");
                return;
            } else if (!this.e) {
                a70.r("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.c - 1] = 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(String str) {
        int i;
        String str2;
        StringWriter stringWriter = this.a;
        stringWriter.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = h[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    stringWriter.write(str, i2, i - i2);
                }
                stringWriter.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                stringWriter.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            stringWriter.write(str, i2, length - i2);
        }
        stringWriter.write(34);
    }

    public final void n() {
        if (this.f != null) {
            int h2 = h();
            if (h2 == 5) {
                this.a.write(44);
            } else if (h2 != 3) {
                a70.r("Nesting problem.");
                return;
            }
            this.b[this.c - 1] = 4;
            m(this.f);
            this.f = null;
        }
    }
}
