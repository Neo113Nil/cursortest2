package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyf implements zzinw {
    public final zzexp a;
    public final zzinv b;
    public final zzinv c;

    public zzeyf(zzexp zzexpVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzexpVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzexn zzexnVar = new zzexn(this.a.a.a(), hsnVar);
        Clock clock = (Clock) this.b.zzb();
        zzioe.a(hsnVar);
        return new zzexw(zzexnVar, ((Long) zzbkw.c.c()).longValue(), clock, hsnVar, (zzeaj) this.c.zzb());
    }
}
