package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.hsn;
import defpackage.qio;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezk implements zzinw {
    public final zzfak a;
    public final zziof b;

    public zzezk(zzfak zzfakVar, zzcok zzcokVar) {
        this.a = zzfakVar;
        this.b = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Object obj;
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzfai zzfaiVar = new zzfai(((zzcok) this.a.a).a(), hsnVar);
        Context a = ((zzcok) this.b).a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Yc)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(a)) {
                int i = zzgxw.c;
                obj = new qio(zzfaiVar);
                zzioe.a(obj);
                return obj;
            }
        }
        int i2 = zzgxw.c;
        obj = t.j;
        zzioe.a(obj);
        return obj;
    }
}
