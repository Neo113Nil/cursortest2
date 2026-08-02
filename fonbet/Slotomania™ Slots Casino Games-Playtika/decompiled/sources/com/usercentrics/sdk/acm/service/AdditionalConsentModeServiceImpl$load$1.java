package com.usercentrics.sdk.acm.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AdditionalConsentModeServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.acm.service.AdditionalConsentModeServiceImpl", f = "AdditionalConsentModeServiceImpl.kt", i = {0}, l = {37}, m = "load", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class AdditionalConsentModeServiceImpl$load$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdditionalConsentModeServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalConsentModeServiceImpl$load$1(AdditionalConsentModeServiceImpl additionalConsentModeServiceImpl, Continuation<? super AdditionalConsentModeServiceImpl$load$1> continuation) {
        super(continuation);
        this.this$0 = additionalConsentModeServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(null, this);
    }
}
