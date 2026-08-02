package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.model.Chapter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$subscribeOnVideoController$2", f = "CoreInteractivePlayer.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e0 extends SuspendLambda implements wzs<com.vk.movika.sdk.player.base.model.a, spj<? super s3q0>, Object> {
    public int a;
    public final /* synthetic */ y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(y yVar, spj<? super e0> spjVar) {
        super(2, spjVar);
        this.b = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e0(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.movika.sdk.player.base.model.a aVar, spj<? super s3q0> spjVar) {
        return ((e0) create(aVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            y yVar = this.b;
            this.a = 1;
            Chapter chapter = yVar.i;
            if (chapter == null || (obj2 = yVar.q(new c.d(chapter), this)) != coroutineSingletons) {
                obj2 = s3q0.a;
            }
            if (obj2 == coroutineSingletons) {
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
