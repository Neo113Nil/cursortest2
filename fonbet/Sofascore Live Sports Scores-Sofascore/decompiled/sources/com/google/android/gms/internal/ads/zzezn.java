package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezn implements zzinw {
    public final zzfaz a;
    public final zziof b;

    public zzezn(zzfaz zzfazVar, zzinv zzinvVar) {
        this.a = zzfazVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfbu(new zzfax(hsnVar, (zzedp) this.a.a.zzb()), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Td)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }
}
