package com.ironsource.adapters.yandex.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.adapters.yandex.YandexConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import java.lang.ref.WeakReference;
import xsna.h73;
import xsna.t11;
import xsna.vr2;

/* compiled from: YandexInterstitialAdapter.kt */
/* loaded from: classes13.dex */
public final class YandexInterstitialAdapter extends LevelPlayBaseInterstitial<YandexAdapter> {
    private InterstitialAd ad;
    private InterstitialAdLoader adLoader;
    private YandexInterstitialListener interstitialAdListener;
    private boolean isAdAvailableFlag;
    private final Handler mainHandler;

    public YandexInterstitialAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$3(YandexInterstitialAdapter yandexInterstitialAdapter, Activity activity) {
        InterstitialAd interstitialAd = yandexInterstitialAdapter.ad;
        if (interstitialAd != null) {
            interstitialAd.setAdEventListener(yandexInterstitialAdapter.interstitialAdListener);
            interstitialAd.show(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        IronLog.ADAPTER_API.verbose();
        YandexAdapter yandexAdapter = (YandexAdapter) getNetworkAdapter();
        if (yandexAdapter == null) {
            biddingDataCallback.onFailure(YandexConstants.Logs.ADAPTER_UNAVAILABLE);
        } else {
            yandexAdapter.collectBiddingData$yandexadapter_release(context, biddingDataCallback, new BidderTokenRequestConfiguration.Builder(AdType.INTERSTITIAL).setParameters(yandexAdapter.getConfigParams$yandexadapter_release()).build());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        destroyInterstitialAd$yandexadapter_release();
    }

    public final void destroyInterstitialAd$yandexadapter_release() {
        InterstitialAdLoader interstitialAdLoader = this.adLoader;
        if (interstitialAdLoader != null) {
            interstitialAdLoader.setAdLoadListener(null);
        }
        this.adLoader = null;
        InterstitialAd interstitialAd = this.ad;
        if (interstitialAd != null) {
            interstitialAd.setAdEventListener(null);
        }
        this.ad = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return this.ad != null && this.isAdAvailableFlag;
    }

    public final void setInterstitialAd$yandexadapter_release(InterstitialAd interstitialAd) {
        this.ad = interstitialAd;
    }

    public final void setInterstitialAdAvailability$yandexadapter_release(boolean z) {
        this.isAdAvailableFlag = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, InterstitialAdListener interstitialAdListener) {
        String string = adData.getString("adUnitId");
        t11.c(new Object[]{string == null ? "" : string}, 1, YandexConstants.Logs.AD_UNIT_ID, IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            IronLog.INTERNAL.error(YandexConstants.Logs.AD_UNIT_ID_EMPTY);
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, YandexConstants.Logs.AD_UNIT_ID_EMPTY);
            return;
        }
        YandexAdapter yandexAdapter = (YandexAdapter) getNetworkAdapter();
        if (yandexAdapter == null) {
            IronLog.INTERNAL.error(YandexConstants.Logs.ADAPTER_UNAVAILABLE);
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, YandexConstants.Logs.ADAPTER_UNAVAILABLE);
            return;
        }
        String serverData = adData.getServerData();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, "serverData is empty");
            return;
        }
        setInterstitialAdAvailability$yandexadapter_release(false);
        this.interstitialAdListener = new YandexInterstitialListener(interstitialAdListener, new WeakReference(this));
        InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(context.getApplicationContext());
        interstitialAdLoader.setAdLoadListener(this.interstitialAdListener);
        this.adLoader = interstitialAdLoader;
        this.mainHandler.post(new h73(8, interstitialAdLoader, new AdRequestConfiguration.Builder(string).setBiddingData(serverData).setParameters(yandexAdapter.getConfigParams$yandexadapter_release()).build()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, InterstitialAdListener interstitialAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (isAdAvailable(adData)) {
            this.mainHandler.post(new vr2(9, this, activity));
        } else {
            interstitialAdListener.onAdShowFailed(1001, "Ad is not available");
        }
    }
}
