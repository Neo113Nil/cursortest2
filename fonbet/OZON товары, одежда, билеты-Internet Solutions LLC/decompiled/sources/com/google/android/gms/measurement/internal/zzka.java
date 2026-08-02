package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzka implements Runnable {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ zzkd zzb;

    zzka(zzkd zzkdVar, zzeq zzeqVar) {
        this.zzb = zzkdVar;
        this.zza = zzeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            try {
                this.zzb.zzb = false;
                if (!this.zzb.zza.zzL()) {
                    this.zzb.zza.zzs.zzay().zzc().zza("Connected to remote service");
                    this.zzb.zza.zzJ(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
