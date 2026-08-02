package com.google.android.gms.internal.ads;

import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdtm implements zzinw {
    public final zzdub a;
    public final zzdug b;
    public final zzinv c;

    public zzdtm(zzdub zzdubVar, zzdug zzdugVar, zzinv zzinvVar) {
        this.a = zzdubVar;
        this.b = zzdugVar;
        this.c = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdtl zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzdua zzb = this.a.zzb();
        zzioe.a(hsnVar);
        zzdug zzdugVar = this.b;
        return new zzdtl(hsnVar, zzb, new zzduf(hsnVar, zzdugVar.a.zzb(), (zzeae) zzdugVar.b.zzb()), (zzeae) this.c.zzb());
    }
}
