package com.vk.mvi.binder.coroutines;

import com.vk.mvi.binder.BinderLifecycleMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.ptk0;
import xsna.s3q0;
import xsna.spj;
import xsna.uh3;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CoroutineBinder.kt */
@b6l(c = "com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$1$2$1", f = "CoroutineBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ BinderLifecycleMode $lifecycleMode;
    final /* synthetic */ Object $state;
    final /* synthetic */ ptk0<Object> $stateConsumer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BinderLifecycleMode binderLifecycleMode, ptk0<Object> ptk0Var, Object obj, spj<? super a> spjVar) {
        super(2, spjVar);
        this.$lifecycleMode = binderLifecycleMode;
        this.$stateConsumer = ptk0Var;
        this.$state = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.lm50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new a(this.$lifecycleMode, this.$stateConsumer, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$lifecycleMode.a(new uh3(12, this.$stateConsumer, this.$state));
        return s3q0.a;
    }
}
