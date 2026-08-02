package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFh1qSDK extends AFa1pSDK {

    /* renamed from: w, reason: collision with root package name */
    public final AFf1zSDK f57479w;

    @Deprecated
    public AFh1qSDK() {
        this.f57479w = null;
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFf1zSDK AFKeystoreWrapper() {
        AFf1zSDK aFf1zSDK = this.f57479w;
        return aFf1zSDK != null ? aFf1zSDK : AFf1zSDK.CACHED_EVENT;
    }

    public AFh1qSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        super(null, str, Boolean.FALSE);
        this.AFInAppEventParameterName = str2;
        values(bArr);
        this.f57479w = aFf1zSDK;
    }
}
