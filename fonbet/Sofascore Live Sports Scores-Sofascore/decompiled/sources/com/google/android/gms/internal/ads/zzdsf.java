package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdsf implements zzinw {
    public final zziof a;
    public final zzdps b;
    public final zzinv c;
    public final zzdpr d;

    public zzdsf(zzinv zzinvVar, zzdps zzdpsVar, zzinv zzinvVar2, zzdpr zzdprVar) {
        this.a = zzinvVar;
        this.b = zzdpsVar;
        this.c = zzinvVar2;
        this.d = zzdprVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdxg zzdxgVar = (zzdxg) this.a.zzb();
        zzdvv zzdvvVar = this.b.a.b;
        zzioe.a(zzdvvVar);
        zzcvi zzcviVar = (zzcvi) this.c.zzb();
        zzdpl zzdplVar = (zzdpl) this.d.a.zzb();
        zzioe.a(zzdplVar);
        return new zzdse(zzdxgVar, zzdvvVar, zzcviVar, zzdplVar);
    }
}
