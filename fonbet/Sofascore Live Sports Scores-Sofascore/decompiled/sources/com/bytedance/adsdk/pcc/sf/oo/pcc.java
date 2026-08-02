package com.bytedance.adsdk.pcc.sf.oo;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum pcc implements vj {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, pcc> oo = new HashMap(128);

    static {
        for (pcc pccVar : values()) {
            oo.put(pccVar.name().toLowerCase(), pccVar);
        }
    }

    public static pcc pcc(String str) {
        return oo.get(str.toLowerCase());
    }
}
