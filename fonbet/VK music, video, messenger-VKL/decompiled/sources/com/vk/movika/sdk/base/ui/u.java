package com.vk.movika.sdk.base.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.j5g;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$1", f = "CoreInteractivePlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class u extends SuspendLambda implements wzs<lsr<? super l0>, spj<? super s3q0>, Object> {
    public final /* synthetic */ y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, spj<? super u> spjVar) {
        super(2, spjVar);
        this.a = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new u(this.a, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super l0> lsrVar, spj<? super s3q0> spjVar) {
        return ((u) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        y yVar = this.a;
        yVar.g = j5g.v0(new t(yVar, 0), yVar.g);
        return s3q0.a;
    }
}
