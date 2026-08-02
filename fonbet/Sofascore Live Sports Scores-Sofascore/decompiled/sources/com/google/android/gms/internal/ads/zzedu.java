package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzedu implements zzinw {
    public final zzcok a;
    public final zzcol b;
    public final zzinv c;

    public zzedu(zzcok zzcokVar, zzcol zzcolVar, zzinv zzinvVar) {
        this.a = zzcokVar;
        this.b = zzcolVar;
        this.c = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = this.a.a();
        WeakReference weakReference = this.b.a.d;
        zzioe.a(weakReference);
        zzeea zzeeaVar = (zzeea) this.c.zzb();
        new zzeeo();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzeem(a, weakReference, zzeeaVar, hsnVar);
    }
}
