package com.ironsource.adapters.vungle.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adapters.vungle.VungleAdapter;
import com.ironsource.adapters.vungle.VungleConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial;
import com.vungle.ads.AdConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.InterstitialAd;
import java.util.Arrays;
import xsna.g0;
import xsna.t11;

/* compiled from: VungleInterstitialAdapter.kt */
/* loaded from: classes13.dex */
public final class VungleInterstitialAdapter extends LevelPlayBaseInterstitial<VungleAdapter> {
    private InterstitialAd interstitialAd;
    private final Handler mainHandler;

    public VungleInterstitialAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$1(VungleInterstitialAdapter vungleInterstitialAdapter) {
        InterstitialAd interstitialAd = vungleInterstitialAdapter.interstitialAd;
        if (interstitialAd != null) {
            FullscreenAd.DefaultImpls.play$default(interstitialAd, null, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        IronLog.ADAPTER_API.verbose();
        VungleAdapter vungleAdapter = (VungleAdapter) getNetworkAdapter();
        if (vungleAdapter != null) {
            vungleAdapter.collectBiddingData$vungleadapter_release(context, biddingDataCallback);
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
        InterstitialAd interstitialAd = this.interstitialAd;
        return interstitialAd != null && interstitialAd.canPlayAd().booleanValue();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, InterstitialAdListener interstitialAdListener) {
        String string = adData.getString(VungleConstants.PLACEMENT_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, "placementId = %s", IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{VungleConstants.PLACEMENT_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
        } else {
            InterstitialAd interstitialAd = new InterstitialAd(context.getApplicationContext(), string, new AdConfig());
            interstitialAd.setAdListener(new VungleInterstitialListener(interstitialAdListener));
            interstitialAd.setAdapterAdFormat(VungleConstants.ADAPTER_FORMAT_INTERSTITIAL);
            this.interstitialAd = interstitialAd;
            interstitialAd.load(adData.getServerData());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, InterstitialAdListener interstitialAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (isAdAvailable(adData)) {
            this.mainHandler.post(new g0(this, 21));
        } else {
            IronLog.INTERNAL.error("Ad is not available");
            interstitialAdListener.onAdShowFailed(1001, "Ad is not available");
        }
    }
}
