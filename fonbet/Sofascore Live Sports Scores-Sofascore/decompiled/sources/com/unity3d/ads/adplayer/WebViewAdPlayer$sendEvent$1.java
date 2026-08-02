package com.unity3d.ads.adplayer;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "sendEvent")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewAdPlayer$sendEvent$1 extends sq3 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendEvent$1(WebViewAdPlayer webViewAdPlayer, rq3<? super WebViewAdPlayer$sendEvent$1> rq3Var) {
        super(rq3Var);
        this.this$0 = webViewAdPlayer;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object sendEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendEvent = this.this$0.sendEvent(null, this);
        return sendEvent;
    }
}
