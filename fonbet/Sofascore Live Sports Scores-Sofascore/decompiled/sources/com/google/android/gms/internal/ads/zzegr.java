package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzegr implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zzddg d;
    public final zziof e;
    public final zzinv f;
    public final zzinv g;
    public final zziof h;
    public final zziof i;
    public final zzdgu j;

    public zzegr(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zzddg zzddgVar, zziof zziofVar4, zzinv zzinvVar, zzinv zzinvVar2, zziof zziofVar5, zziof zziofVar6, zzdgu zzdguVar) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zziofVar3;
        this.d = zzddgVar;
        this.e = zziofVar4;
        this.f = zzinvVar;
        this.g = zzinvVar2;
        this.h = zziofVar5;
        this.i = zziofVar6;
        this.j = zzdguVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzegq zzb() {
        zzcob zzcobVar = (zzcob) this.a.zzb();
        Context a = ((zzcok) this.b).a();
        VersionInfoParcel a2 = ((zzcpa) this.c).a();
        zzflw a3 = this.d.a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        String str = (String) this.e.zzb();
        zzfrg zzfrgVar = (zzfrg) this.f.zzb();
        zzeae zzeaeVar = (zzeae) this.g.zzb();
        zzccd zzccdVar = new zzccd();
        new zzejl();
        return new zzegq(zzcobVar, a, a2, a3, hsnVar, str, zzfrgVar, zzeaeVar, zzccdVar, (ScheduledExecutorService) this.h.zzb(), (zzfte) this.i.zzb(), new zzdgt(this.j.a.zzb()));
    }
}
