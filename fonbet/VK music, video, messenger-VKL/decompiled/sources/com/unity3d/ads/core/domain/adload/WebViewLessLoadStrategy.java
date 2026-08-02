package com.unity3d.ads.core.domain.adload;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import xsna.spj;
import xsna.yvj;

/* compiled from: WebViewLessLoadStrategy.kt */
/* loaded from: classes14.dex */
public interface WebViewLessLoadStrategy {
    Object invoke(yvj yvjVar, String str, UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, String str2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, spj<? super LoadResult> spjVar);
}
