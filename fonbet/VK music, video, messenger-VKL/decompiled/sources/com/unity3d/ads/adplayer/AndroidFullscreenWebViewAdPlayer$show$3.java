package com.unity3d.ads.adplayer;

import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* loaded from: classes14.dex */
public /* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$3 extends AdaptedFunctionReference implements wzs<DisplayMessage, spj<? super s3q0>, Object> {
    public AndroidFullscreenWebViewAdPlayer$show$3(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
    }

    @Override // xsna.wzs
    public final Object invoke(DisplayMessage displayMessage, spj<? super s3q0> spjVar) {
        Object show$displayEventsRouter;
        show$displayEventsRouter = AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, spjVar);
        return show$displayEventsRouter;
    }
}
