package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdss implements zzinw {
    public final zzdrj a;
    public final zzdpq b;
    public final zziof c;

    public zzdss(zzdrj zzdrjVar, zzdpq zzdpqVar, zzinv zzinvVar) {
        this.a = zzdrjVar;
        this.b = zzdpqVar;
        this.c = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdqr a = this.a.a();
        zzdqv zzdqvVar = (zzdqv) this.b.a.zzb();
        zzioe.a(zzdqvVar);
        Executor executor = (Executor) this.c.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzdsr(a, zzdqvVar, executor, hsnVar);
    }
}
