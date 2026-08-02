package com.ironsource.adapters.bigo.rewarded;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.adapters.bigo.BigoConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.RewardVideoAdLoader;
import sg.bigo.ads.api.RewardVideoAdRequest;

/* compiled from: BigoRewardedAdapter.kt */
/* loaded from: classes13.dex */
public final class BigoRewardedAdapter extends LevelPlayBaseRewardedVideo<BigoAdapter> {
    private RewardVideoAd rewardedAd;
    private BigoRewardedListener rewardedListener;

    public BigoRewardedAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        IronLog.ADAPTER_API.verbose();
        BigoAdapter bigoAdapter = (BigoAdapter) getNetworkAdapter();
        if (bigoAdapter != null) {
            bigoAdapter.collectBiddingData$bigoadapter_release(biddingDataCallback);
        } else {
            IronLog.INTERNAL.error("Network adapter is null");
            biddingDataCallback.onFailure("Network adapter is null");
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        RewardVideoAd rewardVideoAd = this.rewardedAd;
        if (rewardVideoAd != null) {
            rewardVideoAd.setAdInteractionListener((RewardAdInteractionListener) null);
        }
        RewardVideoAd rewardVideoAd2 = this.rewardedAd;
        if (rewardVideoAd2 != null) {
            rewardVideoAd2.destroy();
        }
        this.rewardedAd = null;
        this.rewardedListener = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        RewardVideoAd rewardVideoAd = this.rewardedAd;
        return (rewardVideoAd == null || rewardVideoAd == null || rewardVideoAd.isExpired()) ? false : true;
    }

    public final void setRewardedAd$bigoadapter_release(RewardVideoAd rewardVideoAd) {
        this.rewardedAd = rewardVideoAd;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, RewardedVideoAdListener rewardedVideoAdListener) {
        String string = adData.getString(BigoConstants.SLOT_ID_KEY);
        IronLog.ADAPTER_API.verbose(String.format(BigoConstants.Logs.SLOT_ID, Arrays.copyOf(new Object[]{string == null ? "" : string}, 1)));
        String serverData = adData.getServerData();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, "serverData is empty");
        } else {
            this.rewardedListener = new BigoRewardedListener(rewardedVideoAdListener, new WeakReference(this));
            new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) this.rewardedListener).withExt(BigoAdapter.Companion.getMediationInfo()).build().loadAd((RewardVideoAdLoader) new RewardVideoAdRequest.Builder().withBid(serverData).withSlotId(string).build());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, RewardedVideoAdListener rewardedVideoAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (!isAdAvailable(adData)) {
            rewardedVideoAdListener.onAdShowFailed(1001, "Ad is not available");
            return;
        }
        RewardVideoAd rewardVideoAd = this.rewardedAd;
        if (rewardVideoAd != null) {
            rewardVideoAd.setAdInteractionListener((RewardAdInteractionListener) this.rewardedListener);
        }
        RewardVideoAd rewardVideoAd2 = this.rewardedAd;
        if (rewardVideoAd2 != null) {
            rewardVideoAd2.show();
        }
    }
}
