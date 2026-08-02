package com.unity3d.ads.core.domain.events;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommonGetTransactionRequest.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", f = "CommonGetTransactionRequest.kt", i = {0, 0, 0, 0, 0}, l = {21}, m = "invoke", n = {"this", "transactionDataList", "googlePlayBillingLibraryVersion", "transactionOrigin", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5"})
/* loaded from: classes4.dex */
final class CommonGetTransactionRequest$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGetTransactionRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGetTransactionRequest$invoke$1(CommonGetTransactionRequest commonGetTransactionRequest, Continuation<? super CommonGetTransactionRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonGetTransactionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
