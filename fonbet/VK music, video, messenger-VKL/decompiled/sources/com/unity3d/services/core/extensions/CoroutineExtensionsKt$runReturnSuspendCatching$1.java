package com.unity3d.services.core.extensions;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CoroutineExtensions.kt */
@b6l(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {49}, m = "runReturnSuspendCatching")
/* loaded from: classes14.dex */
public final class CoroutineExtensionsKt$runReturnSuspendCatching$1<R> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public CoroutineExtensionsKt$runReturnSuspendCatching$1(spj<? super CoroutineExtensionsKt$runReturnSuspendCatching$1> spjVar) {
        super(spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runReturnSuspendCatching = CoroutineExtensionsKt.runReturnSuspendCatching(null, this);
        return runReturnSuspendCatching == CoroutineSingletons.COROUTINE_SUSPENDED ? runReturnSuspendCatching : new Result(runReturnSuspendCatching);
    }
}
