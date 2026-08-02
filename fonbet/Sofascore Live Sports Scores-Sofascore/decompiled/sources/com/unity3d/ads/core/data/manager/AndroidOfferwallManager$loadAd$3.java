package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidOfferwallManager$loadAd$3 extends hoi implements Function2<OfferwallEventData, rq3<? super Boolean>, Object> {
    final /* synthetic */ String $placementName;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOfferwallManager$loadAd$3(String str, rq3<? super AndroidOfferwallManager$loadAd$3> rq3Var) {
        super(2, rq3Var);
        this.$placementName = str;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidOfferwallManager$loadAd$3 androidOfferwallManager$loadAd$3 = new AndroidOfferwallManager$loadAd$3(this.$placementName, rq3Var);
        androidOfferwallManager$loadAd$3.L$0 = obj;
        return androidOfferwallManager$loadAd$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OfferwallEventData offerwallEventData, rq3<? super Boolean> rq3Var) {
        return ((AndroidOfferwallManager$loadAd$3) create(offerwallEventData, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
        return Boolean.valueOf(b.j(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && Intrinsics.c(offerwallEventData.getPlacementName(), this.$placementName));
    }
}
