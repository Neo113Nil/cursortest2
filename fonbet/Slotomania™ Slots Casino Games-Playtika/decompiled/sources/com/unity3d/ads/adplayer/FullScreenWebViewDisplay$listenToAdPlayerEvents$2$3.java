package com.unity3d.ads.adplayer;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: FullScreenWebViewDisplay.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/DisplayMessage;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends SuspendLambda implements Function2<DisplayMessage, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, Continuation<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3> continuation) {
        super(2, continuation);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, continuation);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DisplayMessage displayMessage, Continuation<? super Unit> continuation) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m11180constructorimpl;
        ISDKDispatchers dispatchers;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DisplayMessage displayMessage = (DisplayMessage) this.L$0;
        FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
                fullScreenWebViewDisplay.finish();
            } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
                fullScreenWebViewDisplay.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
            } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
                fullScreenWebViewDisplay.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
            } else if (displayMessage instanceof DisplayMessage.OpenUrl) {
                fullScreenWebViewDisplay.openUrl(displayMessage.getOpportunityId(), ((DisplayMessage.OpenUrl) displayMessage).getIntent(), ((DisplayMessage.OpenUrl) displayMessage).getUseActivityForResult());
            }
            m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fullScreenWebViewDisplay2);
            dispatchers = fullScreenWebViewDisplay2.getDispatchers();
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, dispatchers.getDefault(), null, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(fullScreenWebViewDisplay2, m11183exceptionOrNullimpl, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}
