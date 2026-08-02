package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: AndroidGetAdPlayerConfigRequest.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J=\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerConfigRequest;", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "mediationInfoConverter", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/MediationInfoConverter;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "configToken", "adFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "loadConfiguration", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetAdPlayerConfigRequest implements GetAdPlayerConfigRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final MediationInfoConverter mediationInfoConverter;

    public AndroidGetAdPlayerConfigRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, MediationInfoConverter mediationInfoConverter) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(mediationInfoConverter, "mediationInfoConverter");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.mediationInfoConverter = mediationInfoConverter;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayerConfigRequest
    public Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation) {
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.INSTANCE;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder newBuilder = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        final AdPlayerConfigRequestKt.Dsl _create = companion._create(newBuilder);
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
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((AdPlayerConfigRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
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
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setAdPlayerConfigRequest(_build);
        return this.getUniversalRequestForPayLoad.invoke(_create2._build(), continuation);
    }
}
