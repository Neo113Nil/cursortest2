package com.google.android.gms.internal.ads;

import defpackage.hsn;
import defpackage.t9o;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfqk implements zzinw {
    public final zziof a;
    public final zzfql b;

    public zzfqk(zzinv zzinvVar, zzfql zzfqlVar) {
        this.a = zzinvVar;
        this.b = zzfqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfqi(hsnVar, (ScheduledExecutorService) this.a.zzb(), new t9o(this.b.a.zzb()));
    }
}
