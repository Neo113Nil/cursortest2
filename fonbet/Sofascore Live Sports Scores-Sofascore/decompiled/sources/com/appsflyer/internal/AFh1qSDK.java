package com.appsflyer.internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1qSDK extends AFh1zSDK {
    @Override // com.appsflyer.internal.AFh1zSDK
    public final AFe1zSDK d() {
        return this.afErrorLog == 1 ? AFd1aSDK.unregisterClient : AFd1aSDK.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final boolean registerClient() {
        return true;
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final boolean unregisterClient() {
        return this.afInfoLog;
    }
}
