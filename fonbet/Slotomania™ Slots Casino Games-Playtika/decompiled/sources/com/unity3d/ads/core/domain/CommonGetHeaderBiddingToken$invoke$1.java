package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommonGetHeaderBiddingToken.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", i = {0, 0, 0, 0, 1}, l = {15, 18}, m = "invoke", n = {"this", "tokenConfiguration", "scarEligibleEffectiveList", "tokenNumber", "rawToken"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0"})
/* loaded from: classes6.dex */
final class CommonGetHeaderBiddingToken$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGetHeaderBiddingToken$invoke$1(CommonGetHeaderBiddingToken commonGetHeaderBiddingToken, Continuation<? super CommonGetHeaderBiddingToken$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
