package com.usercentrics.sdk.v2.settings.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AggregatorRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.settings.repository.AggregatorRepository", f = "AggregatorRepository.kt", i = {0}, l = {32}, m = "fetchServices", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class AggregatorRepository$fetchServices$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AggregatorRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AggregatorRepository$fetchServices$1(AggregatorRepository aggregatorRepository, Continuation<? super AggregatorRepository$fetchServices$1> continuation) {
        super(continuation);
        this.this$0 = aggregatorRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchServices(null, null, false, this);
    }
}
