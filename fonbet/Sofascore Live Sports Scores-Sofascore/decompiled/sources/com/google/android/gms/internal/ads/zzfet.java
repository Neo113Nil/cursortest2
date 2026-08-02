package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfet implements zzinw {
    public final zzffo a;
    public final zziof b;
    public final zziof c;

    public zzfet(zzffo zzffoVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzffoVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfer zzb() {
        zzioe.a(this.a.a.a.d);
        new zzbhi();
        zzcfv zzcfvVar = (zzcfv) this.b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfer(zzcfvVar, scheduledExecutorService, hsnVar);
    }
}
