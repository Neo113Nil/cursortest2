package com.unity3d.services.core.di;

import com.unity3d.ads.core.configuration.AndroidManifestStringPropertyReader;
import com.unity3d.ads.core.data.model.GatewayUrl;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"provideGatewayUrl", "Lcom/unity3d/ads/core/data/model/GatewayUrl;", "reader", "Lcom/unity3d/ads/core/configuration/AndroidManifestStringPropertyReader;", "(Lcom/unity3d/ads/core/configuration/AndroidManifestStringPropertyReader;)Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
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
        return GatewayUrl.m737constructorimpl(propertyByName);
    }
}
