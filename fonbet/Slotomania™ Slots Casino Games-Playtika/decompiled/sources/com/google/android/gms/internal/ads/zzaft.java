package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzaft {
    @Pure
    public static void zza(boolean z, String str) throws zzat {
        if (!z) {
            throw zzat.zzb(str, null);
        }
    }

    public static int zzb(zzafq zzafqVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzg = zzafqVar.zzg(bArr, i + i3, i2 - i3);
            if (zzg == -1) {
                break;
            }
            i3 += zzg;
        }
        return i3;
    }

    public static boolean zzc(zzafq zzafqVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            zzafqVar.zzc(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzafq zzafqVar, int i) throws IOException {
        try {
            zzafqVar.zzf(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzafq zzafqVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzafqVar.zzh(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int zzf(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
        }
        switch (i) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
                return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return 100000;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND;
            default:
                switch (i) {
                    case 14:
                        return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
                    case 15:
                        return 8000;
                    case 16:
                        return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
                    case 17:
                        return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
                    case 18:
                        return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
                    default:
                        return C.RATE_UNSET_INT;
                }
        }
    }
}
