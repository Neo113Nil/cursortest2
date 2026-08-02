package com.usercentrics.sdk.v2.language.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LanguageRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.language.repository.LanguageRepository", f = "LanguageRepository.kt", i = {0, 0}, l = {22}, m = "fetchAvailableLanguages", n = {"this", "bypassCache"}, s = {"L$0", "Z$0"})
/* loaded from: classes6.dex */
final class LanguageRepository$fetchAvailableLanguages$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LanguageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LanguageRepository$fetchAvailableLanguages$1(LanguageRepository languageRepository, Continuation<? super LanguageRepository$fetchAvailableLanguages$1> continuation) {
        super(continuation);
        this.this$0 = languageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchAvailableLanguages(null, null, false, this);
    }
}
