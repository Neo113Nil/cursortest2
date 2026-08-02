package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfhr implements zzinw {
    public final zzinx a;
    public final zziof b;
    public final zzinx c;
    public final zziof d;
    public final zzinv e;
    public final zzinv f;
    public final zzinv g;

    public zzfhr(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zzinx zzinxVar, zzinx zzinxVar2, zzinx zzinxVar3) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinxVar2;
        this.d = zzinxVar3;
        this.e = zzinvVar2;
        this.f = zzinvVar3;
        this.g = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzfhq((Context) this.a.a, (Executor) this.b.zzb(), (com.google.android.gms.ads.internal.client.zzr) this.c.a, (zzcob) this.d.zzb(), (zzeua) this.e.zzb(), (zzeue) this.f.zzb(), new zzflv(), (zzdiv) this.g.zzb());
    }
}
