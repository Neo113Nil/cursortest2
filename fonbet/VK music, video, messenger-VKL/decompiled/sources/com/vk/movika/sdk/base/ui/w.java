package com.vk.movika.sdk.base.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$2", f = "CoreInteractivePlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class w extends SuspendLambda implements yzs<lsr<? super l0>, Throwable, spj<? super s3q0>, Object> {
    public /* synthetic */ lsr a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, spj<? super w> spjVar) {
        super(3, spjVar);
        this.c = yVar;
    }

    @Override // xsna.yzs
    public final Object invoke(lsr<? super l0> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
        w wVar = new w(this.c, spjVar);
        wVar.a = lsrVar;
        wVar.b = th;
        return wVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        lsr lsrVar = this.a;
        Throwable th = this.b;
        com.vk.movika.sdk.utils.c.c(lsrVar, null, th, new v(0), 1);
        this.c.d.c.c(th);
        return s3q0.a;
    }
}
