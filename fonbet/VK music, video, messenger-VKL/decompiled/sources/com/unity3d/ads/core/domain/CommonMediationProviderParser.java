package com.unity3d.ads.core.domain;

import com.ironsource.adapters.unityads.UnityAdsConstants;
import gatewayprotocol.v1.ClientInfoOuterClass;
import xsna.brm0;

/* compiled from: CommonMediationProviderParser.kt */
/* loaded from: classes14.dex */
public final class CommonMediationProviderParser implements MediationProviderParser {
    @Override // com.unity3d.ads.core.domain.MediationProviderParser
    public ClientInfoOuterClass.MediationProvider invoke(String str) {
        if (str != null) {
            ClientInfoOuterClass.MediationProvider mediationProvider = brm0.B(str, "AppLovinSdk_", false) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : str.equalsIgnoreCase("AdMob") ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB : str.equalsIgnoreCase("MAX") ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX : str.equalsIgnoreCase(UnityAdsConstants.MEDIATION_NAME) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
