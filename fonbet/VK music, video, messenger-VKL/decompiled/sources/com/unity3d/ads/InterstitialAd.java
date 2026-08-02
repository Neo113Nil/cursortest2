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

/* compiled from: InterstitialAd.kt */
/* loaded from: classes14.dex */
public final class InterstitialAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<InterstitialAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;

    /* compiled from: InterstitialAd.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final void load(LoadConfiguration loadConfiguration, LoadListener<InterstitialAd> loadListener) {
            myc0.h((yvj) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, fpf0.a(yvj.class))), null, null, new InterstitialAd$Companion$load$1(loadConfiguration, loadListener, null), 3);
        }

        private Companion() {
        }
    }

    public InterstitialAd(AdObject adObject, SafeCallbackInvoke safeCallbackInvoke) {
        yvj scope;
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        myc0.h(scope, null, null, new InterstitialAd$1$1(this, null), 3);
    }

    public static final void load(LoadConfiguration loadConfiguration, LoadListener<InterstitialAd> loadListener) {
        Companion.load(loadConfiguration, loadListener);
    }

    public static /* synthetic */ void show$default(InterstitialAd interstitialAd, Activity activity, ShowConfiguration showConfiguration, InterstitialShowListener interstitialShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showConfiguration = null;
        }
        if ((i & 4) != 0) {
            interstitialShowListener = null;
        }
        interstitialAd.show(activity, showConfiguration, interstitialShowListener);
    }

    public final AdExpiredListener<InterstitialAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(AdExpiredListener<InterstitialAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public final void show(Activity activity, ShowConfiguration showConfiguration, InterstitialShowListener interstitialShowListener) {
        myc0.h((yvj) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, fpf0.a(yvj.class))), null, null, new InterstitialAd$show$1(showConfiguration, this, activity, interstitialShowListener, null), 3);
    }
}
