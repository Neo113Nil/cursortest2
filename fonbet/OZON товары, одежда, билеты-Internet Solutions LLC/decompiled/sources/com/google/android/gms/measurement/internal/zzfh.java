package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzfh implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfi zzb;

    zzfh(zzfi zzfiVar, boolean z11) {
        this.zzb = zzfiVar;
        this.zza = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzll zzllVar;
        zzllVar = this.zzb.zzb;
        zzllVar.zzI(this.zza);
    }
}
