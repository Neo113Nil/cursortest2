package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevq implements zzinw {
    public final zzinv a;
    public final zziof b;

    public zzevq(zzinv zzinvVar, zziof zziofVar) {
        this.a = zzinvVar;
        this.b = zziofVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        ddb ddbVar = (ddb) this.a.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzevo(ddbVar, hsnVar, (ScheduledExecutorService) this.b.zzb());
    }
}
