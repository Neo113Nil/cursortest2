package com.usercentrics.tcf.core;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GVL.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.tcf.core.GVL", f = "GVL.kt", i = {0}, l = {74}, m = "initialize-IoAF18A", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class GVL$initialize$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GVL this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GVL$initialize$1(GVL gvl, Continuation<? super GVL$initialize$1> continuation) {
        super(continuation);
        this.this$0 = gvl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m10629initializeIoAF18A = this.this$0.m10629initializeIoAF18A(this);
        return m10629initializeIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10629initializeIoAF18A : Result.m11179boximpl(m10629initializeIoAF18A);
    }
}
