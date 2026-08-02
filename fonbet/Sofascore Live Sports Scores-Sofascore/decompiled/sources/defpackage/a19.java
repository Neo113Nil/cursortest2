package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.adsbynimbus.google.DynamicPriceRenderer;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a19 implements zrh {
    public final AdManagerInterstitialAd a;
    public final wcd b;
    public final String c;
    public final AdType.Interstitial d;
    public final long e;
    public final String f;
    public final ResponseInfo g;

    public a19(AdManagerInterstitialAd adManagerInterstitialAd, wcd wcdVar, String str, Integer num, AdType.Interstitial interstitial) {
        interstitial.getClass();
        this.a = adManagerInterstitialAd;
        this.b = wcdVar;
        this.c = str;
        this.d = interstitial;
        this.e = System.currentTimeMillis() + ((num != null ? num.intValue() : 1800) * 1000);
        ru ruVar = ru.GOOGLE;
        String adUnitId = adManagerInterstitialAd.getAdUnitId();
        adUnitId.getClass();
        this.f = adUnitId;
        ResponseInfo responseInfo = adManagerInterstitialAd.getResponseInfo();
        responseInfo.getClass();
        this.g = responseInfo;
    }

    @Override // defpackage.zrh
    public final boolean a() {
        return System.currentTimeMillis() < this.e;
    }

    @Override // defpackage.zrh
    public final String b() {
        return this.c;
    }

    @Override // defpackage.zrh
    public final boolean c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return DynamicPriceRenderer.handleEventForNimbus(this.a, str, str2);
    }

    @Override // defpackage.zrh
    public final wcd d() {
        return this.b;
    }

    @Override // defpackage.zrh
    public final ResponseInfo e() {
        return this.g;
    }

    @Override // defpackage.zrh
    public final void f(FragmentActivity fragmentActivity) {
        nv.g(fragmentActivity, this.c, this.d, ru.GOOGLE, this.f);
        this.a.show(fragmentActivity);
    }

    @Override // defpackage.zrh
    public final void g(f9a f9aVar) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.a;
        adManagerInterstitialAd.setFullScreenContentCallback(f9aVar);
        adManagerInterstitialAd.setOnPaidEventListener(f9aVar);
        adManagerInterstitialAd.setAppEventListener(f9aVar);
    }

    @Override // defpackage.zrh
    public final AdType.Interstitial getAdType() {
        return this.d;
    }

    @Override // defpackage.zrh
    public final String getPosition() {
        return this.f;
    }

    @Override // defpackage.zrh
    public final ru getProvider() {
        return ru.GOOGLE;
    }

    @Override // defpackage.zrh
    public final void release() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.a;
        adManagerInterstitialAd.setFullScreenContentCallback(null);
        adManagerInterstitialAd.setOnPaidEventListener(null);
        adManagerInterstitialAd.setAppEventListener(null);
    }
}
