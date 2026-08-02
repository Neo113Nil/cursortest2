package com.unity3d.ads.core.domain;

import com.unity3d.ads.MediationInfo;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonMediationInfoConverter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonMediationInfoConverter;", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "mediationProviderParser", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "(Lcom/unity3d/ads/core/domain/MediationProviderParser;)V", "invoke", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoData", "Lcom/unity3d/ads/MediationInfo;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonMediationInfoConverter implements MediationInfoConverter {
    private final MediationProviderParser mediationProviderParser;

    public CommonMediationInfoConverter(MediationProviderParser mediationProviderParser) {
        Intrinsics.checkNotNullParameter(mediationProviderParser, "mediationProviderParser");
        this.mediationProviderParser = mediationProviderParser;
    }

    @Override // com.unity3d.ads.core.domain.MediationInfoConverter
    public MediationInfoOuterClass.MediationInfo invoke(MediationInfo mediationInfoData) {
        Intrinsics.checkNotNullParameter(mediationInfoData, "mediationInfoData");
        ClientInfoOuterClass.MediationProvider invoke = this.mediationProviderParser.invoke(mediationInfoData.getName());
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.INSTANCE;
        MediationInfoOuterClass.MediationInfo.Builder newBuilder = MediationInfoOuterClass.MediationInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        MediationInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setProvider(invoke);
        if (invoke == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
            _create.setCustomName(mediationInfoData.getName());
        }
        _create.setVersion(mediationInfoData.getVersion());
        _create.setAdapterVersion(mediationInfoData.getAdapterVersion());
        return _create._build();
    }
}
