package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeza implements zzinw {
    public final zzewj a;
    public final zziof b;

    public zzeza(zzewj zzewjVar, zzinv zzinvVar) {
        this.a = zzewjVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfbu(new zzewh(((zzcok) this.a.a).a(), hsnVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.le)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
