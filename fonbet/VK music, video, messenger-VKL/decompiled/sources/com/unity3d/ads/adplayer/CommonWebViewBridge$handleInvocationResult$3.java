package com.unity3d.ads.adplayer;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: CommonWebViewBridge.kt */
@b6l(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$3", f = "CommonWebViewBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonWebViewBridge$handleInvocationResult$3 extends SuspendLambda implements yzs<lsr<? super WebViewEvent>, Throwable, spj<? super s3q0>, Object> {
    final /* synthetic */ Invocation $invocation;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocationResult$3(CommonWebViewBridge commonWebViewBridge, Invocation invocation, spj<? super CommonWebViewBridge$handleInvocationResult$3> spjVar) {
        super(3, spjVar);
        this.this$0 = commonWebViewBridge;
        this.$invocation = invocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        SendDiagnosticEvent sendDiagnosticEvent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        Throwable th = (Throwable) this.L$0;
        logger = this.this$0.logger;
        logger.error("Error delivering flow event", th);
        sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
        String message = th.getMessage();
        if (message == null) {
            message = th.getClass().getSimpleName();
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, pn00.k(new Pair("reason_debug", message), new Pair("webview_invocation", this.$invocation.getLocation())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
        return s3q0.a;
    }

    @Override // xsna.yzs
    public final Object invoke(lsr<? super WebViewEvent> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
        CommonWebViewBridge$handleInvocationResult$3 commonWebViewBridge$handleInvocationResult$3 = new CommonWebViewBridge$handleInvocationResult$3(this.this$0, this.$invocation, spjVar);
        commonWebViewBridge$handleInvocationResult$3.L$0 = th;
        return commonWebViewBridge$handleInvocationResult$3.invokeSuspend(s3q0.a);
    }
}
