package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewx implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;

    public zzewx(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zziofVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        zzcfv zzcfvVar = (zzcfv) this.b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzewv(a, zzcfvVar, scheduledExecutorService, hsnVar);
    }
}
