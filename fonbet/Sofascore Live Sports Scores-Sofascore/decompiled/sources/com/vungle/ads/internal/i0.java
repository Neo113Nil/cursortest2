package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i0 extends BaseAd {
    public final VungleAdSize s;
    public final j0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, String str, VungleAdSize vungleAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        context.getClass();
        str.getClass();
        vungleAdSize.getClass();
        adConfig.getClass();
        this.s = vungleAdSize;
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        adInternal$vungle_ads_release.getClass();
        this.t = ((k0) adInternal$vungle_ads_release).a(new h0(this));
    }

    public final j0 a() {
        return this.t;
    }

    @Override // com.vungle.ads.BaseAd
    public final s constructAdInternal$vungle_ads_release(Context context) {
        context.getClass();
        return new k0(context, this.s);
    }

    public final VungleAdSize getAdViewSize() {
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        adInternal$vungle_ads_release.getClass();
        VungleAdSize m = ((k0) adInternal$vungle_ads_release).m();
        return m == null ? this.s : m;
    }
}
