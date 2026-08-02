package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzgw implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzhc zzc;

    zzgw(zzhc zzhcVar, zzaw zzawVar, String str) {
        this.zzc = zzhcVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzll zzllVar;
        zzll zzllVar2;
        zzllVar = this.zzc.zza;
        zzllVar.zzA();
        zzllVar2 = this.zzc.zza;
        zzllVar2.zzE(this.zza, this.zzb);
    }
}
