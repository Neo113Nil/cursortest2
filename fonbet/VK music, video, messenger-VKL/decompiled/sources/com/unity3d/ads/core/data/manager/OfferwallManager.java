package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import xsna.ksr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: OfferwallManager.kt */
/* loaded from: classes14.dex */
public interface OfferwallManager {
    Object getVersion(spj<? super String> spjVar);

    Object isAdReady(String str, spj<? super Boolean> spjVar);

    Object isConnected(spj<? super Boolean> spjVar);

    Object loadAd(String str, spj<? super s3q0> spjVar);

    ksr<OfferwallEventData> showAd(String str);
}
