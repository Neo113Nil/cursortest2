package com.ironsource.adapters.fyber.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.ironsource.adapters.fyber.FyberAdapter;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import xsna.dt;
import xsna.t11;
import xsna.v11;

/* compiled from: FyberBannerListener.kt */
/* loaded from: classes13.dex */
public final class FyberBannerListener implements InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListenerWithImpressionData {
    private final InneractiveAdViewUnitController adViewController;
    private final Context context;
    private final FrameLayout.LayoutParams layoutParams;
    private final BannerAdListener listener;

    public FyberBannerListener(BannerAdListener bannerAdListener, InneractiveAdViewUnitController inneractiveAdViewUnitController, FrameLayout.LayoutParams layoutParams, Context context) {
        this.listener = bannerAdListener;
        this.adViewController = inneractiveAdViewUnitController;
        this.layoutParams = layoutParams;
        this.context = context;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdScreenDismissed();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.listener.onAdLeftApplication();
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
        if (!inneractiveAdSpot.isReady()) {
            IronLog.INTERNAL.error(FyberConstants.Logs.SPOT_NOT_READY);
            this.listener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, FyberConstants.Logs.SPOT_NOT_READY);
        } else {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.adViewController.bindView(frameLayout);
            this.listener.onAdLoadSuccess(frameLayout, this.layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData
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
