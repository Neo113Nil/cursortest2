package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidOfferwallManager.kt */
@b6l(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidOfferwallManager$showAd$1 extends SuspendLambda implements wzs<lsr<? super OfferwallEventData>, spj<? super s3q0>, Object> {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ AndroidOfferwallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOfferwallManager$showAd$1(AndroidOfferwallManager androidOfferwallManager, String str, spj<? super AndroidOfferwallManager$showAd$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidOfferwallManager;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidOfferwallManager$showAd$1(this.this$0, this.$placementName, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OfferwallAdapterBridge offerwallAdapterBridge;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        offerwallAdapterBridge = this.this$0.offerwallBridge;
        offerwallAdapterBridge.showAd(this.$placementName);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super OfferwallEventData> lsrVar, spj<? super s3q0> spjVar) {
        return ((AndroidOfferwallManager$showAd$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
