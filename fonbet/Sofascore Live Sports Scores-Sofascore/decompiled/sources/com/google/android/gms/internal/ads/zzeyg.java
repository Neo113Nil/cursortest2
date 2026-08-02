package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyg implements zzinw {
    public final zzfdq a;
    public final zzinv b;
    public final zzinv c;

    public zzeyg(zzfdq zzfdqVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzfdqVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = this.a.a.a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzfdo zzfdoVar = new zzfdo(a, hsnVar);
        Clock clock = (Clock) this.b.zzb();
        zzioe.a(hsnVar);
        return new zzexw(zzfdoVar, 2147483647L, clock, hsnVar, (zzeaj) this.c.zzb());
    }
}
