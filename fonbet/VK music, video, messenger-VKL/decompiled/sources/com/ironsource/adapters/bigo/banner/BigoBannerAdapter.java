package com.ironsource.adapters.bigo.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.adapters.bigo.BigoConstants;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;
import xsna.epx;
import xsna.xq3;

/* compiled from: BigoBannerAdapter.kt */
/* loaded from: classes13.dex */
public final class BigoBannerAdapter extends LevelPlayBaseBanner<BigoAdapter> {
    private BannerAd bannerAd;
    private BigoBannerListener bannerListener;
    private final Handler mainHandler;

    public BigoBannerAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAd$lambda$0(BigoBannerAdapter bigoBannerAdapter) {
        BannerAd bannerAd = bigoBannerAdapter.bannerAd;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(null);
        }
        BannerAd bannerAd2 = bigoBannerAdapter.bannerAd;
        if (bannerAd2 != null) {
            bannerAd2.destroy();
        }
        bigoBannerAdapter.bannerAd = null;
        bigoBannerAdapter.bannerListener = null;
    }

    private final AdSize getBannerSize(ISBannerSize iSBannerSize, Context context) {
        String description = iSBannerSize.getDescription();
        if (epx.f(description, ISBannerSize.BANNER.getDescription())) {
            return AdSize.BANNER;
        }
        if (epx.f(description, ISBannerSize.RECTANGLE.getDescription())) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        if (epx.f(description, ISBannerSize.SMART.getDescription())) {
            return AdapterUtils.isLargeScreen(context) ? AdSize.LARGE_BANNER : AdSize.BANNER;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseBanner, com.ironsource.InterfaceC4540s3
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

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void destroyAd(AdData adData) {
        IronLog.ADAPTER_API.verbose();
        this.mainHandler.post(new xq3(this, 2));
    }

    public final void setBannerAd$bigoadapter_release(BannerAd bannerAd) {
        bannerAd.setAdInteractionListener(this.bannerListener);
        this.bannerAd = bannerAd;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, BannerAdListener bannerAdListener) {
        String string = adData.getString(BigoConstants.SLOT_ID_KEY);
        IronLog.ADAPTER_API.verbose(String.format(BigoConstants.Logs.SLOT_ID, Arrays.copyOf(new Object[]{string == null ? "" : string}, 1)));
        String serverData = adData.getServerData();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, "serverData is empty");
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        AdSize bannerSize = getBannerSize(iSBannerSize, applicationContext);
        if (bannerSize == null) {
            IronLog.INTERNAL.error("Unsupported banner size");
            bannerAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1000, "Unsupported banner size");
        } else {
            this.bannerListener = new BigoBannerListener(bannerAdListener, new WeakReference(this), new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, bannerSize.getWidth()), AdapterUtils.dpToPixels(applicationContext, bannerSize.getHeight()), 17));
            new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) this.bannerListener).withExt(BigoAdapter.Companion.getMediationInfo()).build().loadAd((BannerAdLoader) new BannerAdRequest.Builder().withBid(serverData).withSlotId(string).withAdSizes(bannerSize).build());
        }
    }
}
