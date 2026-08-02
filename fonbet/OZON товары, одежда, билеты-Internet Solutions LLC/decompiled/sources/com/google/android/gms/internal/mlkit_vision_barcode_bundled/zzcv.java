package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* loaded from: classes9.dex */
final class zzcv {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i11, zzcu zzcuVar) throws zzer {
        int zzj = zzj(bArr, i11, zzcuVar);
        int i12 = zzcuVar.zza;
        if (i12 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - zzj) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            zzcuVar.zzc = zzdf.zzb;
            return zzj;
        }
        zzcuVar.zzc = zzdf.zzr(bArr, zzj, i12);
        return zzj + i12;
    }

    static int zzb(int i11, byte[] bArr, int i12, int i13, zzed zzedVar, zzef zzefVar, zzgs zzgsVar, zzcu zzcuVar) throws IOException {
        zzdx zzdxVar = zzedVar.zzb;
        zzhf zzhfVar = zzefVar.zzb.zzb;
        Object obj = null;
        if (zzhfVar == zzhf.zzn) {
            zzj(bArr, i12, zzcuVar);
            throw null;
        }
        switch (zzhfVar.ordinal()) {
            case 0:
                i12 += 8;
                obj = Double.valueOf(Double.longBitsToDouble(zzq(bArr, i12)));
                break;
            case 1:
                i12 += 4;
                obj = Float.valueOf(Float.intBitsToFloat(zzc(bArr, i12)));
                break;
            case 2:
            case 3:
                i12 = zzm(bArr, i12, zzcuVar);
                obj = Long.valueOf(zzcuVar.zzb);
                break;
            case 4:
            case 12:
                i12 = zzj(bArr, i12, zzcuVar);
                obj = Integer.valueOf(zzcuVar.zza);
                break;
            case 5:
            case 15:
                i12 += 8;
                obj = Long.valueOf(zzq(bArr, i12));
                break;
            case 6:
            case 14:
                i12 += 4;
                obj = Integer.valueOf(zzc(bArr, i12));
                break;
            case 7:
                i12 = zzm(bArr, i12, zzcuVar);
                obj = Boolean.valueOf(zzcuVar.zzb != 0);
                break;
            case 8:
                i12 = zzh(bArr, i12, zzcuVar);
                obj = zzcuVar.zzc;
                break;
            case 9:
                int i14 = ((i11 >>> 3) << 3) | 4;
                zzge zzb2 = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object zze = zzdxVar.zze(zzefVar.zzb);
                if (zze == null) {
                    zze = zzb2.zze();
                    zzdxVar.zzi(zzefVar.zzb, zze);
                }
                return zzn(zze, zzb2, bArr, i12, i13, i14, zzcuVar);
            case 10:
                zzge zzb3 = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object zze2 = zzdxVar.zze(zzefVar.zzb);
                if (zze2 == null) {
                    zze2 = zzb3.zze();
                    zzdxVar.zzi(zzefVar.zzb, zze2);
                }
                return zzo(zze2, zzb3, bArr, i12, i13, zzcuVar);
            case 11:
                i12 = zza(bArr, i12, zzcuVar);
                obj = zzcuVar.zzc;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i12 = zzj(bArr, i12, zzcuVar);
                obj = Integer.valueOf(zzdj.zzb(zzcuVar.zza));
                break;
            case 17:
                i12 = zzm(bArr, i12, zzcuVar);
                obj = Long.valueOf(zzdj.zzc(zzcuVar.zzb));
                break;
        }
        zzdxVar.zzi(zzefVar.zzb, obj);
        return i12;
    }

    static int zzc(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    static int zzd(zzge zzgeVar, byte[] bArr, int i11, int i12, int i13, zzcu zzcuVar) throws IOException {
        Object zze = zzgeVar.zze();
        int zzn = zzn(zze, zzgeVar, bArr, i11, i12, i13, zzcuVar);
        zzgeVar.zzf(zze);
        zzcuVar.zzc = zze;
        return zzn;
    }

    static int zze(zzge zzgeVar, byte[] bArr, int i11, int i12, zzcu zzcuVar) throws IOException {
        Object zze = zzgeVar.zze();
        int zzo = zzo(zze, zzgeVar, bArr, i11, i12, zzcuVar);
        zzgeVar.zzf(zze);
        zzcuVar.zzc = zze;
        return zzo;
    }

    static int zzf(zzge zzgeVar, int i11, byte[] bArr, int i12, int i13, zzeo zzeoVar, zzcu zzcuVar) throws IOException {
        int zze = zze(zzgeVar, bArr, i12, i13, zzcuVar);
        zzeoVar.add(zzcuVar.zzc);
        while (zze < i13) {
            int zzj = zzj(bArr, zze, zzcuVar);
            if (i11 != zzcuVar.zza) {
                break;
            }
            zze = zze(zzgeVar, bArr, zzj, i13, zzcuVar);
            zzeoVar.add(zzcuVar.zzc);
        }
        return zze;
    }

    static int zzg(byte[] bArr, int i11, zzeo zzeoVar, zzcu zzcuVar) throws IOException {
        zzei zzeiVar = (zzei) zzeoVar;
        int zzj = zzj(bArr, i11, zzcuVar);
        int i12 = zzcuVar.zza + zzj;
        while (zzj < i12) {
            zzj = zzj(bArr, zzj, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        if (zzj == i12) {
            return zzj;
        }
        throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzh(byte[] bArr, int i11, zzcu zzcuVar) throws zzer {
        int zzj = zzj(bArr, i11, zzcuVar);
        int i12 = zzcuVar.zza;
        if (i12 < 0) {
            throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zzcuVar.zzc = "";
            return zzj;
        }
        zzcuVar.zzc = new String(bArr, zzj, i12, zzep.zza);
        return zzj + i12;
    }

    static int zzi(int i11, byte[] bArr, int i12, int i13, zzgt zzgtVar, zzcu zzcuVar) throws zzer {
        if ((i11 >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int zzm = zzm(bArr, i12, zzcuVar);
            zzgtVar.zzj(i11, Long.valueOf(zzcuVar.zzb));
            return zzm;
        }
        if (i14 == 1) {
            zzgtVar.zzj(i11, Long.valueOf(zzq(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int zzj = zzj(bArr, i12, zzcuVar);
            int i15 = zzcuVar.zza;
            if (i15 < 0) {
                throw new zzer("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - zzj) {
                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                zzgtVar.zzj(i11, zzdf.zzb);
            } else {
                zzgtVar.zzj(i11, zzdf.zzr(bArr, zzj, i15));
            }
            return zzj + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zzer("Protocol message contained an invalid tag (zero).");
            }
            zzgtVar.zzj(i11, Integer.valueOf(zzc(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzgt zzf = zzgt.zzf();
        int i17 = zzcuVar.zze + 1;
        zzcuVar.zze = i17;
        zzr(i17);
        int i18 = 0;
        while (true) {
            if (i12 >= i13) {
                break;
            }
            int zzj2 = zzj(bArr, i12, zzcuVar);
            int i19 = zzcuVar.zza;
            if (i19 == i16) {
                i18 = i19;
                i12 = zzj2;
                break;
            }
            i12 = zzi(i19, bArr, zzj2, i13, zzf, zzcuVar);
            i18 = i19;
        }
        zzcuVar.zze--;
        if (i12 > i13 || i18 != i16) {
            throw new zzer("Failed to parse the message.");
        }
        zzgtVar.zzj(i11, zzf);
        return i12;
    }

    static int zzj(byte[] bArr, int i11, zzcu zzcuVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zzk(b11, bArr, i12, zzcuVar);
        }
        zzcuVar.zza = b11;
        return i12;
    }

    static int zzk(int i11, byte[] bArr, int i12, zzcu zzcuVar) {
        byte b11 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b11 >= 0) {
            zzcuVar.zza = i14 | (b11 << 7);
            return i13;
        }
        int i15 = i14 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            zzcuVar.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzcuVar.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzcuVar.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzcuVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int zzl(int i11, byte[] bArr, int i12, int i13, zzeo zzeoVar, zzcu zzcuVar) {
        zzei zzeiVar = (zzei) zzeoVar;
        int zzj = zzj(bArr, i12, zzcuVar);
        zzeiVar.zzg(zzcuVar.zza);
        while (zzj < i13) {
            int zzj2 = zzj(bArr, zzj, zzcuVar);
            if (i11 != zzcuVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i11, zzcu zzcuVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzcuVar.zzb = j11;
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
        zzcuVar.zzb = j12;
        return i13;
    }

    static int zzn(Object obj, zzge zzgeVar, byte[] bArr, int i11, int i12, int i13, zzcu zzcuVar) throws IOException {
        int i14 = zzcuVar.zze + 1;
        zzcuVar.zze = i14;
        zzr(i14);
        int zzc = ((zzfp) zzgeVar).zzc(obj, bArr, i11, i12, i13, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return zzc;
    }

    static int zzo(Object obj, zzge zzgeVar, byte[] bArr, int i11, int i12, zzcu zzcuVar) throws IOException {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = zzk(i14, bArr, i13, zzcuVar);
            i14 = zzcuVar.zza;
        }
        int i15 = i13;
        if (i14 < 0 || i14 > i12 - i15) {
            throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i16 = zzcuVar.zze + 1;
        zzcuVar.zze = i16;
        zzr(i16);
        int i17 = i15 + i14;
        zzgeVar.zzh(obj, bArr, i15, i17, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return i17;
    }

    static int zzp(int i11, byte[] bArr, int i12, int i13, zzcu zzcuVar) throws zzer {
        if ((i11 >>> 3) == 0) {
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return zzm(bArr, i12, zzcuVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return zzj(bArr, i12, zzcuVar) + zzcuVar.zza;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw new zzer("Protocol message contained an invalid tag (zero).");
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = zzj(bArr, i12, zzcuVar);
            i16 = zzcuVar.zza;
            if (i16 == i15) {
                break;
            }
            i12 = zzp(i16, bArr, i12, i13, zzcuVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw new zzer("Failed to parse the message.");
        }
        return i12;
    }

    static long zzq(byte[] bArr, int i11) {
        return (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48) | ((bArr[i11 + 7] & 255) << 56);
    }

    private static void zzr(int i11) throws zzer {
        if (i11 >= zzb) {
            throw new zzer("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
