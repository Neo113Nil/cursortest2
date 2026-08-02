package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;

/* compiled from: LoadOfferwallAd.kt */
/* loaded from: classes14.dex */
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, spj<? super s3q0> spjVar) {
        Object loadAd = this.offerwallManager.loadAd(str, spjVar);
        return loadAd == CoroutineSingletons.COROUTINE_SUSPENDED ? loadAd : s3q0.a;
    }
}
