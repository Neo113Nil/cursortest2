package com.ironsource.adapters.ironsource.nativeAd;

import android.app.Activity;
import com.ironsource.A8;
import com.ironsource.C2556n4;
import com.ironsource.X3;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private A8 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter this$0, JSONObject config, NativeAdSmashListener listener, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            A8 a = A8.j.a();
            a.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(a, this$0.getNativeAdProperties(config)), listener));
            Activity activity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject prepareLoadParams = this$0.prepareLoadParams(config, str);
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            a.a(activity, prepareLoadParams);
            this$0.nativeAd = a;
        } catch (Exception e) {
            C2556n4.d().a(e);
            listener.onNativeAdLoadFailed(new IronSourceError(510, "IronSourceAdapter loadNativeAd exception " + e.getMessage()));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) {
        JSONObject loadParams = IronSourceNetworkBridge.jsonObjectInit().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(X3.s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        HashMap<String, String> extraParams = getAdapter().getInitParams();
        Intrinsics.checkNotNullExpressionValue(extraParams, "extraParams");
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        Intrinsics.checkNotNullExpressionValue(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        A8 a8 = this.nativeAd;
        if (a8 != null) {
            a8.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAdapter().initSDK(str, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(final JSONObject config, JSONObject jSONObject, final String str, final NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter.this, config, listener, str);
            }
        });
    }
}
