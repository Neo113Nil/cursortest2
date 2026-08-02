package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zziz implements Runnable {
    final /* synthetic */ zziw zza;
    final /* synthetic */ zziw zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzje zze;

    zziz(zzje zzjeVar, zziw zziwVar, zziw zziwVar2, long j11, boolean z11) {
        this.zze = zzjeVar;
        this.zza = zziwVar;
        this.zzb = zziwVar2;
        this.zzc = j11;
        this.zzd = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
