package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzkc implements Runnable {
    final /* synthetic */ zzkd zza;

    zzkc(zzkd zzkdVar) {
        this.zza = zzkdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzP();
    }
}
