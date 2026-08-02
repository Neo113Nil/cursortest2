package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzggl implements zzinw {
    public final zzinx a;
    public final zzinv b;
    public final zzinx c;
    public final zzinv d;
    public final zzinx e;

    public zzggl(zzinv zzinvVar, zzinv zzinvVar2, zzinx zzinxVar, zzinx zzinxVar2, zzinx zzinxVar3) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinxVar2;
        this.d = zzinvVar2;
        this.e = zzinxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context context = (Context) this.a.a;
        zzgfo zzgfoVar = (zzgfo) this.b.zzb();
        ExecutorService executorService = (ExecutorService) this.c.a;
        zzgfh zzgfhVar = (zzgfh) this.d.zzb();
        zzgei zzgeiVar = (zzgei) this.e.a;
        return new zzggp(context, zzgfoVar, executorService, zzgfhVar, new Random(), zzgeiVar.X().D(), zzgeiVar.X().F(), zzgeiVar.X().G(), zzgeiVar.X().E(), zzgeiVar.V(), zzgeiVar.O(), zzgeiVar.M() - 1);
    }
}
