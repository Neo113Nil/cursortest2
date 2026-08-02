package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyi implements zzinw {
    public final zzeva a;
    public final zzinv b;
    public final zzinv c;

    public zzeyi(zzeva zzevaVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzevaVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzeuy zzeuyVar = new zzeuy(((zzcok) this.a.a).a());
        Clock clock = (Clock) this.b.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzexw(zzeuyVar, 2147483647L, clock, hsnVar, (zzeaj) this.c.zzb());
    }
}
