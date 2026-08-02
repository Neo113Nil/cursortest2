package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.ShowEvent;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$8 extends SuspendLambda implements wzs<ShowEvent, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$8(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, spj<? super AndroidFullscreenWebViewAdPlayer$show$8> spjVar) {
        super(2, spjVar);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$8(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(ShowEvent showEvent, spj<? super s3q0> spjVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$8) create(showEvent, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            sh50<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            str = this.this$0.opportunityId;
            DisplayMessage.DisplayStarted displayStarted = new DisplayMessage.DisplayStarted(str);
            this.label = 1;
            if (displayMessages.emit(displayStarted, this) == coroutineSingletons) {
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
