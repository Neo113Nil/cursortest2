package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface BannerAdapterInterface extends AdUnitAdapterInterface {
    void collectBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback);

    void destroyBanner(JSONObject jSONObject);

    int getAdaptiveHeight(int i);

    Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2);

    void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener);

    void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener);

    void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener);

    void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener);

    void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener);

    void onBannerViewBound(@NotNull JSONObject jSONObject);

    void onBannerViewWillBind(@NotNull JSONObject jSONObject);
}
