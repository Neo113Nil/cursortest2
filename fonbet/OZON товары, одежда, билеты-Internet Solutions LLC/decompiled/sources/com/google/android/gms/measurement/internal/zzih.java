package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
final class zzih implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzip zzb;

    zzih(zzip zzipVar, AtomicReference atomicReference) {
        this.zzb = zzipVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(Double.valueOf(this.zzb.zzs.zzf().zza(this.zzb.zzs.zzh().zzl(), zzen.zzN)));
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
