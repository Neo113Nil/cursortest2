package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfdm implements zzinw {
    public final zziof a;
    public final zzioi b;
    public final zzinv c;

    public zzfdm(zziof zziofVar, zzioi zzioiVar, zzinv zzinvVar) {
        this.a = zziofVar;
        this.b = zzioiVar;
        this.c = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfdl zzb() {
        Context a = ((zzcok) this.a).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfdl(a, hsnVar, this.b.zzb(), (zzfrg) this.c.zzb());
    }
}
