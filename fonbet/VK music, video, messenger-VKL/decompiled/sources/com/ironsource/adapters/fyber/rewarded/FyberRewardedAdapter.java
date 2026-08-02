package com.ironsource.adapters.fyber.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.ironsource.adapters.fyber.FyberAdapter;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo;
import java.util.Arrays;
import xsna.a72;
import xsna.f1t;
import xsna.nl6;
import xsna.t11;

/* compiled from: FyberRewardedAdapter.kt */
/* loaded from: classes13.dex */
public final class FyberRewardedAdapter extends LevelPlayBaseRewardedVideo<FyberAdapter> {
    private final Handler mainHandler;
    private InneractiveAdSpot rewardedAd;
    private FyberRewardedListener rewardedAdListener;

    public FyberRewardedAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAd$lambda$4(FyberRewardedAdapter fyberRewardedAdapter) {
        InneractiveAdSpot inneractiveAdSpot = fyberRewardedAdapter.rewardedAd;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        fyberRewardedAdapter.rewardedAd = null;
        fyberRewardedAdapter.rewardedAdListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAd$lambda$1(RewardedVideoAdListener rewardedVideoAdListener, FyberRewardedAdapter fyberRewardedAdapter, String str, String str2) {
        FyberRewardedListener fyberRewardedListener = new FyberRewardedListener(rewardedVideoAdListener);
        fyberRewardedAdapter.rewardedAdListener = fyberRewardedListener;
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        createSpot.setMediationName("IronSource");
        createSpot.setMediationVersion("5.8.0");
        createSpot.addUnitController(new InneractiveFullscreenUnitController());
        createSpot.setRequestListener(fyberRewardedListener);
        fyberRewardedAdapter.rewardedAd = createSpot;
        if (str == null || str.length() == 0) {
            InneractiveAdSpot inneractiveAdSpot = fyberRewardedAdapter.rewardedAd;
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.requestAd(new InneractiveAdRequest(str2));
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot2 = fyberRewardedAdapter.rewardedAd;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.loadAd(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$3(FyberRewardedAdapter fyberRewardedAdapter, Activity activity) {
        InneractiveAdSpot inneractiveAdSpot = fyberRewardedAdapter.rewardedAd;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot != null ? inneractiveAdSpot.getSelectedUnitController() : null;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = selectedUnitController instanceof InneractiveFullscreenUnitController ? (InneractiveFullscreenUnitController) selectedUnitController : null;
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.setRewardedListener(fyberRewardedAdapter.rewardedAdListener);
        }
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.setEventsListener(fyberRewardedAdapter.rewardedAdListener);
        }
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
        inneractiveFullscreenVideoContentController.setEventsListener(fyberRewardedAdapter.rewardedAdListener);
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
        }
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.show(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo, com.ironsource.InterfaceC4540s3
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
        this.mainHandler.post(new a72(this, 11));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        InneractiveAdSpot inneractiveAdSpot = this.rewardedAd;
        return inneractiveAdSpot != null && inneractiveAdSpot.isReady();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, RewardedVideoAdListener rewardedVideoAdListener) {
        String string = adData.getString(FyberConstants.SPOT_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, FyberConstants.Logs.SPOT_ID, IronLog.ADAPTER_API);
        if (string != null && string.length() != 0) {
            this.mainHandler.post(new f1t(rewardedVideoAdListener, this, adData.getServerData(), string, 0));
            return;
        }
        String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{FyberConstants.SPOT_ID_KEY}, 1));
        IronLog.INTERNAL.error(format);
        rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, RewardedVideoAdListener rewardedVideoAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (!isAdAvailable(adData)) {
            IronLog.INTERNAL.error("Ad is not available");
            rewardedVideoAdListener.onAdShowFailed(1001, "Ad is not available");
            return;
        }
        String dynamicUserId = getDynamicUserId();
        if (dynamicUserId != null && dynamicUserId.length() > 0) {
            IronLog.INTERNAL.verbose(String.format(FyberConstants.Logs.SET_USER_ID, Arrays.copyOf(new Object[]{dynamicUserId}, 1)));
            InneractiveAdManager.setUserId(dynamicUserId);
        }
        this.mainHandler.post(new nl6(3, this, activity));
    }
}
