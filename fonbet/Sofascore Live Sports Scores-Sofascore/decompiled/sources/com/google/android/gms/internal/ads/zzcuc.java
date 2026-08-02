package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcuc implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zzinv c;
    public final zzinv d;
    public final zziof e;
    public final zziof f;

    public zzcuc(zzcok zzcokVar, zzcoe zzcoeVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4) {
        this.a = zzcokVar;
        this.b = zzcoeVar;
        this.c = zzinvVar;
        this.d = zzinvVar2;
        this.e = zzinvVar3;
        this.f = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        com.google.android.gms.ads.internal.util.zzj zzb = ((zzcoe) this.b).zzb();
        zzemm zzemmVar = (zzemm) this.c.zzb();
        zzdxl zzdxlVar = (zzdxl) this.d.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzcub(a, zzb, zzemmVar, zzdxlVar, hsnVar, (zzhdi) this.e.zzb(), (ScheduledExecutorService) this.f.zzb());
    }
}
