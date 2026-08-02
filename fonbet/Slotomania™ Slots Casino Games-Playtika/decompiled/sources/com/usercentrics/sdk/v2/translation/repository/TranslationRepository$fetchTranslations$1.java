package com.usercentrics.sdk.v2.translation.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TranslationRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.translation.repository.TranslationRepository", f = "TranslationRepository.kt", i = {0}, l = {26}, m = "fetchTranslations", n = {"this"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class TranslationRepository$fetchTranslations$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TranslationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslationRepository$fetchTranslations$1(TranslationRepository translationRepository, Continuation<? super TranslationRepository$fetchTranslations$1> continuation) {
        super(continuation);
        this.this$0 = translationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchTranslations(null, false, this);
    }
}
