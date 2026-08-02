package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.D8;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;

/* loaded from: classes13.dex */
public final class IronSourceNativeAdData extends AdapterNativeAdData {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final NativeAdDataInterface.Image icon;
    private final String title;

    public IronSourceNativeAdData(D8 d8) {
        this.title = d8.n();
        this.advertiser = d8.h();
        this.body = d8.i();
        this.callToAction = d8.j();
        this.icon = new NativeAdDataInterface.Image(d8.k(), null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        return this.title;
    }
}
