package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.پ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0490 extends AdListener implements InterfaceC0873 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0464 f1561;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0683 f1562;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AdListener f1563;

    public C0490(C0464 c0464, AdListener adListener, C0683 c0683) {
        this.f1561 = c0464;
        this.f1563 = adListener;
        this.f1562 = c0683;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f1561.m270(this, this.f1562, StringFog.decrypt("uDqLz19eFyecLOnJQmsWCpUxtMNI\n", "+V7Hpiwqckk=\n"), new Object[0]);
        AdListener adListener = this.f1563;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    public final void onAdFailedToLoad(int i) {
        this.f1561.m270(this, this.f1562, StringFog.decrypt("LoWy4W/6ZqgKk9Dncs9ngA6Iku142myKAICa\n", "b+H+iByOA8Y=\n"), Integer.valueOf(i));
        AdListener adListener = this.f1563;
        if (adListener != null) {
            adListener.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f1561.m270(this, this.f1562, StringFog.decrypt("Y0GVnFHKrgNHV/eaTP+vJE9Vq5BRzaICTA==\n", "IiXZ9SK+y20=\n"), new Object[0]);
        AdListener adListener = this.f1563;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final void onAdLeftApplication() {
        this.f1561.m270(this, this.f1562, StringFog.decrypt("fOPgmWS9KPtY9YKfeYgp2Vjh2LFnuSH8XubYmXin\n", "PYes8BfJTZU=\n"), new Object[0]);
        AdListener adListener = this.f1563;
        if (adListener != null) {
            adListener.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f1561.m270(this, this.f1562, StringFog.decrypt("XeaZT4MaYCp58PtJni9hCHPjsUOU\n", "HILVJvBuBUQ=\n"), new Object[0]);
        AdListener adListener = this.f1563;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f1561.m270(this, this.f1562, StringFog.decrypt("1LVFfGl9j4bwoyd6dEiOp+W0Z3B+\n", "ldEJFRoJ6ug=\n"), new Object[0]);
        AdListener adListener = this.f1563;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdSwipeGestureClicked() {
        this.f1561.m270(this, this.f1562, StringFog.decrypt("1NBNxDUoYMnwxi/CKB1h9OLdccgBOXbT4MZk7io1Zszw0A==\n", "lbQBrUZcBac=\n"), new Object[0]);
        AdListener adListener = this.f1563;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this.f1563;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f1561.m270(this, this.f1562, StringFog.decrypt("MtX+K5YKczwWw5wtiz9yFBLY3ieBKnkeHNDWFYwKfhMX9MAwigw=\n", "c7GyQuV+FlI=\n"), loadAdError);
        AdListener adListener = this.f1563;
        if (adListener != null) {
            adListener.onAdFailedToLoad(loadAdError);
        }
    }
}
