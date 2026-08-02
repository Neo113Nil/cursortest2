package com.ironsource.adapters.yandex.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.adapters.yandex.YandexConstants;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import xsna.mx5;
import xsna.q44;
import xsna.t11;

/* compiled from: YandexBannerAdapter.kt */
/* loaded from: classes13.dex */
public final class YandexBannerAdapter extends LevelPlayBaseBanner<YandexAdapter> {
    private BannerAdView adView;
    private YandexBannerListener bannerAdListener;
    private final Handler mainHandler;

    public YandexBannerAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    private final void destroyBannerViewAd() {
        this.mainHandler.post(new q44(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBannerViewAd$lambda$2(YandexBannerAdapter yandexBannerAdapter) {
        BannerAdView bannerAdView = yandexBannerAdapter.adView;
        if (bannerAdView != null) {
            bannerAdView.setBannerAdEventListener(null);
        }
        BannerAdView bannerAdView2 = yandexBannerAdapter.adView;
        if (bannerAdView2 != null) {
            bannerAdView2.destroy();
        }
        yandexBannerAdapter.adView = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final BannerAdSize getBannerSize(Context context, ISBannerSize iSBannerSize) {
        String description = iSBannerSize.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        return BannerAdSize.a.fixedSize(context, 300, 250);
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        return BannerAdSize.a.fixedSize(context, 320, 90);
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        return AdapterUtils.isLargeScreen(context) ? BannerAdSize.a.fixedSize(context, 728, 90) : BannerAdSize.a.fixedSize(context, 320, 50);
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        return BannerAdSize.a.fixedSize(context, 320, 50);
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        return BannerAdSize.a.fixedSize(context, iSBannerSize.getWidth(), iSBannerSize.getHeight());
                    }
                    break;
            }
        }
        IronLog.INTERNAL.verbose(YandexConstants.Logs.BANNER_SIZE_NULL_LOG);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner, com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        Map<String, Object> adUnitData;
        IronLog.ADAPTER_API.verbose();
        YandexAdapter yandexAdapter = (YandexAdapter) getNetworkAdapter();
        if (yandexAdapter == null) {
            biddingDataCallback.onFailure(YandexConstants.Logs.ADAPTER_UNAVAILABLE);
            return;
        }
        Object obj = (adData == null || (adUnitData = adData.getAdUnitData()) == null) ? null : adUnitData.get("bannerSize");
        if (!(obj instanceof ISBannerSize)) {
            IronLog.INTERNAL.verbose(YandexConstants.Logs.BANNER_SIZE_IS_NULL);
            biddingDataCallback.onFailure(YandexConstants.Logs.BANNER_SIZE_IS_NULL);
            return;
        }
        BannerAdSize bannerSize = getBannerSize(context.getApplicationContext(), (ISBannerSize) obj);
        if (bannerSize != null) {
            yandexAdapter.collectBiddingData$yandexadapter_release(context, biddingDataCallback, new BidderTokenRequestConfiguration.Builder(AdType.BANNER).setBannerAdSize(bannerSize).setParameters(yandexAdapter.getConfigParams$yandexadapter_release()).build());
        } else {
            IronLog.INTERNAL.verbose("Unsupported banner size");
            biddingDataCallback.onFailure("Unsupported banner size");
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        destroyBannerViewAd();
    }

    public final void setBannerView$yandexadapter_release(BannerAdView bannerAdView) {
        this.adView = bannerAdView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, BannerAdListener bannerAdListener) {
        String string = adData.getString("adUnitId");
        t11.c(new Object[]{string == null ? "" : string}, 1, YandexConstants.Logs.AD_UNIT_ID, IronLog.ADAPTER_API);
        if (string == null || string.length() == 0) {
            IronLog.INTERNAL.error(YandexConstants.Logs.AD_UNIT_ID_EMPTY);
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, YandexConstants.Logs.AD_UNIT_ID_EMPTY);
            return;
        }
        YandexAdapter yandexAdapter = (YandexAdapter) getNetworkAdapter();
        if (yandexAdapter == null) {
            IronLog.INTERNAL.error(YandexConstants.Logs.ADAPTER_UNAVAILABLE);
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, YandexConstants.Logs.ADAPTER_UNAVAILABLE);
            return;
        }
        String serverData = adData.getServerData();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, "serverData is empty");
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        BannerAdSize bannerSize = getBannerSize(applicationContext, iSBannerSize);
        if (bannerSize == null) {
            IronLog.INTERNAL.error("Unsupported banner size");
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, "Unsupported banner size");
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, bannerSize.getWidth()), AdapterUtils.dpToPixels(applicationContext, bannerSize.getHeight()), 17);
        BannerAdView bannerAdView = new BannerAdView(applicationContext);
        bannerAdView.setAdUnitId(string);
        bannerAdView.setAdSize(bannerSize);
        this.bannerAdListener = new YandexBannerListener(bannerAdListener, new WeakReference(this), bannerAdView, layoutParams);
        AdRequest build = new AdRequest.Builder().setBiddingData(serverData).setParameters(yandexAdapter.getConfigParams$yandexadapter_release()).build();
        bannerAdView.setBannerAdEventListener(this.bannerAdListener);
        this.mainHandler.post(new mx5(6, bannerAdView, build));
    }
}
