package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFb1vSDK {
    public final Map<String, Object> d = new HashMap();
    public Map<String, Object> AFKeystoreWrapper = new HashMap();

    public final void AFKeystoreWrapper(Map<String, Object> map) {
        if (!this.d.isEmpty()) {
            map.put("partner_data", this.d);
        }
        if (this.AFKeystoreWrapper.isEmpty()) {
            return;
        }
        AFj1tSDK.d(map).put("partner_data", this.AFKeystoreWrapper);
        this.AFKeystoreWrapper = new HashMap();
    }
}
