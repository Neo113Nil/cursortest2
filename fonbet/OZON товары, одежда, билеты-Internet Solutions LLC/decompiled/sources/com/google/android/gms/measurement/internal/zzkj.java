package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzkj implements Runnable {
    final /* synthetic */ zzll zza;
    final /* synthetic */ Runnable zzb;

    zzkj(zzkl zzklVar, zzll zzllVar, Runnable runnable) {
        this.zza = zzllVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzW();
    }
}
