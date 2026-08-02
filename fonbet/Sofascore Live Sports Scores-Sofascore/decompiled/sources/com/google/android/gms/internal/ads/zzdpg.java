package com.google.android.gms.internal.ads;

import defpackage.c40;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdpg implements zzinw {
    public final zziof a;
    public final zzddh b;
    public final zzdkk c;
    public final zzdox d;
    public final zziof e;
    public final zzinv f;

    public zzdpg(zziof zziofVar, zzddh zzddhVar, zzdkk zzdkkVar, zzdox zzdoxVar, zziof zziofVar2, zzinv zzinvVar) {
        this.a = zziofVar;
        this.b = zzddhVar;
        this.c = zzdkkVar;
        this.d = zzdoxVar;
        this.e = zziofVar2;
        this.f = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzcob zzcobVar = (zzcob) this.a.zzb();
        zzdcy a = this.b.a.a();
        zzdjp zzdjpVar = this.c.a;
        zzdov zzdovVar = this.d.a;
        zzdgq zzb = ((zzcwc) this.e).zzb();
        zzeqb zzeqbVar = (zzeqb) this.f.zzb();
        c40 g = zzcobVar.g();
        g.f = new zzdcz(a);
        g.e = zzdjpVar;
        g.k = zzdovVar;
        g.g = new zzesg(null);
        g.h = new zzcyd(zzb, null);
        g.j = new zzcwa(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H4)).booleanValue()) {
            zzeqk zzeqkVar = new zzeqk();
            zzeqkVar.a = zzeqbVar;
            g.i = zzeqkVar;
        }
        zzcyo zzcyoVar = (zzcyo) g.zzh().t.zzb();
        zzioe.a(zzcyoVar);
        return zzcyoVar;
    }
}
