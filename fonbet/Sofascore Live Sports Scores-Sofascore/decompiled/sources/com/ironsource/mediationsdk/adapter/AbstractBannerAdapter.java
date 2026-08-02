package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class AbstractBannerAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements BannerAdapterInterface {
    public AbstractBannerAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        jSONObject.getClass();
        biddingDataCallback.getClass();
        Map<String, Object> bannerBiddingData = getBannerBiddingData(jSONObject, jSONObject2);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i) {
        return -1;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    @Nullable
    public Map<String, Object> getBannerBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        jSONObject.getClass();
        return null;
    }

    @Nullable
    public LoadWhileShowSupportState getBannerLoadWhileShowSupportState(@Nullable JSONObject jSONObject) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull BannerSmashListener bannerSmashListener) {
        jSONObject.getClass();
        bannerSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull BannerSmashListener bannerSmashListener) {
        jSONObject.getClass();
        bannerSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable ISBannerSize iSBannerSize, @NotNull BannerSmashListener bannerSmashListener) {
        jSONObject.getClass();
        bannerSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable String str, @Nullable ISBannerSize iSBannerSize, @NotNull BannerSmashListener bannerSmashListener) {
        jSONObject.getClass();
        bannerSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(@NotNull JSONObject jSONObject, @Nullable String str, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @NotNull BannerSmashListener bannerSmashListener) {
        jSONObject.getClass();
        bannerSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
    }
}
