package com.zoho.messenger.api;

import gg.C4379a;

/* loaded from: classes4.dex */
public abstract class i extends b {
    public static void l(String str, fg.e eVar) {
        if (str != null) {
            b.d(str).D(a.SERVICECHAT, eVar);
        }
    }

    public static void m(String str, fg.e eVar) {
        if (str != null) {
            if (b.f44591a.containsKey(str)) {
                ((C4379a) b.f44591a.get(str)).L(a.SERVICECHAT);
            }
            l(str, eVar);
        }
    }
}
