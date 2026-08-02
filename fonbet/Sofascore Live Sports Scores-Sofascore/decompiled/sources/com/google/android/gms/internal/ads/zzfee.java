package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfee implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zzemp d;
    public final zzddg e;
    public final zziof f;

    public zzfee(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zzemp zzempVar, zzddg zzddgVar, zziof zziofVar4) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zziofVar3;
        this.d = zzempVar;
        this.e = zzddgVar;
        this.f = zziofVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        com.google.android.gms.ads.internal.util.zzj zzb = ((zzcoe) this.a).zzb();
        Context a = ((zzcok) this.b).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfec(zzb, a, hsnVar, (ScheduledExecutorService) this.c.zzb(), new zzemo(((zzcok) this.d.a).a()), this.e.a(), ((zzcpa) this.f).a());
    }
}
