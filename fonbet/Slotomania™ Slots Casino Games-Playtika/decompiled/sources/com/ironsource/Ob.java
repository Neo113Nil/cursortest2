package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;

/* loaded from: classes3.dex */
public final class Ob {
    private AdapterNativeAdViewBinder a;
    private AdapterNativeAdData b;

    public final void a(AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.a = adapterNativeAdViewBinder;
    }

    public final AdapterNativeAdViewBinder b() {
        return this.a;
    }

    public final AdapterNativeAdData a() {
        return this.b;
    }

    public final void a(AdapterNativeAdData adapterNativeAdData) {
        this.b = adapterNativeAdData;
    }
}
