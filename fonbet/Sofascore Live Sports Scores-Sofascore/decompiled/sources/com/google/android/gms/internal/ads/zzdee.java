package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdee implements zzinw {
    public final zzded a;
    public final zzioi b;
    public final zziof c;

    public zzdee(zzded zzdedVar, zzioi zzioiVar, zzinv zzinvVar) {
        this.a = zzdedVar;
        this.b = zzioiVar;
        this.c = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzddy zzddyVar = new zzddy(this.a.a.zzb());
        Set zzb = this.b.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzdec(zzddyVar, zzb, hsnVar, (ScheduledExecutorService) this.c.zzb());
    }
}
