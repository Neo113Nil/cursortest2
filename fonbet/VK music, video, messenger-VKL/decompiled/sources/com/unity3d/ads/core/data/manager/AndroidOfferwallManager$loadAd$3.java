package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.e43;
import xsna.epx;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidOfferwallManager.kt */
@b6l(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidOfferwallManager$loadAd$3 extends SuspendLambda implements wzs<OfferwallEventData, spj<? super Boolean>, Object> {
    final /* synthetic */ String $placementName;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOfferwallManager$loadAd$3(String str, spj<? super AndroidOfferwallManager$loadAd$3> spjVar) {
        super(2, spjVar);
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidOfferwallManager$loadAd$3 androidOfferwallManager$loadAd$3 = new AndroidOfferwallManager$loadAd$3(this.$placementName, spjVar);
        androidOfferwallManager$loadAd$3.L$0 = obj;
        return androidOfferwallManager$loadAd$3;
    }

    @Override // xsna.wzs
    public final Object invoke(OfferwallEventData offerwallEventData, spj<? super Boolean> spjVar) {
        return ((AndroidOfferwallManager$loadAd$3) create(offerwallEventData, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
        return Boolean.valueOf(e43.l(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && epx.f(offerwallEventData.getPlacementName(), this.$placementName));
    }
}
