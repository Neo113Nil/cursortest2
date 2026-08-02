package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzaqs {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfh zza = new zzfh(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzes zzb = new zzes();

    zzaqs(int i) {
    }

    private final int zze(zzafq zzafqVar) {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafqVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzafq zzafqVar, zzagp zzagpVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzafqVar);
            return 0;
        }
        boolean z = this.zze;
        long j = C.TIME_UNSET;
        if (z) {
            if (this.zzg == C.TIME_UNSET) {
                zze(zzafqVar);
                return 0;
            }
            if (this.zzd) {
                long j2 = this.zzf;
                if (j2 == C.TIME_UNSET) {
                    zze(zzafqVar);
                    return 0;
                }
                zzfh zzfhVar = this.zza;
                this.zzh = zzfhVar.zzf(this.zzg) - zzfhVar.zze(j2);
                zze(zzafqVar);
                return 0;
            }
            int min = (int) Math.min(112800L, zzafqVar.zzo());
            if (zzafqVar.zzn() != 0) {
                zzagpVar.zza = 0L;
                return 1;
            }
            zzes zzesVar = this.zzb;
            zzesVar.zza(min);
            zzafqVar.zzl();
            zzafqVar.zzi(zzesVar.zzi(), 0, min);
            int zzg = zzesVar.zzg();
            int zze = zzesVar.zze();
            while (true) {
                if (zzg >= zze) {
                    break;
                }
                if (zzesVar.zzi()[zzg] == 71) {
                    long zzb = zzarc.zzb(zzesVar, zzg, i);
                    if (zzb != C.TIME_UNSET) {
                        j = zzb;
                        break;
                    }
                }
                zzg++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long zzo = zzafqVar.zzo();
        int min2 = (int) Math.min(112800L, zzo);
        long j3 = zzo - min2;
        if (zzafqVar.zzn() != j3) {
            zzagpVar.zza = j3;
            return 1;
        }
        zzes zzesVar2 = this.zzb;
        zzesVar2.zza(min2);
        zzafqVar.zzl();
        zzafqVar.zzi(zzesVar2.zzi(), 0, min2);
        int zzg2 = zzesVar2.zzg();
        int zze2 = zzesVar2.zze();
        int i2 = zze2 - 188;
        while (true) {
            if (i2 < zzg2) {
                break;
            }
            byte[] zzi = zzesVar2.zzi();
            int i3 = -4;
            int i4 = 0;
            while (true) {
                if (i3 > 4) {
                    break;
                }
                int i5 = (i3 * TsExtractor.TS_PACKET_SIZE) + i2;
                if (i5 < zzg2 || i5 >= zze2 || zzi[i5] != 71) {
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 5) {
                        long zzb2 = zzarc.zzb(zzesVar2, i2, i);
                        if (zzb2 != C.TIME_UNSET) {
                            j = zzb2;
                            break;
                        }
                    }
                }
                i3++;
            }
            i2--;
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfh zzd() {
        return this.zza;
    }
}
