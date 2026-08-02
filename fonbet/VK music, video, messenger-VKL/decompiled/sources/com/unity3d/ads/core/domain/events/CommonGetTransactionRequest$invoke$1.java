package com.unity3d.ads.core.domain.events;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CommonGetTransactionRequest.kt */
@b6l(c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", f = "CommonGetTransactionRequest.kt", l = {21}, m = "invoke")
/* loaded from: classes14.dex */
public final class CommonGetTransactionRequest$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGetTransactionRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGetTransactionRequest$invoke$1(CommonGetTransactionRequest commonGetTransactionRequest, spj<? super CommonGetTransactionRequest$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = commonGetTransactionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
