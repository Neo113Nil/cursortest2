package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzaqi {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfh zza = new zzfh(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzes zzb = new zzes();

    zzaqi() {
    }

    public static long zze(zzes zzesVar) {
        int zzg = zzesVar.zzg();
        if (zzesVar.zzd() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        zzesVar.zzm(bArr, 0, 9);
        zzesVar.zzh(zzg);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return C.TIME_UNSET;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return C.TIME_UNSET;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return C.TIME_UNSET;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int zzf(zzafq zzafqVar) {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafqVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfh zzb() {
        return this.zza;
    }

    public final int zzc(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        boolean z = this.zze;
        long j = C.TIME_UNSET;
        if (!z) {
            long zzo = zzafqVar.zzo();
            int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzo);
            long j2 = zzo - min;
            if (zzafqVar.zzn() != j2) {
                zzagpVar.zza = j2;
                return 1;
            }
            zzes zzesVar = this.zzb;
            zzesVar.zza(min);
            zzafqVar.zzl();
            zzafqVar.zzi(zzesVar.zzi(), 0, min);
            int zzg = zzesVar.zzg();
            int zze = zzesVar.zze() - 4;
            while (true) {
                if (zze < zzg) {
                    break;
                }
                if (zzg(zzesVar.zzi(), zze) == 442) {
                    zzesVar.zzh(zze + 4);
                    long zze2 = zze(zzesVar);
                    if (zze2 != C.TIME_UNSET) {
                        j = zze2;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == C.TIME_UNSET) {
            zzf(zzafqVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == C.TIME_UNSET) {
                zzf(zzafqVar);
                return 0;
            }
            zzfh zzfhVar = this.zza;
            this.zzh = zzfhVar.zzf(this.zzg) - zzfhVar.zze(j3);
            zzf(zzafqVar);
            return 0;
        }
        int min2 = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzafqVar.zzo());
        if (zzafqVar.zzn() != 0) {
            zzagpVar.zza = 0L;
            return 1;
        }
        zzes zzesVar2 = this.zzb;
        zzesVar2.zza(min2);
        zzafqVar.zzl();
        zzafqVar.zzi(zzesVar2.zzi(), 0, min2);
        int zzg2 = zzesVar2.zzg();
        int zze3 = zzesVar2.zze();
        while (true) {
            if (zzg2 >= zze3 - 3) {
                break;
            }
            if (zzg(zzesVar2.zzi(), zzg2) == 442) {
                zzesVar2.zzh(zzg2 + 4);
                long zze4 = zze(zzesVar2);
                if (zze4 != C.TIME_UNSET) {
                    j = zze4;
                    break;
                }
            }
            zzg2++;
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
