package com.google.android.gms.internal.measurement;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
final class zzkx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zzkw zzkwVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzb(b10, bArr, i11, zzkwVar);
        }
        zzkwVar.zza = b10;
        return i11;
    }

    public static int zzb(int i10, byte[] bArr, int i11, zzkw zzkwVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzkwVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzkwVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzkwVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzkwVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzkwVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzc(byte[] bArr, int i10, zzkw zzkwVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzkwVar.zzb = j10;
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
        zzkwVar.zzb = j11;
        return i12;
    }

    public static int zzd(byte[] bArr, int i10) {
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
        int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static long zze(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i10, zzkw zzkwVar) {
        int i11;
        int zza2 = zza(bArr, i10, zzkwVar);
        int i12 = zzkwVar.zza;
        if (i12 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zzkwVar.zzc = "";
            return zza2;
        }
        int i13 = zzos.zza;
        int length = bArr.length;
        if ((((length - zza2) - i12) | zza2 | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zza2), Integer.valueOf(i12)));
        }
        int i14 = zza2 + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (zza2 < i14) {
            byte b10 = bArr[zza2];
            if (!zzoq.zza(b10)) {
                break;
            }
            zza2++;
            cArr[i15] = (char) b10;
            i15++;
        }
        int i16 = i15;
        while (zza2 < i14) {
            int i17 = zza2 + 1;
            byte b11 = bArr[zza2];
            if (zzoq.zza(b11)) {
                cArr[i16] = (char) b11;
                i16++;
                zza2 = i17;
                while (zza2 < i14) {
                    byte b12 = bArr[zza2];
                    if (zzoq.zza(b12)) {
                        zza2++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i17 >= i14) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    zza2 += 2;
                    zzoq.zzb(b11, bArr[i17], cArr, i16);
                } else if (b11 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = zza2 + 2;
                    zza2 += 3;
                    zzoq.zzc(b11, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i17];
                    int i19 = zza2 + 3;
                    byte b14 = bArr[zza2 + 2];
                    zza2 += 4;
                    zzoq.zzd(b11, b13, b14, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        zzkwVar.zzc = new String(cArr, 0, i16);
        return i14;
    }

    public static int zzg(byte[] bArr, int i10, zzkw zzkwVar) {
        int zza2 = zza(bArr, i10, zzkwVar);
        int i11 = zzkwVar.zza;
        if (i11 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - zza2) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzkwVar.zzc = zzlh.zzb;
            return zza2;
        }
        zzkwVar.zzc = zzlh.zzh(bArr, zza2, i11);
        return zza2 + i11;
    }

    public static int zzh(zznx zznxVar, byte[] bArr, int i10, int i11, zzkw zzkwVar) {
        Object zza2 = zznxVar.zza();
        int zzj = zzj(zza2, zznxVar, bArr, i10, i11, zzkwVar);
        zznxVar.zzj(zza2);
        zzkwVar.zzc = zza2;
        return zzj;
    }

    public static int zzi(zznx zznxVar, byte[] bArr, int i10, int i11, int i12, zzkw zzkwVar) {
        Object zza2 = zznxVar.zza();
        int zzk = zzk(zza2, zznxVar, bArr, i10, i11, i12, zzkwVar);
        zznxVar.zzj(zza2);
        zzkwVar.zzc = zza2;
        return zzk;
    }

    public static int zzj(Object obj, zznx zznxVar, byte[] bArr, int i10, int i11, zzkw zzkwVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzb(i13, bArr, i12, zzkwVar);
            i13 = zzkwVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = zzkwVar.zze + 1;
        zzkwVar.zze = i15;
        zzq(i15);
        int i16 = i14 + i13;
        zznxVar.zzi(obj, bArr, i14, i16, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return i16;
    }

    public static int zzk(Object obj, zznx zznxVar, byte[] bArr, int i10, int i11, int i12, zzkw zzkwVar) {
        int i13 = zzkwVar.zze + 1;
        zzkwVar.zze = i13;
        zzq(i13);
        int zzh = ((zznp) zznxVar).zzh(obj, bArr, i10, i11, i12, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return zzh;
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzmo zzmoVar, zzkw zzkwVar) {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int zza2 = zza(bArr, i11, zzkwVar);
        zzmgVar.zzh(zzkwVar.zza);
        while (zza2 < i12) {
            int zza3 = zza(bArr, zza2, zzkwVar);
            if (i10 != zzkwVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        return zza2;
    }

    public static int zzm(byte[] bArr, int i10, zzmo zzmoVar, zzkw zzkwVar) {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int zza2 = zza(bArr, i10, zzkwVar);
        int i11 = zzkwVar.zza + zza2;
        while (zza2 < i11) {
            zza2 = zza(bArr, zza2, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        if (zza2 == i11) {
            return zza2;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zznx zznxVar, int i10, byte[] bArr, int i11, int i12, zzmo zzmoVar, zzkw zzkwVar) {
        int zzh = zzh(zznxVar, bArr, i11, i12, zzkwVar);
        zzmoVar.add(zzkwVar.zzc);
        while (zzh < i12) {
            int zza2 = zza(bArr, zzh, zzkwVar);
            if (i10 != zzkwVar.zza) {
                break;
            }
            zzh = zzh(zznxVar, bArr, zza2, i12, zzkwVar);
            zzmoVar.add(zzkwVar.zzc);
        }
        return zzh;
    }

    public static int zzo(int i10, byte[] bArr, int i11, int i12, zzoj zzojVar, zzkw zzkwVar) {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzc = zzc(bArr, i11, zzkwVar);
            zzojVar.zzk(i10, Long.valueOf(zzkwVar.zzb));
            return zzc;
        }
        if (i13 == 1) {
            zzojVar.zzk(i10, Long.valueOf(zze(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zza2 = zza(bArr, i11, zzkwVar);
            int i14 = zzkwVar.zza;
            if (i14 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - zza2) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzojVar.zzk(i10, zzlh.zzb);
            } else {
                zzojVar.zzk(i10, zzlh.zzh(bArr, zza2, i14));
            }
            return zza2 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            zzojVar.zzk(i10, Integer.valueOf(zzd(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzoj zzb2 = zzoj.zzb();
        int i16 = zzkwVar.zze + 1;
        zzkwVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zza3 = zza(bArr, i11, zzkwVar);
            int i18 = zzkwVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = zza3;
                break;
            }
            i11 = zzo(i18, bArr, zza3, i12, zzb2, zzkwVar);
            i17 = i18;
        }
        zzkwVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzmr("Failed to parse the message.");
        }
        zzojVar.zzk(i10, zzb2);
        return i11;
    }

    public static int zzp(int i10, byte[] bArr, int i11, int i12, zzkw zzkwVar) {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzc(bArr, i11, zzkwVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zza(bArr, i11, zzkwVar) + zzkwVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zza(bArr, i11, zzkwVar);
            i15 = zzkwVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzp(i15, bArr, i11, i12, zzkwVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzmr("Failed to parse the message.");
        }
        return i11;
    }

    private static void zzq(int i10) {
        if (i10 >= zzb) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
