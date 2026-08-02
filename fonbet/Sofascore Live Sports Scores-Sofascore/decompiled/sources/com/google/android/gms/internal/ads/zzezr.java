package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezr implements zzinw {
    public final zzfbs a;
    public final zziof b;

    public zzezr(zzfbs zzfbsVar, zzinv zzinvVar) {
        this.a = zzfbsVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfbu(new zzfbq(hsnVar, (zzebm) this.a.a.zzb()), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Sd)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
