package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdrr implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zzdrj d;
    public final zzinw e;
    public final zzinw f;
    public final zziof g;
    public final zzinv h;

    public zzdrr(zzcoe zzcoeVar, zzddg zzddgVar, zziof zziofVar, zzdrj zzdrjVar, zzinw zzinwVar, zzinw zzinwVar2, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzcoeVar;
        this.b = zzddgVar;
        this.c = zziofVar;
        this.d = zzdrjVar;
        this.e = zzinwVar;
        this.f = zzinwVar2;
        this.g = zzinvVar;
        this.h = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdrq zzb() {
        com.google.android.gms.ads.internal.util.zzj zzb = ((zzcoe) this.a).zzb();
        zzflw a = ((zzddg) this.b).a();
        zzdqw zzdqwVar = (zzdqw) this.c.zzb();
        zzdqr a2 = this.d.a();
        zzdse zzdseVar = (zzdse) this.e.zzb();
        zzdsm zzdsmVar = (zzdsm) this.f.zzb();
        Executor executor = (Executor) this.g.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzdrq(zzb, a, zzdqwVar, a2, zzdseVar, zzdsmVar, executor, hsnVar, (zzdqo) this.h.zzb());
    }
}
