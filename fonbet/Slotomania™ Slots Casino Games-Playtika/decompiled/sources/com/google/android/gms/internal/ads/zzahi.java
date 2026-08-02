package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzahi {
    public final List zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    private zzahi(List list, int i, String str, int i2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = i2;
    }

    public static zzahi zza(zzes zzesVar) throws zzat {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            if (zzesVar.zzB() != 0) {
                throw zzat.zzb("Unsupported VVC version", null);
            }
            int zzs = zzesVar.zzs();
            int i6 = zzs >> 1;
            int i7 = 1;
            str = "L";
            if ((zzs & 1) != 0) {
                zzesVar.zzk(1);
                int zzs2 = zzesVar.zzs() >> 4;
                i = zzesVar.zzs() >> 5;
                int zzs3 = zzesVar.zzs() & 63;
                int zzs4 = zzesVar.zzs();
                i3 = zzs4 >> 1;
                str = (zzs4 & 1) != 0 ? "H" : "L";
                i2 = zzesVar.zzs();
                zzesVar.zzk(zzs3);
                int i8 = zzs2 & 7;
                if (i8 > 1) {
                    int zzs5 = zzesVar.zzs();
                    for (int i9 = 0; i9 < i8 - 1; i9++) {
                        if (((zzs5 >> (7 - i9)) & 1) != 0) {
                            zzesVar.zzk(1);
                        }
                    }
                }
                zzesVar.zzk(zzesVar.zzs() * 4);
                zzesVar.zzk(6);
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            int zzs6 = zzesVar.zzs();
            int zzg = zzesVar.zzg();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i4 = 12;
                i5 = 13;
                if (i10 >= zzs6) {
                    break;
                }
                int zzs7 = zzesVar.zzs() & 31;
                int zzt = (zzs7 == 13 || zzs7 == 12) ? 1 : zzesVar.zzt();
                for (int i12 = 0; i12 < zzt; i12++) {
                    int zzt2 = zzesVar.zzt();
                    i11 += zzt2 + 4;
                    zzesVar.zzk(zzt2);
                }
                i10++;
            }
            zzesVar.zzh(zzg);
            byte[] bArr = new byte[i11];
            int i13 = 0;
            int i14 = 0;
            while (i13 < zzs6) {
                int zzs8 = zzesVar.zzs() & 31;
                int zzt3 = (zzs8 == i5 || zzs8 == i4) ? i7 : zzesVar.zzt();
                int i15 = i7;
                for (int i16 = 0; i16 < zzt3; i16++) {
                    int zzt4 = zzesVar.zzt();
                    System.arraycopy(zzgo.zza, 0, bArr, i14, 4);
                    int i17 = i14 + 4;
                    zzesVar.zzm(bArr, i17, zzt4);
                    i14 = i17 + zzt4;
                }
                i13++;
                i7 = i15;
                i4 = 12;
                i5 = 13;
            }
            return new zzahi(zzgvz.zzj(bArr), (i6 & 3) + 1, String.format(Locale.US, "vvc1.%d.%s%d", Integer.valueOf(i3), str, Integer.valueOf(i2)), i + 8);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.zzb("Error parsing VVC configuration", e);
        }
    }
}
