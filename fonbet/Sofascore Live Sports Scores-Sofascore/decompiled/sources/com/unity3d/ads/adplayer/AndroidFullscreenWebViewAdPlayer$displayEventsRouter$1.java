package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ DisplayMessage $displayMessage;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, rq3<? super AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1> rq3Var) {
        super(2, rq3Var);
        this.$displayMessage = displayMessage;
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(this.$displayMessage, this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r5.requestShow(r1, r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r5.sendVisibilityChange(r1, r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r5.sendFocusChange(r1, r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r5.sendActivityDestroyed(r4) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r5.destroy(r4) == r0) goto L36;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WebViewAdPlayer webViewAdPlayer;
        WebViewAdPlayer webViewAdPlayer2;
        WebViewAdPlayer webViewAdPlayer3;
        WebViewAdPlayer webViewAdPlayer4;
        lu3 lu3Var = lu3.a;
        switch (this.label) {
            case 0:
                y6a.M(obj);
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
                                boolean isFocused = ((DisplayMessage.FocusChanged) this.$displayMessage).getIsFocused();
                                this.label = 4;
                                break;
                            }
                        } else {
                            webViewAdPlayer3 = this.this$0.webViewAdPlayer;
                            boolean isVisible = ((DisplayMessage.VisibilityChanged) this.$displayMessage).getIsVisible();
                            this.label = 3;
                            break;
                        }
                    } else {
                        b1d displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
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
                y6a.M(obj);
                break;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
        return Unit.a;
    }
}
