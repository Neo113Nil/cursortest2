package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.A8;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class IronSourceNativeAdData extends AdapterNativeAdData {

    @Nullable
    private final String advertiser;

    @Nullable
    private final String body;

    @Nullable
    private final String callToAction;

    @Nullable
    private final NativeAdDataInterface.Image icon;

    @Nullable
    private final String title;

    public IronSourceNativeAdData(@NotNull A8 a8) {
        a8.getClass();
        this.title = a8.n();
        this.advertiser = a8.h();
        this.body = a8.i();
        this.callToAction = a8.j();
        this.icon = new NativeAdDataInterface.Image(a8.k(), null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        return this.title;
    }
}
