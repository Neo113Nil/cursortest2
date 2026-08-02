package com.ironsource.adapters.mintegral.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.ironsource.adapters.mintegral.MintegralAdapter;
import com.ironsource.adapters.mintegral.MintegralConstants;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner;
import java.util.Arrays;
import xsna.d0;
import xsna.t11;

/* compiled from: MintegralBannerAdapter.kt */
/* loaded from: classes13.dex */
public final class MintegralBannerAdapter extends LevelPlayBaseBanner<MintegralAdapter> {
    private MBBannerView bannerView;
    private final Handler mainHandler;

    public MintegralBannerAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    private final FrameLayout.LayoutParams createBannerLayoutParams(Context context, ISBannerSize iSBannerSize) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        String description = iSBannerSize.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 300), AdapterUtils.dpToPixels(context, 250));
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 90));
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        layoutParams = AdapterUtils.isLargeScreen(context) ? new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 728), AdapterUtils.dpToPixels(context, 90)) : new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, iSBannerSize.getWidth()), AdapterUtils.dpToPixels(context, iSBannerSize.getHeight()));
                        break;
                    }
                    break;
            }
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    private final BannerSize createBannerSize(Context context, ISBannerSize iSBannerSize) {
        String description = iSBannerSize.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        return new BannerSize(2, 300, 250);
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        return new BannerSize(1, 320, 90);
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        return AdapterUtils.isLargeScreen(context) ? new BannerSize(3, 728, 90) : new BannerSize(4, 320, 50);
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        return new BannerSize(4, 320, 50);
                    }
                    break;
            }
        }
        return new BannerSize(5, iSBannerSize.getWidth(), iSBannerSize.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAd$lambda$1(MintegralBannerAdapter mintegralBannerAdapter) {
        MBBannerView mBBannerView = mintegralBannerAdapter.bannerView;
        if (mBBannerView != null) {
            mBBannerView.release();
        }
        mintegralBannerAdapter.bannerView = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        MintegralAdapter mintegralAdapter = (MintegralAdapter) getNetworkAdapter();
        if (mintegralAdapter == null) {
            IronLog.INTERNAL.error(MintegralConstants.Logs.ADAPTER_UNAVAILABLE);
            biddingDataCallback.onFailure(MintegralConstants.Logs.ADAPTER_UNAVAILABLE);
        } else {
            mintegralAdapter.collectBiddingData$mintegraladapter_release(context, BidConstants.BID_FILTER_VALUE_AD_TYPE_BANNER, adData != null ? adData.getString("placementId") : null, adData != null ? adData.getString("unitId") : null, biddingDataCallback);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        this.mainHandler.post(new d0(this, 7));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, BannerAdListener bannerAdListener) {
        String string = adData.getString("placementId");
        String string2 = adData.getString("unitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        t11.c(new Object[]{string == null ? "" : string, string2 != null ? string2 : ""}, 2, MintegralConstants.Logs.PLACEMENT_ID_AND_UNIT_ID, ironLog);
        if (string2 == null || string2.length() == 0) {
            String format = String.format(MintegralConstants.Logs.MISSING_PARAM, Arrays.copyOf(new Object[]{"unitId"}, 1));
            IronLog.INTERNAL.error(format);
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        FrameLayout.LayoutParams createBannerLayoutParams = createBannerLayoutParams(applicationContext, iSBannerSize);
        BannerSize createBannerSize = createBannerSize(applicationContext, iSBannerSize);
        MBBannerView mBBannerView = new MBBannerView(applicationContext);
        mBBannerView.init(createBannerSize, string, string2);
        mBBannerView.setRefreshTime(0);
        mBBannerView.setAllowShowCloseBtn(false);
        mBBannerView.setBannerAdListener(new MintegralBannerListener(bannerAdListener, mBBannerView, createBannerLayoutParams));
        this.bannerView = mBBannerView;
        t11.c(new Object[]{Integer.valueOf(iSBannerSize.getWidth()), Integer.valueOf(iSBannerSize.getHeight()), string, string2, adData.getServerData()}, 5, MintegralConstants.Logs.LOAD_BANNER, ironLog);
        MBBannerView mBBannerView2 = this.bannerView;
        if (mBBannerView2 != null) {
            mBBannerView2.loadFromBid(adData.getServerData());
        }
    }
}
