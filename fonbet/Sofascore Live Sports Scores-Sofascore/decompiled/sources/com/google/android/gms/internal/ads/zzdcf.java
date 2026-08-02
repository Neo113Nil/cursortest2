package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdcf implements zzinw {
    public final zzinv a;
    public final zzczc b;
    public final zziof c;
    public final zzczd d;
    public final zzinv e;

    public zzdcf(zzinv zzinvVar, zzczc zzczcVar, zzinv zzinvVar2, zzczd zzczdVar, zzinv zzinvVar3) {
        this.a = zzinvVar;
        this.b = zzczcVar;
        this.c = zzinvVar2;
        this.d = zzczdVar;
        this.e = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdeh zzdehVar = (zzdeh) this.a.zzb();
        zzfld a = this.b.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzdce(zzdehVar, a, scheduledExecutorService, hsnVar, this.d.a.c, (zzdgi) this.e.zzb());
    }
}
