package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepn implements zzinw {
    public final zziof a;
    public final zzinv b;
    public final zziof c;
    public final zzinv d;
    public final zzinv e;
    public final zzinv f;

    public zzepn(zziof zziofVar, zzinv zzinvVar, zziof zziofVar2, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4) {
        this.a = zziofVar;
        this.b = zzinvVar;
        this.c = zziofVar2;
        this.d = zzinvVar2;
        this.e = zzinvVar3;
        this.f = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzepl zzb() {
        Context a = ((zzcok) this.a).a();
        zzfrg zzfrgVar = (zzfrg) this.b.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzepl(a, zzfrgVar, hsnVar, (ScheduledExecutorService) this.c.zzb(), (zzcyo) this.d.zzb(), (zzeqb) this.e.zzb(), (zzfta) this.f.zzb());
    }
}
