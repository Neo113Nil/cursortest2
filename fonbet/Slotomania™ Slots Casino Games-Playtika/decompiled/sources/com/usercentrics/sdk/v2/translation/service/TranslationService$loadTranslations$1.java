package com.usercentrics.sdk.v2.translation.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TranslationService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.translation.service.TranslationService", f = "TranslationService.kt", i = {}, l = {14}, m = "loadTranslations", n = {}, s = {})
/* loaded from: classes6.dex */
final class TranslationService$loadTranslations$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TranslationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslationService$loadTranslations$1(TranslationService translationService, Continuation<? super TranslationService$loadTranslations$1> continuation) {
        super(continuation);
        this.this$0 = translationService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadTranslations(null, false, this);
    }
}
