package com.unity3d.ads;

import android.app.Activity;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import xsna.fpf0;
import xsna.myc0;
import xsna.yvj;
import xsna.zcl;

/* compiled from: RewardedAd.kt */
/* loaded from: classes14.dex */
public final class RewardedAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<RewardedAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;

    /* compiled from: RewardedAd.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final void load(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener) {
            myc0.h((yvj) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, fpf0.a(yvj.class))), null, null, new RewardedAd$Companion$load$1(loadConfiguration, loadListener, null), 3);
        }

        private Companion() {
        }
    }

    public RewardedAd(AdObject adObject, SafeCallbackInvoke safeCallbackInvoke) {
        yvj scope;
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        myc0.h(scope, null, null, new RewardedAd$1$1(this, null), 3);
    }

    public static final void load(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener) {
        Companion.load(loadConfiguration, loadListener);
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Activity activity, ShowConfiguration showConfiguration, RewardedShowListener rewardedShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showConfiguration = null;
        }
        if ((i & 4) != 0) {
            rewardedShowListener = null;
        }
        rewardedAd.show(activity, showConfiguration, rewardedShowListener);
    }

    public final AdExpiredListener<RewardedAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(AdExpiredListener<RewardedAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public final void show(Activity activity, ShowConfiguration showConfiguration, RewardedShowListener rewardedShowListener) {
        myc0.h((yvj) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, fpf0.a(yvj.class))), null, null, new RewardedAd$show$1(showConfiguration, this, activity, rewardedShowListener, null), 3);
    }
}
