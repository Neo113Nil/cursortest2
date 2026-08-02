package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzegj implements zzinw {
    public final zziof a;
    public final zzddg b;
    public final zzefk c;
    public final zziof d;
    public final zzinv e;
    public final zzinv f;

    public zzegj(zziof zziofVar, zzddg zzddgVar, zzefk zzefkVar, zziof zziofVar2, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zziofVar;
        this.b = zzddgVar;
        this.c = zzefkVar;
        this.d = zziofVar2;
        this.e = zzinvVar;
        this.f = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        zzflw a2 = this.b.a();
        hsn hsnVar = zzcgj.b;
        zzioe.a(hsnVar);
        hsn hsnVar2 = zzcgj.a;
        zzioe.a(hsnVar2);
        zzefk zzefkVar = this.c;
        zzefj zzefjVar = new zzefj(hsnVar, hsnVar2, new zzegt((Context) zzefkVar.a.a.zzb(), hsnVar2), zzinv.b(zzefkVar.b));
        zzioe.a(hsnVar2);
        return new zzegi(a, a2, zzefjVar, hsnVar2, (ScheduledExecutorService) this.d.zzb(), (zzekb) this.e.zzb(), (zzfrg) this.f.zzb());
    }
}
