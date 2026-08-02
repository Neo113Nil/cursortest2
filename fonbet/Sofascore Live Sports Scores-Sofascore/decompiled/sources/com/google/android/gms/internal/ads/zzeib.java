package com.google.android.gms.internal.ads;

import defpackage.a4o;
import defpackage.ewn;
import defpackage.yvn;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeib {
    public final zzhdi a;
    public final zzehg b;
    public final zzinq c;

    public zzeib(zzhdi zzhdiVar, zzehg zzehgVar, zzinq zzinqVar) {
        this.a = zzhdiVar;
        this.b = zzehgVar;
        this.c = zzinqVar;
    }

    public final zzhcq a(zzcbv zzcbvVar, a4o a4oVar, a4o a4oVar2, zzhcg zzhcgVar) {
        String str = zzcbvVar.d;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzF = com.google.android.gms.ads.internal.util.zzs.zzF(str);
        zzhdi zzhdiVar = this.a;
        return zzhcy.f(zzhcy.h(zzhcy.h(zzhcq.r(zzF ? zzhcy.b(new zzehp(1)) : zzhcy.f(a4oVar.e(zzcbvVar), ExecutionException.class, yvn.g, zzhdiVar)), yvn.e, zzhdiVar), zzhcgVar, zzhdiVar), zzehp.class, new ewn(this, a4oVar2, zzcbvVar, zzhcgVar, 2), zzhdiVar);
    }
}
