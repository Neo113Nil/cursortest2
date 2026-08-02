package com.usercentrics.sdk;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UsercentricsSDKImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.UsercentricsSDKImpl", f = "UsercentricsSDKImpl.kt", i = {}, l = {283}, m = "finishChangeLanguage-gIAlu-s", n = {}, s = {})
/* loaded from: classes2.dex */
final class UsercentricsSDKImpl$finishChangeLanguage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UsercentricsSDKImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsercentricsSDKImpl$finishChangeLanguage$1(UsercentricsSDKImpl usercentricsSDKImpl, Continuation<? super UsercentricsSDKImpl$finishChangeLanguage$1> continuation) {
        super(continuation);
        this.this$0 = usercentricsSDKImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m10588finishChangeLanguagegIAlus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m10588finishChangeLanguagegIAlus = this.this$0.m10588finishChangeLanguagegIAlus(null, this);
        return m10588finishChangeLanguagegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10588finishChangeLanguagegIAlus : Result.m11179boximpl(m10588finishChangeLanguagegIAlus);
    }
}
