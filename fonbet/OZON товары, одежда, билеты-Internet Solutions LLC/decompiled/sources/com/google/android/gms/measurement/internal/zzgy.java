package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzgy implements Runnable {
    final /* synthetic */ zzlo zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzhc zzc;

    zzgy(zzhc zzhcVar, zzlo zzloVar, zzq zzqVar) {
        this.zzc = zzhcVar;
        this.zza = zzloVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzll zzllVar;
        zzll zzllVar2;
        zzll zzllVar3;
        zzllVar = this.zzc.zza;
        zzllVar.zzA();
        if (this.zza.zza() == null) {
            zzllVar3 = this.zzc.zza;
            zzllVar3.zzO(this.zza, this.zzb);
        } else {
            zzllVar2 = this.zzc.zza;
            zzllVar2.zzV(this.zza, this.zzb);
        }
    }
}
