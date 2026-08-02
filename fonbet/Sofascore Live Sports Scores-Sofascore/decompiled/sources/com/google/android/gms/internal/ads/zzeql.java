package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeql implements zzinw {
    public final zzeqk a;
    public final zziof b;
    public final zzeqe c;
    public final zzinv d;
    public final zziof e;

    public zzeql(zzeqk zzeqkVar, zziof zziofVar, zzeqe zzeqeVar, zzinv zzinvVar, zziof zziofVar2) {
        this.a = zzeqkVar;
        this.b = zziofVar;
        this.c = zzeqeVar;
        this.d = zzinvVar;
        this.e = zziofVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Clock clock = (Clock) this.b.zzb();
        zzeqe zzeqeVar = this.c;
        zzeqd zzeqdVar = new zzeqd((zzfmp) zzeqeVar.a.zzb(), (zzdxx) zzeqeVar.b.zzb(), (zzeaj) zzeqeVar.c.zzb());
        zzemv zzemvVar = (zzemv) this.d.zzb();
        zzfte zzfteVar = (zzfte) this.e.zzb();
        zzeqb zzeqbVar = this.a.a;
        return zzeqbVar != null ? zzeqbVar : new zzeqb(clock, zzeqdVar, zzemvVar, zzfteVar);
    }
}
