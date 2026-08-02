package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzkn implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzku zzb;

    zzkn(zzku zzkuVar, long j11) {
        this.zzb = zzkuVar;
        this.zza = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzku.zzj(this.zzb, this.zza);
    }
}
