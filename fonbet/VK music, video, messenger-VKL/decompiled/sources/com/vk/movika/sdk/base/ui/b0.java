package com.vk.movika.sdk.base.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$postError$1", f = "CoreInteractivePlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    public final /* synthetic */ y a;
    public final /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y yVar, Throwable th, spj<? super b0> spjVar) {
        super(2, spjVar);
        this.a = yVar;
        this.b = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b0(this.a, this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        this.a.d.c.c(this.b);
        return s3q0.a;
    }
}
