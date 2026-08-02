package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevh implements zzinw {
    public final zziof a;
    public final zzddg b;
    public final zziof c;

    public zzevh(zziof zziofVar, zzddg zzddgVar, zziof zziofVar2) {
        this.a = zziofVar;
        this.b = zzddgVar;
        this.c = zziofVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevf((Clock) this.a.zzb(), this.b.a(), ((Long) this.c.zzb()).longValue());
    }
}
