package com.vk.movika.sdk.base.flow.binding;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.phd0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zhd0;

@b6l(c = "com.vk.movika.sdk.base.flow.binding.VideoChangedFlowKt$videoChanges$1", f = "VideoChangedFlow.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e extends SuspendLambda implements wzs<zhd0<? super com.vk.movika.sdk.player.base.model.a>, spj<? super s3q0>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ com.vk.movika.sdk.player.base.observable.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.vk.movika.sdk.player.base.observable.c cVar, spj<? super e> spjVar) {
        super(2, spjVar);
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        e eVar = new e(this.c, spjVar);
        eVar.b = obj;
        return eVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super com.vk.movika.sdk.player.base.model.a> zhd0Var, spj<? super s3q0> spjVar) {
        e eVar = new e(this.c, spjVar);
        eVar.b = zhd0Var;
        return eVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.vk.movika.sdk.base.flow.binding.i, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            final zhd0 zhd0Var = (zhd0) this.b;
            ?? r1 = new com.vk.movika.sdk.player.base.listener.c() { // from class: com.vk.movika.sdk.base.flow.binding.i
                @Override // com.vk.movika.sdk.player.base.listener.c
                public final void a(com.vk.movika.sdk.player.base.model.a aVar) {
                    h.a(aVar, zhd0.this);
                }
            };
            this.c.c(r1);
            j jVar = new j(0, this.c, (Object) r1);
            this.a = 1;
            if (phd0.a(zhd0Var, jVar, this) == coroutineSingletons) {
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
