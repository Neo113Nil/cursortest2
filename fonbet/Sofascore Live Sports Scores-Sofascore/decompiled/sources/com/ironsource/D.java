package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.dmi;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class D implements D0 {

    @NotNull
    private final T0 a;

    @NotNull
    private final C b;

    @Nullable
    private final BaseAdAdapter<?, ?> c;

    public D(@NotNull T0 t0, @NotNull C c, @Nullable BaseAdAdapter<?, ?> baseAdAdapter) {
        t0.getClass();
        c.getClass();
        this.a = t0;
        this.b = c;
        this.c = baseAdAdapter;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@NotNull B0 b0) {
        String str;
        b0.getClass();
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.c;
            String str2 = "";
            if (baseAdAdapter != null) {
                ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
                networkAdapter.getClass();
                str = networkAdapter.getAdapterVersion();
            } else {
                str = "";
            }
            str.getClass();
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.c;
            if (baseAdAdapter2 != null) {
                ?? networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                networkAdapter2.getClass();
                str2 = networkAdapter2.getNetworkSDKVersion();
            }
            str2.getClass();
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str2);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(C4243p0.a(this.a, dmi.q("could not get adapter version for event data ", this.b.x()), (String) null, 2, (Object) null));
        }
        String i = this.b.k().i();
        i.getClass();
        hashMap.put("spId", i);
        String a = this.b.k().a();
        a.getClass();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, a);
        hashMap.put("instanceType", Integer.valueOf(this.b.t()));
        String k = this.b.o().k();
        T0 t0 = this.a;
        k.getClass();
        String e2 = t0.e(k);
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("dynamicDemandSource", e2);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.b.w()));
        if (!TextUtils.isEmpty(this.b.v().getCustomNetwork())) {
            String customNetwork = this.b.v().getCustomNetwork();
            customNetwork.getClass();
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return hashMap;
    }
}
