package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeko implements zzinw {
    public final zzinv a;
    public final zzekg b;

    public zzeko(zzinv zzinvVar, zzekg zzekgVar) {
        this.a = zzinvVar;
        this.b = zzekgVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzekb zzekbVar = (zzekb) this.a.zzb();
        zzekg zzekgVar = this.b;
        return new zzekn(zzekbVar, new zzekf(zzekgVar.a.zzb(), ((zzcoe) zzekgVar.b).zzb()));
    }
}
