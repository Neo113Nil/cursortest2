package com.google.android.gms.internal.ads;

import defpackage.edo;
import defpackage.mco;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzghn implements zzinw {
    public final zziof a;
    public final zzinv b;
    public final zziof c;
    public final zziof d;
    public final zzinv e;
    public final mco f;
    public final zziof g;

    public zzghn(zzinx zzinxVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, mco mcoVar, zzinx zzinxVar2) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzinvVar3;
        this.e = zzinvVar4;
        this.f = mcoVar;
        this.g = zzinxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new edo((ExecutorService) this.a.zzb(), zzinv.b(this.b), zzinv.b(this.c), (zzgqc) this.d.zzb(), zzinv.b(this.e), this.f, (zzgei) this.g.zzb());
    }
}
