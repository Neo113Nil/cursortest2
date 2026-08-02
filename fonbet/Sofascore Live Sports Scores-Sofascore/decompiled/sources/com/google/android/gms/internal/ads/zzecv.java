package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzecv implements zzinw {
    public final zzinv a;
    public final zzcok b;
    public final zzcol c;
    public final zzinv d;
    public final zzinv e;
    public final zzinv f;
    public final zzcpa g;
    public final zzdkw h;
    public final zzinv i;

    public zzecv(zzinv zzinvVar, zzcok zzcokVar, zzcol zzcolVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zzcpa zzcpaVar, zzdkw zzdkwVar, zzinv zzinvVar5) {
        this.a = zzinvVar;
        this.b = zzcokVar;
        this.c = zzcolVar;
        this.d = zzinvVar2;
        this.e = zzinvVar3;
        this.f = zzinvVar4;
        this.g = zzcpaVar;
        this.h = zzdkwVar;
        this.i = zzinvVar5;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Executor executor = (Executor) this.a.zzb();
        Context a = this.b.a();
        WeakReference weakReference = this.c.a.d;
        zzioe.a(weakReference);
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzecu(executor, a, weakReference, hsnVar, (zzdya) this.d.zzb(), (ScheduledExecutorService) this.e.zzb(), (zzeau) this.f.zzb(), this.g.a(), new zzdkv(this.h.a.zzb()), (zzfrj) this.i.zzb());
    }
}
