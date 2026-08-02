package com.unity3d.services.core.di;

import com.unity3d.ads.core.configuration.AndroidManifestStringPropertyReader;
import com.unity3d.ads.core.data.model.GatewayUrl;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ServiceProvider.kt */
/* loaded from: classes14.dex */
public final class ServiceProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String provideGatewayUrl(AndroidManifestStringPropertyReader androidManifestStringPropertyReader) {
        String propertyByName = androidManifestStringPropertyReader.getPropertyByName("GatewayUrl");
        if (propertyByName != null) {
            if (propertyByName.length() <= 0) {
                propertyByName = null;
            }
        }
        propertyByName = UnityAdsConstants.DefaultUrls.GATEWAY_URL;
        return GatewayUrl.m58constructorimpl(propertyByName);
    }
}
