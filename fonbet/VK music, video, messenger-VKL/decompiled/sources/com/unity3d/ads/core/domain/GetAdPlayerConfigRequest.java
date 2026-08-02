package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import xsna.spj;

/* compiled from: GetAdPlayerConfigRequest.kt */
/* loaded from: classes14.dex */
public interface GetAdPlayerConfigRequest {

    /* compiled from: GetAdPlayerConfigRequest.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdPlayerConfigRequest getAdPlayerConfigRequest, String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, spj spjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 16) != 0) {
                loadConfigurationInternal = null;
            }
            return getAdPlayerConfigRequest.invoke(str, byteString, byteString2, adFormat, loadConfigurationInternal, spjVar);
        }
    }

    Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar);
}
