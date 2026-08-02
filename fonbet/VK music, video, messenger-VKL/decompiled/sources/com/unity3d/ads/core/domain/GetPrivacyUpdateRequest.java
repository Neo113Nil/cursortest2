package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.PrivacyUpdateRequestKt;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import xsna.spj;

/* compiled from: GetPrivacyUpdateRequest.kt */
/* loaded from: classes14.dex */
public final class GetPrivacyUpdateRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public GetPrivacyUpdateRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    public final Object invoke(int i, ByteString byteString, spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar) {
        PrivacyUpdateRequestKt.Dsl _create = PrivacyUpdateRequestKt.Dsl.Companion._create(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder());
        _create.setVersion(i);
        _create.setContent(byteString);
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest _build = _create._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl _create2 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
        _create2.setPrivacyUpdateRequest(_build);
        return this.getUniversalRequestForPayLoad.invoke(_create2._build(), spjVar);
    }
}
