package com.ironsource.adapters.mintegral.rewarded;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adapters.mintegral.MintegralAdapter;
import com.ironsource.adapters.mintegral.MintegralConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo;
import java.util.Arrays;
import java.util.Set;
import xsna.t11;
import xsna.tj0;
import xsna.zcl;

/* compiled from: MintegralRewardedAdapter.kt */
/* loaded from: classes13.dex */
public final class MintegralRewardedAdapter extends LevelPlayBaseRewardedVideo<MintegralAdapter> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> rewardedPlacementIds = tj0.c();
    private String reservedPlacementId;
    private MintegralRewardedListener rewardedAdListener;
    private MBBidRewardVideoHandler rewardedVideoAd;

    /* compiled from: MintegralRewardedAdapter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MintegralRewardedAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseRewardedVideo, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        MintegralAdapter mintegralAdapter = (MintegralAdapter) getNetworkAdapter();
        if (mintegralAdapter == null) {
            IronLog.INTERNAL.error(MintegralConstants.Logs.ADAPTER_UNAVAILABLE);
            biddingDataCallback.onFailure(MintegralConstants.Logs.ADAPTER_UNAVAILABLE);
        } else {
            mintegralAdapter.collectBiddingData$mintegraladapter_release(context, BidConstants.BID_FILTER_VALUE_AD_TYPE_REWARD_VIDEO, adData != null ? adData.getString("placementId") : null, adData != null ? adData.getString("unitId") : null, biddingDataCallback);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(AdData adData) {
        t11.c(new Object[]{adData.getString("placementId")}, 1, "placementId = %s", IronLog.ADAPTER_API);
        String str = this.reservedPlacementId;
        if (str != null) {
            rewardedPlacementIds.remove(str);
        }
        this.reservedPlacementId = null;
        this.rewardedAdListener = null;
        this.rewardedVideoAd = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.rewardedVideoAd;
        return mBBidRewardVideoHandler != null && mBBidRewardVideoHandler.isBidReady();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, RewardedVideoAdListener rewardedVideoAdListener) {
        String string = adData.getString("placementId");
        String string2 = adData.getString("unitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        t11.c(new Object[]{string == null ? "" : string, string2 != null ? string2 : ""}, 2, MintegralConstants.Logs.PLACEMENT_ID_AND_UNIT_ID, ironLog);
        if (string2 == null || string2.length() == 0) {
            String format = String.format(MintegralConstants.Logs.MISSING_PARAM, Arrays.copyOf(new Object[]{"unitId"}, 1));
            IronLog.INTERNAL.error(format);
            rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
            return;
        }
        Set<String> set = rewardedPlacementIds;
        if (set.contains(string)) {
            IronLog.INTERNAL.error(MintegralConstants.Logs.DUPLICATE_PLACEMENT_RV);
            rewardedVideoAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, MintegralConstants.Logs.DUPLICATE_PLACEMENT_RV);
            return;
        }
        if (string != null) {
            set.add(string);
            this.reservedPlacementId = string;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler = new MBBidRewardVideoHandler(context.getApplicationContext(), string, string2);
        MintegralRewardedListener mintegralRewardedListener = new MintegralRewardedListener(rewardedVideoAdListener, mBBidRewardVideoHandler);
        this.rewardedAdListener = mintegralRewardedListener;
        mBBidRewardVideoHandler.setRewardVideoListener(mintegralRewardedListener);
        this.rewardedVideoAd = mBBidRewardVideoHandler;
        t11.c(new Object[]{string, string2, adData.getServerData()}, 3, MintegralConstants.Logs.LOAD_REWARDED, ironLog);
        MBBidRewardVideoHandler mBBidRewardVideoHandler2 = this.rewardedVideoAd;
        if (mBBidRewardVideoHandler2 != null) {
            mBBidRewardVideoHandler2.loadFromBid(adData.getServerData());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, RewardedVideoAdListener rewardedVideoAdListener) {
        t11.c(new Object[]{adData.getString("placementId")}, 1, "placementId = %s", IronLog.ADAPTER_API);
        String str = this.reservedPlacementId;
        if (str != null) {
            rewardedPlacementIds.remove(str);
        }
        this.reservedPlacementId = null;
        if (!isAdAvailable(adData)) {
            rewardedVideoAdListener.onAdShowFailed(1001, MintegralConstants.Logs.AD_NOT_AVAILABLE);
            return;
        }
        String dynamicUserId = getDynamicUserId();
        if (dynamicUserId == null || dynamicUserId.length() == 0) {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.rewardedVideoAd;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.showFromBid(activity);
                return;
            }
            return;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler2 = this.rewardedVideoAd;
        if (mBBidRewardVideoHandler2 != null) {
            mBBidRewardVideoHandler2.showFromBid(activity, dynamicUserId);
        }
    }
}
