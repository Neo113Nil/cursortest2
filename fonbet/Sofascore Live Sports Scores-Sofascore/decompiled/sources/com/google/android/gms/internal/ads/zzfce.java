package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfce implements zzinw {
    public final zziof a;
    public final zzddg b;
    public final zziof c;

    public zzfce(zzcok zzcokVar, zzddg zzddgVar, zzcpa zzcpaVar) {
        this.a = zzcokVar;
        this.b = zzddgVar;
        this.c = zzcpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfcc zzb() {
        Context a = ((zzcok) this.a).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfcc(a, hsnVar, this.b.a(), ((zzcpa) this.c).a());
    }
}
