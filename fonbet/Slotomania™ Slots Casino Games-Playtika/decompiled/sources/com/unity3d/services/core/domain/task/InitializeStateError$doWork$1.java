package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InitializeStateError.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateError", f = "InitializeStateError.kt", i = {}, l = {27}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
final class InitializeStateError$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateError$doWork$1(InitializeStateError initializeStateError, Continuation<? super InitializeStateError$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m10570doWorkgIAlus = this.this$0.m10570doWorkgIAlus((InitializeStateError.Params) null, (Continuation<? super Result<Unit>>) this);
        return m10570doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10570doWorkgIAlus : Result.m11179boximpl(m10570doWorkgIAlus);
    }
}
