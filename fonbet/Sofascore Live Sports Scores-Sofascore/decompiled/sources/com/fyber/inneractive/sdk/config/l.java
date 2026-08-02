package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l {
    public final HashMap a = new HashMap();

    public final boolean a() {
        try {
            if (this.a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
