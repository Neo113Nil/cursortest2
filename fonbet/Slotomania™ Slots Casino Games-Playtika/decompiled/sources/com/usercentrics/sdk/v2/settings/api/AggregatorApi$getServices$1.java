package com.usercentrics.sdk.v2.settings.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AggregatorApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.settings.api.AggregatorApi", f = "AggregatorApi.kt", i = {0}, l = {20}, m = "getServices", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class AggregatorApi$getServices$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AggregatorApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AggregatorApi$getServices$1(AggregatorApi aggregatorApi, Continuation<? super AggregatorApi$getServices$1> continuation) {
        super(continuation);
        this.this$0 = aggregatorApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getServices(null, null, null, this);
    }
}
