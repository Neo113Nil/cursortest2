package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.a70;
import defpackage.b98;
import defpackage.ct8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb98;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "it", "", "<anonymous>", "(Lb98;Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;)Z"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidOfferwallManager$showAd$2 extends hoi implements ct8 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public AndroidOfferwallManager$showAd$2(rq3<? super AndroidOfferwallManager$showAd$2> rq3Var) {
        super(3, rq3Var);
    }

    @Override // defpackage.ct8
    public final Object invoke(b98 b98Var, OfferwallEventData offerwallEventData, rq3<? super Boolean> rq3Var) {
        AndroidOfferwallManager$showAd$2 androidOfferwallManager$showAd$2 = new AndroidOfferwallManager$showAd$2(rq3Var);
        androidOfferwallManager$showAd$2.L$0 = b98Var;
        androidOfferwallManager$showAd$2.L$1 = offerwallEventData;
        return androidOfferwallManager$showAd$2.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        OfferwallEventData offerwallEventData;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            b98 b98Var = (b98) this.L$0;
            OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
            this.L$0 = offerwallEventData2;
            this.label = 1;
            if (b98Var.emit(offerwallEventData2, this) == lu3Var) {
                return lu3Var;
            }
            offerwallEventData = offerwallEventData2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            offerwallEventData = (OfferwallEventData) this.L$0;
            y6a.M(obj);
        }
        return Boolean.valueOf(!ph0.v(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
    }
}
