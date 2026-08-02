package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ DisplayMessage $displayMessage;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, spj<? super AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1> spjVar) {
        super(2, spjVar);
        this.$displayMessage = displayMessage;
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(this.$displayMessage, this.this$0, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r5.requestShow(r1, r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ba, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r5.sendVisibilityChange(r1, r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r5.sendFocusChange(r1, r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r5.sendActivityDestroyed(r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r5.destroy(r4) == r0) goto L36;
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
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                a.a(obj);
                DisplayMessage displayMessage = this.$displayMessage;
                if (!(displayMessage instanceof DisplayMessage.DisplayReady)) {
                    if (!(displayMessage instanceof DisplayMessage.WebViewInstanceRequest)) {
                        if (!(displayMessage instanceof DisplayMessage.VisibilityChanged)) {
                            if (!(displayMessage instanceof DisplayMessage.FocusChanged)) {
                                if (!(displayMessage instanceof DisplayMessage.DisplayDestroyed)) {
                                    if (displayMessage instanceof DisplayMessage.DisplayError) {
                                        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                                        this.label = 6;
                                        break;
                                    }
                                } else {
                                    webViewAdPlayer = this.this$0.webViewAdPlayer;
                                    this.label = 5;
                                    break;
                                }
                            } else {
                                webViewAdPlayer2 = this.this$0.webViewAdPlayer;
                                boolean isFocused = ((DisplayMessage.FocusChanged) this.$displayMessage).isFocused();
                                this.label = 4;
                                break;
                            }
                        } else {
                            webViewAdPlayer3 = this.this$0.webViewAdPlayer;
                            boolean isVisible = ((DisplayMessage.VisibilityChanged) this.$displayMessage).isVisible();
                            this.label = 3;
                            break;
                        }
                    } else {
                        sh50<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        DisplayMessage.WebViewInstanceResponse webViewInstanceResponse = new DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView());
                        this.label = 2;
                        break;
                    }
                } else {
                    webViewAdPlayer4 = this.this$0.webViewAdPlayer;
                    Map<String, Object> showOptions = ((DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions();
                    this.label = 1;
                    break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                a.a(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
