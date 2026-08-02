package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements E0 {
    private final V0 a;
    private final C b;
    private final BaseAdAdapter<?, ?> c;

    public D(V0 adTools, C instanceData, BaseAdAdapter<?, ?> baseAdAdapter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        this.a = adTools;
        this.b = instanceData;
        this.c = baseAdAdapter;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.c;
            String str2 = "";
            if (baseAdAdapter != null) {
                ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter);
                str = networkAdapter.getAdapterVersion();
            } else {
                str = "";
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.c;
            if (baseAdAdapter2 != null) {
                ?? networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter2);
                str2 = networkAdapter2.getNetworkSDKVersion();
            }
            Intrinsics.checkNotNull(str2);
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str2);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(C2588p0.a(this.a, "could not get adapter version for event data " + this.b.x(), (String) null, 2, (Object) null));
        }
        String i = this.b.k().i();
        Intrinsics.checkNotNullExpressionValue(i, "instanceData.adapterConfig.subProviderId");
        hashMap.put("spId", i);
        String a = this.b.k().a();
        Intrinsics.checkNotNullExpressionValue(a, "instanceData.adapterConfig.adSourceNameForEvents");
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, a);
        hashMap.put("instanceType", Integer.valueOf(this.b.t()));
        String serverData = this.b.o().k();
        V0 v0 = this.a;
        Intrinsics.checkNotNullExpressionValue(serverData, "serverData");
        String e2 = v0.e(serverData);
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("dynamicDemandSource", e2);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.b.w()));
        if (!TextUtils.isEmpty(this.b.v().getCustomNetwork())) {
            String customNetwork = this.b.v().getCustomNetwork();
            Intrinsics.checkNotNullExpressionValue(customNetwork, "instanceData.providerSettings.customNetwork");
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return hashMap;
    }
}
