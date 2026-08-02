package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzju implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zziz zzb;

    zzju(zziz zzizVar, long j) {
        this.zza = j;
        this.zzb = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
        this.zzb.zzo().zza(new AtomicReference<>());
    }
}
