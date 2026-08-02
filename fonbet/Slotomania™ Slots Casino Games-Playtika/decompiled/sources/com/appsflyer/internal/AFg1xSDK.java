package com.appsflyer.internal;

/* loaded from: classes6.dex */
public final class AFg1xSDK extends AFh1tSDK {
    @Override // com.appsflyer.internal.AFh1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFg1xSDK() {
        super("Register", null, Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFh1tSDK
    public final AFe1uSDK getMediationNetwork() {
        return AFe1uSDK.REGISTER;
    }
}
