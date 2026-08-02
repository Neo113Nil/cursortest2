package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjc implements Runnable {
    final /* synthetic */ zziw zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzje zzc;

    zzjc(zzje zzjeVar, zziw zziwVar, long j11) {
        this.zzc = zzjeVar;
        this.zza = zziwVar;
        this.zzb = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzje zzjeVar = this.zzc;
        zzjeVar.zza = null;
        zzjeVar.zzs.zzt().zzG(null);
    }
}
