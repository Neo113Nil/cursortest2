package com.unity3d.ads.adplayer;

import com.ironsource.adapters.fyber.FyberConstants;
import com.unity3d.ads.adplayer.DisplayMessage;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: FullScreenWebViewDisplay.kt */
@b6l(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1", f = "FullScreenWebViewDisplay.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, Throwable th, spj<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1> spjVar) {
        super(2, spjVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$it = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(this.this$0, this.$it, spjVar);
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
            String message = this.$it.getMessage();
            if (message == null) {
                message = FyberConstants.Logs.UNKNOWN_ERROR;
            }
            DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, message);
            this.label = 1;
            if (displayMessages.emit(displayError, this) == coroutineSingletons) {
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
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
