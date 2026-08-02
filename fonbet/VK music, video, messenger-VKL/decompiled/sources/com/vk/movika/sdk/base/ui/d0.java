package com.vk.movika.sdk.base.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$subscribeOnVideoController$1", f = "CoreInteractivePlayer.kt", l = {396}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d0 extends SuspendLambda implements wzs<com.vk.movika.sdk.player.base.model.a, spj<? super s3q0>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(y yVar, spj<? super d0> spjVar) {
        super(2, spjVar);
        this.c = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        d0 d0Var = new d0(this.c, spjVar);
        d0Var.b = obj;
        return d0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.movika.sdk.player.base.model.a aVar, spj<? super s3q0> spjVar) {
        return ((d0) create(aVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            com.vk.movika.sdk.player.base.model.a aVar = (com.vk.movika.sdk.player.base.model.a) this.b;
            y yVar = this.c;
            this.a = 1;
            if (y.x(yVar, aVar, this) == coroutineSingletons) {
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
