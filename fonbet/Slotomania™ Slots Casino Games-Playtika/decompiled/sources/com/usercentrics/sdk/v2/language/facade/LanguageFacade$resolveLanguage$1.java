package com.usercentrics.sdk.v2.language.facade;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LanguageFacade.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.language.facade.LanguageFacade", f = "LanguageFacade.kt", i = {0}, l = {12}, m = "resolveLanguage-yxL6bBk", n = {"this"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class LanguageFacade$resolveLanguage$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LanguageFacade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LanguageFacade$resolveLanguage$1(LanguageFacade languageFacade, Continuation<? super LanguageFacade$resolveLanguage$1> continuation) {
        super(continuation);
        this.this$0 = languageFacade;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo10623resolveLanguageyxL6bBk = this.this$0.mo10623resolveLanguageyxL6bBk(null, null, null, false, this);
        return mo10623resolveLanguageyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo10623resolveLanguageyxL6bBk : Result.m11179boximpl(mo10623resolveLanguageyxL6bBk);
    }
}
