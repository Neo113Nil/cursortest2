package com.unity3d.ads.core.data.manager;

import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import defpackage.a70;
import defpackage.b98;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb98;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "", "<anonymous>", "(Lb98;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidOfferwallManager$loadAd$2 extends hoi implements Function2<b98, rq3<? super Unit>, Object> {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ AndroidOfferwallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOfferwallManager$loadAd$2(AndroidOfferwallManager androidOfferwallManager, String str, rq3<? super AndroidOfferwallManager$loadAd$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidOfferwallManager;
        this.$placementName = str;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidOfferwallManager$loadAd$2(this.this$0, this.$placementName, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b98 b98Var, rq3<? super Unit> rq3Var) {
        return ((AndroidOfferwallManager$loadAd$2) create(b98Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        OfferwallAdapterBridge offerwallAdapterBridge;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        offerwallAdapterBridge = this.this$0.offerwallBridge;
        offerwallAdapterBridge.loadAd(this.$placementName);
        return Unit.a;
    }
}
