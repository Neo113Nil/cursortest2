package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcos implements zzinw {
    public final zzinv a;

    public zzcos(zzinv zzinvVar) {
        this.a = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzecw zzecwVar = (zzecw) this.a.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t2)).booleanValue() ? Collections.singleton(new zzdlo(zzecwVar, hsnVar)) : Collections.EMPTY_SET;
        zzioe.a(singleton);
        return singleton;
    }
}
