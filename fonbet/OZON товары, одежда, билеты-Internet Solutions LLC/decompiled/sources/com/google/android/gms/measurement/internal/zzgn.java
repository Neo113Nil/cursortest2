package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzgn implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzhc zzb;

    zzgn(zzhc zzhcVar, zzac zzacVar) {
        this.zzb = zzhcVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzll zzllVar;
        zzll zzllVar2;
        zzll zzllVar3;
        zzllVar = this.zzb.zza;
        zzllVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzllVar3 = this.zzb.zza;
            zzllVar3.zzM(this.zza);
        } else {
            zzllVar2 = this.zzb.zza;
            zzllVar2.zzS(this.zza);
        }
    }
}
