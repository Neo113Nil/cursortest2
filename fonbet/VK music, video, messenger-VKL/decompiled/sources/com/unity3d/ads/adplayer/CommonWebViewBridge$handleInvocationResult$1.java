package com.unity3d.ads.adplayer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CommonWebViewBridge.kt */
@b6l(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {150, 158, 160, 164, 166, 181, 186}, m = "handleInvocationResult")
/* loaded from: classes14.dex */
public final class CommonWebViewBridge$handleInvocationResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocationResult$1(CommonWebViewBridge commonWebViewBridge, spj<? super CommonWebViewBridge$handleInvocationResult$1> spjVar) {
        super(spjVar);
        this.this$0 = commonWebViewBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleInvocationResult;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleInvocationResult = this.this$0.handleInvocationResult(null, null, this);
        return handleInvocationResult;
    }
}
