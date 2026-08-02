package com.fyber.inneractive.sdk.cache.session;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class a extends HashMap {
    public final /* synthetic */ int a = 25;

    public a() {
        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE) {
                put(cVar, new k(this.a));
            }
        }
    }
}
