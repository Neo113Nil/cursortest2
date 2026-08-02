package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f {
    public final HashMap a = new HashMap();

    public final void a(com.fyber.inneractive.sdk.response.a aVar, e eVar) {
        boolean containsKey = this.a.containsKey(aVar);
        HashMap hashMap = this.a;
        if (containsKey) {
            IAlog.f("Handler already exists for ad type %s! : %s", aVar, hashMap.get(aVar));
        } else {
            hashMap.put(aVar, eVar);
        }
    }
}
