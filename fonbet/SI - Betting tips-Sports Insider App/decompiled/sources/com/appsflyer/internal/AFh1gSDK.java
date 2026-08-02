package com.appsflyer.internal;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFh1gSDK extends AFh1mSDK {
    public final AFe1pSDK hashCode;

    @Deprecated
    public AFh1gSDK() {
        this.hashCode = null;
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1pSDK AFAdRevenueData() {
        AFe1pSDK aFe1pSDK = this.hashCode;
        return aFe1pSDK != null ? aFe1pSDK : AFe1pSDK.CACHED_EVENT;
    }

    public AFh1gSDK(String str, byte[] bArr, String str2, AFe1pSDK aFe1pSDK, Map<String, String> map) {
        super(null, str, Boolean.FALSE);
        this.component3 = str2;
        getMediationNetwork(bArr);
        this.hashCode = aFe1pSDK;
        if (map != null) {
            this.getMediationNetwork.putAll(map);
        }
    }
}
