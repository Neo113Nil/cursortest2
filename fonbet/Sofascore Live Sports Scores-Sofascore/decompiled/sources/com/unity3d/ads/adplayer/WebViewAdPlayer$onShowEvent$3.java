package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.ShowEvent;
import defpackage.a70;
import defpackage.ct8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "event", "isCompletedManually", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", f = "WebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class WebViewAdPlayer$onShowEvent$3 extends hoi implements ct8 {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public WebViewAdPlayer$onShowEvent$3(rq3<? super WebViewAdPlayer$onShowEvent$3> rq3Var) {
        super(3, rq3Var);
    }

    public final Object invoke(ShowEvent showEvent, boolean z, rq3<? super ShowEvent> rq3Var) {
        WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new WebViewAdPlayer$onShowEvent$3(rq3Var);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label == 0) {
            y6a.M(obj);
            return this.Z$0 ? new ShowEvent.Completed(ShowStatus.COMPLETED, null, null, 6, null) : (ShowEvent) this.L$0;
        }
        a70.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.ct8
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ShowEvent) obj, ((Boolean) obj2).booleanValue(), (rq3<? super ShowEvent>) obj3);
    }
}
