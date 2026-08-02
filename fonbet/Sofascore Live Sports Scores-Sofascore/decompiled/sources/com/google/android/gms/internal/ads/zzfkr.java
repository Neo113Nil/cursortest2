package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfkr implements zzinw {
    public final zzinx a;
    public final zziof b;
    public final zziof c;
    public final zzfix d;
    public final zzinv e;
    public final zzinv f;

    public zzfkr(zzinx zzinxVar, zzinv zzinvVar, zzinx zzinxVar2, zzfix zzfixVar, zzinv zzinvVar2, zzinv zzinvVar3) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinxVar2;
        this.d = zzfixVar;
        this.e = zzinvVar2;
        this.f = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzfkq((Context) this.a.a, (Executor) this.b.zzb(), (zzcob) this.c.zzb(), this.d.zzb(), (zzfkh) this.e.zzb(), new zzflv(), (zzflp) this.f.zzb());
    }
}
