package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzaeo {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzaen zza(byte[] bArr) throws zzat {
        return zzb(new zzer(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaen zzb(zzer zzerVar, boolean z) throws zzat {
        int i;
        int zzc2 = zzc(zzerVar);
        int zzd = zzd(zzerVar);
        int zzj = zzerVar.zzj(4);
        StringBuilder sb = new StringBuilder(String.valueOf(zzc2).length() + 8);
        sb.append("mp4a.40.");
        sb.append(zzc2);
        String sb2 = sb.toString();
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzerVar);
            zzc2 = zzc(zzerVar);
            if (zzc2 == 22) {
                zzj = zzerVar.zzj(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (zzc2 != 1 && zzc2 != 2 && zzc2 != 3 && zzc2 != 4 && zzc2 != 6 && zzc2 != 7 && zzc2 != 17) {
                switch (zzc2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zzc2).length() + 31);
                        sb3.append("Unsupported audio object type: ");
                        sb3.append(zzc2);
                        throw zzat.zzc(sb3.toString());
                }
            }
            if (zzerVar.zzi()) {
                zzef.zzc("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzerVar.zzi()) {
                zzerVar.zzh(14);
            }
            boolean zzi = zzerVar.zzi();
            if (zzj == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 == 20) {
                    zzc2 = 20;
                }
                if (zzi) {
                    if (zzc2 == 22) {
                        zzerVar.zzh(16);
                        i = 22;
                    } else {
                        i = zzc2;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        zzerVar.zzh(3);
                    }
                    zzerVar.zzh(1);
                }
                switch (zzc2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int zzj2 = zzerVar.zzj(2);
                        if (zzj2 == 2) {
                            i2 = zzj2;
                        }
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + 22);
                        sb4.append("Unsupported epConfig: ");
                        sb4.append(i2);
                        throw zzat.zzc(sb4.toString());
                }
            }
            zzerVar.zzh(3);
            if (zzi) {
            }
            switch (zzc2) {
            }
        }
        int i3 = zzc[zzj];
        if (i3 != -1) {
            return new zzaen(zzd, i3, sb2, null);
        }
        throw zzat.zzb(null, null);
    }

    private static int zzc(zzer zzerVar) {
        int zzj = zzerVar.zzj(5);
        return zzj == 31 ? zzerVar.zzj(6) + 32 : zzj;
    }

    private static int zzd(zzer zzerVar) throws zzat {
        int zzj = zzerVar.zzj(4);
        if (zzj == 15) {
            if (zzerVar.zzc() >= 24) {
                return zzerVar.zzj(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (zzj < 13) {
            return zzb[zzj];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }
}
