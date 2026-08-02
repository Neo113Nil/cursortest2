package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzffm implements zzinw {
    public final zziof a;
    public final zziof b;

    public zzffm(zzcok zzcokVar, zzinv zzinvVar) {
        this.a = zzinvVar;
        this.b = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        new zzbzx();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.zzb();
        ((zzcok) this.b).a();
        return new zzffk(scheduledExecutorService);
    }
}
