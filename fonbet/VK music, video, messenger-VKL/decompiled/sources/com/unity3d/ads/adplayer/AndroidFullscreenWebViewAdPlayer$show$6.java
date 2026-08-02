package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ShowEvent;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$6 extends SuspendLambda implements wzs<ShowEvent, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$6(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, spj<? super AndroidFullscreenWebViewAdPlayer$show$6> spjVar) {
        super(2, spjVar);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$6(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(ShowEvent showEvent, spj<? super s3q0> spjVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$6) create(showEvent, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
            this.label = 1;
            if (androidFullscreenWebViewAdPlayer.destroy(this) == coroutineSingletons) {
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
}
