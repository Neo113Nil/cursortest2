package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.P2;
import com.ironsource.Q2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public final class BannerAdView extends FrameLayout implements Q2 {
    private P2 a;
    private BannerAdViewListener b;

    private BannerAdView(Context context) {
        super(context);
    }

    public final BannerAdInfo getAdInfo() {
        P2 p2 = this.a;
        if (p2 == null) {
            p2 = null;
        }
        return p2.c();
    }

    public final BannerAdViewListener getListener() {
        return this.b;
    }

    @Override // com.ironsource.Q2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.Q2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(BannerAdViewListener bannerAdViewListener) {
        this.b = bannerAdViewListener;
    }

    public BannerAdView(P2 p2) {
        this(p2.d().getContext());
        this.a = p2;
        p2.a(new WeakReference<>(this));
        p2.b(new WeakReference<>(this));
    }
}
