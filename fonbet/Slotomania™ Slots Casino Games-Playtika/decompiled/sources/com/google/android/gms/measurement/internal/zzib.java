package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzib implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzij zzb;

    zzib(zzij zzijVar, AtomicReference atomicReference) {
        this.zzb = zzijVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(Integer.valueOf(this.zzb.zzt.zzf().zze(this.zzb.zzt.zzh().zzl(), zzeh.zzN)));
            } finally {
                this.zza.notify();
            }
        }
    }
}
