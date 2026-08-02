package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzjy implements Runnable {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ zzkd zzb;

    zzjy(zzkd zzkdVar, zzeq zzeqVar) {
        this.zzb = zzkdVar;
        this.zza = zzeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            try {
                this.zzb.zzb = false;
                if (!this.zzb.zza.zzL()) {
                    this.zzb.zza.zzs.zzay().zzj().zza("Connected to service");
                    this.zzb.zza.zzJ(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
