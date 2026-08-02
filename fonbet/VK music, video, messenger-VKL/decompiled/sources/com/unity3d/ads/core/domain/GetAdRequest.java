package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import xsna.spj;

/* compiled from: GetAdRequest.kt */
/* loaded from: classes14.dex */
public interface GetAdRequest {

    /* compiled from: GetAdRequest.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, spj spjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                bannerSize = null;
            }
            if ((i & 8) != 0) {
                loadConfigurationInternal = null;
            }
            return getAdRequest.invoke(str, byteString, bannerSize, loadConfigurationInternal, spjVar);
        }
    }

    Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar);
}
