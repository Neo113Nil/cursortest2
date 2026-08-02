package com.google.android.gms.internal.ads;

import defpackage.hsn;
import defpackage.qio;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdbj implements zzinw {
    public final zzinv a;

    public zzdbj(zzinv zzinvVar) {
        this.a = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdal zzdalVar = (zzdal) this.a.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzdlo zzdloVar = new zzdlo(zzdalVar, hsnVar);
        int i = zzgxw.c;
        return new qio(zzdloVar);
    }
}
