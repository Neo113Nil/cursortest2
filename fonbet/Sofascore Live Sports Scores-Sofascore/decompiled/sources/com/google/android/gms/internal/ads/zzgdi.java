package com.google.android.gms.internal.ads;

import defpackage.d1l;
import defpackage.ye4;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgdi implements zzinw {
    public final zzinv a;
    public final zzinv b;

    public zzgdi(zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        ye4 ye4Var = (ye4) this.a.zzb();
        ExecutorService executorService = zzcgj.g;
        zzioe.a(executorService);
        return new zzgdh(ye4Var, new d1l(executorService, 24), (zzdxu) this.b.zzb(), new zzgcg());
    }
}
