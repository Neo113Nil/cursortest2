package com.unity3d.ads.adplayer;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CommonWebViewBridge.kt */
@b6l(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$result$1", f = "CommonWebViewBridge.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonWebViewBridge$handleInvocationResult$result$1 extends SuspendLambda implements wzs<yvj, spj<? super Object>, Object> {
    final /* synthetic */ ExposedFunction $handler;
    final /* synthetic */ Invocation $invocation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocationResult$result$1(ExposedFunction exposedFunction, Invocation invocation, spj<? super CommonWebViewBridge$handleInvocationResult$result$1> spjVar) {
        super(2, spjVar);
        this.$handler = exposedFunction;
        this.$invocation = invocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CommonWebViewBridge$handleInvocationResult$result$1(this.$handler, this.$invocation, spjVar);
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(yvj yvjVar, spj<? super Object> spjVar) {
        return invoke2(yvjVar, (spj<Object>) spjVar);
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
        ExposedFunction exposedFunction = this.$handler;
        Object[] parameters = this.$invocation.getParameters();
        this.label = 1;
        Object invoke = exposedFunction.invoke(parameters, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(yvj yvjVar, spj<Object> spjVar) {
        return ((CommonWebViewBridge$handleInvocationResult$result$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
