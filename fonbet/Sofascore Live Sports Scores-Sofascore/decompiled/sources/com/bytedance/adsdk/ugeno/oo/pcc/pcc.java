package com.bytedance.adsdk.ugeno.oo.pcc;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private volatile Map<String, gm> pcc = new HashMap();

    public gm pcc(String str) {
        if (this.pcc.containsKey(str) && this.pcc.get(str) != null) {
            return this.pcc.get(str);
        }
        sf sfVar = new sf();
        this.pcc.put(str, sfVar);
        return sfVar;
    }

    public void pcc(String str, gm gmVar) {
        if (!this.pcc.containsKey(str) || this.pcc.get(str) == null) {
            this.pcc.put(str, gmVar);
        }
    }
}
