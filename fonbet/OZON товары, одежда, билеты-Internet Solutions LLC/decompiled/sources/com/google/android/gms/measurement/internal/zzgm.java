package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzgm implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzhc zzc;

    zzgm(zzhc zzhcVar, zzac zzacVar, zzq zzqVar) {
        this.zzc = zzhcVar;
        this.zza = zzacVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzll zzllVar;
        zzll zzllVar2;
        zzll zzllVar3;
        zzllVar = this.zzc.zza;
        zzllVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzllVar3 = this.zzc.zza;
            zzllVar3.zzN(this.zza, this.zzb);
        } else {
            zzllVar2 = this.zzc.zza;
            zzllVar2.zzT(this.zza, this.zzb);
        }
    }
}
