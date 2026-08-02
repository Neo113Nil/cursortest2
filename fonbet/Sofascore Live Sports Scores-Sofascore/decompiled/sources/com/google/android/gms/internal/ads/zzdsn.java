package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdsn implements zzinw {
    public final zziof a;
    public final zzdps b;

    public zzdsn(zzdps zzdpsVar, zzinv zzinvVar) {
        this.a = zzinvVar;
        this.b = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdxg zzdxgVar = (zzdxg) this.a.zzb();
        zzdvv zzdvvVar = this.b.a.b;
        zzioe.a(zzdvvVar);
        return new zzdsm(zzdxgVar, zzdvvVar);
    }
}
