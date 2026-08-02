package com.unity3d.ads.core.domain;

import com.unity3d.ads.MediationInfo;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;

/* compiled from: CommonMediationInfoConverter.kt */
/* loaded from: classes14.dex */
public final class CommonMediationInfoConverter implements MediationInfoConverter {
    private final MediationProviderParser mediationProviderParser;

    public CommonMediationInfoConverter(MediationProviderParser mediationProviderParser) {
        this.mediationProviderParser = mediationProviderParser;
    }

    @Override // com.unity3d.ads.core.domain.MediationInfoConverter
    public MediationInfoOuterClass.MediationInfo invoke(MediationInfo mediationInfo) {
        ClientInfoOuterClass.MediationProvider invoke = this.mediationProviderParser.invoke(mediationInfo.getName());
        MediationInfoKt.Dsl _create = MediationInfoKt.Dsl.Companion._create(MediationInfoOuterClass.MediationInfo.newBuilder());
        _create.setProvider(invoke);
        if (invoke == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
            _create.setCustomName(mediationInfo.getName());
        }
        _create.setVersion(mediationInfo.getVersion());
        _create.setAdapterVersion(mediationInfo.getAdapterVersion());
        return _create._build();
    }
}
