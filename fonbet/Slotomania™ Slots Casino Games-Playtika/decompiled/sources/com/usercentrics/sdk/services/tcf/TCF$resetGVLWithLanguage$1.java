package com.usercentrics.sdk.services.tcf;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TCF.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.services.tcf.TCF", f = "TCF.kt", i = {}, l = {1132}, m = "resetGVLWithLanguage-gIAlu-s", n = {}, s = {})
/* loaded from: classes2.dex */
final class TCF$resetGVLWithLanguage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TCF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCF$resetGVLWithLanguage$1(TCF tcf, Continuation<? super TCF$resetGVLWithLanguage$1> continuation) {
        super(continuation);
        this.this$0 = tcf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m10607resetGVLWithLanguagegIAlus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m10607resetGVLWithLanguagegIAlus = this.this$0.m10607resetGVLWithLanguagegIAlus(null, this);
        return m10607resetGVLWithLanguagegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10607resetGVLWithLanguagegIAlus : Result.m11179boximpl(m10607resetGVLWithLanguagegIAlus);
    }
}
