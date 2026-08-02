package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzenr implements zzinw {
    public final zzinx a;
    public final zzinv b;
    public final zziof c;
    public final zzinv d;
    public final zzddg e;
    public final zzinv f;
    public final zzinv g;

    public zzenr(zzinx zzinxVar, zzinv zzinvVar, zziof zziofVar, zzinv zzinvVar2, zzddg zzddgVar, zzinv zzinvVar3, zzinv zzinvVar4) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zziofVar;
        this.d = zzinvVar2;
        this.e = zzddgVar;
        this.f = zzinvVar3;
        this.g = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzenq zzb() {
        return new zzenq((zzcxi) this.a.a, (Context) this.b.zzb(), (Executor) this.c.zzb(), (zzdxg) this.d.zzb(), this.e.a(), (zzgub) this.f.zzb(), (zzeae) this.g.zzb());
    }
}
