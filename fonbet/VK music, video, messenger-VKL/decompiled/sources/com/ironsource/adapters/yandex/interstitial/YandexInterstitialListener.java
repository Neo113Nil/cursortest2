package com.ironsource.adapters.yandex.interstitial;

import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.Creative;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.dt;
import xsna.v11;

/* compiled from: YandexInterstitialListener.kt */
/* loaded from: classes13.dex */
public final class YandexInterstitialListener implements InterstitialAdLoadListener, InterstitialAdEventListener {
    private final WeakReference<YandexInterstitialAdapter> adapter;
    private final InterstitialAdListener listener;

    public YandexInterstitialListener(InterstitialAdListener interstitialAdListener, WeakReference<YandexInterstitialAdapter> weakReference) {
        this.listener = interstitialAdListener;
        this.adapter = weakReference;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClosed();
        YandexInterstitialAdapter yandexInterstitialAdapter = this.adapter.get();
        if (yandexInterstitialAdapter != null) {
            yandexInterstitialAdapter.destroyInterstitialAd$yandexadapter_release();
        }
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public void onAdFailedToLoad(AdRequestError adRequestError) {
        v11.d(new Object[]{Integer.valueOf(adRequestError.getCode()), adRequestError.getDescription()}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        YandexInterstitialAdapter yandexInterstitialAdapter = this.adapter.get();
        if (yandexInterstitialAdapter != null) {
            yandexInterstitialAdapter.setInterstitialAdAvailability$yandexadapter_release(false);
        }
        this.listener.onAdLoadFailed(YandexAdapter.Companion.getLoadError(adRequestError), adRequestError.getCode(), adRequestError.getDescription());
        YandexInterstitialAdapter yandexInterstitialAdapter2 = this.adapter.get();
        if (yandexInterstitialAdapter2 != null) {
            yandexInterstitialAdapter2.destroyInterstitialAd$yandexadapter_release();
        }
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdFailedToShow(AdError adError) {
        v11.d(new Object[]{adError.getDescription()}, 1, "Failed to show, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdShowFailed(1000, adError.getDescription());
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdImpression(ImpressionData impressionData) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
        this.listener.onAdStarted();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r4 != null) goto L20;
     */
    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAdLoaded(InterstitialAd interstitialAd) {
        String str;
        List<Creative> creatives;
        YandexInterstitialAdapter yandexInterstitialAdapter = this.adapter.get();
        if (yandexInterstitialAdapter != null) {
            yandexInterstitialAdapter.setInterstitialAd$yandexadapter_release(interstitialAd);
        }
        YandexInterstitialAdapter yandexInterstitialAdapter2 = this.adapter.get();
        if (yandexInterstitialAdapter2 != null) {
            yandexInterstitialAdapter2.setInterstitialAdAvailability$yandexadapter_release(true);
        }
        AdInfo info = interstitialAd.getInfo();
        if (info != null && (creatives = info.getCreatives()) != null) {
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
            this.listener.onAdLoadSuccess();
        } else {
            this.listener.onAdLoadSuccess(dt.b("creativeId", str));
        }
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }
}
