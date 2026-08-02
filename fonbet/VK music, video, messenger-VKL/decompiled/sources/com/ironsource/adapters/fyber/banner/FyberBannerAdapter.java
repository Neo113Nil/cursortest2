package com.ironsource.adapters.fyber.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.ironsource.adapters.fyber.FyberAdapter;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.adapters.fyber.banner.FyberBannerAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner;
import java.util.Arrays;
import xsna.q44;
import xsna.t11;

/* compiled from: FyberBannerAdapter.kt */
/* loaded from: classes13.dex */
public final class FyberBannerAdapter extends LevelPlayBaseBanner<FyberAdapter> {
    private InneractiveAdSpot bannerAdView;
    private final Handler mainHandler;

    public FyberBannerAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAd$lambda$2(FyberBannerAdapter fyberBannerAdapter) {
        InneractiveAdSpot inneractiveAdSpot = fyberBannerAdapter.bannerAdView;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        fyberBannerAdapter.bannerAdView = null;
    }

    private final FrameLayout.LayoutParams getBannerLayoutParams(Context context, ISBannerSize iSBannerSize) {
        FrameLayout.LayoutParams layoutParams;
        String description = iSBannerSize.getDescription();
        if (description == null) {
            return null;
        }
        int hashCode = description.hashCode();
        if (hashCode != -387072689) {
            if (hashCode != 79011241) {
                if (hashCode != 1951953708 || !description.equals("BANNER")) {
                    return null;
                }
                layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
            } else {
                if (!description.equals("SMART")) {
                    return null;
                }
                layoutParams = AdapterUtils.isLargeScreen(context) ? new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 728), AdapterUtils.dpToPixels(context, 90)) : new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
            }
        } else {
            if (!description.equals("RECTANGLE")) {
                return null;
            }
            layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 300), AdapterUtils.dpToPixels(context, 250));
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAd$lambda$1(BannerAdListener bannerAdListener, FrameLayout.LayoutParams layoutParams, Context context, FyberBannerAdapter fyberBannerAdapter, String str, String str2) {
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        FyberBannerListener fyberBannerListener = new FyberBannerListener(bannerAdListener, inneractiveAdViewUnitController, layoutParams, context);
        inneractiveAdViewUnitController.setEventsListener(fyberBannerListener);
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        createSpot.setMediationName("IronSource");
        createSpot.setMediationVersion("5.8.0");
        createSpot.addUnitController(inneractiveAdViewUnitController);
        createSpot.setRequestListener(fyberBannerListener);
        fyberBannerAdapter.bannerAdView = createSpot;
        if (str == null || str.length() == 0) {
            InneractiveAdSpot inneractiveAdSpot = fyberBannerAdapter.bannerAdView;
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.requestAd(new InneractiveAdRequest(str2));
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot2 = fyberBannerAdapter.bannerAdView;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.loadAd(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner, com.ironsource.InterfaceC4540s3
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

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        this.mainHandler.post(new q44(this, 7));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, final BannerAdListener bannerAdListener) {
        final String string = adData.getString(FyberConstants.SPOT_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, FyberConstants.Logs.SPOT_ID, IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{FyberConstants.SPOT_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        final FrameLayout.LayoutParams bannerLayoutParams = getBannerLayoutParams(applicationContext, iSBannerSize);
        if (bannerLayoutParams == null) {
            IronLog.INTERNAL.error("Unsupported banner size");
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, "Unsupported banner size");
        } else {
            final String serverData = adData.getServerData();
            this.mainHandler.post(new Runnable() { // from class: xsna.d1t
                @Override // java.lang.Runnable
                public final void run() {
                    FyberBannerAdapter.loadAd$lambda$1(BannerAdListener.this, bannerLayoutParams, applicationContext, this, serverData, string);
                }
            });
        }
    }
}
