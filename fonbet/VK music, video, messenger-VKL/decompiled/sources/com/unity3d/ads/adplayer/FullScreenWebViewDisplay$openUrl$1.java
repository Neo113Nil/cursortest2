package com.unity3d.ads.adplayer;

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
@b6l(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$openUrl$1", f = "FullScreenWebViewDisplay.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class FullScreenWebViewDisplay$openUrl$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ boolean $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$openUrl$1(String str, boolean z, spj<? super FullScreenWebViewDisplay$openUrl$1> spjVar) {
        super(2, spjVar);
        this.$opportunityId = str;
        this.$result = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new FullScreenWebViewDisplay$openUrl$1(this.$opportunityId, this.$result, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            sh50<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            DisplayMessage.OpenUrlResult openUrlResult = new DisplayMessage.OpenUrlResult(this.$opportunityId, this.$result);
            this.label = 1;
            if (displayMessages.emit(openUrlResult, this) == coroutineSingletons) {
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
        return ((FullScreenWebViewDisplay$openUrl$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
