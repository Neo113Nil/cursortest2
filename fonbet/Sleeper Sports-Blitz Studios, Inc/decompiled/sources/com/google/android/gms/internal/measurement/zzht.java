package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzht {
    static double zza(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    static float zzb(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    static int zza(byte[] bArr, int i, zzhw zzhwVar) throws zzjt {
        int zzc = zzc(bArr, i, zzhwVar);
        int i2 = zzhwVar.zza;
        if (i2 < 0) {
            throw zzjt.zzf();
        }
        if (i2 > bArr.length - zzc) {
            throw zzjt.zzh();
        }
        if (i2 == 0) {
            zzhwVar.zzc = zzhx.zza;
            return zzc;
        }
        zzhwVar.zzc = zzhx.zza(bArr, zzc, i2);
        return zzc + i2;
    }

    static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int zza(zzli zzliVar, byte[] bArr, int i, int i2, int i3, zzhw zzhwVar) throws IOException {
        Object zza = zzliVar.zza();
        int zza2 = zza(zza, zzliVar, bArr, i, i2, i3, zzhwVar);
        zzliVar.zzc(zza);
        zzhwVar.zzc = zza;
        return zza2;
    }

    static int zza(zzli zzliVar, byte[] bArr, int i, int i2, zzhw zzhwVar) throws IOException {
        Object zza = zzliVar.zza();
        int zza2 = zza(zza, zzliVar, bArr, i, i2, zzhwVar);
        zzliVar.zzc(zza);
        zzhwVar.zzc = zza;
        return zza2;
    }

    static int zza(zzli<?> zzliVar, int i, byte[] bArr, int i2, int i3, zzjq<?> zzjqVar, zzhw zzhwVar) throws IOException {
        int zza = zza(zzliVar, bArr, i2, i3, zzhwVar);
        zzjqVar.add(zzhwVar.zzc);
        while (zza < i3) {
            int zzc = zzc(bArr, zza, zzhwVar);
            if (i != zzhwVar.zza) {
                break;
            }
            zza = zza(zzliVar, bArr, zzc, i3, zzhwVar);
            zzjqVar.add(zzhwVar.zzc);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i, zzjq<?> zzjqVar, zzhw zzhwVar) throws IOException {
        zzjl zzjlVar = (zzjl) zzjqVar;
        int zzc = zzc(bArr, i, zzhwVar);
        int i2 = zzhwVar.zza + zzc;
        while (zzc < i2) {
            zzc = zzc(bArr, zzc, zzhwVar);
            zzjlVar.zzd(zzhwVar.zza);
        }
        if (zzc == i2) {
            return zzc;
        }
        throw zzjt.zzh();
    }

    static int zzb(byte[] bArr, int i, zzhw zzhwVar) throws zzjt {
        int zzc = zzc(bArr, i, zzhwVar);
        int i2 = zzhwVar.zza;
        if (i2 < 0) {
            throw zzjt.zzf();
        }
        if (i2 == 0) {
            zzhwVar.zzc = "";
            return zzc;
        }
        zzhwVar.zzc = zzmi.zzb(bArr, zzc, i2);
        return zzc + i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzmf zzmfVar, zzhw zzhwVar) throws zzjt {
        if ((i >>> 3) == 0) {
            throw zzjt.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzd = zzd(bArr, i2, zzhwVar);
            zzmfVar.zza(i, Long.valueOf(zzhwVar.zzb));
            return zzd;
        }
        if (i4 == 1) {
            zzmfVar.zza(i, Long.valueOf(zzd(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzc = zzc(bArr, i2, zzhwVar);
            int i5 = zzhwVar.zza;
            if (i5 < 0) {
                throw zzjt.zzf();
            }
            if (i5 > bArr.length - zzc) {
                throw zzjt.zzh();
            }
            if (i5 == 0) {
                zzmfVar.zza(i, zzhx.zza);
            } else {
                zzmfVar.zza(i, zzhx.zza(bArr, zzc, i5));
            }
            return zzc + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzmfVar.zza(i, Integer.valueOf(zzc(bArr, i2)));
                return i2 + 4;
            }
            throw zzjt.zzc();
        }
        zzmf zzd2 = zzmf.zzd();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzc2 = zzc(bArr, i2, zzhwVar);
            i7 = zzhwVar.zza;
            if (i7 == i6) {
                i2 = zzc2;
                break;
            }
            i2 = zza(i7, bArr, zzc2, i3, zzd2, zzhwVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzjt.zzg();
        }
        zzmfVar.zza(i, zzd2);
        return i2;
    }

    static int zzc(byte[] bArr, int i, zzhw zzhwVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzhwVar.zza = b;
            return i2;
        }
        return zza(b, bArr, i2, zzhwVar);
    }

    static int zza(int i, byte[] bArr, int i2, zzhw zzhwVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzhwVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzhwVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzhwVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzhwVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzhwVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzjq<?> zzjqVar, zzhw zzhwVar) {
        zzjl zzjlVar = (zzjl) zzjqVar;
        int zzc = zzc(bArr, i2, zzhwVar);
        zzjlVar.zzd(zzhwVar.zza);
        while (zzc < i3) {
            int zzc2 = zzc(bArr, zzc, zzhwVar);
            if (i != zzhwVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzhwVar);
            zzjlVar.zzd(zzhwVar.zza);
        }
        return zzc;
    }

    static int zzd(byte[] bArr, int i, zzhw zzhwVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzhwVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzhwVar.zzb = j2;
        return i3;
    }

    static int zza(Object obj, zzli zzliVar, byte[] bArr, int i, int i2, int i3, zzhw zzhwVar) throws IOException {
        int zza = ((zzku) zzliVar).zza((zzku) obj, bArr, i, i2, i3, zzhwVar);
        zzhwVar.zzc = obj;
        return zza;
    }

    static int zza(Object obj, zzli zzliVar, byte[] bArr, int i, int i2, zzhw zzhwVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzhwVar);
            i4 = zzhwVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzjt.zzh();
        }
        int i6 = i5 + i4;
        zzliVar.zza(obj, bArr, i5, i6, zzhwVar);
        zzhwVar.zzc = obj;
        return i6;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzhw zzhwVar) throws zzjt {
        if ((i >>> 3) == 0) {
            throw zzjt.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzd(bArr, i2, zzhwVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzc(bArr, i2, zzhwVar) + zzhwVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzjt.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzc(bArr, i2, zzhwVar);
            i6 = zzhwVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzhwVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzjt.zzg();
        }
        return i2;
    }

    static long zzd(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
