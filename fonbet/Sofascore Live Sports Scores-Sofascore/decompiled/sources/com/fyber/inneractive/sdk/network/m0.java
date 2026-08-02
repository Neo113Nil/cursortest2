package com.fyber.inneractive.sdk.network;

import com.ironsource.C4094gc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum m0 {
    POST(C4094gc.b),
    PUT("PUT"),
    DELETE("DELETE"),
    GET(C4094gc.a);

    final String key;

    m0(String str) {
        this.key = str;
    }
}
