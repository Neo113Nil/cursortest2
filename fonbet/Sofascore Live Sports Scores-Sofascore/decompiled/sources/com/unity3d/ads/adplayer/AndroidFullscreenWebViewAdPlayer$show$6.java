package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ShowEvent;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$6 extends hoi implements Function2<ShowEvent, rq3<? super Unit>, Object> {
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$6(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, rq3<? super AndroidFullscreenWebViewAdPlayer$show$6> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidFullscreenWebViewAdPlayer$show$6(this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShowEvent showEvent, rq3<? super Unit> rq3Var) {
        return ((AndroidFullscreenWebViewAdPlayer$show$6) create(showEvent, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
            this.label = 1;
            if (androidFullscreenWebViewAdPlayer.destroy(this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
