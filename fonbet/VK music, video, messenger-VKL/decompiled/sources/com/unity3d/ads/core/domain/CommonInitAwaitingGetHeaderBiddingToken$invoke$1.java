package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@b6l(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {57, 69}, m = "invoke")
/* loaded from: classes14.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonInitAwaitingGetHeaderBiddingToken$invoke$1(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, spj<? super CommonInitAwaitingGetHeaderBiddingToken$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, null, this);
    }
}
