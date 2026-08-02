package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.ue8;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzejo {
    public final zzcbr a;

    public zzejo(zzcbr zzcbrVar) {
        this.a = zzcbrVar;
    }

    public final void a() {
        ddb a = this.a.a();
        String str = "persistFlags";
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M8)).booleanValue()) {
            zzcgm.a(a, "persistFlags", zzcgj.h);
            return;
        }
        ue8 ue8Var = new ue8(str, 2);
        a.addListener(new vlo(0, a, ue8Var), zzcgj.h);
    }
}
