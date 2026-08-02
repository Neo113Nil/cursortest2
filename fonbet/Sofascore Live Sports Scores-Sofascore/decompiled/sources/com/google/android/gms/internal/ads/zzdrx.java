package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdrx implements zzinw {
    public final zzdps a;
    public final zziof b;

    public zzdrx(zzdps zzdpsVar, zzinv zzinvVar) {
        this.a = zzdpsVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdvv zzdvvVar = this.a.a.b;
        zzioe.a(zzdvvVar);
        return new zzdrw(zzdvvVar, (Clock) this.b.zzb());
    }
}
