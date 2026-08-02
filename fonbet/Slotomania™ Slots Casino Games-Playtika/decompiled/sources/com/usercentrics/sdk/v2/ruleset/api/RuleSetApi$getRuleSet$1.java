package com.usercentrics.sdk.v2.ruleset.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RuleSetApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.ruleset.api.RuleSetApi", f = "RuleSetApi.kt", i = {0, 0}, l = {20}, m = "getRuleSet", n = {"this", "id"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class RuleSetApi$getRuleSet$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RuleSetApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuleSetApi$getRuleSet$1(RuleSetApi ruleSetApi, Continuation<? super RuleSetApi$getRuleSet$1> continuation) {
        super(continuation);
        this.this$0 = ruleSetApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRuleSet(null, null, this);
    }
}
