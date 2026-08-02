package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import xsna.spj;

/* compiled from: GetIsOfferwallAdReady.kt */
/* loaded from: classes14.dex */
public final class GetIsOfferwallAdReady {
    private final OfferwallManager offerwallManager;

    public GetIsOfferwallAdReady(OfferwallManager offerwallManager) {
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, spj<? super Boolean> spjVar) {
        return this.offerwallManager.isAdReady(str, spjVar);
    }
}
