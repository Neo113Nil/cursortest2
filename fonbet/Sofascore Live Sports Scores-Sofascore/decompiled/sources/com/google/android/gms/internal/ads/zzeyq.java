package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyq implements zzinw {
    public final zzfav a;
    public final zzinv b;
    public final zzinv c;

    public zzeyq(zzfav zzfavVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzfavVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzfat zzb = this.a.zzb();
        Clock clock = (Clock) this.b.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzexw(zzb, ((Long) zzbkw.e.c()).longValue(), clock, hsnVar, (zzeaj) this.c.zzb());
    }
}
