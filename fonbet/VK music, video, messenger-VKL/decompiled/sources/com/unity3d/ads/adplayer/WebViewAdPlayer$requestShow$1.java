package com.unity3d.ads.adplayer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: WebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {180, 181, 196}, m = "requestShow")
/* loaded from: classes14.dex */
public final class WebViewAdPlayer$requestShow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$requestShow$1(WebViewAdPlayer webViewAdPlayer, spj<? super WebViewAdPlayer$requestShow$1> spjVar) {
        super(spjVar);
        this.this$0 = webViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.requestShow(null, this);
    }
}
