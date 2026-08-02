package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: CommonMediationProviderParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonMediationProviderParser;", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "()V", "invoke", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CommonMediationProviderParser implements MediationProviderParser {
    @Override // com.unity3d.ads.core.domain.MediationProviderParser
    public ClientInfoOuterClass.MediationProvider invoke(String mediationProvider) {
        ClientInfoOuterClass.MediationProvider mediationProvider2;
        if (mediationProvider != null) {
            if (StringsKt.startsWith$default(mediationProvider, "AppLovinSdk_", false, 2, (Object) null)) {
                mediationProvider2 = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else if (StringsKt.equals(mediationProvider, "AdMob", true)) {
                mediationProvider2 = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
            } else if (StringsKt.equals(mediationProvider, "MAX", true)) {
                mediationProvider2 = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else {
                mediationProvider2 = StringsKt.equals(mediationProvider, "ironSource", true) ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            }
            if (mediationProvider2 != null) {
                return mediationProvider2;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
