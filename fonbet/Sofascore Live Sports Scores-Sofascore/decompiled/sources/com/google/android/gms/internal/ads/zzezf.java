package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezf implements zzinw {
    public final zzexs a;
    public final zziof b;

    public zzezf(zzexs zzexsVar, zzinv zzinvVar) {
        this.a = zzexsVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzfbu(new zzexr((zzfic) this.a.a.zzb()), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Wd)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
