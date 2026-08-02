package com.unity3d.ads.adplayer;

import defpackage.a70;
import defpackage.b98;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.pa3;
import defpackage.qa3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb98;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "", "<anonymous>", "(Lb98;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$1 extends hoi implements Function2<b98, rq3<? super Unit>, Object> {
    final /* synthetic */ pa3 $listenerStarted;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$1(pa3 pa3Var, rq3<? super AndroidFullscreenWebViewAdPlayer$show$1> rq3Var) {
        super(2, rq3Var);
        this.$listenerStarted = pa3Var;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidFullscreenWebViewAdPlayer$show$1(this.$listenerStarted, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b98 b98Var, rq3<? super Unit> rq3Var) {
        return ((AndroidFullscreenWebViewAdPlayer$show$1) create(b98Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        pa3 pa3Var = this.$listenerStarted;
        Unit unit = Unit.a;
        ((qa3) pa3Var).V(unit);
        return unit;
    }
}
