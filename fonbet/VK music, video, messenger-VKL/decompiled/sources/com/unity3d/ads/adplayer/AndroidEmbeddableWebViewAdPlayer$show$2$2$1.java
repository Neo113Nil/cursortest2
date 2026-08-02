package com.unity3d.ads.adplayer;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$2$2$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$2$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, spj<? super AndroidEmbeddableWebViewAdPlayer$show$2$2$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
            this.label = 1;
            if (androidEmbeddableWebViewAdPlayer.destroy(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$2$2$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
