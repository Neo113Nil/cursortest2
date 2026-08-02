package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdva implements zzinw {
    public final zzczd a;
    public final zzinu b;
    public final zzdrj c;

    public zzdva(zzczd zzczdVar, zzinu zzinuVar, zzdrj zzdrjVar) {
        this.a = zzczdVar;
        this.b = zzinuVar;
        this.c = zzdrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzduz(this.a.a.c, (zzdqm) this.b.zzb(), this.c.a());
    }
}
