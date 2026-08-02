package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeqj implements zzinw {
    public final zziof a;
    public final zzinv b;
    public final zzinv c;
    public final zzinv d;
    public final zzinv e;
    public final zziof f;
    public final zzinv g;
    public final zziof h;
    public final zzinv i;
    public final zzinv j;
    public final zzepn k;
    public final zzinv l;

    public zzeqj(zziof zziofVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zziof zziofVar2, zzinv zzinvVar5, zziof zziofVar3, zzinv zzinvVar6, zzinv zzinvVar7, zzepn zzepnVar, zzinv zzinvVar8) {
        this.a = zziofVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzinvVar3;
        this.e = zzinvVar4;
        this.f = zziofVar2;
        this.g = zzinvVar5;
        this.h = zziofVar3;
        this.i = zzinvVar6;
        this.j = zzinvVar7;
        this.k = zzepnVar;
        this.l = zzinvVar8;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzeqi zzb() {
        Context a = ((zzcok) this.a).a();
        zzfqi zzfqiVar = (zzfqi) this.b.zzb();
        zzeqb zzeqbVar = (zzeqb) this.c.zzb();
        zzddr zzddrVar = (zzddr) this.d.zzb();
        zzfta zzftaVar = (zzfta) this.e.zzb();
        zzfte zzfteVar = (zzfte) this.f.zzb();
        zzcyo zzcyoVar = (zzcyo) this.g.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzeqi(a, zzfqiVar, zzeqbVar, zzddrVar, zzftaVar, zzfteVar, zzcyoVar, hsnVar, (ScheduledExecutorService) this.h.zzb(), (zzemv) this.i.zzb(), (zzfrg) this.j.zzb(), this.k.zzb(), (zzeae) this.l.zzb());
    }
}
