package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzafx {
    public static boolean zza(zzes zzesVar, zzagc zzagcVar, int i, zzafw zzafwVar) {
        int zzg = zzesVar.zzg();
        long zzz = zzesVar.zzz();
        long j = zzz >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = zzz >> 12;
        long j3 = zzz >> 8;
        long j4 = zzz >> 4;
        long j5 = zzz >> 1;
        long j6 = zzz & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzagcVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzagcVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 != 0 && i3 != zzagcVar.zzi) || j6 == 1 || !zzd(zzesVar, zzagcVar, z, zzafwVar)) {
            return false;
        }
        long j7 = zzafwVar.zza;
        int zzc = zzc(zzesVar, (int) (j2 & 15));
        long j8 = zzagcVar.zzj;
        boolean z2 = j8 == 0 || j7 + ((long) zzc) >= j8;
        if (zzc == -1) {
            return false;
        }
        if ((!z2 && zzc < zzagcVar.zza) || zzc > zzagcVar.zzb) {
            return false;
        }
        int i4 = zzagcVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzagcVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzesVar.zzs() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int zzt = zzesVar.zzt();
                if (i5 == 14) {
                    zzt *= 10;
                }
                if (zzt != i4) {
                    return false;
                }
            }
        }
        if (zzesVar.zzs() != zzfk.zzK(zzesVar.zzi(), zzg, zzesVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzesVar.zzd() != 0) {
            int zzn = zzesVar.zzn();
            if ((zzn & 128) != 0) {
                return false;
            }
            int i6 = (zzn & 126) >> 1;
            if ((i6 >= 2 && i6 <= 7) || (i6 >= 13 && i6 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i6);
                zzef.zzb("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzafq zzafqVar, zzagc zzagcVar) throws IOException {
        zzafqVar.zzl();
        zzafqVar.zzk(1);
        byte[] bArr = new byte[1];
        zzafqVar.zzi(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzafqVar.zzk(2);
        int i2 = 1 != i ? 6 : 7;
        zzes zzesVar = new zzes(i2);
        zzesVar.zzf(zzaft.zzb(zzafqVar, zzesVar.zzi(), 0, i2));
        zzafqVar.zzl();
        zzafw zzafwVar = new zzafw();
        if (zzd(zzesVar, zzagcVar, z, zzafwVar)) {
            return zzafwVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzes zzesVar, int i) {
        switch (i) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzesVar.zzs() + 1;
            case 7:
                return zzesVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzes zzesVar, zzagc zzagcVar, boolean z, zzafw zzafwVar) {
        try {
            long zzO = zzesVar.zzO();
            if (!z) {
                zzO *= zzagcVar.zzb;
            }
            long j = zzagcVar.zzj;
            if (j != 0 && zzO > j) {
                return false;
            }
            zzafwVar.zza = zzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
