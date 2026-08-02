package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1fSDK implements AFi1dSDK {

    @NotNull
    private final String d = "DeeplinkProcessedCondition";
    public volatile boolean registerClient;

    @Override // com.appsflyer.internal.AFi1dSDK
    public final void AFLogger() {
        this.registerClient = false;
    }

    @Override // com.appsflyer.internal.AFi1dSDK
    @NotNull
    public final String registerClient() {
        return this.d;
    }

    @Override // com.appsflyer.internal.AFi1dSDK
    public final boolean unregisterClient() {
        return this.registerClient;
    }
}
