package com.ironsource.adapters.fyber.interstitial;

import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.ironsource.adapters.fyber.FyberAdapter;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import xsna.dt;
import xsna.t11;
import xsna.v11;

/* compiled from: FyberInterstitialListener.kt */
/* loaded from: classes13.dex */
public final class FyberInterstitialListener implements InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListenerWithImpressionData {
    private final InterstitialAdListener listener;

    public FyberInterstitialListener(InterstitialAdListener interstitialAdListener) {
        this.listener = interstitialAdListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClosed();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        String str;
        if (adDisplayError == null || (str = adDisplayError.getMessage()) == null) {
            str = FyberConstants.Logs.UNKNOWN_ERROR;
        }
        v11.d(new Object[]{str}, 1, "Failed to show, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdShowFailed(1000, str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        String str;
        if (inneractiveErrorCode == null || (str = inneractiveErrorCode.toString()) == null) {
            str = FyberConstants.Logs.UNKNOWN_ERROR;
        }
        v11.d(new Object[]{1000, str}, 2, "Failed to load, errorCode = %s, errorMessage = %s", IronLog.ADAPTER_CALLBACK);
        this.listener.onAdLoadFailed(FyberAdapter.Companion.getLoadErrorType(inneractiveErrorCode), 1000, str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdLoadSuccess();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
        String creativeId = impressionData != null ? impressionData.getCreativeId() : null;
        t11.c(new Object[]{creativeId == null ? "" : creativeId}, 1, "creativeId = %s", IronLog.ADAPTER_CALLBACK);
        if (creativeId == null || creativeId.length() == 0) {
            this.listener.onAdOpened();
        } else {
            this.listener.onAdOpened(dt.b("creativeId", creativeId));
        }
    }
}
