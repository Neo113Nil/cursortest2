package com.appsflyer.internal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFh1eSDK extends AFh1mSDK {
    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1pSDK AFAdRevenueData() {
        return this.component4 == 1 ? AFe1pSDK.CONVERSION : AFe1pSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final boolean areAllFieldsValid() {
        return true;
    }
}
