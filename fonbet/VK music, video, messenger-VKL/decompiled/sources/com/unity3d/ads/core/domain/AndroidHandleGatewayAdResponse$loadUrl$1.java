package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {277}, m = "loadUrl")
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayAdResponse$loadUrl$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$loadUrl$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, spj<? super AndroidHandleGatewayAdResponse$loadUrl$1> spjVar) {
        super(spjVar);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadUrl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadUrl = this.this$0.loadUrl(null, null, null, this);
        return loadUrl;
    }
}
