package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdyu implements zzinw {
    public final zzdzn a;

    public zzdyu(zzdzn zzdznVar) {
        this.a = zzdznVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzdzn zzdznVar = this.a;
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k6)).booleanValue() ? Collections.singleton(new zzdlo(new zzdzm((zzbif) zzdznVar.a.zzb(), zzdznVar.b.zzb()), hsnVar)) : Collections.EMPTY_SET;
        zzioe.a(singleton);
        return singleton;
    }
}
