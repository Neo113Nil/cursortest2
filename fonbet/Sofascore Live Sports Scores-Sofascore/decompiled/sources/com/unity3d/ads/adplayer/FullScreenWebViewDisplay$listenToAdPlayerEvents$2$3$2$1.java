package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1", f = "FullScreenWebViewDisplay.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, Throwable th, rq3<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = fullScreenWebViewDisplay;
        this.$it = th;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(this.this$0, this.$it, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String str;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            b1d displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
            str = this.this$0.opportunityId;
            String message = this.$it.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, message);
            this.label = 1;
            if (displayMessages.emit(displayError, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
