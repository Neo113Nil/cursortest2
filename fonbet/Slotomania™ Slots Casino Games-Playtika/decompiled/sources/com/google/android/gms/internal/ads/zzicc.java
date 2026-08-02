package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzicc {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, zzicb zzicbVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzicbVar);
        }
        zzicbVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, zzicb zzicbVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzicbVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzicbVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzicbVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzicbVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzicbVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, zzicb zzicbVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzicbVar.zzb = j;
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
        zzicbVar.zzb = j2;
        return i3;
    }

    static int zzd(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static long zze(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static int zzf(byte[] bArr, int i, zzicb zzicbVar) throws zzieg {
        int zza2 = zza(bArr, i, zzicbVar);
        int i2 = zzicbVar.zza;
        if (i2 < 0) {
            throw new zzieg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zzicbVar.zzc = "";
            return zza2;
        }
        zzicbVar.zzc = zzigt.zze(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzg(byte[] bArr, int i, zzicb zzicbVar) throws zzieg {
        int zza2 = zza(bArr, i, zzicbVar);
        int i2 = zzicbVar.zza;
        if (i2 < 0) {
            throw new zzieg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zza2) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzicbVar.zzc = zzicn.zza;
            return zza2;
        }
        zzicbVar.zzc = zzicn.zzt(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzh(zzifu zzifuVar, byte[] bArr, int i, int i2, zzicb zzicbVar) throws IOException {
        Object zza2 = zzifuVar.zza();
        int zzj = zzj(zza2, zzifuVar, bArr, i, i2, zzicbVar);
        zzifuVar.zzk(zza2);
        zzicbVar.zzc = zza2;
        return zzj;
    }

    static int zzi(zzifu zzifuVar, byte[] bArr, int i, int i2, int i3, zzicb zzicbVar) throws IOException {
        Object zza2 = zzifuVar.zza();
        int zzk = zzk(zza2, zzifuVar, bArr, i, i2, i3, zzicbVar);
        zzifuVar.zzk(zza2);
        zzicbVar.zzc = zza2;
        return zzk;
    }

    static int zzj(Object obj, zzifu zzifuVar, byte[] bArr, int i, int i2, zzicb zzicbVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzicbVar);
            i4 = zzicbVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzicbVar.zze + 1;
        zzicbVar.zze = i6;
        zzq(i6);
        int i7 = i5 + i4;
        zzifuVar.zzj(obj, bArr, i5, i7, zzicbVar);
        zzicbVar.zze--;
        zzicbVar.zzc = obj;
        return i7;
    }

    static int zzk(Object obj, zzifu zzifuVar, byte[] bArr, int i, int i2, int i3, zzicb zzicbVar) throws IOException {
        int i4 = zzicbVar.zze + 1;
        zzicbVar.zze = i4;
        zzq(i4);
        int zzi = ((zziff) zzifuVar).zzi(obj, bArr, i, i2, i3, zzicbVar);
        zzicbVar.zze--;
        zzicbVar.zzc = obj;
        return zzi;
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzied zziedVar, zzicb zzicbVar) {
        zzids zzidsVar = (zzids) zziedVar;
        int zza2 = zza(bArr, i2, zzicbVar);
        zzidsVar.zzi(zzicbVar.zza);
        while (zza2 < i3) {
            int zza3 = zza(bArr, zza2, zzicbVar);
            if (i != zzicbVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzicbVar);
            zzidsVar.zzi(zzicbVar.zza);
        }
        return zza2;
    }

    static int zzm(byte[] bArr, int i, zzied zziedVar, zzicb zzicbVar) throws IOException {
        zzids zzidsVar = (zzids) zziedVar;
        int zza2 = zza(bArr, i, zzicbVar);
        int i2 = zzicbVar.zza + zza2;
        while (zza2 < i2) {
            zza2 = zza(bArr, zza2, zzicbVar);
            zzidsVar.zzi(zzicbVar.zza);
        }
        if (zza2 == i2) {
            return zza2;
        }
        throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(zzifu zzifuVar, int i, byte[] bArr, int i2, int i3, zzied zziedVar, zzicb zzicbVar) throws IOException {
        int zzh = zzh(zzifuVar, bArr, i2, i3, zzicbVar);
        zziedVar.add(zzicbVar.zzc);
        while (zzh < i3) {
            int zza2 = zza(bArr, zzh, zzicbVar);
            if (i != zzicbVar.zza) {
                break;
            }
            zzh = zzh(zzifuVar, bArr, zza2, i3, zzicbVar);
            zziedVar.add(zzicbVar.zzc);
        }
        return zzh;
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, zzigi zzigiVar, zzicb zzicbVar) throws zzieg {
        if ((i >>> 3) == 0) {
            throw new zzieg("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzc = zzc(bArr, i2, zzicbVar);
            zzigiVar.zzk(i, Long.valueOf(zzicbVar.zzb));
            return zzc;
        }
        if (i4 == 1) {
            zzigiVar.zzk(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza2 = zza(bArr, i2, zzicbVar);
            int i5 = zzicbVar.zza;
            if (i5 < 0) {
                throw new zzieg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zza2) {
                throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzigiVar.zzk(i, zzicn.zza);
            } else {
                zzigiVar.zzk(i, zzicn.zzt(bArr, zza2, i5));
            }
            return zza2 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzieg("Protocol message contained an invalid tag (zero).");
            }
            zzigiVar.zzk(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzigi zzb2 = zzigi.zzb();
        int i7 = zzicbVar.zze + 1;
        zzicbVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza3 = zza(bArr, i2, zzicbVar);
            int i9 = zzicbVar.zza;
            if (i9 == i6) {
                i8 = i9;
                i2 = zza3;
                break;
            }
            i2 = zzo(i9, bArr, zza3, i3, zzb2, zzicbVar);
            i8 = i9;
        }
        zzicbVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzieg("Failed to parse the message.");
        }
        zzigiVar.zzk(i, zzb2);
        return i2;
    }

    static int zzp(int i, byte[] bArr, int i2, int i3, zzicb zzicbVar) throws zzieg {
        if ((i >>> 3) == 0) {
            throw new zzieg("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zzicbVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzicbVar) + zzicbVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzieg("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzicbVar);
            i6 = zzicbVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, zzicbVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new zzieg("Failed to parse the message.");
        }
        return i2;
    }

    private static void zzq(int i) throws zzieg {
        if (i >= zzb) {
            throw new zzieg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
