package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzjb implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzje zzb;

    zzjb(zzje zzjeVar, long j11) {
        this.zzb = zzjeVar;
        this.zza = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
