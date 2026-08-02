package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* loaded from: classes12.dex */
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
