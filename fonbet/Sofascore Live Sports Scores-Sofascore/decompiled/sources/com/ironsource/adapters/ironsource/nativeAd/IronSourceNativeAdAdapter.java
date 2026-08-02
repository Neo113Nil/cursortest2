package com.ironsource.adapters.ironsource.nativeAd;

import android.app.Activity;
import com.ironsource.C4157k4;
import com.ironsource.C4412y8;
import com.ironsource.U3;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import defpackage.kx0;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {

    @Nullable
    private C4412y8 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(@NotNull IronSourceAdapter ironSourceAdapter) {
        super(ironSourceAdapter);
        ironSourceAdapter.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter ironSourceNativeAdAdapter, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener, String str) {
        ironSourceNativeAdAdapter.getClass();
        jSONObject.getClass();
        nativeAdSmashListener.getClass();
        try {
            C4412y8 a = C4412y8.j.a();
            a.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(a, ironSourceNativeAdAdapter.getNativeAdProperties(jSONObject)), nativeAdSmashListener));
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject prepareLoadParams = ironSourceNativeAdAdapter.prepareLoadParams(jSONObject, str);
            currentActiveActivity.getClass();
            a.a(currentActiveActivity, prepareLoadParams);
            ironSourceNativeAdAdapter.nativeAd = a;
        } catch (Exception e) {
            C4157k4.d().a(e);
            nativeAdSmashListener.onNativeAdLoadFailed(new IronSourceError(510, dmi.q("IronSourceAdapter loadNativeAd exception ", e.getMessage())));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) {
        JSONObject put = new JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(U3.s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        HashMap<String, String> initParams = getAdapter().getInitParams();
        initParams.getClass();
        for (Map.Entry<String, String> entry : initParams.entrySet()) {
            put.put(entry.getKey(), entry.getValue());
        }
        put.getClass();
        return put;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        C4412y8 c4412y8 = this.nativeAd;
        if (c4412y8 != null) {
            c4412y8.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    @Nullable
    public Map<String, Object> getNativeAdBiddingData(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        jSONObject.getClass();
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject jSONObject, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        jSONObject.getClass();
        nativeAdSmashListener.getClass();
        getAdapter().initSDK(str, jSONObject);
        nativeAdSmashListener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(@NotNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable String str, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        jSONObject.getClass();
        nativeAdSmashListener.getClass();
        postOnUIThread(new kx0(this, jSONObject, nativeAdSmashListener, str, 7));
    }
}
