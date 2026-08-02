package com.unity3d.ads.adplayer;

import defpackage.dh;
import defpackage.rq3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$3 extends dh implements Function2<DisplayMessage, rq3<? super Unit>, Object> {
    public AndroidFullscreenWebViewAdPlayer$show$3(Object obj) {
        super(2, 12, AndroidFullscreenWebViewAdPlayer.class, obj, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DisplayMessage displayMessage, rq3<? super Unit> rq3Var) {
        Object show$displayEventsRouter;
        show$displayEventsRouter = AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, rq3Var);
        return show$displayEventsRouter;
    }
}
