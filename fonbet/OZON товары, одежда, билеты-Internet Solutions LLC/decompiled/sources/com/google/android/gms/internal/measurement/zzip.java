package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes9.dex */
final class zzip {
    static int zza(byte[] bArr, int i11, zzio zzioVar) throws zzkm {
        int zzj = zzj(bArr, i11, zzioVar);
        int i12 = zzioVar.zza;
        if (i12 < 0) {
            throw zzkm.zzd();
        }
        if (i12 > bArr.length - zzj) {
            throw zzkm.zzf();
        }
        if (i12 == 0) {
            zzioVar.zzc = zzjb.zzb;
            return zzj;
        }
        zzioVar.zzc = zzjb.zzl(bArr, zzj, i12);
        return zzj + i12;
    }

    static int zzb(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    static int zzc(zzlu zzluVar, byte[] bArr, int i11, int i12, int i13, zzio zzioVar) throws IOException {
        zzlm zzlmVar = (zzlm) zzluVar;
        Object zze = zzlmVar.zze();
        int zzc = zzlmVar.zzc(zze, bArr, i11, i12, i13, zzioVar);
        zzlmVar.zzf(zze);
        zzioVar.zzc = zze;
        return zzc;
    }

    static int zzd(zzlu zzluVar, byte[] bArr, int i11, int i12, zzio zzioVar) throws IOException {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = zzk(i14, bArr, i13, zzioVar);
            i14 = zzioVar.zza;
        }
        int i15 = i13;
        if (i14 < 0 || i14 > i12 - i15) {
            throw zzkm.zzf();
        }
        Object zze = zzluVar.zze();
        int i16 = i15 + i14;
        zzluVar.zzh(zze, bArr, i15, i16, zzioVar);
        zzluVar.zzf(zze);
        zzioVar.zzc = zze;
        return i16;
    }

    static int zze(zzlu zzluVar, int i11, byte[] bArr, int i12, int i13, zzkj zzkjVar, zzio zzioVar) throws IOException {
        int zzd = zzd(zzluVar, bArr, i12, i13, zzioVar);
        zzkjVar.add(zzioVar.zzc);
        while (zzd < i13) {
            int zzj = zzj(bArr, zzd, zzioVar);
            if (i11 != zzioVar.zza) {
                break;
            }
            zzd = zzd(zzluVar, bArr, zzj, i13, zzioVar);
            zzkjVar.add(zzioVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i11, zzkj zzkjVar, zzio zzioVar) throws IOException {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int zzj = zzj(bArr, i11, zzioVar);
        int i12 = zzioVar.zza + zzj;
        while (zzj < i12) {
            zzj = zzj(bArr, zzj, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        if (zzj == i12) {
            return zzj;
        }
        throw zzkm.zzf();
    }

    static int zzg(byte[] bArr, int i11, zzio zzioVar) throws zzkm {
        int zzj = zzj(bArr, i11, zzioVar);
        int i12 = zzioVar.zza;
        if (i12 < 0) {
            throw zzkm.zzd();
        }
        if (i12 == 0) {
            zzioVar.zzc = "";
            return zzj;
        }
        zzioVar.zzc = new String(bArr, zzj, i12, zzkk.zzb);
        return zzj + i12;
    }

    static int zzh(byte[] bArr, int i11, zzio zzioVar) throws zzkm {
        int zzj = zzj(bArr, i11, zzioVar);
        int i12 = zzioVar.zza;
        if (i12 < 0) {
            throw zzkm.zzd();
        }
        if (i12 == 0) {
            zzioVar.zzc = "";
            return zzj;
        }
        zzioVar.zzc = zzna.zzd(bArr, zzj, i12);
        return zzj + i12;
    }

    static int zzi(int i11, byte[] bArr, int i12, int i13, zzmm zzmmVar, zzio zzioVar) throws zzkm {
        if ((i11 >>> 3) == 0) {
            throw zzkm.zzb();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int zzm = zzm(bArr, i12, zzioVar);
            zzmmVar.zzh(i11, Long.valueOf(zzioVar.zzb));
            return zzm;
        }
        if (i14 == 1) {
            zzmmVar.zzh(i11, Long.valueOf(zzn(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int zzj = zzj(bArr, i12, zzioVar);
            int i15 = zzioVar.zza;
            if (i15 < 0) {
                throw zzkm.zzd();
            }
            if (i15 > bArr.length - zzj) {
                throw zzkm.zzf();
            }
            if (i15 == 0) {
                zzmmVar.zzh(i11, zzjb.zzb);
            } else {
                zzmmVar.zzh(i11, zzjb.zzl(bArr, zzj, i15));
            }
            return zzj + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw zzkm.zzb();
            }
            zzmmVar.zzh(i11, Integer.valueOf(zzb(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzmm zze = zzmm.zze();
        int i17 = 0;
        while (true) {
            if (i12 >= i13) {
                break;
            }
            int zzj2 = zzj(bArr, i12, zzioVar);
            i17 = zzioVar.zza;
            if (i17 == i16) {
                i12 = zzj2;
                break;
            }
            i12 = zzi(i17, bArr, zzj2, i13, zze, zzioVar);
        }
        if (i12 > i13 || i17 != i16) {
            throw zzkm.zze();
        }
        zzmmVar.zzh(i11, zze);
        return i12;
    }

    static int zzj(byte[] bArr, int i11, zzio zzioVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zzk(b11, bArr, i12, zzioVar);
        }
        zzioVar.zza = b11;
        return i12;
    }

    static int zzk(int i11, byte[] bArr, int i12, zzio zzioVar) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzioVar.zza = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzioVar.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzioVar.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzioVar.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzioVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int zzl(int i11, byte[] bArr, int i12, int i13, zzkj zzkjVar, zzio zzioVar) {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int zzj = zzj(bArr, i12, zzioVar);
        zzkdVar.zzh(zzioVar.zza);
        while (zzj < i13) {
            int zzj2 = zzj(bArr, zzj, zzioVar);
            if (i11 != zzioVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i11, zzio zzioVar) {
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            zzioVar.zzb = j11;
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
        zzioVar.zzb = j12;
        return i13;
    }

    static long zzn(byte[] bArr, int i11) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }
}
