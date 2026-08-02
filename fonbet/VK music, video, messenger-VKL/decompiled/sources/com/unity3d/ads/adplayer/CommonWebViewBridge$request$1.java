package com.unity3d.ads.adplayer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CommonWebViewBridge.kt */
@b6l(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {83, 85}, m = "request")
/* loaded from: classes14.dex */
public final class CommonWebViewBridge$request$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$request$1(CommonWebViewBridge commonWebViewBridge, spj<? super CommonWebViewBridge$request$1> spjVar) {
        super(spjVar);
        this.this$0 = commonWebViewBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.request(null, null, null, this);
    }
}
