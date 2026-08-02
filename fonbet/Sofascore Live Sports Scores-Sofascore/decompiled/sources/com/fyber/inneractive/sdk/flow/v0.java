package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class v0 {
    public boolean a = true;
    public String b;

    public boolean getAllowFullscreen() {
        return this.a;
    }

    public String getMediationName() {
        return IAConfigManager.N.l;
    }

    public String getMediationVersion() {
        return IAConfigManager.N.n;
    }
}
