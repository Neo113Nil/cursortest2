package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzege implements zzinw {
    public final zziof a;
    public final zzehd b;
    public final zzejh c;

    public zzege(zzinv zzinvVar, zzehd zzehdVar, zzejh zzejhVar) {
        this.a = zzinvVar;
        this.b = zzehdVar;
        this.c = zzejhVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzegd zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        hsn hsnVar2 = zzcgj.b;
        zzioe.a(hsnVar2);
        Context a = ((zzcok) this.b.a).a();
        zzioe.a(hsnVar);
        return new zzegd(scheduledExecutorService, hsnVar, hsnVar2, new zzehc(a, hsnVar), zzinv.b(this.c));
    }
}
