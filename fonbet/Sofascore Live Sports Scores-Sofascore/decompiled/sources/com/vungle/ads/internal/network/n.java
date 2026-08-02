package com.vungle.ads.internal.network;

import defpackage.a70;
import defpackage.d2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class n {
    public static o a(d2g d2gVar) {
        d2gVar.getClass();
        if (!d2gVar.q) {
            return new o(d2gVar, null, 0);
        }
        a70.p("rawResponse should not be successful response");
        return null;
    }

    public static o a(Object obj, d2g d2gVar) {
        d2gVar.getClass();
        if (d2gVar.q) {
            return new o(d2gVar, obj, 0);
        }
        a70.p("rawResponse must be successful response");
        return null;
    }
}
