package com.unity3d.ads.adplayer;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.b98;
import defpackage.ct8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.y6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb98;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "", "e", "", "<anonymous>", "(Lb98;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$3", f = "CommonWebViewBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CommonWebViewBridge$handleInvocationResult$3 extends hoi implements ct8 {
    final /* synthetic */ Invocation $invocation;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocationResult$3(CommonWebViewBridge commonWebViewBridge, Invocation invocation, rq3<? super CommonWebViewBridge$handleInvocationResult$3> rq3Var) {
        super(3, rq3Var);
        this.this$0 = commonWebViewBridge;
        this.$invocation = invocation;
    }

    @Override // defpackage.ct8
    public final Object invoke(b98 b98Var, Throwable th, rq3<? super Unit> rq3Var) {
        CommonWebViewBridge$handleInvocationResult$3 commonWebViewBridge$handleInvocationResult$3 = new CommonWebViewBridge$handleInvocationResult$3(this.this$0, this.$invocation, rq3Var);
        commonWebViewBridge$handleInvocationResult$3.L$0 = th;
        return commonWebViewBridge$handleInvocationResult$3.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        SendDiagnosticEvent sendDiagnosticEvent;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        Throwable th = (Throwable) this.L$0;
        logger = this.this$0.logger;
        logger.error("Error delivering flow event", th);
        sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
        String message = th.getMessage();
        if (message == null) {
            message = th.getClass().getSimpleName();
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, tub.h(new Pair("reason_debug", message), new Pair("webview_invocation", this.$invocation.getLocation())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
        return Unit.a;
    }
}
