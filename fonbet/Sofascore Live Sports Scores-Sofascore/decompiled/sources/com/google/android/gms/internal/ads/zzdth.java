package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdth implements zzinw {
    public final zziof a;
    public final zziof b;

    public zzdth(zziof zziofVar, zziof zziofVar2) {
        this.a = zziofVar;
        this.b = zziofVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        com.google.android.gms.ads.internal.util.zzbl zzblVar = (com.google.android.gms.ads.internal.util.zzbl) this.a.zzb();
        Clock clock = (Clock) this.b.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzdtg(zzblVar, clock, hsnVar);
    }
}
