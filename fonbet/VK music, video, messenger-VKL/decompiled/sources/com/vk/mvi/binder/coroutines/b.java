package com.vk.mvi.binder.coroutines;

import com.vk.movika.sdk.base.flow.binding.g;
import com.vk.mvi.binder.BinderLifecycleMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.iyp;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CoroutineBinder.kt */
@b6l(c = "com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$2$2$1", f = "CoroutineBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $event;
    final /* synthetic */ iyp<Object> $eventConsumer;
    final /* synthetic */ BinderLifecycleMode $lifecycleMode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BinderLifecycleMode binderLifecycleMode, iyp<Object> iypVar, Object obj, spj<? super b> spjVar) {
        super(2, spjVar);
        this.$lifecycleMode = binderLifecycleMode;
        this.$eventConsumer = iypVar;
        this.$event = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.pk50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b(this.$lifecycleMode, this.$eventConsumer, this.$event, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$lifecycleMode.a(new g(11, this.$eventConsumer, this.$event));
        return s3q0.a;
    }
}
