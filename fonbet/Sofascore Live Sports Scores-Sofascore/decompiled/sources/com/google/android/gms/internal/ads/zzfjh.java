package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfjh implements zzinw {
    public final zzinx a;
    public final zziof b;
    public final zziof c;
    public final zzinv d;
    public final zzinv e;

    public zzfjh(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinx zzinxVar, zzinx zzinxVar2) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinxVar2;
        this.d = zzinvVar2;
        this.e = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzfjg((Context) this.a.a, (Executor) this.b.zzb(), (zzcob) this.c.zzb(), (zzeua) this.d.zzb(), (zzfkh) this.e.zzb(), new zzflv());
    }
}
