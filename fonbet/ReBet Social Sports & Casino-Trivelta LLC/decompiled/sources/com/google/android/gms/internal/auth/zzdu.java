package com.google.android.gms.internal.auth;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
final class zzdu {
    public static int zza(byte[] bArr, int i10, zzdt zzdtVar) {
        int zzh = zzh(bArr, i10, zzdtVar);
        int i11 = zzdtVar.zza;
        if (i11 < 0) {
            throw zzfb.zzc();
        }
        if (i11 > bArr.length - zzh) {
            throw zzfb.zzf();
        }
        if (i11 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return zzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, zzh, i11);
        return zzh + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
        int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzgi zzgiVar, byte[] bArr, int i10, int i11, int i12, zzdt zzdtVar) {
        Object zzd = zzgiVar.zzd();
        int zzl = zzl(zzd, zzgiVar, bArr, i10, i11, i12, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzl;
    }

    public static int zzd(zzgi zzgiVar, byte[] bArr, int i10, int i11, zzdt zzdtVar) {
        Object zzd = zzgiVar.zzd();
        int zzm = zzm(zzd, zzgiVar, bArr, i10, i11, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzm;
    }

    public static int zze(zzgi zzgiVar, int i10, byte[] bArr, int i11, int i12, zzez zzezVar, zzdt zzdtVar) {
        int zzd = zzd(zzgiVar, bArr, i11, i12, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (zzd < i12) {
            int zzh = zzh(bArr, zzd, zzdtVar);
            if (i10 != zzdtVar.zza) {
                break;
            }
            zzd = zzd(zzgiVar, bArr, zzh, i12, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i10, zzdtVar);
        int i11 = zzdtVar.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw zzfb.zzf();
    }

    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzha zzhaVar, zzdt zzdtVar) {
        if ((i10 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzk = zzk(bArr, i11, zzdtVar);
            zzhaVar.zzh(i10, Long.valueOf(zzdtVar.zzb));
            return zzk;
        }
        if (i13 == 1) {
            zzhaVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzh = zzh(bArr, i11, zzdtVar);
            int i14 = zzdtVar.zza;
            if (i14 < 0) {
                throw zzfb.zzc();
            }
            if (i14 > bArr.length - zzh) {
                throw zzfb.zzf();
            }
            if (i14 == 0) {
                zzhaVar.zzh(i10, zzef.zzb);
            } else {
                zzhaVar.zzh(i10, zzef.zzk(bArr, zzh, i14));
            }
            return zzh + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzha zzd = zzha.zzd();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzh2 = zzh(bArr, i11, zzdtVar);
            i16 = zzdtVar.zza;
            if (i16 == i15) {
                i11 = zzh2;
                break;
            }
            i11 = zzg(i16, bArr, zzh2, i12, zzd, zzdtVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i10, zzd);
        return i11;
    }

    public static int zzh(byte[] bArr, int i10, zzdt zzdtVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzdtVar);
        }
        zzdtVar.zza = b10;
        return i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, zzdt zzdtVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzdtVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzdtVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzdtVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzdtVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzdtVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i11, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (zzh < i12) {
            int zzh2 = zzh(bArr, zzh, zzdtVar);
            if (i10 != zzdtVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i10, zzdt zzdtVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzdtVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & ByteCompanionObject.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzdtVar.zzb = j11;
        return i12;
    }

    public static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i10, int i11, int i12, zzdt zzdtVar) {
        int zzb = ((zzga) zzgiVar).zzb(obj, bArr, i10, i11, i12, zzdtVar);
        zzdtVar.zzc = obj;
        return zzb;
    }

    public static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i10, int i11, zzdt zzdtVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzi(i13, bArr, i12, zzdtVar);
            i13 = zzdtVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzfb.zzf();
        }
        int i15 = i14 + i13;
        zzgiVar.zzg(obj, bArr, i14, i15, zzdtVar);
        zzdtVar.zzc = obj;
        return i15;
    }

    public static long zzn(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
