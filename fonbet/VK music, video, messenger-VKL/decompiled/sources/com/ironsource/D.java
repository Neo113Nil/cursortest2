package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import xsna.go9;

/* loaded from: classes13.dex */
public final class D implements E0 {
    private final V0 a;
    private final C b;
    private final BaseAdAdapter<?, ?> c;

    public D(V0 v0, C c, BaseAdAdapter<?, ?> baseAdAdapter) {
        this.a = v0;
        this.b = c;
        this.c = baseAdAdapter;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(C4484p0.a(this.a, go9.b("could not get adapter version for event data ", this.b.x()), (String) null, 2, (Object) null));
        }
        hashMap.put("spId", this.b.k().i());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.b.k().a());
        hashMap.put("instanceType", Integer.valueOf(this.b.t()));
        String e2 = this.a.e(this.b.o().k());
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("dynamicDemandSource", e2);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.b.w()));
        if (!TextUtils.isEmpty(this.b.v().getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.b.v().getCustomNetwork());
        }
        return hashMap;
    }
}
