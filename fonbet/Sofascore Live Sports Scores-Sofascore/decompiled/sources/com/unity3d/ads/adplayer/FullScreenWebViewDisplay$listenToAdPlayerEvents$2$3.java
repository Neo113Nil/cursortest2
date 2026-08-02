package com.unity3d.ads.adplayer;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.hda;
import defpackage.hoi;
import defpackage.il4;
import defpackage.k6b;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xw3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/DisplayMessage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends hoi implements Function2<DisplayMessage, rq3<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, rq3<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3> rq3Var) {
        super(2, rq3Var);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, rq3Var);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DisplayMessage displayMessage, rq3<? super Unit> rq3Var) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        ISDKDispatchers dispatchers;
        AdObject adObject;
        SendDiagnosticEvent sendDiagnosticEvent;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        DisplayMessage displayMessage = (DisplayMessage) this.L$0;
        FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            p2g p2gVar = w2g.b;
            if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
                fullScreenWebViewDisplay.finish();
            } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
                fullScreenWebViewDisplay.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
            } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
                fullScreenWebViewDisplay.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
            } else if (displayMessage instanceof DisplayMessage.OpenUrl) {
                fullScreenWebViewDisplay.openUrl(displayMessage.getOpportunityId(), ((DisplayMessage.OpenUrl) displayMessage).getIntent(), ((DisplayMessage.OpenUrl) displayMessage).getUseActivityForResult());
            } else if (displayMessage instanceof DisplayMessage.DisplayStarted) {
                adObject = fullScreenWebViewDisplay.getAdObject();
                if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null) {
                    sendDiagnosticEvent = fullScreenWebViewDisplay.getSendDiagnosticEvent();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_less_ad_display_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                }
            }
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            k6b E = hda.E(fullScreenWebViewDisplay2);
            dispatchers = fullScreenWebViewDisplay2.getDispatchers();
            xw3.L(E, dispatchers.getDefault(), null, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(fullScreenWebViewDisplay2, a, null), 2);
        }
        return Unit.a;
    }
}
