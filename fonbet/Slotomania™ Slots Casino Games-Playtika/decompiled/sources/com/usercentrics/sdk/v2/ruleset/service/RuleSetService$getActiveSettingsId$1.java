package com.usercentrics.sdk.v2.ruleset.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RuleSetService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.ruleset.service.RuleSetService", f = "RuleSetService.kt", i = {0, 0}, l = {19}, m = "getActiveSettingsId", n = {"this", "hasCachedLocation"}, s = {"L$0", "Z$0"})
/* loaded from: classes2.dex */
final class RuleSetService$getActiveSettingsId$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RuleSetService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuleSetService$getActiveSettingsId$1(RuleSetService ruleSetService, Continuation<? super RuleSetService$getActiveSettingsId$1> continuation) {
        super(continuation);
        this.this$0 = ruleSetService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getActiveSettingsId(null, this);
    }
}
