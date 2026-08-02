package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapb implements zzafp {
    private final zzapc zza = new zzapc(null, 0, MimeTypes.AUDIO_AC3);
    private final zzes zzb = new zzes(2786);
    private boolean zzc;

    static {
        int i = zzapa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzafg zzafgVar;
        zzes zzesVar = new zzes(10);
        int i = 0;
        while (true) {
            zzafgVar = (zzafg) zzafqVar;
            zzafgVar.zzh(zzesVar.zzi(), 0, 10, false);
            zzesVar.zzh(0);
            if (zzesVar.zzx() != 4801587) {
                break;
            }
            zzesVar.zzk(3);
            int zzG = zzesVar.zzG();
            i += zzG + 10;
            zzafgVar.zzj(zzG, false);
        }
        zzafqVar.zzl();
        zzafgVar.zzj(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzafgVar.zzh(zzesVar.zzi(), 0, 6, false);
            zzesVar.zzh(0);
            if (zzesVar.zzt() != 2935) {
                zzafqVar.zzl();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzafgVar.zzj(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzd = zzaeq.zzd(zzesVar.zzi());
                if (zzd == -1) {
                    return false;
                }
                zzafgVar.zzj(zzd - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zza.zzb(zzafsVar, new zzara(Integer.MIN_VALUE, 0, 1));
        zzafsVar.zzv();
        zzafsVar.zzw(new zzagr(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        zzes zzesVar = this.zzb;
        int zza = zzafqVar.zza(zzesVar.zzi(), 0, 2786);
        if (zza == -1) {
            return -1;
        }
        zzesVar.zzh(0);
        zzesVar.zzf(zza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzesVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }
}
