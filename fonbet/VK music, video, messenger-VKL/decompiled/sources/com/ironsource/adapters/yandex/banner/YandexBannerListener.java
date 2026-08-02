package com.ironsource.adapters.yandex.banner;

import android.widget.FrameLayout;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.Creative;
import com.yandex.mobile.ads.common.ImpressionData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.dt;
import xsna.v11;

/* compiled from: YandexBannerListener.kt */
/* loaded from: classes13.dex */
public final class YandexBannerListener implements BannerAdEventListener {
    private final BannerAdView adView;
    private final WeakReference<YandexBannerAdapter> adapter;
    private final FrameLayout.LayoutParams layoutParams;
    private final BannerAdListener listener;

    public YandexBannerListener(BannerAdListener bannerAdListener, WeakReference<YandexBannerAdapter> weakReference, BannerAdView bannerAdView, FrameLayout.LayoutParams layoutParams) {
        this.listener = bannerAdListener;
        this.adapter = weakReference;
        this.adView = bannerAdView;
        this.layoutParams = layoutParams;
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onAdFailedToLoad(AdRequestError adRequestError) {
        v11.d(new Object[]{Integer.valueOf(adRequestError.getCode()), adRequestError.getDescription()}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(YandexAdapter.Companion.getLoadError(adRequestError), adRequestError.getCode(), adRequestError.getDescription());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0 != null) goto L17;
     */
    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAdLoaded() {
        String str;
        List<Creative> creatives;
        YandexBannerAdapter yandexBannerAdapter = this.adapter.get();
        if (yandexBannerAdapter != null) {
            yandexBannerAdapter.setBannerView$yandexadapter_release(this.adView);
        }
        AdInfo adInfo = this.adView.getAdInfo();
        if (adInfo != null && (creatives = adInfo.getCreatives()) != null) {
            List<Creative> list = creatives;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Creative) it.next()).getCreativeId());
            }
            str = YandexAdapter.Companion.buildCreativeIdString$yandexadapter_release(arrayList);
        }
        str = "";
        IronLog.ADAPTER_CALLBACK.verbose(String.format("creativeId = %s", Arrays.copyOf(new Object[]{str}, 1)));
        if (str.length() == 0) {
            this.listener.onAdLoadSuccess(this.adView, this.layoutParams);
        } else {
            this.listener.onAdLoadSuccess(this.adView, this.layoutParams, dt.b("creativeId", str));
        }
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onImpression(ImpressionData impressionData) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdLeftApplication();
    }

    @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
    public void onReturnedToApplication() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }
}
