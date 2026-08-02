package com.ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.ironsource.C4000b8;
import com.ironsource.C4036d8;
import com.ironsource.Hc;
import com.ironsource.J9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import defpackage.lnb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class IronSourceBannerListener implements Hc {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    public IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    @Override // com.ironsource.Hc
    public void onBannerClick() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdClicked();
    }

    @Override // com.ironsource.Hc
    public void onBannerInitFailed(String str) {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Hc
    public void onBannerInitSuccess() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadFail(String str) {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadSuccess(J9 j9, C4036d8 c4036d8) {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        if (this.mAdapter.get() != null) {
            if (c4036d8 == null) {
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            ConcurrentHashMap<String, ArrayList<J9>> concurrentHashMap = this.mAdapter.get().mDemandSourceToBnAd;
            if (concurrentHashMap.get(this.mDemandSourceName) == null) {
                concurrentHashMap.put(this.mDemandSourceName, new ArrayList<>());
            }
            concurrentHashMap.get(this.mDemandSourceName).add(j9);
            C4000b8 size = c4036d8.getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a());
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(c4036d8, layoutParams);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerShowSuccess() {
        lnb.v(new StringBuilder(), this.mDemandSourceName, " onBannerShowSuccess", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
