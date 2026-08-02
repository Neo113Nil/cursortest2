package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.vk.reefton.protocol.ReefProtocol$Event;
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
@b6l(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1", f = "FullScreenWebViewDisplay.kt", l = {ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class FullScreenWebViewDisplay$onCreate$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$onCreate$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, spj<? super FullScreenWebViewDisplay$onCreate$1> spjVar) {
        super(2, spjVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new FullScreenWebViewDisplay$onCreate$1(this.this$0, spjVar);
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
            DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, "Opportunity ID not found");
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
        return ((FullScreenWebViewDisplay$onCreate$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
