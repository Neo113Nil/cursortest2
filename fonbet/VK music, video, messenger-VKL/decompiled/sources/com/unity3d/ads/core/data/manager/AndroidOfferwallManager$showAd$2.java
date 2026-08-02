package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.rl3;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: AndroidOfferwallManager.kt */
@b6l(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidOfferwallManager$showAd$2 extends SuspendLambda implements yzs<lsr<? super OfferwallEventData>, OfferwallEventData, spj<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public AndroidOfferwallManager$showAd$2(spj<? super AndroidOfferwallManager$showAd$2> spjVar) {
        super(3, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OfferwallEventData offerwallEventData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lsr lsrVar = (lsr) this.L$0;
            OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
            this.L$0 = offerwallEventData2;
            this.label = 1;
            if (lsrVar.emit(offerwallEventData2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            offerwallEventData = offerwallEventData2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            offerwallEventData = (OfferwallEventData) this.L$0;
            kotlin.a.a(obj);
        }
        return Boolean.valueOf(!rl3.G(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
    }

    @Override // xsna.yzs
    public final Object invoke(lsr<? super OfferwallEventData> lsrVar, OfferwallEventData offerwallEventData, spj<? super Boolean> spjVar) {
        AndroidOfferwallManager$showAd$2 androidOfferwallManager$showAd$2 = new AndroidOfferwallManager$showAd$2(spjVar);
        androidOfferwallManager$showAd$2.L$0 = lsrVar;
        androidOfferwallManager$showAd$2.L$1 = offerwallEventData;
        return androidOfferwallManager$showAd$2.invokeSuspend(s3q0.a);
    }
}
