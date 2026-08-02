package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes9.dex */
final class zzsm {
    static int zza(byte[] bArr, int i11, zzsl zzslVar) throws zzvk {
        int zzj = zzj(bArr, i11, zzslVar);
        int i12 = zzslVar.zza;
        if (i12 < 0) {
            throw zzvk.zzf();
        }
        if (i12 > bArr.length - zzj) {
            throw zzvk.zzj();
        }
        if (i12 == 0) {
            zzslVar.zzc = zztd.zzb;
            return zzj;
        }
        zzslVar.zzc = zztd.zzn(bArr, zzj, i12);
        return zzj + i12;
    }

    static int zzb(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    static int zzc(zzwx zzwxVar, byte[] bArr, int i11, int i12, int i13, zzsl zzslVar) throws IOException {
        zzwn zzwnVar = (zzwn) zzwxVar;
        Object zze = zzwnVar.zze();
        int zzc = zzwnVar.zzc(zze, bArr, i11, i12, i13, zzslVar);
        zzwnVar.zzf(zze);
        zzslVar.zzc = zze;
        return zzc;
    }

    static int zzd(zzwx zzwxVar, byte[] bArr, int i11, int i12, zzsl zzslVar) throws IOException {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = zzk(i14, bArr, i13, zzslVar);
            i14 = zzslVar.zza;
        }
        int i15 = i13;
        if (i14 < 0 || i14 > i12 - i15) {
            throw zzvk.zzj();
        }
        Object zze = zzwxVar.zze();
        int i16 = i15 + i14;
        zzwxVar.zzi(zze, bArr, i15, i16, zzslVar);
        zzwxVar.zzf(zze);
        zzslVar.zzc = zze;
        return i16;
    }

    static int zze(zzwx<?> zzwxVar, int i11, byte[] bArr, int i12, int i13, zzvh<?> zzvhVar, zzsl zzslVar) throws IOException {
        int zzd = zzd(zzwxVar, bArr, i12, i13, zzslVar);
        zzvhVar.add(zzslVar.zzc);
        while (zzd < i13) {
            int zzj = zzj(bArr, zzd, zzslVar);
            if (i11 != zzslVar.zza) {
                break;
            }
            zzd = zzd(zzwxVar, bArr, zzj, i13, zzslVar);
            zzvhVar.add(zzslVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i11, zzvh<?> zzvhVar, zzsl zzslVar) throws IOException {
        zzva zzvaVar = (zzva) zzvhVar;
        int zzj = zzj(bArr, i11, zzslVar);
        int i12 = zzslVar.zza + zzj;
        while (zzj < i12) {
            zzj = zzj(bArr, zzj, zzslVar);
            zzvaVar.zzh(zzslVar.zza);
        }
        if (zzj == i12) {
            return zzj;
        }
        throw zzvk.zzj();
    }

    static int zzg(byte[] bArr, int i11, zzsl zzslVar) throws zzvk {
        int zzj = zzj(bArr, i11, zzslVar);
        int i12 = zzslVar.zza;
        if (i12 < 0) {
            throw zzvk.zzf();
        }
        if (i12 == 0) {
            zzslVar.zzc = "";
            return zzj;
        }
        zzslVar.zzc = new String(bArr, zzj, i12, zzvi.zza);
        return zzj + i12;
    }

    static int zzh(byte[] bArr, int i11, zzsl zzslVar) throws zzvk {
        int zzj = zzj(bArr, i11, zzslVar);
        int i12 = zzslVar.zza;
        if (i12 < 0) {
            throw zzvk.zzf();
        }
        if (i12 == 0) {
            zzslVar.zzc = "";
            return zzj;
        }
        zzslVar.zzc = zzyd.zzd(bArr, zzj, i12);
        return zzj + i12;
    }

    static int zzi(int i11, byte[] bArr, int i12, int i13, zzxp zzxpVar, zzsl zzslVar) throws zzvk {
        if ((i11 >>> 3) == 0) {
            throw zzvk.zzc();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int zzm = zzm(bArr, i12, zzslVar);
            zzxpVar.zzh(i11, Long.valueOf(zzslVar.zzb));
            return zzm;
        }
        if (i14 == 1) {
            zzxpVar.zzh(i11, Long.valueOf(zzo(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int zzj = zzj(bArr, i12, zzslVar);
            int i15 = zzslVar.zza;
            if (i15 < 0) {
                throw zzvk.zzf();
            }
            if (i15 > bArr.length - zzj) {
                throw zzvk.zzj();
            }
            if (i15 == 0) {
                zzxpVar.zzh(i11, zztd.zzb);
            } else {
                zzxpVar.zzh(i11, zztd.zzn(bArr, zzj, i15));
            }
            return zzj + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw zzvk.zzc();
            }
            zzxpVar.zzh(i11, Integer.valueOf(zzb(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzxp zze = zzxp.zze();
        int i17 = 0;
        while (true) {
            if (i12 >= i13) {
                break;
            }
            int zzj2 = zzj(bArr, i12, zzslVar);
            i17 = zzslVar.zza;
            if (i17 == i16) {
                i12 = zzj2;
                break;
            }
            i12 = zzi(i17, bArr, zzj2, i13, zze, zzslVar);
        }
        if (i12 > i13 || i17 != i16) {
            throw zzvk.zzg();
        }
        zzxpVar.zzh(i11, zze);
        return i12;
    }

    static int zzj(byte[] bArr, int i11, zzsl zzslVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zzk(b11, bArr, i12, zzslVar);
        }
        zzslVar.zza = b11;
        return i12;
    }

    static int zzk(int i11, byte[] bArr, int i12, zzsl zzslVar) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzslVar.zza = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzslVar.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzslVar.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzslVar.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzslVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int zzl(int i11, byte[] bArr, int i12, int i13, zzvh<?> zzvhVar, zzsl zzslVar) {
        zzva zzvaVar = (zzva) zzvhVar;
        int zzj = zzj(bArr, i12, zzslVar);
        zzvaVar.zzh(zzslVar.zza);
        while (zzj < i13) {
            int zzj2 = zzj(bArr, zzj, zzslVar);
            if (i11 != zzslVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzslVar);
            zzvaVar.zzh(zzslVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i11, zzsl zzslVar) {
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            zzslVar.zzb = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b11 = bArr[i12];
        long j12 = (j11 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i14 = 7;
        while (b11 < 0) {
            int i15 = i13 + 1;
            i14 += 7;
            j12 |= (r10 & Byte.MAX_VALUE) << i14;
            b11 = bArr[i13];
            i13 = i15;
        }
        zzslVar.zzb = j12;
        return i13;
    }

    static int zzn(int i11, byte[] bArr, int i12, int i13, zzsl zzslVar) throws zzvk {
        if ((i11 >>> 3) == 0) {
            throw zzvk.zzc();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return zzm(bArr, i12, zzslVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return zzj(bArr, i12, zzslVar) + zzslVar.zza;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw zzvk.zzc();
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = zzj(bArr, i12, zzslVar);
            i16 = zzslVar.zza;
            if (i16 == i15) {
                break;
            }
            i12 = zzn(i16, bArr, i12, i13, zzslVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw zzvk.zzg();
        }
        return i12;
    }

    static long zzo(byte[] bArr, int i11) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }
}
