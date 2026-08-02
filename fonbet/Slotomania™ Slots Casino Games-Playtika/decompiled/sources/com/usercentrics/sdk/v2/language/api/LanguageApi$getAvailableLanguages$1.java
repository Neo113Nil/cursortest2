package com.usercentrics.sdk.v2.language.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LanguageApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.language.api.LanguageApi", f = "LanguageApi.kt", i = {}, l = {18}, m = "getAvailableLanguages", n = {}, s = {})
/* loaded from: classes5.dex */
final class LanguageApi$getAvailableLanguages$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LanguageApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LanguageApi$getAvailableLanguages$1(LanguageApi languageApi, Continuation<? super LanguageApi$getAvailableLanguages$1> continuation) {
        super(continuation);
        this.this$0 = languageApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAvailableLanguages(null, null, null, this);
    }
}
