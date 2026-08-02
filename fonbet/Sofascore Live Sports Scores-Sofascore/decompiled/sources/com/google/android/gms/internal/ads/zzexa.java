package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzexa implements zzinw {
    public final zziof a;
    public final zzdde b;
    public final zziof c;
    public final zzinv d;
    public final zzinv e;
    public final zzddg f;
    public final zzinv g;
    public final zziof h;
    public final zziof i;

    public zzexa(zziof zziofVar, zzdde zzddeVar, zziof zziofVar2, zzinv zzinvVar, zzinv zzinvVar2, zzddg zzddgVar, zzinv zzinvVar3, zziof zziofVar3, zziof zziofVar4) {
        this.a = zziofVar;
        this.b = zzddeVar;
        this.c = zziofVar2;
        this.d = zzinvVar;
        this.e = zzinvVar2;
        this.f = zzddgVar;
        this.g = zzinvVar3;
        this.h = zziofVar3;
        this.i = zziofVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        String str = ((zzdab) this.b.a.zzb()).b.e;
        zzioe.a(str);
        return new zzewy(a, str, (String) this.c.zzb(), (zzdab) this.d.zzb(), (zzfne) this.e.zzb(), this.f.a(), (zzeae) this.g.zzb(), (zzdap) this.h.zzb(), ((Long) this.i.zzb()).longValue());
    }
}
