package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbko implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zzinv c;

    public zzbko(zziof zziofVar, zziof zziofVar2, zzinv zzinvVar) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        ((zzcok) this.a).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.zzb();
        new zzbkp();
        return new zzbkn(scheduledExecutorService);
    }
}
