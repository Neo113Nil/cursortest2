package com.vk.movika.sdk.base.flow.binding;

import defpackage.f0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.phd0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zhd0;

@b6l(c = "com.vk.movika.sdk.base.flow.binding.TimePointsControllerFlowKt$timePointsReaching$1", f = "TimePointsControllerFlow.kt", l = {14}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends SuspendLambda implements wzs<zhd0<? super Object>, spj<? super s3q0>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ com.vk.movika.sdk.player.base.observable.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.vk.movika.sdk.player.base.observable.b bVar, spj<? super d> spjVar) {
        super(2, spjVar);
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        d dVar = new d(this.c, spjVar);
        dVar.b = obj;
        return dVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super Object> zhd0Var, spj<? super s3q0> spjVar) {
        d dVar = new d(this.c, spjVar);
        dVar.b = zhd0Var;
        return dVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.b;
            a aVar = new a(zhd0Var);
            this.c.h(aVar);
            f0 f0Var = new f0(1, this.c, aVar);
            this.a = 1;
            if (phd0.a(zhd0Var, f0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
