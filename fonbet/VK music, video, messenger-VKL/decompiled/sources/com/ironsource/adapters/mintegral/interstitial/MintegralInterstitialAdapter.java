package com.ironsource.adapters.mintegral.interstitial;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adapters.mintegral.MintegralAdapter;
import com.ironsource.adapters.mintegral.MintegralConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial;
import java.util.Arrays;
import java.util.Set;
import xsna.t11;
import xsna.tj0;
import xsna.zcl;

/* compiled from: MintegralInterstitialAdapter.kt */
/* loaded from: classes13.dex */
public final class MintegralInterstitialAdapter extends LevelPlayBaseInterstitial<MintegralAdapter> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> interstitialPlacementIds = tj0.c();
    private MBBidNewInterstitialHandler interstitialAd;
    private MintegralInterstitialListener interstitialAdListener;
    private String reservedPlacementId;

    /* compiled from: MintegralInterstitialAdapter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MintegralInterstitialAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        MintegralAdapter mintegralAdapter = (MintegralAdapter) getNetworkAdapter();
        if (mintegralAdapter == null) {
            IronLog.INTERNAL.error(MintegralConstants.Logs.ADAPTER_UNAVAILABLE);
            biddingDataCallback.onFailure(MintegralConstants.Logs.ADAPTER_UNAVAILABLE);
        } else {
            mintegralAdapter.collectBiddingData$mintegraladapter_release(context, BidConstants.BID_FILTER_VALUE_AD_TYPE_INTERSTITIAL_VIDEO, adData != null ? adData.getString("placementId") : null, adData != null ? adData.getString("unitId") : null, biddingDataCallback);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void destroyAd(AdData adData) {
        t11.c(new Object[]{adData.getString("placementId")}, 1, "placementId = %s", IronLog.ADAPTER_API);
        String str = this.reservedPlacementId;
        if (str != null) {
            interstitialPlacementIds.remove(str);
        }
        this.reservedPlacementId = null;
        this.interstitialAdListener = null;
        this.interstitialAd = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.interstitialAd;
        return mBBidNewInterstitialHandler != null && mBBidNewInterstitialHandler.isBidReady();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, InterstitialAdListener interstitialAdListener) {
        String string = adData.getString("placementId");
        String string2 = adData.getString("unitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        t11.c(new Object[]{string == null ? "" : string, string2 != null ? string2 : ""}, 2, MintegralConstants.Logs.PLACEMENT_ID_AND_UNIT_ID, ironLog);
        if (string2 == null || string2.length() == 0) {
            String format = String.format(MintegralConstants.Logs.MISSING_PARAM, Arrays.copyOf(new Object[]{"unitId"}, 1));
            IronLog.INTERNAL.error(format);
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
            return;
        }
        Set<String> set = interstitialPlacementIds;
        if (set.contains(string)) {
            IronLog.INTERNAL.error(MintegralConstants.Logs.DUPLICATE_PLACEMENT_IS);
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, MintegralConstants.Logs.DUPLICATE_PLACEMENT_IS);
            return;
        }
        if (string != null) {
            set.add(string);
            this.reservedPlacementId = string;
        }
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = new MBBidNewInterstitialHandler(context.getApplicationContext(), string, string2);
        MintegralInterstitialListener mintegralInterstitialListener = new MintegralInterstitialListener(interstitialAdListener, mBBidNewInterstitialHandler);
        this.interstitialAdListener = mintegralInterstitialListener;
        mBBidNewInterstitialHandler.setInterstitialVideoListener(mintegralInterstitialListener);
        this.interstitialAd = mBBidNewInterstitialHandler;
        t11.c(new Object[]{string, string2, adData.getServerData()}, 3, MintegralConstants.Logs.LOAD_INTERSTITIAL, ironLog);
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = this.interstitialAd;
        if (mBBidNewInterstitialHandler2 != null) {
            mBBidNewInterstitialHandler2.loadFromBid(adData.getServerData());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, InterstitialAdListener interstitialAdListener) {
        t11.c(new Object[]{adData.getString("placementId")}, 1, "placementId = %s", IronLog.ADAPTER_API);
        String str = this.reservedPlacementId;
        if (str != null) {
            interstitialPlacementIds.remove(str);
        }
        this.reservedPlacementId = null;
        if (!isAdAvailable(adData)) {
            interstitialAdListener.onAdShowFailed(1001, MintegralConstants.Logs.AD_NOT_AVAILABLE);
            return;
        }
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.interstitialAd;
        if (mBBidNewInterstitialHandler != null) {
            mBBidNewInterstitialHandler.showFromBid(activity);
        }
    }
}
