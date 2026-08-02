package com.ironsource.adapters.vungle.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adapters.vungle.VungleAdapter;
import com.ironsource.adapters.vungle.VungleConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo;
import com.vungle.ads.AdConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.RewardedAd;
import java.util.Arrays;
import xsna.oh;
import xsna.t11;

/* compiled from: VungleRewardedAdapter.kt */
/* loaded from: classes13.dex */
public final class VungleRewardedAdapter extends LevelPlayBaseRewardedVideo<VungleAdapter> {
    private final Handler mainHandler;
    private RewardedAd rewardedVideoAd;

    public VungleRewardedAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$2(VungleRewardedAdapter vungleRewardedAdapter) {
        RewardedAd rewardedAd = vungleRewardedAdapter.rewardedVideoAd;
        if (rewardedAd != null) {
            FullscreenAd.DefaultImpls.play$default(rewardedAd, null, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo, com.ironsource.InterfaceC4540s3
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
        this.rewardedVideoAd = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        RewardedAd rewardedAd = this.rewardedVideoAd;
        return rewardedAd != null && rewardedAd.canPlayAd().booleanValue();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, RewardedVideoAdListener rewardedVideoAdListener) {
        String string = adData.getString(VungleConstants.PLACEMENT_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, "placementId = %s", IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{VungleConstants.PLACEMENT_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
        } else {
            RewardedAd rewardedAd = new RewardedAd(context.getApplicationContext(), string, new AdConfig());
            rewardedAd.setAdListener(new VungleRewardedListener(rewardedVideoAdListener));
            rewardedAd.setAdapterAdFormat(VungleConstants.ADAPTER_FORMAT_REWARDED);
            this.rewardedVideoAd = rewardedAd;
            rewardedAd.load(adData.getServerData());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, RewardedVideoAdListener rewardedVideoAdListener) {
        RewardedAd rewardedAd;
        IronLog.ADAPTER_API.verbose();
        if (!isAdAvailable(adData)) {
            IronLog.INTERNAL.error("Ad is not available");
            rewardedVideoAdListener.onAdShowFailed(1001, "Ad is not available");
            return;
        }
        String dynamicUserId = getDynamicUserId();
        if (dynamicUserId != null && dynamicUserId.length() > 0 && (rewardedAd = this.rewardedVideoAd) != null) {
            rewardedAd.setUserId(dynamicUserId);
        }
        this.mainHandler.post(new oh(this, 16));
    }
}
