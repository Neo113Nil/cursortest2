package com.google.android.gms.internal.ads;

import defpackage.hfo;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgou implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zziof c;

    public zzgou(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        File file = (File) this.a.zzb();
        zzggf zzggfVar = (zzggf) this.b.zzb();
        zzgrh zzgrhVar = (zzgrh) this.c.zzb();
        zzggt J = zzggt.J();
        hfo hfoVar = new hfo(zzgrhVar, 5);
        zzggfVar.getClass();
        return new zzgge(file, zzggfVar.a, new zzggc(J), hfoVar);
    }
}
