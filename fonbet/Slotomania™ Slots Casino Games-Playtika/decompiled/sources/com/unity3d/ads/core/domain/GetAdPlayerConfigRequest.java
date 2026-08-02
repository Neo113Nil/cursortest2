package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: GetAdPlayerConfigRequest.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH¦Bø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "configToken", "adFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "loadConfiguration", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GetAdPlayerConfigRequest {
    Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation);

    /* compiled from: GetAdPlayerConfigRequest.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdPlayerConfigRequest getAdPlayerConfigRequest, String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 16) != 0) {
                loadConfigurationInternal = null;
            }
            return getAdPlayerConfigRequest.invoke(str, byteString, byteString2, adFormat, loadConfigurationInternal, continuation);
        }
    }
}
