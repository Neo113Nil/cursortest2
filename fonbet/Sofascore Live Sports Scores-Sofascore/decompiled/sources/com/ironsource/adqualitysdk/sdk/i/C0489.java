package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0489 extends AppOpenAd.AppOpenAdLoadCallback implements InterfaceC0873 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0464 f1558;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0683 f1559;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AppOpenAd.AppOpenAdLoadCallback f1560;

    public C0489(C0464 c0464, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, C0683 c0683) {
        this.f1558 = c0464;
        this.f1560 = appOpenAdLoadCallback;
        this.f1559 = c0683;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f1558.m270(this, this.f1559, StringFog.decrypt("1oxNJwmNTTLzsFIJHatCH/ueXAsSxkwd1ph7CRCERhfDk3EHGIw=\n", "l/w9aHnoI3M=\n"), loadAdError);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1560;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(loadAdError);
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        AppOpenAd appOpenAd2 = appOpenAd;
        this.f1558.m270(this, this.f1559, StringFog.decrypt("3Irwuzm1uSn5tu+VLZO2BPGY4Zci/rgG3J7Mmyi0sgw=\n", "nfqA9EnQ12g=\n"), appOpenAd2);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1560;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(appOpenAd2);
        }
    }

    public final void onAppOpenAdFailedToLoad(int i) {
        this.f1558.m270(this, this.f1559, StringFog.decrypt("rrdGxILH3i6Li1nqluHRA4OlV+iZjN8BrrdGxILH3i6LgVfinsfUO4CLWeqW\n", "78c2i/KisG8=\n"), Integer.valueOf(i));
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1560;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }

    public final void onAppOpenAdLoaded(AppOpenAd appOpenAd) {
        this.f1558.m270(this, this.f1559, StringFog.decrypt("UMmhtM7TQ7Z19b6a2vVMm33bsJjVmEKZUMmhtM7TQ7Z19b6a2tNJ\n", "EbnR+762Lfc=\n"), appOpenAd);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1560;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(appOpenAd);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this.f1560;
    }

    public final void onAppOpenAdFailedToLoad(LoadAdError loadAdError) {
        this.f1558.m270(this, this.f1559, StringFog.decrypt("wFB5cjzE9xTlbGZcKOL4Oe1CaF4nj/Y7wFB5cjzE9xTlZmhUIMT9Ae5sZlwo9vAh6WV7TyPT\n", "gSAJPUyhmVU=\n"), loadAdError);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1560;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(loadAdError);
        }
    }
}
