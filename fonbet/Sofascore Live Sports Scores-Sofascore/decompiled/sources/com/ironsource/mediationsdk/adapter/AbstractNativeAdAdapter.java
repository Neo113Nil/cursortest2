package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class AbstractNativeAdAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements NativeAdAdapterInterface {
    public AbstractNativeAdAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        jSONObject.getClass();
        biddingDataCallback.getClass();
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(jSONObject, jSONObject2);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyNativeAd(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
    }

    @Nullable
    public Map<String, Object> getNativeAdBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        jSONObject.getClass();
        return null;
    }

    @NotNull
    public final NativeAdProperties getNativeAdProperties(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        return new NativeAdProperties(jSONObject);
    }

    public void initNativeAdForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        jSONObject.getClass();
        nativeAdSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        jSONObject.getClass();
        nativeAdSmashListener.getClass();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        jSONObject.getClass();
        nativeAdSmashListener.getClass();
    }

    public void loadNativeAdForBidding(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable String str, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        jSONObject.getClass();
        nativeAdSmashListener.getClass();
    }
}
