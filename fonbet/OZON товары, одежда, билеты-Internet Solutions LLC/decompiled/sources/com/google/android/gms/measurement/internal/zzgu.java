package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
final class zzgu implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzhc zzb;

    zzgu(zzhc zzhcVar, zzq zzqVar) {
        this.zzb = zzhcVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzll zzllVar;
        zzll zzllVar2;
        zzllVar = this.zzb.zza;
        zzllVar.zzA();
        zzllVar2 = this.zzb.zza;
        zzq zzqVar = this.zza;
        zzllVar2.zzaz().zzg();
        zzllVar2.zzB();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzai zzb = zzai.zzb(zzqVar.zzv);
        zzai zzh = zzllVar2.zzh(zzqVar.zza);
        zzllVar2.zzay().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzb);
        zzllVar2.zzU(zzqVar.zza, zzb);
        if (zzb.zzk(zzh)) {
            zzllVar2.zzP(zzqVar);
        }
    }
}
