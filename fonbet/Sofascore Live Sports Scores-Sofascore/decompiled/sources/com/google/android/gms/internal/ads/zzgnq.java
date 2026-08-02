package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.zeo;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgnq implements zzinw {
    public final zziof a;
    public final zzinv b;
    public final zzinv c;
    public final zziof d;
    public final zziof e;
    public final zzinv f;
    public final zzinv g;

    public zzgnq(zzinx zzinxVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinx zzinxVar2, zzinv zzinvVar4, zzinv zzinvVar5) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzinvVar3;
        this.e = zzinxVar2;
        this.f = zzinvVar4;
        this.g = zzinvVar5;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zeo((Context) this.a.zzb(), zzinv.b(this.b), (zzgnz) this.c.zzb(), (zzgrh) this.d.zzb(), (ExecutorService) this.e.zzb(), (zzgme) this.f.zzb(), (zzfyi) this.g.zzb());
    }
}
