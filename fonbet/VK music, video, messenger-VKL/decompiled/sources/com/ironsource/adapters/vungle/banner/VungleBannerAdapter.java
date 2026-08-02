package com.ironsource.adapters.vungle.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adapters.vungle.VungleAdapter;
import com.ironsource.adapters.vungle.VungleConstants;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleMediationLogger;
import java.util.Arrays;
import java.util.Locale;
import xsna.epx;
import xsna.t11;
import xsna.yn2;

/* compiled from: VungleBannerAdapter.kt */
/* loaded from: classes13.dex */
public final class VungleBannerAdapter extends LevelPlayBaseBanner<VungleAdapter> {
    private VungleBannerView bannerView;
    private final Handler mainHandler;

    public VungleBannerAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAd$lambda$2(VungleBannerAdapter vungleBannerAdapter) {
        VungleBannerView vungleBannerView = vungleBannerAdapter.bannerView;
        if (vungleBannerView != null) {
            vungleBannerView.finishAd();
        }
        vungleBannerAdapter.bannerView = null;
    }

    private final VungleAdSize getBannerSize(Context context, ISBannerSize iSBannerSize) {
        String description = iSBannerSize.getDescription();
        if (description == null) {
            return null;
        }
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals("RECTANGLE")) {
                    return VungleAdSize.MREC;
                }
                return null;
            case 72205083:
                if (!description.equals("LARGE")) {
                    return null;
                }
                break;
            case 79011241:
                if (description.equals("SMART")) {
                    return AdapterUtils.isLargeScreen(context) ? VungleAdSize.BANNER_LEADERBOARD : VungleAdSize.BANNER;
                }
                return null;
            case 1951953708:
                if (!description.equals("BANNER")) {
                    return null;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    return VungleAdSize.Companion.getAdSizeWithWidthAndHeight(iSBannerSize.getWidth(), iSBannerSize.getHeight());
                }
                return null;
            default:
                return null;
        }
        return VungleAdSize.BANNER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner, com.ironsource.InterfaceC4540s3
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

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        this.mainHandler.post(new yn2(this, 12));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, BannerAdListener bannerAdListener) {
        VungleBannerView vungleBannerView;
        String string = adData.getString(VungleConstants.PLACEMENT_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, "placementId = %s", IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{VungleConstants.PLACEMENT_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        VungleAdSize bannerSize = getBannerSize(applicationContext, iSBannerSize);
        if (bannerSize == null) {
            IronLog.INTERNAL.error("Unsupported banner size");
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, "Unsupported banner size");
            return;
        }
        VungleBannerView vungleBannerView2 = new VungleBannerView(applicationContext, string, bannerSize);
        vungleBannerView2.setAdListener(new VungleBannerListener(bannerAdListener, vungleBannerView2));
        vungleBannerView2.setAdapterAdFormat(VungleConstants.ADAPTER_FORMAT_BANNER);
        this.bannerView = vungleBannerView2;
        if (!VungleAds.Companion.isInline(string) && epx.f(iSBannerSize.getDescription(), "CUSTOM") && (vungleBannerView = this.bannerView) != null) {
            vungleBannerView.setAdapterAdFormat("ISVungleBanner-".concat(iSBannerSize.getDescription().toLowerCase(Locale.ROOT)));
            VungleMediationLogger.logError(vungleBannerView, String.format(VungleConstants.Logs.CUSTOM_SIZE_MISMATCH, Arrays.copyOf(new Object[]{Integer.valueOf(iSBannerSize.getWidth()), Integer.valueOf(iSBannerSize.getHeight())}, 2)));
        }
        VungleBannerView vungleBannerView3 = this.bannerView;
        if (vungleBannerView3 != null) {
            vungleBannerView3.load(adData.getServerData());
        }
    }
}
