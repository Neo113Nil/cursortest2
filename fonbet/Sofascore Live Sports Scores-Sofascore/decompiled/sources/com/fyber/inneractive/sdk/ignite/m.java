package com.fyber.inneractive.sdk.ignite;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum m {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP("st"),
    NONE("none");

    private static final Map<String, m> CONSTANTS = new HashMap();
    private final String value;

    static {
        for (m mVar : values()) {
            CONSTANTS.put(mVar.value, mVar);
        }
    }

    m(String str) {
        this.value = str;
    }

    public static m a(String str) {
        return CONSTANTS.get(str);
    }

    public final String a() {
        return this.value;
    }
}
