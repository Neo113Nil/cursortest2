package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzehn implements zzinw {
    public final zziod a;
    public final zzdgu b;

    public zzehn(zziod zziodVar, zzdgu zzdguVar) {
        this.a = zziodVar;
        this.b = zzdguVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Map map = this.a.a;
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzehm(map, hsnVar, new zzdgt(this.b.a.zzb()));
    }
}
