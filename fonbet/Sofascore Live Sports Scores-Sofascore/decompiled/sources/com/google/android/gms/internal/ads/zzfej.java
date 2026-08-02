package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfej implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zzffp c;
    public final zzffq d;
    public final zzffr e;

    public zzfej(zzcok zzcokVar, zzinv zzinvVar, zzffp zzffpVar, zzffq zzffqVar, zzffr zzffrVar) {
        this.a = zzcokVar;
        this.b = zzinvVar;
        this.c = zzffpVar;
        this.d = zzffqVar;
        this.e = zzffrVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfeh zzb() {
        zzcfn zzcfnVar = new zzcfn();
        Context a = ((zzcok) this.a).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfeh(zzcfnVar, a, scheduledExecutorService, hsnVar, this.c.a.b, this.d.a.a.l, this.e.a.a.k);
    }
}
