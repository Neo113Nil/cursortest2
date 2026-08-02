package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.B8;
import com.ironsource.C4452n4;
import com.ironsource.X3;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.go9;
import xsna.usx;

/* loaded from: classes13.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private B8 nativeAd;

    public IronSourceNativeAdAdapter(IronSourceAdapter ironSourceAdapter) {
        super(ironSourceAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter ironSourceNativeAdAdapter, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener, String str) {
        try {
            B8 a = B8.j.a();
            a.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(a, ironSourceNativeAdAdapter.getNativeAdProperties(jSONObject)), nativeAdSmashListener));
            a.a(ContextProvider.getInstance().getCurrentActiveActivity(), ironSourceNativeAdAdapter.prepareLoadParams(jSONObject, str));
            ironSourceNativeAdAdapter.nativeAd = a;
        } catch (Exception e) {
            C4452n4.d().a(e);
            nativeAdSmashListener.onNativeAdLoadFailed(new IronSourceError(510, go9.b("IronSourceAdapter loadNativeAd exception ", e.getMessage())));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) {
        JSONObject put = new JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(X3.s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        for (Map.Entry<String, String> entry : getAdapter().getInitParams().entrySet()) {
            put.put(entry.getKey(), entry.getValue());
        }
        return put;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject jSONObject) {
        B8 b8 = this.nativeAd;
        if (b8 != null) {
            b8.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        getAdapter().initSDK(str, jSONObject);
        nativeAdSmashListener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, NativeAdSmashListener nativeAdSmashListener) {
        postOnUIThread(new usx(this, jSONObject, nativeAdSmashListener, str, 0));
    }
}
