package com.unity3d.ads.adplayer;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.adplayer.DisplayMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {PsExtractor.VIDEO_STREAM_MASK, 241, 242, 243, 244, 246}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DisplayMessage $displayMessage;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Continuation<? super AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1> continuation) {
        super(2, continuation);
        this.$displayMessage = displayMessage;
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(this.$displayMessage, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r5.requestShow(((com.unity3d.ads.adplayer.DisplayMessage.DisplayReady) r4.$displayMessage).getShowOptions(), r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages().emit(new com.unity3d.ads.adplayer.DisplayMessage.WebViewInstanceResponse(r4.$displayMessage.getOpportunityId(), r4.this$0.getWebViewContainer().getWebView()), r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r5.sendVisibilityChange(((com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged) r4.$displayMessage).getIsVisible(), r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (r5.sendFocusChange(((com.unity3d.ads.adplayer.DisplayMessage.FocusChanged) r4.$displayMessage).getIsFocused(), r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        if (r5.sendActivityDestroyed(r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r4.this$0.destroy(r4) == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WebViewAdPlayer webViewAdPlayer;
        WebViewAdPlayer webViewAdPlayer2;
        WebViewAdPlayer webViewAdPlayer3;
        WebViewAdPlayer webViewAdPlayer4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                DisplayMessage displayMessage = this.$displayMessage;
                if (displayMessage instanceof DisplayMessage.DisplayReady) {
                    webViewAdPlayer4 = this.this$0.webViewAdPlayer;
                    this.label = 1;
                    break;
                } else if (!(displayMessage instanceof DisplayMessage.WebViewInstanceRequest)) {
                    if (displayMessage instanceof DisplayMessage.VisibilityChanged) {
                        webViewAdPlayer3 = this.this$0.webViewAdPlayer;
                        this.label = 3;
                        break;
                    } else if (displayMessage instanceof DisplayMessage.FocusChanged) {
                        webViewAdPlayer2 = this.this$0.webViewAdPlayer;
                        this.label = 4;
                        break;
                    } else if (displayMessage instanceof DisplayMessage.DisplayDestroyed) {
                        webViewAdPlayer = this.this$0.webViewAdPlayer;
                        this.label = 5;
                        break;
                    } else if (displayMessage instanceof DisplayMessage.DisplayError) {
                        this.label = 6;
                        break;
                    }
                } else {
                    this.label = 2;
                    break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                ResultKt.throwOnFailure(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
