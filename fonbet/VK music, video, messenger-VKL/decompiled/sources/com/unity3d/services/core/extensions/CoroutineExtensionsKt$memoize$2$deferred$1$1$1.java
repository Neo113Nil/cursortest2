package com.unity3d.services.core.extensions;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.izs;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: CoroutineExtensions.kt */
@b6l(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1<T> extends SuspendLambda implements wzs<yvj, spj<? super T>, Object> {
    final /* synthetic */ izs<spj<? super T>, Object> $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(izs<? super spj<? super T>, ? extends Object> izsVar, spj<? super CoroutineExtensionsKt$memoize$2$deferred$1$1$1> spjVar) {
        super(2, spjVar);
        this.$action = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        izs<spj<? super T>, Object> izsVar = this.$action;
        this.label = 1;
        Object invoke = izsVar.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super T> spjVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
