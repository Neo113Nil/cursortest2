package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
final class zzgt implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzhc zzb;

    zzgt(zzhc zzhcVar, zzq zzqVar) {
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
        zzllVar2.zzd(zzqVar);
    }
}
