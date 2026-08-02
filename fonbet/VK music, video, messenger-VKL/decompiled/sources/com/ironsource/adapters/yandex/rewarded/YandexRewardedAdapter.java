package com.ironsource.adapters.yandex.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.adapters.yandex.YandexConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import java.lang.ref.WeakReference;
import xsna.b0;
import xsna.t11;
import xsna.vrl;

/* compiled from: YandexRewardedAdapter.kt */
/* loaded from: classes13.dex */
public final class YandexRewardedAdapter extends LevelPlayBaseRewardedVideo<YandexAdapter> {
    private RewardedAd ad;
    private RewardedAdLoader adLoader;
    private boolean isAdAvailableFlag;
    private final Handler mainHandler;
    private YandexRewardedListener rewardedAdListener;

    public YandexRewardedAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$3(YandexRewardedAdapter yandexRewardedAdapter, Activity activity) {
        RewardedAd rewardedAd = yandexRewardedAdapter.ad;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(yandexRewardedAdapter.rewardedAdListener);
            rewardedAd.show(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        IronLog.ADAPTER_API.verbose();
        YandexAdapter yandexAdapter = (YandexAdapter) getNetworkAdapter();
        if (yandexAdapter == null) {
            biddingDataCallback.onFailure(YandexConstants.Logs.ADAPTER_UNAVAILABLE);
        } else {
            yandexAdapter.collectBiddingData$yandexadapter_release(context, biddingDataCallback, new BidderTokenRequestConfiguration.Builder(AdType.REWARDED).setParameters(yandexAdapter.getConfigParams$yandexadapter_release()).build());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        destroyRewardedAd$yandexadapter_release();
    }

    public final void destroyRewardedAd$yandexadapter_release() {
        RewardedAdLoader rewardedAdLoader = this.adLoader;
        if (rewardedAdLoader != null) {
            rewardedAdLoader.setAdLoadListener(null);
        }
        this.adLoader = null;
        RewardedAd rewardedAd = this.ad;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(null);
        }
        this.ad = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return this.ad != null && this.isAdAvailableFlag;
    }

    public final void setRewardedAd$yandexadapter_release(RewardedAd rewardedAd) {
        this.ad = rewardedAd;
    }

    public final void setRewardedAdAvailability$yandexadapter_release(boolean z) {
        this.isAdAvailableFlag = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, RewardedVideoAdListener rewardedVideoAdListener) {
        String string = adData.getString("adUnitId");
        t11.c(new Object[]{string == null ? "" : string}, 1, YandexConstants.Logs.AD_UNIT_ID, IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            IronLog.INTERNAL.error(YandexConstants.Logs.AD_UNIT_ID_EMPTY);
            rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, YandexConstants.Logs.AD_UNIT_ID_EMPTY);
            return;
        }
        YandexAdapter yandexAdapter = (YandexAdapter) getNetworkAdapter();
        if (yandexAdapter == null) {
            IronLog.INTERNAL.error(YandexConstants.Logs.ADAPTER_UNAVAILABLE);
            rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, YandexConstants.Logs.ADAPTER_UNAVAILABLE);
            return;
        }
        String serverData = adData.getServerData();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, "serverData is empty");
            return;
        }
        setRewardedAdAvailability$yandexadapter_release(false);
        this.rewardedAdListener = new YandexRewardedListener(rewardedVideoAdListener, new WeakReference(this));
        RewardedAdLoader rewardedAdLoader = new RewardedAdLoader(context.getApplicationContext());
        rewardedAdLoader.setAdLoadListener(this.rewardedAdListener);
        this.adLoader = rewardedAdLoader;
        this.mainHandler.post(new vrl(7, rewardedAdLoader, new AdRequestConfiguration.Builder(string).setBiddingData(serverData).setParameters(yandexAdapter.getConfigParams$yandexadapter_release()).build()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, RewardedVideoAdListener rewardedVideoAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (isAdAvailable(adData)) {
            this.mainHandler.post(new b0(4, this, activity));
        } else {
            rewardedVideoAdListener.onAdShowFailed(1001, "Ad is not available");
        }
    }
}
