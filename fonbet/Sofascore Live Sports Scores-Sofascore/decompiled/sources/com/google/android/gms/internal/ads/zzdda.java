package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdda implements zzinw {
    public final zzdcz a;
    public final zzinv b;

    public zzdda(zzdcz zzdczVar, zzinv zzinvVar) {
        this.a = zzdczVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        String str = (String) this.b.zzb();
        zzemv zzemvVar = this.a.f;
        return zzemvVar != null ? zzemvVar : new zzemv(str);
    }
}
