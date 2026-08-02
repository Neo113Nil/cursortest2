package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzaqg implements zzafa {
    private final zzfh zza;
    private final zzes zzb = new zzes();

    /* synthetic */ zzaqg(zzfh zzfhVar, byte[] bArr) {
        this.zza = zzfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaez zza(zzafq zzafqVar, long j) throws IOException {
        int zzh;
        long zzn = zzafqVar.zzn();
        int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzafqVar.zzo() - zzn);
        zzes zzesVar = this.zzb;
        zzesVar.zza(min);
        zzafqVar.zzi(zzesVar.zzi(), 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (zzesVar.zzd() >= 4) {
            if (zzaqh.zzh(zzesVar.zzi(), zzesVar.zzg()) != 442) {
                zzesVar.zzk(1);
            } else {
                zzesVar.zzk(4);
                long zze = zzaqi.zze(zzesVar);
                if (zze != C.TIME_UNSET) {
                    long zze2 = this.zza.zze(zze);
                    if (zze2 > j) {
                        return j2 == C.TIME_UNSET ? zzaez.zza(zze2, zzn) : zzaez.zzc(zzn + i2);
                    }
                    if (100000 + zze2 > j) {
                        return zzaez.zzc(zzn + zzesVar.zzg());
                    }
                    i2 = zzesVar.zzg();
                    j2 = zze2;
                }
                int zze3 = zzesVar.zze();
                if (zzesVar.zzd() >= 10) {
                    zzesVar.zzk(9);
                    int zzs = zzesVar.zzs() & 7;
                    if (zzesVar.zzd() >= zzs) {
                        zzesVar.zzk(zzs);
                        if (zzesVar.zzd() >= 4) {
                            if (zzaqh.zzh(zzesVar.zzi(), zzesVar.zzg()) == 443) {
                                zzesVar.zzk(4);
                                int zzt = zzesVar.zzt();
                                if (zzesVar.zzd() < zzt) {
                                    zzesVar.zzh(zze3);
                                } else {
                                    zzesVar.zzk(zzt);
                                }
                            }
                            while (true) {
                                if (zzesVar.zzd() < 4 || (zzh = zzaqh.zzh(zzesVar.zzi(), zzesVar.zzg())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzesVar.zzk(4);
                                if (zzesVar.zzd() < 2) {
                                    zzesVar.zzh(zze3);
                                    break;
                                }
                                zzesVar.zzh(Math.min(zzesVar.zze(), zzesVar.zzg() + zzesVar.zzt()));
                            }
                        } else {
                            zzesVar.zzh(zze3);
                        }
                    } else {
                        zzesVar.zzh(zze3);
                    }
                } else {
                    zzesVar.zzh(zze3);
                }
                i = zzesVar.zzg();
            }
        }
        return j2 != C.TIME_UNSET ? zzaez.zzb(j2, zzn + i) : zzaez.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzb() {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
