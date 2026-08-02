package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {301, 307}, m = "cleanup")
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayAdResponse$cleanup$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$cleanup$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, spj<? super AndroidHandleGatewayAdResponse$cleanup$1> spjVar) {
        super(spjVar);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object cleanup;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        cleanup = this.this$0.cleanup(null, null, null, null, this);
        return cleanup;
    }
}
