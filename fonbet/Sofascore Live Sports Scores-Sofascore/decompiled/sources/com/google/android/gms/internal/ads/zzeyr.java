package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyr implements zzinw {
    public final zzinv a;
    public final zzinv b;

    public zzeyr(zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzfbb zzfbbVar = new zzfbb(hsnVar);
        Clock clock = (Clock) this.a.zzb();
        zzioe.a(hsnVar);
        return new zzexw(zzfbbVar, ((Long) zzbkw.f.c()).longValue(), clock, hsnVar, (zzeaj) this.b.zzb());
    }
}
