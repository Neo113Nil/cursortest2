package com.unity3d.ads.adplayer;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.n7i;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$1 extends SuspendLambda implements wzs<lsr<? super DisplayMessage>, spj<? super s3q0>, Object> {
    final /* synthetic */ n7i<s3q0> $listenerStarted;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$1(n7i<s3q0> n7iVar, spj<? super AndroidFullscreenWebViewAdPlayer$show$1> spjVar) {
        super(2, spjVar);
        this.$listenerStarted = n7iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$1(this.$listenerStarted, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        n7i<s3q0> n7iVar = this.$listenerStarted;
        s3q0 s3q0Var = s3q0.a;
        n7iVar.h(s3q0Var);
        return s3q0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super DisplayMessage> lsrVar, spj<? super s3q0> spjVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
