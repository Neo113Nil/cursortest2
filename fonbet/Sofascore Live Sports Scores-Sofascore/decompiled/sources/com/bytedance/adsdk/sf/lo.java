package com.bytedance.adsdk.sf;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo {
    private final Map<String, String> pcc;
    private boolean sf;

    public String pcc(String str, String str2) {
        return pcc(str2);
    }

    public final String sf(String str, String str2) {
        if (this.sf && this.pcc.containsKey(str2)) {
            return this.pcc.get(str2);
        }
        String pcc = pcc(str, str2);
        if (this.sf) {
            this.pcc.put(str2, pcc);
        }
        return pcc;
    }

    public String pcc(String str) {
        return str;
    }
}
