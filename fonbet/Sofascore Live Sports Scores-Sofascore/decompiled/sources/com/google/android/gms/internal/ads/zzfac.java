package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfac implements zzinw {
    public final zziof a;

    public zzfac(zzcok zzcokVar) {
        this.a = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfab(a, hsnVar);
    }
}
