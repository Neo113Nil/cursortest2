package com.moloco.sdk.internal.services;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p implements o {
    public final Context a;

    public p(Context context) {
        this.a = context;
    }

    public final com.facebook.appevents.j a() {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        com.facebook.appevents.j jVar = null;
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) u2gVar;
        com.facebook.appevents.j jVar2 = n.a;
        if (info == null) {
            return jVar2;
        }
        if (info.isLimitAdTrackingEnabled()) {
            jVar = jVar2;
        } else {
            String id = info.getId();
            if (id != null) {
                jVar = new m(id);
            }
        }
        return jVar != null ? jVar : jVar2;
    }
}
