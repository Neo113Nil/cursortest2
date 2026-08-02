package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahw {
    public final List a;
    public final int b;
    public final String c;
    public final int d;

    public zzahw(s sVar, int i, String str, int i2) {
        this.a = sVar;
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    public static zzahw a(zzeu zzeuVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            if (zzeuVar.b() != 0) {
                throw zzat.a(null, "Unsupported VVC version");
            }
            int I = zzeuVar.I();
            int i6 = I >> 1;
            int i7 = 1;
            str = "L";
            if ((I & 1) != 0) {
                zzeuVar.E(1);
                int I2 = zzeuVar.I() >> 4;
                i = zzeuVar.I() >> 5;
                int I3 = zzeuVar.I() & 63;
                int I4 = zzeuVar.I();
                i3 = I4 >> 1;
                str = (I4 & 1) != 0 ? "H" : "L";
                i2 = zzeuVar.I();
                zzeuVar.E(I3);
                int i8 = I2 & 7;
                if (i8 > 1) {
                    int I5 = zzeuVar.I();
                    for (int i9 = 0; i9 < i8 - 1; i9++) {
                        if (((I5 >> (7 - i9)) & 1) != 0) {
                            zzeuVar.E(1);
                        }
                    }
                }
                zzeuVar.E(zzeuVar.I() * 4);
                zzeuVar.E(6);
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            int I6 = zzeuVar.I();
            int i10 = zzeuVar.b;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i4 = 12;
                i5 = 13;
                if (i11 >= I6) {
                    break;
                }
                int I7 = zzeuVar.I() & 31;
                int J = (I7 == 13 || I7 == 12) ? 1 : zzeuVar.J();
                for (int i13 = 0; i13 < J; i13++) {
                    int J2 = zzeuVar.J();
                    i12 = J2 + 4 + i12;
                    zzeuVar.E(J2);
                }
                i11++;
            }
            zzeuVar.D(i10);
            byte[] bArr = new byte[i12];
            int i14 = 0;
            int i15 = 0;
            while (i14 < I6) {
                int I8 = zzeuVar.I() & 31;
                int J3 = (I8 == i5 || I8 == i4) ? i7 : zzeuVar.J();
                int i16 = i7;
                for (int i17 = 0; i17 < J3; i17++) {
                    int J4 = zzeuVar.J();
                    System.arraycopy(zzgr.a, 0, bArr, i15, 4);
                    int i18 = i15 + 4;
                    zzeuVar.F(i18, J4, bArr);
                    i15 = i18 + J4;
                }
                i14++;
                i7 = i16;
                i4 = 12;
                i5 = 13;
            }
            Locale locale = Locale.US;
            return new zzahw(zzgxm.t(bArr), (i6 & 3) + 1, "vvc1." + i3 + "." + str + i2, i + 8);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.a(e, "Error parsing VVC configuration");
        }
    }
}
