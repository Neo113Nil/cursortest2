package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzkm implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzku zzb;

    zzkm(zzku zzkuVar, long j11) {
        this.zzb = zzkuVar;
        this.zza = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzku.zzl(this.zzb, this.zza);
    }
}
