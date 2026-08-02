package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepd implements zzinw {
    public final zzinx a;
    public final zzdtm b;
    public final zziof c;
    public final zzinv d;
    public final zzinv e;
    public final zziof f;
    public final zzinv g;

    public zzepd(zzinx zzinxVar, zzdtm zzdtmVar, zziof zziofVar, zzinv zzinvVar, zzinv zzinvVar2, zziof zziofVar2, zzinv zzinvVar3) {
        this.a = zzinxVar;
        this.b = zzdtmVar;
        this.c = zziofVar;
        this.d = zzinvVar;
        this.e = zzinvVar2;
        this.f = zziofVar2;
        this.g = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdpa zzdpaVar = (zzdpa) this.a.a;
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzepc(zzdpaVar, hsnVar, this.b.zzb(), (zzfmv) this.c.zzb(), (zzdwb) this.d.zzb(), (zzeae) this.e.zzb(), ((zzcpa) this.f).a(), (Context) this.g.zzb(), new zzceb());
    }
}
