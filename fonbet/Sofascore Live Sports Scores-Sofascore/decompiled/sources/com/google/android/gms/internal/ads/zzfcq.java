package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfcq implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zzinv d;
    public final zzddg e;
    public final zzinv f;
    public final zziof g;
    public final zziof h;

    public zzfcq(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zzinv zzinvVar, zzddg zzddgVar, zzinv zzinvVar2, zziof zziofVar4, zziof zziofVar5) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zziofVar3;
        this.d = zzinvVar;
        this.e = zzddgVar;
        this.f = zzinvVar2;
        this.g = zziofVar4;
        this.h = zziofVar5;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfco(hsnVar, (ScheduledExecutorService) this.a.zzb(), (String) this.b.zzb(), (zzesu) this.c.zzb(), (Context) this.d.zzb(), this.e.a(), (zzesp) this.f.zzb(), (zzdya) this.g.zzb(), (zzecw) this.h.zzb());
    }
}
