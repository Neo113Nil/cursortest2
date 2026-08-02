package com.google.android.gms.internal.ads;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.a70;
import defpackage.ihi;
import defpackage.is8;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzidn implements Closeable, Flushable {
    public static final Pattern j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] k = new String[128];
    public final ihi a;
    public int[] b;
    public int c;
    public final zzicm d;
    public final String e;
    public final String f;
    public final boolean g;
    public zzict h;
    public String i;

    static {
        for (int i = 0; i <= 31; i++) {
            k[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = k;
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

    public zzidn(ihi ihiVar) {
        int[] iArr = new int[32];
        this.b = iArr;
        boolean z = false;
        this.c = 0;
        if (iArr.length == 0) {
            iArr = Arrays.copyOf(iArr, 0);
            this.b = iArr;
        }
        int i = this.c;
        this.c = i + 1;
        iArr[i] = 6;
        this.h = zzict.b;
        this.a = ihiVar;
        zzicm zzicmVar = zzicm.d;
        Objects.requireNonNull(zzicmVar);
        String str = zzicmVar.a;
        this.d = zzicmVar;
        this.f = BlazeDataSourcePersonalizedType.STRING_SEPARATOR;
        if (zzicmVar.c) {
            this.e = ": ";
            if (str.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        if (str.isEmpty() && zzicmVar.b.isEmpty()) {
            z = true;
        }
        this.g = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.getClass();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[0] != 7)) {
            is8.e("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    public final void e(int i, int i2, char c) {
        int h = h();
        if (h != i2 && h != i) {
            a70.r("Nesting problem.");
            return;
        }
        String str = this.i;
        if (str != null) {
            a70.r("Dangling name: ".concat(str));
            return;
        }
        this.c--;
        if (h == i2) {
            n();
        }
        this.a.write(c);
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.c != 0) {
            this.a.getClass();
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

    public final void k() {
        if (this.i != null) {
            int h = h();
            if (h == 5) {
                this.a.write(this.f);
            } else if (h != 3) {
                a70.r("Nesting problem.");
                return;
            }
            n();
            this.b[this.c - 1] = 4;
            m(this.i);
            this.i = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(String str) {
        int i;
        String str2;
        ihi ihiVar = this.a;
        ihiVar.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = k[charAt];
                i = str2 == null ? i3 : 0;
                if (i2 < i) {
                    ihiVar.write(str, i2, i - i2);
                }
                ihiVar.write(str2);
                i2 = i3;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                ihiVar.write(str2);
                i2 = i3;
            }
        }
        if (i2 < length) {
            ihiVar.write(str, i2, length - i2);
        }
        ihiVar.write(34);
    }

    public final void n() {
        if (this.g) {
            return;
        }
        zzicm zzicmVar = this.d;
        String str = zzicmVar.a;
        ihi ihiVar = this.a;
        ihiVar.write(str);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            ihiVar.write(zzicmVar.b);
        }
    }

    public final void p() {
        int h = h();
        if (h == 1) {
            this.b[this.c - 1] = 2;
            n();
            return;
        }
        ihi ihiVar = this.a;
        if (h == 2) {
            ihiVar.append((CharSequence) this.f);
            n();
            return;
        }
        if (h == 4) {
            ihiVar.append((CharSequence) this.e);
            this.b[this.c - 1] = 5;
            return;
        }
        if (h != 6) {
            if (h != 7) {
                a70.r("Nesting problem.");
                return;
            } else if (this.h != zzict.a) {
                a70.r("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.c - 1] = 7;
    }
}
