package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.spj;

/* compiled from: AndroidGetAdPlayerConfigRequest.kt */
/* loaded from: classes14.dex */
public final class AndroidGetAdPlayerConfigRequest implements GetAdPlayerConfigRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final MediationInfoConverter mediationInfoConverter;

    public AndroidGetAdPlayerConfigRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, MediationInfoConverter mediationInfoConverter) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.mediationInfoConverter = mediationInfoConverter;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayerConfigRequest
    public Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar) {
        final AdPlayerConfigRequestKt.Dsl _create = AdPlayerConfigRequestKt.Dsl.Companion._create(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder());
        _create.setConfigurationToken(byteString2);
        _create.setPlacementId(str);
        _create.setImpressionOpportunityId(byteString);
        if (adFormat != null) {
            _create.setAdFormat(adFormat);
        }
        if (loadConfigurationInternal != null) {
            String mediationAdUnitId = loadConfigurationInternal.getMediationAdUnitId();
            if (mediationAdUnitId != null) {
                new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest$invoke$request$1$2$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                    public Object get() {
                        return ((AdPlayerConfigRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                    public void set(Object obj) {
                        ((AdPlayerConfigRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj);
                    }
                }.set(mediationAdUnitId);
            }
            MediationInfo mediationInfo = loadConfigurationInternal.getMediationInfo();
            if (mediationInfo != null) {
                _create.setMediationInfo(this.mediationInfoConverter.invoke(mediationInfo));
            }
            _create.putAllExtras(_create.getExtrasMap(), loadConfigurationInternal.getExtras());
        }
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build = _create._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl _create2 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
        _create2.setAdPlayerConfigRequest(_build);
        return this.getUniversalRequestForPayLoad.invoke(_create2._build(), spjVar);
    }
}
