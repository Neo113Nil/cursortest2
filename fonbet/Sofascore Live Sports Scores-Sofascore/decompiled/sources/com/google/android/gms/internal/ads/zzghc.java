package com.google.android.gms.internal.ads;

import defpackage.ddo;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzghc implements zzinw {
    public final zzinv a;
    public final zzinv b;
    public final zzinv c;
    public final zzinx d;
    public final zzinx e;
    public final zzinv f;

    public zzghc(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinx zzinxVar, zzinx zzinxVar2, zzinv zzinvVar4) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
        this.d = zzinxVar;
        this.e = zzinxVar2;
        this.f = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new ddo(zzinv.b(this.a), zzinv.b(this.b), zzinv.b(this.c), (zzgei) this.d.a, (ExecutorService) this.e.a, (zzgrh) this.f.zzb());
    }
}
