package com.ironsource.adapters.unityads.rewarded;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adapters.unityads.UnityAdsAdapter;
import com.ironsource.adapters.unityads.UnityAdsConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.RewardedAd;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import xsna.t11;

/* compiled from: UnityAdsRewardedAdapter.kt */
/* loaded from: classes13.dex */
public final class UnityAdsRewardedAdapter extends LevelPlayBaseRewardedVideo<UnityAdsAdapter> {
    private RewardedAd rewardedAd;

    public UnityAdsRewardedAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        IronLog.ADAPTER_API.verbose();
        UnityAdsAdapter unityAdsAdapter = (UnityAdsAdapter) getNetworkAdapter();
        if (unityAdsAdapter != null) {
            UnityAdsAdapter.collectBiddingData$unityadsadapter_release$default(unityAdsAdapter, adData, biddingDataCallback, AdFormat.REWARDED, null, 8, null);
        } else {
            IronLog.INTERNAL.error("Network adapter is null");
            biddingDataCallback.onFailure("Network adapter is null");
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        this.rewardedAd = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return this.rewardedAd != null;
    }

    public final void setRewardedAd$unityadsadapter_release(RewardedAd rewardedAd) {
        this.rewardedAd = rewardedAd;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, RewardedVideoAdListener rewardedVideoAdListener) {
        String string = adData.getString(UnityAdsConstants.ZONE_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, UnityAdsConstants.Logs.ZONE_ID, IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{UnityAdsConstants.ZONE_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
        } else {
            LoadConfiguration.Builder withMediationInfo = new LoadConfiguration.Builder(string).withMediationInfo(UnityAdsAdapter.Companion.getMediationInfo$unityadsadapter_release());
            String serverData = adData.getServerData();
            if (serverData != null && serverData.length() > 0) {
                withMediationInfo.withAdMarkup(serverData);
            }
            RewardedAd.Companion.load(withMediationInfo.build(), new UnityAdsRewardedLoadListener(rewardedVideoAdListener, new WeakReference(this)));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, RewardedVideoAdListener rewardedVideoAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (!isAdAvailable(adData)) {
            IronLog.INTERNAL.error("Ad is not available");
            rewardedVideoAdListener.onAdShowFailed(1001, "Ad is not available");
            return;
        }
        ShowConfiguration.Builder builder = new ShowConfiguration.Builder();
        String dynamicUserId = getDynamicUserId();
        if (dynamicUserId != null && dynamicUserId.length() > 0) {
            builder.withCustomRewardString(dynamicUserId);
        }
        ShowConfiguration build = builder.build();
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.show(activity, build, new UnityAdsRewardedShowListener(rewardedVideoAdListener));
        }
    }
}
