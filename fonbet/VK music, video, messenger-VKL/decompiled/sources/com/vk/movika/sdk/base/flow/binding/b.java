package com.vk.movika.sdk.base.flow.binding;

import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.phd0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zhd0;

@b6l(c = "com.vk.movika.sdk.base.flow.binding.PlaybackStateFlowKt$playbackStates$1", f = "PlaybackStateFlow.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends SuspendLambda implements wzs<zhd0<? super PlaybackStateListener.PlaybackState>, spj<? super s3q0>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ com.vk.movika.sdk.player.base.observable.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.vk.movika.sdk.player.base.observable.a aVar, spj<? super b> spjVar) {
        super(2, spjVar);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        b bVar = new b(this.c, spjVar);
        bVar.b = obj;
        return bVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super PlaybackStateListener.PlaybackState> zhd0Var, spj<? super s3q0> spjVar) {
        b bVar = new b(this.c, spjVar);
        bVar.b = zhd0Var;
        return bVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.b;
            c cVar = new c(zhd0Var, 0);
            this.c.e(cVar);
            g gVar = new g(0, this.c, cVar);
            this.a = 1;
            if (phd0.a(zhd0Var, gVar, this) == coroutineSingletons) {
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
