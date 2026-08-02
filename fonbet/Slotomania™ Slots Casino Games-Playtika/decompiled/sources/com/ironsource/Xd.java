package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public interface Xd {
    void onAdInstanceDidBecomeVisible();

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToShow(IronSourceError ironSourceError);

    void onRewardedAdShown();

    void onUserEarnedReward();
}
