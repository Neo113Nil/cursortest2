package com.unity3d.services.core.extensions;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CoroutineExtensions.kt */
@b6l(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {15}, m = "runSuspendCatching")
/* loaded from: classes14.dex */
public final class CoroutineExtensionsKt$runSuspendCatching$1<R> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public CoroutineExtensionsKt$runSuspendCatching$1(spj<? super CoroutineExtensionsKt$runSuspendCatching$1> spjVar) {
        super(spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runSuspendCatching = CoroutineExtensionsKt.runSuspendCatching(null, this);
        return runSuspendCatching == CoroutineSingletons.COROUTINE_SUSPENDED ? runSuspendCatching : new Result(runSuspendCatching);
    }
}
