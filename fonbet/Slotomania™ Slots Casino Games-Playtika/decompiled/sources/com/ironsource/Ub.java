package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes2.dex */
public interface Ub {
    void a(LevelPlayAdInfo levelPlayAdInfo);

    void b(LevelPlayAdInfo levelPlayAdInfo);

    void onNativeAdLoadFailed(IronSourceError ironSourceError);
}
