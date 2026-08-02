package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
final class zzajr {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int zzd(byte[] bArr, int i10, zzaju zzajuVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzajuVar.zzb = j10;
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
        zzajuVar.zzb = j11;
        return i12;
    }

    public static int zza(byte[] bArr, int i10, zzaju zzajuVar) {
        int zzc = zzc(bArr, i10, zzajuVar);
        int i11 = zzajuVar.zza;
        if (i11 < 0) {
            throw zzall.zzf();
        }
        if (i11 > bArr.length - zzc) {
            throw zzall.zzj();
        }
        if (i11 == 0) {
            zzajuVar.zzc = zzajv.zza;
            return zzc;
        }
        zzajuVar.zzc = zzajv.zza(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zzb(zzanb<?> zzanbVar, int i10, byte[] bArr, int i11, int i12, zzalm<?> zzalmVar, zzaju zzajuVar) {
        int zza2 = zza(zzanbVar, bArr, i11, i12, zzajuVar);
        zzalmVar.add(zzajuVar.zzc);
        while (zza2 < i12) {
            int zzc = zzc(bArr, zza2, zzajuVar);
            if (i10 != zzajuVar.zza) {
                break;
            }
            zza2 = zza(zzanbVar, bArr, zzc, i12, zzajuVar);
            zzalmVar.add(zzajuVar.zzc);
        }
        return zza2;
    }

    public static int zzc(byte[] bArr, int i10, zzaju zzajuVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzajuVar);
        }
        zzajuVar.zza = b10;
        return i11;
    }

    public static long zzd(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i10, zzaju zzajuVar) {
        int zzc = zzc(bArr, i10, zzajuVar);
        int i11 = zzajuVar.zza;
        if (i11 < 0) {
            throw zzall.zzf();
        }
        if (i11 == 0) {
            zzajuVar.zzc = "";
            return zzc;
        }
        zzajuVar.zzc = zzaoa.zzb(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, Object obj, zzamm zzammVar, zzanu<zzanx, zzanx> zzanuVar, zzaju zzajuVar) {
        if (zzajuVar.zzd.zza(zzammVar, i10 >>> 3) == null) {
            return zza(i10, bArr, i11, i12, zzamq.zzc(obj), zzajuVar);
        }
        zzalf.zzd zzdVar = (zzalf.zzd) obj;
        zzdVar.zza();
        zzakx<zzalf.zzc> zzakxVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i10, int i11, int i12, zzaju zzajuVar) {
        T zza2 = zzanbVar.zza();
        int zza3 = zza(zza2, zzanbVar, bArr, i10, i11, i12, zzajuVar);
        zzanbVar.zzd(zza2);
        zzajuVar.zzc = zza2;
        return zza3;
    }

    public static int zza(zzanb<?> zzanbVar, int i10, byte[] bArr, int i11, int i12, zzalm<Object> zzalmVar, zzaju zzajuVar) {
        int i13 = (i10 & (-8)) | 4;
        int zza2 = zza(zzanbVar, bArr, i11, i12, i13, zzajuVar);
        zzalmVar.add(zzajuVar.zzc);
        while (zza2 < i12) {
            int zzc = zzc(bArr, zza2, zzajuVar);
            if (i10 != zzajuVar.zza) {
                break;
            }
            zza2 = zza(zzanbVar, bArr, zzc, i12, i13, zzajuVar);
            zzalmVar.add(zzajuVar.zzc);
        }
        return zza2;
    }

    public static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i10, int i11, zzaju zzajuVar) {
        T zza2 = zzanbVar.zza();
        int zza3 = zza(zza2, zzanbVar, bArr, i10, i11, zzajuVar);
        zzanbVar.zzd(zza2);
        zzajuVar.zzc = zza2;
        return zza3;
    }

    public static int zza(byte[] bArr, int i10, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int zzc = zzc(bArr, i10, zzajuVar);
        int i11 = zzajuVar.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzall.zzj();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzanx zzanxVar, zzaju zzajuVar) {
        if ((i10 >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzd = zzd(bArr, i11, zzajuVar);
            zzanxVar.zza(i10, Long.valueOf(zzajuVar.zzb));
            return zzd;
        }
        if (i13 == 1) {
            zzanxVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzc = zzc(bArr, i11, zzajuVar);
            int i14 = zzajuVar.zza;
            if (i14 >= 0) {
                if (i14 > bArr.length - zzc) {
                    throw zzall.zzj();
                }
                if (i14 == 0) {
                    zzanxVar.zza(i10, zzajv.zza);
                } else {
                    zzanxVar.zza(i10, zzajv.zza(bArr, zzc, i14));
                }
                return zzc + i14;
            }
            throw zzall.zzf();
        }
        if (i13 != 3) {
            if (i13 == 5) {
                zzanxVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
                return i11 + 4;
            }
            throw zzall.zzc();
        }
        zzanx zzd2 = zzanx.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = zzajuVar.zze + 1;
        zzajuVar.zze = i16;
        zza(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, i11, zzajuVar);
            i17 = zzajuVar.zza;
            if (i17 == i15) {
                i11 = zzc2;
                break;
            }
            i11 = zza(i17, bArr, zzc2, i12, zzd2, zzajuVar);
        }
        zzajuVar.zze--;
        if (i11 <= i12 && i17 == i15) {
            zzanxVar.zza(i10, zzd2);
            return i11;
        }
        throw zzall.zzg();
    }

    public static int zza(int i10, byte[] bArr, int i11, zzaju zzajuVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzajuVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzajuVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzajuVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzajuVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzajuVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int zzc = zzc(bArr, i11, zzajuVar);
        zzaliVar.zzc(zzajuVar.zza);
        while (zzc < i12) {
            int zzc2 = zzc(bArr, zzc, zzajuVar);
            if (i10 != zzajuVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        return zzc;
    }

    public static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i10, int i11, int i12, zzaju zzajuVar) {
        int i13 = zzajuVar.zze + 1;
        zzajuVar.zze = i13;
        zza(i13);
        int zza2 = ((zzamq) zzanbVar).zza((zzamq) obj, bArr, i10, i11, i12, zzajuVar);
        zzajuVar.zze--;
        zzajuVar.zzc = obj;
        return zza2;
    }

    public static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i10, int i11, zzaju zzajuVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zza(i13, bArr, i12, zzajuVar);
            i13 = zzajuVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = zzajuVar.zze + 1;
            zzajuVar.zze = i15;
            zza(i15);
            int i16 = i14 + i13;
            zzanbVar.zza(obj, bArr, i14, i16, zzajuVar);
            zzajuVar.zze--;
            zzajuVar.zzc = obj;
            return i16;
        }
        throw zzall.zzj();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzaju zzajuVar) {
        if ((i10 >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzajuVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzajuVar) + zzajuVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzall.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzajuVar);
            i15 = zzajuVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzajuVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzall.zzg();
        }
        return i11;
    }

    private static void zza(int i10) {
        if (i10 >= zza) {
            throw zzall.zzh();
        }
    }
}
