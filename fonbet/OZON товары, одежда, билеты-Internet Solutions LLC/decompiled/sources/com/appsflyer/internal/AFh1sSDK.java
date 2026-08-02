package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFh1sSDK extends AFa1pSDK {
    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFf1zSDK AFKeystoreWrapper() {
        return this.registerClient == 1 ? AFf1zSDK.CONVERSION : AFf1zSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final boolean unregisterClient() {
        return true;
    }
}
