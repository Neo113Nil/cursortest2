package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: CommonWebViewBridge.kt */
/* loaded from: classes14.dex */
public /* synthetic */ class CommonWebViewBridge$handleInvocationResult$2 extends FunctionReferenceImpl implements wzs<WebViewEvent, spj<? super s3q0>, Object> {
    public CommonWebViewBridge$handleInvocationResult$2(Object obj) {
        super(2, obj, CommonWebViewBridge.class, "sendEvent", "sendEvent(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // xsna.wzs
    public final Object invoke(WebViewEvent webViewEvent, spj<? super s3q0> spjVar) {
        return ((CommonWebViewBridge) this.receiver).sendEvent(webViewEvent, spjVar);
    }
}
