package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w13 {
    public static final w13 h = new w13(1, 2, 3, -1, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        wt3.s(0, 1, 2, 3, 4);
        nik.N(5);
    }

    public w13(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? ljg.j(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? ljg.j(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? ljg.j(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(w13 w13Var) {
        if (w13Var == null) {
            return true;
        }
        int i = w13Var.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = w13Var.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = w13Var.c;
        if ((i3 != -1 && i3 != 3) || w13Var.d != null) {
            return false;
        }
        int i4 = w13Var.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = w13Var.e;
        return i5 == -1 || i5 == 8;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w13.class == obj.getClass()) {
            w13 w13Var = (w13) obj;
            if (this.a == w13Var.a && this.b == w13Var.b && this.c == w13Var.c && Arrays.equals(this.d, w13Var.d) && this.e == w13Var.e && this.f == w13Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((Arrays.hashCode(this.d) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        this.g = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        int i = this.e;
        sb.append(i != -1 ? mz1.i(i, "bit Luma") : "NA");
        sb.append(", ");
        int i2 = this.f;
        return mz1.o(sb, i2 != -1 ? mz1.i(i2, "bit Chroma") : "NA", ")");
    }
}
