package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezl implements zzinw {
    public final zzfao a;
    public final zziof b;

    public zzezl(zzfao zzfaoVar, zzinv zzinvVar) {
        this.a = zzfaoVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfbu(new zzfam(hsnVar, this.a.a.a()), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ie)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
