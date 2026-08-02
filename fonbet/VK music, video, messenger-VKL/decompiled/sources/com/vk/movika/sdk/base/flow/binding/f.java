package com.vk.movika.sdk.base.flow.binding;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.phd0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zhd0;

@b6l(c = "com.vk.movika.sdk.base.flow.binding.VideoInQueueEndFlowKt$videoInQueueEnds$1", f = "VideoInQueueEndFlow.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends SuspendLambda implements wzs<zhd0<? super com.vk.movika.sdk.player.base.model.a>, spj<? super s3q0>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ com.vk.movika.sdk.player.base.observable.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.vk.movika.sdk.player.base.observable.c cVar, spj<? super f> spjVar) {
        super(2, spjVar);
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        f fVar = new f(this.c, spjVar);
        fVar.b = obj;
        return fVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super com.vk.movika.sdk.player.base.model.a> zhd0Var, spj<? super s3q0> spjVar) {
        f fVar = new f(this.c, spjVar);
        fVar.b = zhd0Var;
        return fVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.vk.movika.sdk.base.flow.binding.k, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            final zhd0 zhd0Var = (zhd0) this.b;
            ?? r1 = new com.vk.movika.sdk.player.base.listener.d() { // from class: com.vk.movika.sdk.base.flow.binding.k
                @Override // com.vk.movika.sdk.player.base.listener.d
                public final void a(com.vk.movika.sdk.player.base.model.a aVar) {
                    h.a(aVar, zhd0.this);
                }
            };
            this.c.i(r1);
            l lVar = new l(0, this.c, r1);
            this.a = 1;
            if (phd0.a(zhd0Var, lVar, this) == coroutineSingletons) {
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
