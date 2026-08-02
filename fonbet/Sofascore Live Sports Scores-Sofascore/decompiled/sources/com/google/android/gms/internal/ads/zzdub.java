package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdub implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zziof c;
    public final zziof d;
    public final zziof e;
    public final zzinv f;
    public final zzddg g;
    public final zzinv h;
    public final zzinv i;
    public final zziof j;
    public final zziof k;
    public final zziof l;
    public final zziof m;
    public final zzinv n;
    public final zziof o;
    public final zziof p;
    public final zzinv q;
    public final zziof r;
    public final zziof s;

    public zzdub(zzinv zzinvVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zzinv zzinvVar2, zzddg zzddgVar, zzinv zzinvVar3, zzinv zzinvVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zzinv zzinvVar5, zziof zziofVar9, zziof zziofVar10, zzinv zzinvVar6, zziof zziofVar11, zziof zziofVar12) {
        this.a = zzinvVar;
        this.b = zziofVar;
        this.c = zziofVar2;
        this.d = zziofVar3;
        this.e = zziofVar4;
        this.f = zzinvVar2;
        this.g = zzddgVar;
        this.h = zzinvVar3;
        this.i = zzinvVar4;
        this.j = zziofVar5;
        this.k = zziofVar6;
        this.l = zziofVar7;
        this.m = zziofVar8;
        this.n = zzinvVar5;
        this.o = zziofVar9;
        this.p = zziofVar10;
        this.q = zzinvVar6;
        this.r = zziofVar11;
        this.s = zziofVar12;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdua zzb() {
        Context context = (Context) this.a.zzb();
        zzdtg zzdtgVar = (zzdtg) this.b.zzb();
        zzbbd zzbbdVar = (zzbbd) this.c.zzb();
        VersionInfoParcel a = ((zzcpa) this.d).a();
        zzcqx zzcqxVar = ((zzcqy) this.e).a;
        com.google.android.gms.ads.internal.zza a2 = zzcqy.a();
        zzbif zzbifVar = (zzbif) this.f.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzdua(context, zzdtgVar, zzbbdVar, a, a2, zzbifVar, hsnVar, this.g.a(), (zzdus) this.h.zzb(), (zzdxg) this.i.zzb(), (ScheduledExecutorService) this.j.zzb(), (zzeaj) this.k.zzb(), (zzfte) this.l.zzb(), (zzele) this.m.zzb(), (zzdwb) this.n.zzb(), (zzelp) this.o.zzb(), (zzfma) this.p.zzb(), (zzeae) this.q.zzb(), (zzebm) this.r.zzb(), (zzdcg) this.s.zzb());
    }
}
