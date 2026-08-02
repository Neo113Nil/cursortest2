package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.qdo;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgiz implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zzinv d;
    public final zziof e;
    public final zziof f;
    public final zziof g;

    public zzgiz(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zzinx zzinxVar, zzinx zzinxVar2, zzinx zzinxVar3) {
        this.a = zzinxVar;
        this.b = zzinxVar2;
        this.c = zzinvVar;
        this.d = zzinvVar2;
        this.e = zzinvVar3;
        this.f = zzinvVar4;
        this.g = zzinxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.a.zzb();
        ExecutorService executorService = (ExecutorService) this.b.zzb();
        zzgid zzgidVar = (zzgid) this.c.zzb();
        zzgiv zzgivVar = (zzgiv) this.d.zzb();
        File file = (File) this.e.zzb();
        zzgrh zzgrhVar = (zzgrh) this.f.zzb();
        zzgei zzgeiVar = (zzgei) this.g.zzb();
        return new qdo(context, executorService, zzgidVar, zzgivVar, file, zzgrhVar, zzgeiVar.h0(), zzgjc.a());
    }
}
