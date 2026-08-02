package com.unity3d.ads;

import android.view.View;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import xsna.fpf0;
import xsna.myc0;
import xsna.yvj;
import xsna.zcl;

/* compiled from: BannerAd.kt */
/* loaded from: classes14.dex */
public final class BannerAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<BannerAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final View view;

    /* compiled from: BannerAd.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final void load(BannerConfiguration bannerConfiguration, LoadListener<BannerAd> loadListener) {
            myc0.h((yvj) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, fpf0.a(yvj.class))), null, null, new BannerAd$Companion$load$1(loadListener, bannerConfiguration, null), 3);
        }

        private Companion() {
        }
    }

    public BannerAd(AdObject adObject, View view, SafeCallbackInvoke safeCallbackInvoke) {
        yvj scope;
        this.adObject = adObject;
        this.view = view;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        myc0.h(scope, null, null, new BannerAd$1$1(this, null), 3);
    }

    public static final void load(BannerConfiguration bannerConfiguration, LoadListener<BannerAd> loadListener) {
        Companion.load(bannerConfiguration, loadListener);
    }

    public final AdExpiredListener<BannerAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final View getView() {
        return this.view;
    }

    public final void setOnAdExpired(AdExpiredListener<BannerAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }
}
