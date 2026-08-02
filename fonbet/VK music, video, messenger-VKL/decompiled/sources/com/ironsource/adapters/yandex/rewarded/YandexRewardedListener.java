package com.ironsource.adapters.yandex.rewarded;

import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.Creative;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.dt;
import xsna.v11;

/* compiled from: YandexRewardedListener.kt */
/* loaded from: classes13.dex */
public final class YandexRewardedListener implements RewardedAdLoadListener, RewardedAdEventListener {
    private final WeakReference<YandexRewardedAdapter> adapter;
    private final RewardedVideoAdListener listener;

    public YandexRewardedListener(RewardedVideoAdListener rewardedVideoAdListener, WeakReference<YandexRewardedAdapter> weakReference) {
        this.listener = rewardedVideoAdListener;
        this.adapter = weakReference;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClosed();
        YandexRewardedAdapter yandexRewardedAdapter = this.adapter.get();
        if (yandexRewardedAdapter != null) {
            yandexRewardedAdapter.destroyRewardedAd$yandexadapter_release();
        }
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public void onAdFailedToLoad(AdRequestError adRequestError) {
        v11.d(new Object[]{Integer.valueOf(adRequestError.getCode()), adRequestError.getDescription()}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        YandexRewardedAdapter yandexRewardedAdapter = this.adapter.get();
        if (yandexRewardedAdapter != null) {
            yandexRewardedAdapter.setRewardedAdAvailability$yandexadapter_release(false);
        }
        this.listener.onAdLoadFailed(YandexAdapter.Companion.getLoadError(adRequestError), adRequestError.getCode(), adRequestError.getDescription());
        YandexRewardedAdapter yandexRewardedAdapter2 = this.adapter.get();
        if (yandexRewardedAdapter2 != null) {
            yandexRewardedAdapter2.destroyRewardedAd$yandexadapter_release();
        }
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdFailedToShow(AdError adError) {
        v11.d(new Object[]{adError.getDescription()}, 1, "Failed to show, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdShowFailed(1000, adError.getDescription());
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdImpression(ImpressionData impressionData) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdOpened();
        this.listener.onAdStarted();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r4 != null) goto L20;
     */
    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAdLoaded(RewardedAd rewardedAd) {
        String str;
        List<Creative> creatives;
        YandexRewardedAdapter yandexRewardedAdapter = this.adapter.get();
        if (yandexRewardedAdapter != null) {
            yandexRewardedAdapter.setRewardedAd$yandexadapter_release(rewardedAd);
        }
        YandexRewardedAdapter yandexRewardedAdapter2 = this.adapter.get();
        if (yandexRewardedAdapter2 != null) {
            yandexRewardedAdapter2.setRewardedAdAvailability$yandexadapter_release(true);
        }
        AdInfo info = rewardedAd.getInfo();
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

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onRewarded(Reward reward) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdEnded();
        this.listener.onAdRewarded();
    }
}
