package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.me4;
import defpackage.mz1;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzi {
    public static final zzi h;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        zzh zzhVar = new zzh();
        zzhVar.a = 1;
        zzhVar.b = 2;
        zzhVar.c = 3;
        h = zzhVar.a();
        zzh zzhVar2 = new zzh();
        zzhVar2.a = 1;
        zzhVar2.b = 1;
        zzhVar2.c = 2;
        zzhVar2.a();
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzi(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static boolean a(zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i = zziVar.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = zziVar.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = zziVar.c;
        if ((i3 != -1 && i3 != 3) || zziVar.d != null) {
            return false;
        }
        int i4 = zziVar.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = zziVar.e;
        return i5 == -1 || i5 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
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

    public static String e(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? me4.g(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? me4.g(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i) {
        return i != -1 ? i != 1 ? i != 2 ? me4.g(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.a == zziVar.a && this.b == zziVar.b && this.c == zziVar.c && Arrays.equals(this.d, zziVar.d) && this.e == zziVar.e && this.f == zziVar.f) {
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
        int hashCode = ((((Arrays.hashCode(this.d) + ((((((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        this.g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String e = e(this.a);
        String g = g(this.b);
        String f = f(this.c);
        int i = this.e;
        String h2 = i != -1 ? fc6.h(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8)) : "NA";
        int i2 = this.f;
        String h3 = i2 != -1 ? fc6.h(i2, "bit Chroma", new StringBuilder(String.valueOf(i2).length() + 10)) : "NA";
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(mz1.d(mz1.d(mz1.d(mz1.d(e.length() + 12, 2, g) + f.length() + 2, 2, String.valueOf(z)), 2, h2), 1, h3));
        sb.append("ColorInfo(");
        sb.append(e);
        sb.append(", ");
        sb.append(g);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(z);
        bf3.v(sb, ", ", h2, ", ", h3);
        sb.append(")");
        return sb.toString();
    }
}
