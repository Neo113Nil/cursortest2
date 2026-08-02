package com.google.android.gms.internal.auth;

import java.io.IOException;

/* loaded from: classes9.dex */
final class zzdu {
    static int zza(byte[] bArr, int i11, zzdt zzdtVar) throws zzfb {
        int zzh = zzh(bArr, i11, zzdtVar);
        int i12 = zzdtVar.zza;
        if (i12 < 0) {
            throw zzfb.zzc();
        }
        if (i12 > bArr.length - zzh) {
            throw zzfb.zzf();
        }
        if (i12 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return zzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, zzh, i12);
        return zzh + i12;
    }

    static int zzb(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    static int zzc(zzgi zzgiVar, byte[] bArr, int i11, int i12, int i13, zzdt zzdtVar) throws IOException {
        Object zzd = zzgiVar.zzd();
        int zzl = zzl(zzd, zzgiVar, bArr, i11, i12, i13, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzl;
    }

    static int zzd(zzgi zzgiVar, byte[] bArr, int i11, int i12, zzdt zzdtVar) throws IOException {
        Object zzd = zzgiVar.zzd();
        int zzm = zzm(zzd, zzgiVar, bArr, i11, i12, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzm;
    }

    static int zze(zzgi zzgiVar, int i11, byte[] bArr, int i12, int i13, zzez zzezVar, zzdt zzdtVar) throws IOException {
        int zzd = zzd(zzgiVar, bArr, i12, i13, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (zzd < i13) {
            int zzh = zzh(bArr, zzd, zzdtVar);
            if (i11 != zzdtVar.zza) {
                break;
            }
            zzd = zzd(zzgiVar, bArr, zzh, i13, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i11, zzez zzezVar, zzdt zzdtVar) throws IOException {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i11, zzdtVar);
        int i12 = zzdtVar.zza + zzh;
        while (zzh < i12) {
            zzh = zzh(bArr, zzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (zzh == i12) {
            return zzh;
        }
        throw zzfb.zzf();
    }

    static int zzg(int i11, byte[] bArr, int i12, int i13, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        if ((i11 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int zzk = zzk(bArr, i12, zzdtVar);
            zzhaVar.zzh(i11, Long.valueOf(zzdtVar.zzb));
            return zzk;
        }
        if (i14 == 1) {
            zzhaVar.zzh(i11, Long.valueOf(zzn(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int zzh = zzh(bArr, i12, zzdtVar);
            int i15 = zzdtVar.zza;
            if (i15 < 0) {
                throw zzfb.zzc();
            }
            if (i15 > bArr.length - zzh) {
                throw zzfb.zzf();
            }
            if (i15 == 0) {
                zzhaVar.zzh(i11, zzef.zzb);
            } else {
                zzhaVar.zzh(i11, zzef.zzk(bArr, zzh, i15));
            }
            return zzh + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i11, Integer.valueOf(zzb(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzha zzd = zzha.zzd();
        int i17 = 0;
        while (true) {
            if (i12 >= i13) {
                break;
            }
            int zzh2 = zzh(bArr, i12, zzdtVar);
            i17 = zzdtVar.zza;
            if (i17 == i16) {
                i12 = zzh2;
                break;
            }
            i12 = zzg(i17, bArr, zzh2, i13, zzd, zzdtVar);
        }
        if (i12 > i13 || i17 != i16) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i11, zzd);
        return i12;
    }

    static int zzh(byte[] bArr, int i11, zzdt zzdtVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zzi(b11, bArr, i12, zzdtVar);
        }
        zzdtVar.zza = b11;
        return i12;
    }

    static int zzi(int i11, byte[] bArr, int i12, zzdt zzdtVar) {
        byte b11 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b11 >= 0) {
            zzdtVar.zza = i14 | (b11 << 7);
            return i13;
        }
        int i15 = i14 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            zzdtVar.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzdtVar.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzdtVar.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzdtVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int zzj(int i11, byte[] bArr, int i12, int i13, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i12, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (zzh < i13) {
            int zzh2 = zzh(bArr, zzh, zzdtVar);
            if (i11 != zzdtVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return zzh;
    }

    static int zzk(byte[] bArr, int i11, zzdt zzdtVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzdtVar.zzb = j11;
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
        zzdtVar.zzb = j12;
        return i13;
    }

    static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i11, int i12, int i13, zzdt zzdtVar) throws IOException {
        int zzb = ((zzga) zzgiVar).zzb(obj, bArr, i11, i12, i13, zzdtVar);
        zzdtVar.zzc = obj;
        return zzb;
    }

    static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i11, int i12, zzdt zzdtVar) throws IOException {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = zzi(i14, bArr, i13, zzdtVar);
            i14 = zzdtVar.zza;
        }
        int i15 = i13;
        if (i14 < 0 || i14 > i12 - i15) {
            throw zzfb.zzf();
        }
        int i16 = i15 + i14;
        zzgiVar.zzg(obj, bArr, i15, i16, zzdtVar);
        zzdtVar.zzc = obj;
        return i16;
    }

    static long zzn(byte[] bArr, int i11) {
        return (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48) | ((bArr[i11 + 7] & 255) << 56);
    }
}
