package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzahy implements zzafa {
    private final zzagc zza;
    private final int zzb;
    private final zzafw zzc = new zzafw();

    /* synthetic */ zzahy(zzagc zzagcVar, int i, byte[] bArr) {
        this.zza = zzagcVar;
        this.zzb = i;
    }

    private final long zzc(zzafq zzafqVar) throws IOException {
        while (zzafqVar.zzm() < zzafqVar.zzo() - 6) {
            zzagc zzagcVar = this.zza;
            int i = this.zzb;
            zzafw zzafwVar = this.zzc;
            long zzm = zzafqVar.zzm();
            zzes zzesVar = new zzes(17);
            zzafqVar.zzi(zzesVar.zzi(), 0, 2);
            if (zzesVar.zzo() != i) {
                zzafqVar.zzl();
                zzafqVar.zzk((int) (zzm - zzafqVar.zzn()));
            } else {
                zzesVar.zzf(zzaft.zzb(zzafqVar, zzesVar.zzi(), 2, 15) + 2);
                zzafqVar.zzl();
                zzafqVar.zzk((int) (zzm - zzafqVar.zzn()));
                if (zzafx.zza(zzesVar, zzagcVar, i, zzafwVar)) {
                    break;
                }
            }
            zzafqVar.zzk(1);
        }
        if (zzafqVar.zzm() < zzafqVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzafqVar.zzk((int) (zzafqVar.zzo() - zzafqVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaez zza(zzafq zzafqVar, long j) throws IOException {
        long zzn = zzafqVar.zzn();
        long zzc = zzc(zzafqVar);
        long zzm = zzafqVar.zzm();
        zzafqVar.zzk(Math.max(6, this.zza.zzc));
        long zzc2 = zzc(zzafqVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? zzaez.zzb(zzc2, zzafqVar.zzm()) : zzaez.zza(zzc, zzn) : zzaez.zzc(zzm);
    }
}
