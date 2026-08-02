package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdxi implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zzinv c;
    public final zziof d;
    public final zziof e;
    public final zzinv f;
    public final zzinw g;
    public final zziof h;
    public final zziof i;
    public final zziof j;
    public final zziof k;

    public zzdxi(zzinv zzinvVar, zziof zziofVar, zzinv zzinvVar2, zziof zziofVar2, zziof zziofVar3, zzinv zzinvVar3, zzinw zzinwVar, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7) {
        this.a = zzinvVar;
        this.b = zziofVar;
        this.c = zzinvVar2;
        this.d = zziofVar2;
        this.e = zziofVar3;
        this.f = zzinvVar3;
        this.g = zzinwVar;
        this.h = zziofVar4;
        this.i = zziofVar5;
        this.j = zziofVar6;
        this.k = zziofVar7;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        new zzcmc();
        Context context = (Context) this.a.zzb();
        zzbbd zzbbdVar = (zzbbd) this.b.zzb();
        zzbkn zzbknVar = (zzbkn) this.c.zzb();
        VersionInfoParcel a = ((zzcpa) this.d).a();
        zzcqx zzcqxVar = ((zzcqy) this.e).a;
        return new zzdxg(context, zzbbdVar, zzbknVar, a, zzcqy.a(), (zzbif) this.f.zzb(), (zzdgq) this.g.zzb(), (zzelp) this.h.zzb(), (zzfma) this.i.zzb(), (zzeaj) this.j.zzb(), (zzcnl) this.k.zzb());
    }
}
