package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzftb implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zzdde c;
    public final zziof d;
    public final zziof e;
    public final zzddf f;
    public final zzinv g;
    public final zziof h;
    public final zziof i;

    public zzftb(zzinv zzinvVar, zziof zziofVar, zzdde zzddeVar, zziof zziofVar2, zziof zziofVar3, zzddf zzddfVar, zzinv zzinvVar2, zziof zziofVar4, zziof zziofVar5) {
        this.a = zzinvVar;
        this.b = zziofVar;
        this.c = zzddeVar;
        this.d = zziofVar2;
        this.e = zziofVar3;
        this.f = zzddfVar;
        this.g = zzinvVar2;
        this.h = zziofVar4;
        this.i = zziofVar5;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzeqb zzeqbVar = (zzeqb) this.a.zzb();
        VersionInfoParcel a = ((zzcpa) this.b).a();
        String str = ((zzdab) this.c.a.zzb()).b.e;
        zzioe.a(str);
        return new zzfta(zzeqbVar, a, str, (String) this.d.zzb(), ((zzcok) this.e).a(), this.f.a.d, (zzflq) this.g.zzb(), (Clock) this.h.zzb(), (zzbbd) this.i.zzb());
    }
}
