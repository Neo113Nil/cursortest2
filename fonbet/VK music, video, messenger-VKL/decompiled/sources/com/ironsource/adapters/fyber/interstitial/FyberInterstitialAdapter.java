package com.ironsource.adapters.fyber.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.ironsource.adapters.fyber.FyberAdapter;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.adapters.fyber.interstitial.FyberInterstitialAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial;
import java.util.Arrays;
import xsna.t11;
import xsna.vr2;
import xsna.wk;

/* compiled from: FyberInterstitialAdapter.kt */
/* loaded from: classes13.dex */
public final class FyberInterstitialAdapter extends LevelPlayBaseInterstitial<FyberAdapter> {
    private InneractiveAdSpot interstitialAd;
    private FyberInterstitialListener interstitialAdListener;
    private final Handler mainHandler;

    public FyberInterstitialAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAd$lambda$3(FyberInterstitialAdapter fyberInterstitialAdapter) {
        InneractiveAdSpot inneractiveAdSpot = fyberInterstitialAdapter.interstitialAd;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        fyberInterstitialAdapter.interstitialAd = null;
        fyberInterstitialAdapter.interstitialAdListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAd$lambda$1(InterstitialAdListener interstitialAdListener, FyberInterstitialAdapter fyberInterstitialAdapter, String str, String str2) {
        FyberInterstitialListener fyberInterstitialListener = new FyberInterstitialListener(interstitialAdListener);
        fyberInterstitialAdapter.interstitialAdListener = fyberInterstitialListener;
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        createSpot.setMediationName("IronSource");
        createSpot.setMediationVersion("5.8.0");
        createSpot.addUnitController(new InneractiveFullscreenUnitController());
        createSpot.setRequestListener(fyberInterstitialListener);
        fyberInterstitialAdapter.interstitialAd = createSpot;
        if (str == null || str.length() == 0) {
            InneractiveAdSpot inneractiveAdSpot = fyberInterstitialAdapter.interstitialAd;
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.requestAd(new InneractiveAdRequest(str2));
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot2 = fyberInterstitialAdapter.interstitialAd;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.loadAd(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$2(FyberInterstitialAdapter fyberInterstitialAdapter, Activity activity) {
        InneractiveAdSpot inneractiveAdSpot = fyberInterstitialAdapter.interstitialAd;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot != null ? inneractiveAdSpot.getSelectedUnitController() : null;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = selectedUnitController instanceof InneractiveFullscreenUnitController ? (InneractiveFullscreenUnitController) selectedUnitController : null;
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.setEventsListener(fyberInterstitialAdapter.interstitialAdListener);
        }
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.addContentController(new InneractiveFullscreenVideoContentController());
        }
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.show(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        IronLog.ADAPTER_API.verbose();
        FyberAdapter fyberAdapter = (FyberAdapter) getNetworkAdapter();
        if (fyberAdapter != null) {
            fyberAdapter.collectBiddingData$fyberadapter_release(biddingDataCallback);
        } else {
            IronLog.INTERNAL.error("Network adapter is null");
            biddingDataCallback.onFailure("Network adapter is null");
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        this.mainHandler.post(new wk(this, 12));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        InneractiveAdSpot inneractiveAdSpot = this.interstitialAd;
        return inneractiveAdSpot != null && inneractiveAdSpot.isReady();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, final InterstitialAdListener interstitialAdListener) {
        final String string = adData.getString(FyberConstants.SPOT_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, FyberConstants.Logs.SPOT_ID, IronLog.ADAPTER_API);
        if (string != null && string.length() != 0) {
            final String serverData = adData.getServerData();
            this.mainHandler.post(new Runnable() { // from class: xsna.e1t
                @Override // java.lang.Runnable
                public final void run() {
                    FyberInterstitialAdapter.loadAd$lambda$1(InterstitialAdListener.this, this, serverData, string);
                }
            });
        } else {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{FyberConstants.SPOT_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, InterstitialAdListener interstitialAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (isAdAvailable(adData)) {
            this.mainHandler.post(new vr2(5, this, activity));
        } else {
            IronLog.INTERNAL.error("Ad is not available");
            interstitialAdListener.onAdShowFailed(1001, "Ad is not available");
        }
    }
}
