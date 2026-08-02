package com.ironsource.adapters.unityads.banner;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.adapters.unityads.UnityAdsAdapter;
import com.ironsource.adapters.unityads.UnityAdsConstants;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.BannerAd;
import com.unity3d.ads.BannerConfiguration;
import com.unity3d.ads.BannerSize;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner;
import com.unity3d.services.banners.UnityBannerSize;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import xsna.t11;

/* compiled from: UnityAdsBannerAdapter.kt */
/* loaded from: classes13.dex */
public final class UnityAdsBannerAdapter extends LevelPlayBaseBanner<UnityAdsAdapter> {
    private BannerAd bannerAdView;

    public UnityAdsBannerAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    private final UnityBannerSize getBannerSize(ISBannerSize iSBannerSize, boolean z) {
        String description = iSBannerSize.getDescription();
        if (description == null) {
            return null;
        }
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals("RECTANGLE")) {
                    return new UnityBannerSize(300, 250);
                }
                return null;
            case 72205083:
                if (!description.equals("LARGE")) {
                    return null;
                }
                break;
            case 79011241:
                if (description.equals("SMART")) {
                    return z ? new UnityBannerSize(728, 90) : new UnityBannerSize(320, 50);
                }
                return null;
            case 1951953708:
                if (!description.equals("BANNER")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return new UnityBannerSize(320, 50);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        Map<String, Object> adUnitData;
        IronLog.ADAPTER_API.verbose();
        UnityAdsAdapter unityAdsAdapter = (UnityAdsAdapter) getNetworkAdapter();
        if (unityAdsAdapter == null) {
            IronLog.INTERNAL.error("Network adapter is null");
            biddingDataCallback.onFailure("Network adapter is null");
        } else {
            Object obj = (adData == null || (adUnitData = adData.getAdUnitData()) == null) ? null : adUnitData.get("bannerSize");
            ISBannerSize iSBannerSize = obj instanceof ISBannerSize ? (ISBannerSize) obj : null;
            unityAdsAdapter.collectBiddingData$unityadsadapter_release(adData, biddingDataCallback, AdFormat.BANNER, iSBannerSize != null ? new BannerSize(iSBannerSize.getWidth(), iSBannerSize.getHeight()) : null);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        this.bannerAdView = null;
    }

    public final void setBannerAdView$unityadsadapter_release(BannerAd bannerAd) {
        this.bannerAdView = bannerAd;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, BannerAdListener bannerAdListener) {
        String string = adData.getString(UnityAdsConstants.ZONE_ID_KEY);
        t11.c(new Object[]{string == null ? "" : string}, 1, UnityAdsConstants.Logs.ZONE_ID, IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{UnityAdsConstants.ZONE_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, format);
            return;
        }
        UnityBannerSize bannerSize = getBannerSize(iSBannerSize, AdapterUtils.isLargeScreen(activity.getApplicationContext()));
        if (bannerSize == null) {
            IronLog.INTERNAL.error(UnityAdsConstants.Logs.UNSUPPORTED_BANNER_SIZE);
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, UnityAdsConstants.Logs.UNSUPPORTED_BANNER_SIZE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(activity.getApplicationContext(), bannerSize.getWidth()), -2, 17);
        Map<String, Object> adUnitData = adData.getAdUnitData();
        Object obj = adUnitData != null ? adUnitData.get("adUnitId") : null;
        String str = obj instanceof String ? (String) obj : null;
        BannerConfiguration.Builder withMediationInfo = new BannerConfiguration.Builder(string, new BannerSize(bannerSize.getWidth(), bannerSize.getHeight()), new UnityAdsBannerShowListener(bannerAdListener)).withMediationInfo(UnityAdsAdapter.Companion.getMediationInfo$unityadsadapter_release());
        String serverData = adData.getServerData();
        if (serverData != null && serverData.length() > 0) {
            withMediationInfo.withAdMarkup(serverData);
        }
        if (str != null && str.length() != 0) {
            withMediationInfo.withMediationAdUnitId(str);
        }
        BannerAd.Companion.load(withMediationInfo.build(), new UnityAdsBannerLoadListener(bannerAdListener, layoutParams, new WeakReference(this)));
    }
}
