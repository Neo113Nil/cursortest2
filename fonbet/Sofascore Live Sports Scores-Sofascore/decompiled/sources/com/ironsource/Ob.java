package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ob {

    @Nullable
    private AdapterNativeAdViewBinder a;

    @Nullable
    private AdapterNativeAdData b;

    public final void a(@Nullable AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.a = adapterNativeAdViewBinder;
    }

    @Nullable
    public final AdapterNativeAdViewBinder b() {
        return this.a;
    }

    @Nullable
    public final AdapterNativeAdData a() {
        return this.b;
    }

    public final void a(@Nullable AdapterNativeAdData adapterNativeAdData) {
        this.b = adapterNativeAdData;
    }
}
