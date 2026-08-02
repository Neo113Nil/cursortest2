package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfhf implements zzinw {
    public final zzinx a;
    public final zziof b;
    public final zziof c;
    public final zzfiw d;
    public final zzinv e;
    public final zziof f;

    public zzfhf(zzinx zzinxVar, zzinv zzinvVar, zzinx zzinxVar2, zzfiw zzfiwVar, zzinv zzinvVar2, zzcpa zzcpaVar) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinxVar2;
        this.d = zzfiwVar;
        this.e = zzinvVar2;
        this.f = zzcpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzfhe((Context) this.a.a, (Executor) this.b.zzb(), (zzcob) this.c.zzb(), this.d.zzb(), (zzfhc) this.e.zzb(), new zzflv(), ((zzcpa) this.f).a());
    }
}
