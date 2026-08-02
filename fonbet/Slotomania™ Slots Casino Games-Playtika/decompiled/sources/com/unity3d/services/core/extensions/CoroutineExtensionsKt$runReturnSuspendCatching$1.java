package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoroutineExtensions.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", i = {}, l = {49}, m = "runReturnSuspendCatching", n = {}, s = {})
/* loaded from: classes2.dex */
final class CoroutineExtensionsKt$runReturnSuspendCatching$1<R> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    CoroutineExtensionsKt$runReturnSuspendCatching$1(Continuation<? super CoroutineExtensionsKt$runReturnSuspendCatching$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runReturnSuspendCatching = CoroutineExtensionsKt.runReturnSuspendCatching(null, this);
        return runReturnSuspendCatching == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? runReturnSuspendCatching : Result.m11179boximpl(runReturnSuspendCatching);
    }
}
