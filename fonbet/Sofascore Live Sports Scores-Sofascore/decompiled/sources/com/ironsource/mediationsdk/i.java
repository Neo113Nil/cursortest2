package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.I2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i extends a<BannerAdListener> implements BannerSmashListener {
    public i(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.BANNER, uuid);
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        o oVar = (o) adData.getAdUnitData().get(I2.t);
        if (oVar == null) {
            IronLog.INTERNAL.error(a("Banner layout is null, cannot load banner ad"));
            if (this.b.get() != null) {
                ((BannerAdListener) this.b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "Banner layout is null");
                return;
            }
            return;
        }
        if (num == null || num.intValue() != 1) {
            this.a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), oVar.getSize(), this);
        } else {
            this.a.loadBanner(jSONObject, jSONObject2, oVar.getSize(), this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    public IronSource.a b() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.a
    public void c(@NotNull JSONObject jSONObject) {
        this.a.onBannerViewBound(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    public void d(@NotNull JSONObject jSONObject) {
        this.a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((BannerAdListener) this.b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((BannerAdListener) this.b.get()).onAdLeftApplication();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((BannerAdListener) this.b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((BannerAdListener) this.b.get()).onAdLoadSuccess(view, layoutParams, map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((BannerAdListener) this.b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((BannerAdListener) this.b.get()).onAdScreenPresented();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((BannerAdListener) this.b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        onBannerAdLoaded(view, layoutParams, new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        onBannerAdShown(new HashMap());
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject) {
        this.a.destroyBanner(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        this.a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    public boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }
}
