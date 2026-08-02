package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.hsn;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcuo implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zzczf d;
    public final zzczc e;
    public final zziof f;
    public final zzinv g;
    public final zzinw h;
    public final zzinw i;
    public final zziof j;
    public final zziof k;
    public final zziof l;
    public final zziof m;
    public final zzinv n;
    public final zzinv o;
    public final zziof p;

    public zzcuo(zzcok zzcokVar, zzinv zzinvVar, zzinv zzinvVar2, zzczf zzczfVar, zzczc zzczcVar, zzinv zzinvVar3, zzinv zzinvVar4, zzinw zzinwVar, zzinw zzinwVar2, zzinv zzinvVar5, zzinv zzinvVar6, zzinv zzinvVar7, zzddd zzdddVar, zzinv zzinvVar8, zzinv zzinvVar9, zzioi zzioiVar) {
        this.a = zzcokVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzczfVar;
        this.e = zzczcVar;
        this.f = zzinvVar3;
        this.g = zzinvVar4;
        this.h = zzinwVar;
        this.i = zzinwVar2;
        this.j = zzinvVar5;
        this.k = zzinvVar6;
        this.l = zzinvVar7;
        this.m = zzdddVar;
        this.n = zzinvVar8;
        this.o = zzinvVar9;
        this.p = zzioiVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        Executor executor = (Executor) this.b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        zzflo a2 = this.d.a();
        zzfld a3 = this.e.a();
        zzfta zzftaVar = (zzfta) this.f.zzb();
        zzfmj zzfmjVar = (zzfmj) this.g.zzb();
        View view = (View) this.h.zzb();
        zzclm zzclmVar = (zzclm) this.i.zzb();
        zzbbd zzbbdVar = (zzbbd) this.j.zzb();
        zzbkn zzbknVar = (zzbkn) this.k.zzb();
        new zzbkp();
        return new zzcun(a, hsnVar, executor, scheduledExecutorService, a2, a3, zzftaVar, zzfmjVar, view, zzclmVar, zzbbdVar, zzbknVar, ((zzddd) this.m).a.e, (zzdge) this.n.zzb(), (zzdck) this.o.zzb(), ((zzioi) this.p).zzb());
    }
}
