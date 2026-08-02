package com.google.android.gms.internal.ads;

import defpackage.feo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzglb implements zzinw {
    public final zzinv a;
    public final zzinv b;
    public final zzinv c;
    public final zziof d;

    public zzglb(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinx zzinxVar) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
        this.d = zzinxVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzinq b = zzinv.b(this.a);
        zzinq b2 = zzinv.b(this.b);
        zzinq b3 = zzinv.b(this.c);
        zzgei zzgeiVar = (zzgei) this.d.zzb();
        return new feo(b, b2, b3, zzgeiVar.b0().D(), zzgeiVar.b0().G());
    }
}
