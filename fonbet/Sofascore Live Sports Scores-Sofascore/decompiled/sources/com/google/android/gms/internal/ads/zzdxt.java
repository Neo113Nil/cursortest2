package com.google.android.gms.internal.ads;

import defpackage.d1l;
import defpackage.ye4;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdxt implements zzinw {
    public final zzgdi a;

    public zzdxt(zzgdi zzgdiVar) {
        this.a = zzgdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzgdi zzgdiVar = this.a;
        ye4 ye4Var = (ye4) zzgdiVar.a.zzb();
        ExecutorService executorService = zzcgj.g;
        zzioe.a(executorService);
        return new zzdxs(new zzgdh(ye4Var, new d1l(executorService, 24), (zzdxu) zzgdiVar.b.zzb(), new zzgcg()));
    }
}
