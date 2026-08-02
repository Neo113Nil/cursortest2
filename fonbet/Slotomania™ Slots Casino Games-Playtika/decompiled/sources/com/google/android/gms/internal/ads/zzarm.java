package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzarm {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, Ascii.DLE, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzafq zzafqVar) throws IOException {
        zzes zzesVar = new zzes(8);
        int i = zzarl.zza(zzafqVar, zzesVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzafqVar.zzi(zzesVar.zzi(), 0, 4);
        zzesVar.zzh(0);
        int zzB = zzesVar.zzB();
        if (zzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(zzB);
        zzef.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzark zzb(zzafq zzafqVar) throws IOException {
        byte[] bArr;
        int i;
        byte[] bArr2;
        zzes zzesVar = new zzes(16);
        long j = zzd(WavUtil.FMT_FOURCC, zzafqVar, zzesVar).zzb;
        zzgsw.zzi(j >= 16);
        zzafqVar.zzi(zzesVar.zzi(), 0, 16);
        zzesVar.zzh(0);
        int zzu = zzesVar.zzu();
        int zzu2 = zzesVar.zzu();
        int zzI = zzesVar.zzI();
        int zzI2 = zzesVar.zzI();
        int zzu3 = zzesVar.zzu();
        int zzu4 = zzesVar.zzu();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            bArr = new byte[i2];
            zzafqVar.zzi(bArr, 0, i2);
            if (zzu == 65534) {
                if (i2 != 24) {
                    bArr2 = bArr;
                    i = 65534;
                    zzafqVar.zzf((int) (zzafqVar.zzm() - zzafqVar.zzn()));
                    return new zzark(i, zzu2, zzI, zzI2, zzu3, zzu4, bArr2);
                }
                zzes zzesVar2 = new zzes(bArr);
                zzesVar2.zzu();
                int zzu5 = zzesVar2.zzu();
                if (zzu5 != 0 && zzu5 != zzu4) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzu5).length() + 33 + String.valueOf(zzu4).length() + 19);
                    sb.append("validBits ( ");
                    sb.append(zzu5);
                    sb.append(")  != bitsPerSample( ");
                    sb.append(zzu4);
                    sb.append(") are not supported");
                    throw zzat.zzc(sb.toString());
                }
                int zzI3 = zzesVar2.zzI();
                if ((zzI3 >> 18) != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzI3).length() + 21);
                    sb2.append("invalid channel mask ");
                    sb2.append(zzI3);
                    throw zzat.zzc(sb2.toString());
                }
                if (zzI3 != 0 && Integer.bitCount(zzI3) != zzu2) {
                    int bitCount = Integer.bitCount(zzI3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(bitCount).length() + 46 + String.valueOf(zzI3).length());
                    sb3.append("invalid number of channels (");
                    sb3.append(bitCount);
                    sb3.append(") in channel mask ");
                    sb3.append(zzI3);
                    throw zzat.zzc(sb3.toString());
                }
                zzu = zzesVar2.zzu();
                byte[] bArr3 = new byte[14];
                zzesVar2.zzm(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                    throw zzat.zzc("invalid wav format extension guid");
                }
            }
        } else {
            bArr = zzfk.zzb;
        }
        i = zzu;
        bArr2 = bArr;
        zzafqVar.zzf((int) (zzafqVar.zzm() - zzafqVar.zzn()));
        return new zzark(i, zzu2, zzI, zzI2, zzu3, zzu4, bArr2);
    }

    public static Pair zzc(zzafq zzafqVar) throws IOException {
        zzafqVar.zzl();
        zzarl zzd = zzd(1684108385, zzafqVar, new zzes(8));
        zzafqVar.zzf(8);
        return Pair.create(Long.valueOf(zzafqVar.zzn()), Long.valueOf(zzd.zzb));
    }

    private static zzarl zzd(int i, zzafq zzafqVar, zzes zzesVar) throws IOException {
        zzarl zza2 = zzarl.zza(zzafqVar, zzesVar);
        while (true) {
            int i2 = zza2.zza;
            if (i2 == i) {
                return zza2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i2);
            zzef.zzc("WavHeaderReader", sb.toString());
            long j = zza2.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i2);
                throw zzat.zzc(sb2.toString());
            }
            zzafqVar.zzf((int) j2);
            zza2 = zzarl.zza(zzafqVar, zzesVar);
        }
    }
}
