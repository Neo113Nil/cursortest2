package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzjs implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zziz zzb;

    zzjs(zziz zzizVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        this.zzb = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(this.zzb.zze().zzg(this.zzb.zzg().zzad()));
            } finally {
                this.zza.notify();
            }
        }
    }
}
