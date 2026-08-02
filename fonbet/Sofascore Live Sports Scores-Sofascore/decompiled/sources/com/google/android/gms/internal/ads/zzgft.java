package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgft implements zzgfo {
    public final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final void a(long j, Runnable runnable) {
        this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final void zzb() {
    }
}
