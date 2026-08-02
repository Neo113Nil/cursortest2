package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzczq implements zzinw {
    public final zzegr a;
    public final zzddg b;
    public final zzinv c;
    public final zzcsk d;
    public final zzeqj e;
    public final zzinv f;
    public final zziof g;
    public final zzeic h;
    public final zzdcv i;
    public final zzehn j;
    public final zzinv k;

    public zzczq(zzegr zzegrVar, zzddg zzddgVar, zzinv zzinvVar, zzcsk zzcskVar, zzeqj zzeqjVar, zzinv zzinvVar2, zziof zziofVar, zzeic zzeicVar, zzdcv zzdcvVar, zzehn zzehnVar, zzinv zzinvVar3) {
        this.a = zzegrVar;
        this.b = zzddgVar;
        this.c = zzinvVar;
        this.d = zzcskVar;
        this.e = zzeqjVar;
        this.f = zzinvVar2;
        this.g = zziofVar;
        this.h = zzeicVar;
        this.i = zzdcvVar;
        this.j = zzehnVar;
        this.k = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzegq zzb = this.a.zzb();
        zzflw a = this.b.a();
        zzfqi zzfqiVar = (zzfqi) this.c.zzb();
        zzcsk zzcskVar = this.d;
        zzcsj zzcsjVar = new zzcsj(zzcskVar.a.zzb(), zzcskVar.b.zzb());
        zzeqi zzb2 = this.e.zzb();
        zzdje zzdjeVar = (zzdje) this.f.zzb();
        zzflo zzfloVar = (zzflo) this.g.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzeic zzeicVar = this.h;
        zzeib zzeibVar = new zzeib(hsnVar, zzeicVar.a.zzb(), zzinv.b(zzeicVar.b));
        zzdcu zzb3 = this.i.zzb();
        zzioe.a(hsnVar);
        zzehn zzehnVar = this.j;
        Map map = zzehnVar.a.a;
        zzioe.a(hsnVar);
        return new zzczp(zzb, a, zzfqiVar, zzcsjVar, zzb2, zzdjeVar, zzfloVar, zzeibVar, zzb3, hsnVar, new zzehm(map, hsnVar, new zzdgt(zzehnVar.b.a.zzb())), (zzemv) this.k.zzb());
    }
}
