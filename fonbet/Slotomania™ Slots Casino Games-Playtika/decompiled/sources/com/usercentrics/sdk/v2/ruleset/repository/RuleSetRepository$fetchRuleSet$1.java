package com.usercentrics.sdk.v2.ruleset.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RuleSetRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.ruleset.repository.RuleSetRepository", f = "RuleSetRepository.kt", i = {0}, l = {23}, m = "fetchRuleSet", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class RuleSetRepository$fetchRuleSet$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RuleSetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuleSetRepository$fetchRuleSet$1(RuleSetRepository ruleSetRepository, Continuation<? super RuleSetRepository$fetchRuleSet$1> continuation) {
        super(continuation);
        this.this$0 = ruleSetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchRuleSet(null, false, this);
    }
}
