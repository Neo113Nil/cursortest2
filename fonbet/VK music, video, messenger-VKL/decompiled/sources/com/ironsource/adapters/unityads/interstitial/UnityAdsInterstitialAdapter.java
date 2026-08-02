package com.ironsource.adapters.unityads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adapters.unityads.UnityAdsAdapter;
import com.ironsource.adapters.unityads.UnityAdsConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.InterstitialAd;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import xsna.t11;

/* compiled from: UnityAdsInterstitialAdapter.kt */
/* loaded from: classes13.dex */
public final class UnityAdsInterstitialAdapter extends LevelPlayBaseInterstitial<UnityAdsAdapter> {
    private InterstitialAd interstitialAd;

    public UnityAdsInterstitialAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        IronLog.ADAPTER_API.verbose();
        UnityAdsAdapter unityAdsAdapter = (UnityAdsAdapter) getNetworkAdapter();
        if (unityAdsAdapter != null) {
            UnityAdsAdapter.collectBiddingData$unityadsadapter_release$default(unityAdsAdapter, adData, biddingDataCallback, AdFormat.INTERSTITIAL, null, 8, null);
        } else {
            IronLog.INTERNAL.error("Network adapter is null");
            biddingDataCallback.onFailure("Network adapter is null");
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        this.interstitialAd = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return this.interstitialAd != null;
    }

    public final void setInterstitialAd$unityadsadapter_release(InterstitialAd interstitialAd) {
        this.interstitialAd = interstitialAd;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, InterstitialAdListener interstitialAdListener) {
        String string = adData.getString(UnityAdsConstants.ZONE_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, UnityAdsConstants.Logs.ZONE_ID, IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{UnityAdsConstants.ZONE_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
        } else {
            LoadConfiguration.Builder withMediationInfo = new LoadConfiguration.Builder(string).withMediationInfo(UnityAdsAdapter.Companion.getMediationInfo$unityadsadapter_release());
            String serverData = adData.getServerData();
            if (serverData != null && serverData.length() > 0) {
                withMediationInfo.withAdMarkup(serverData);
            }
            InterstitialAd.Companion.load(withMediationInfo.build(), new UnityAdsInterstitialLoadListener(interstitialAdListener, new WeakReference(this)));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, InterstitialAdListener interstitialAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (!isAdAvailable(adData)) {
            IronLog.INTERNAL.error("Ad is not available");
            interstitialAdListener.onAdShowFailed(1001, "Ad is not available");
            return;
        }
        ShowConfiguration build = new ShowConfiguration.Builder().build();
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(activity, build, new UnityAdsInterstitialShowListener(interstitialAdListener));
        }
    }
}
