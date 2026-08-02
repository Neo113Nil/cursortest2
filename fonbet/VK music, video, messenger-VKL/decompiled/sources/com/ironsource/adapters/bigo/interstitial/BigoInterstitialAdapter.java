package com.ironsource.adapters.bigo.interstitial;

import android.app.Activity;
import android.content.Context;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.adapters.bigo.BigoConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.InterstitialAdLoader;
import sg.bigo.ads.api.InterstitialAdRequest;

/* compiled from: BigoInterstitialAdapter.kt */
/* loaded from: classes13.dex */
public final class BigoInterstitialAdapter extends LevelPlayBaseInterstitial<BigoAdapter> {
    private InterstitialAd interstitialAd;
    private BigoInterstitialListener interstitialListener;

    public BigoInterstitialAdapter(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseInterstitial, com.ironsource.InterfaceC4540s3
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
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdInteractionListener(null);
        }
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.destroy();
        }
        this.interstitialAd = null;
        this.interstitialListener = null;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        InterstitialAd interstitialAd = this.interstitialAd;
        return (interstitialAd == null || interstitialAd == null || interstitialAd.isExpired()) ? false : true;
    }

    public final void setInterstitialAd$bigoadapter_release(InterstitialAd interstitialAd) {
        this.interstitialAd = interstitialAd;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void loadAd(AdData adData, Context context, InterstitialAdListener interstitialAdListener) {
        String string = adData.getString(BigoConstants.SLOT_ID_KEY);
        IronLog.ADAPTER_API.verbose(String.format(BigoConstants.Logs.SLOT_ID, Arrays.copyOf(new Object[]{string == null ? "" : string}, 1)));
        String serverData = adData.getServerData();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            interstitialAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 1002, "serverData is empty");
        } else {
            this.interstitialListener = new BigoInterstitialListener(interstitialAdListener, new WeakReference(this));
            new InterstitialAdLoader.Builder().withAdLoadListener((AdLoadListener<InterstitialAd>) this.interstitialListener).withExt(BigoAdapter.Companion.getMediationInfo()).build().loadAd((InterstitialAdLoader) new InterstitialAdRequest.Builder().withBid(serverData).withSlotId(string).build());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, InterstitialAdListener interstitialAdListener) {
        IronLog.ADAPTER_API.verbose();
        if (!isAdAvailable(adData)) {
            interstitialAdListener.onAdShowFailed(1001, "Ad is not available");
            return;
        }
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdInteractionListener(this.interstitialListener);
        }
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.show();
        }
    }
}
