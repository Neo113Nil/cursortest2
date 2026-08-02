package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzefk implements zzinw {
    public final zzefx a;
    public final zzejh b;

    public zzefk(zzefx zzefxVar, zzejh zzejhVar) {
        this.a = zzefxVar;
        this.b = zzejhVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.b;
        zzioe.a(hsnVar);
        hsn hsnVar2 = zzcgj.a;
        zzioe.a(hsnVar2);
        return new zzefj(hsnVar, hsnVar2, new zzegt((Context) this.a.a.zzb(), hsnVar2), zzinv.b(this.b));
    }
}
