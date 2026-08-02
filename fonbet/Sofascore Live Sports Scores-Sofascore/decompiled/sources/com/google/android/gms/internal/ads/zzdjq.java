package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdjq implements zzinw {
    public final zzdjp a;
    public final zzioi b;

    public zzdjq(zzdjp zzdjpVar, zzioi zzioiVar) {
        this.a = zzdjpVar;
        this.b = zzioiVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Set zzb = this.b.zzb();
        zzdjp zzdjpVar = this.a;
        zzddr zzddrVar = zzdjpVar.p;
        if (zzddrVar != null) {
            return zzddrVar;
        }
        zzddr zzddrVar2 = new zzddr(zzb);
        zzdjpVar.p = zzddrVar2;
        return zzddrVar2;
    }
}
