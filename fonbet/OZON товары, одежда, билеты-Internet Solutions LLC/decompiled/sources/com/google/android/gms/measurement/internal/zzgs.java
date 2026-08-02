package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzgs implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzhc zzb;

    zzgs(zzhc zzhcVar, zzq zzqVar) {
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
        zzllVar2.zzP(this.zza);
    }
}
