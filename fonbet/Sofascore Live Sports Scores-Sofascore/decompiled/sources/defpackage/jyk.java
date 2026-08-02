package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleMediationLogger;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jyk implements nyk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public jyk(lyk lykVar, Context context, String str, VungleAdSize vungleAdSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        this.a = 1;
        this.f = lykVar;
        this.b = context;
        this.c = str;
        this.d = vungleAdSize;
        this.e = mediationBannerAdConfiguration;
    }

    @Override // defpackage.nyk
    public final void a(AdError adError) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                adError.getClass();
                adError.toString();
                ((kyk) obj).a.onFailure(adError);
                break;
            case 1:
                adError.toString();
                ((lyk) this.f).a.onFailure(adError);
                break;
            default:
                adError.getClass();
                adError.toString();
                ((pyk) obj).a.onFailure(adError);
                break;
        }
    }

    @Override // defpackage.nyk
    public final void b() {
        int i = this.a;
        String str = this.c;
        Context context = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = (MediationAppOpenAdConfiguration) obj3;
                kyk kykVar = (kyk) obj2;
                myk mykVar = kykVar.b;
                mykVar.getClass();
                AdConfig adConfig = new AdConfig();
                Bundle bundle = (Bundle) obj;
                if (bundle.containsKey("adOrientation")) {
                    adConfig.setAdOrientation(bundle.getInt("adOrientation", 2));
                }
                if (bundle.containsKey("back_button_immediately_enabled")) {
                    adConfig.setBackButtonImmediatelyEnabled(bundle.getBoolean("back_button_immediately_enabled", false));
                }
                kykVar.b(adConfig, mediationAppOpenAdConfiguration);
                str.getClass();
                mykVar.getClass();
                context.getClass();
                InterstitialAd interstitialAd = new InterstitialAd(context, str, adConfig);
                kykVar.c = interstitialAd;
                interstitialAd.setAdListener(kykVar);
                InterstitialAd interstitialAd2 = kykVar.c;
                if (interstitialAd2 == null) {
                    Intrinsics.i("appOpenAd");
                    throw null;
                }
                interstitialAd2.setAdapterAdFormat("VungleAppOpenAd");
                InterstitialAd interstitialAd3 = kykVar.c;
                if (interstitialAd3 != null) {
                    interstitialAd3.load(kykVar.a(mediationAppOpenAdConfiguration));
                    return;
                } else {
                    Intrinsics.i("appOpenAd");
                    throw null;
                }
            case 1:
                lyk lykVar = (lyk) obj3;
                VungleAdSize vungleAdSize = (VungleAdSize) obj2;
                MediationBannerAdConfiguration mediationBannerAdConfiguration = (MediationBannerAdConfiguration) obj;
                lykVar.d.getClass();
                context.getClass();
                str.getClass();
                vungleAdSize.getClass();
                VungleBannerView vungleBannerView = new VungleBannerView(context, str, vungleAdSize);
                lykVar.c = vungleBannerView;
                vungleBannerView.setAdListener(lykVar);
                lykVar.c.setAdapterAdFormat("VungleBannerAd");
                AdSize adSize = mediationBannerAdConfiguration.getAdSize();
                VungleBannerView vungleBannerView2 = lykVar.c;
                vungleBannerView2.getClass();
                adSize.getClass();
                if (!VungleAds.INSTANCE.isInline(str)) {
                    int width = adSize.getWidth();
                    AdSize adSize2 = AdSize.BANNER;
                    if (width != adSize2.getWidth() || adSize.getHeight() != adSize2.getHeight()) {
                        int width2 = adSize.getWidth();
                        AdSize adSize3 = AdSize.MEDIUM_RECTANGLE;
                        if (width2 != adSize3.getWidth() || adSize.getHeight() != adSize3.getHeight()) {
                            int width3 = adSize.getWidth();
                            AdSize adSize4 = AdSize.LEADERBOARD;
                            if (width3 != adSize4.getWidth() || adSize.getHeight() != adSize4.getHeight()) {
                                vungleBannerView2.setAdapterAdFormat("VungleBannerAd-custom");
                                VungleMediationLogger.logError(vungleBannerView2, "CustomBannerSizeMismatch:w-" + adSize.getWidth() + "|h-" + adSize.getHeight());
                                adSize.toString();
                            }
                        }
                    }
                }
                lykVar.a(lykVar.c, mediationBannerAdConfiguration);
                return;
            default:
                MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = (MediationInterstitialAdConfiguration) obj3;
                pyk pykVar = (pyk) obj2;
                myk mykVar2 = pykVar.b;
                mykVar2.getClass();
                AdConfig adConfig2 = new AdConfig();
                Bundle bundle2 = (Bundle) obj;
                if (bundle2.containsKey("adOrientation")) {
                    adConfig2.setAdOrientation(bundle2.getInt("adOrientation", 2));
                }
                pykVar.b(adConfig2, mediationInterstitialAdConfiguration);
                mykVar2.getClass();
                context.getClass();
                str.getClass();
                InterstitialAd interstitialAd4 = new InterstitialAd(context, str, adConfig2);
                pykVar.c = interstitialAd4;
                interstitialAd4.setAdListener(pykVar);
                InterstitialAd interstitialAd5 = pykVar.c;
                if (interstitialAd5 == null) {
                    Intrinsics.i("interstitialAd");
                    throw null;
                }
                interstitialAd5.setAdapterAdFormat("VungleInterstitialAd");
                String a = pykVar.a(mediationInterstitialAdConfiguration);
                InterstitialAd interstitialAd6 = pykVar.c;
                if (a != null) {
                    if (interstitialAd6 != null) {
                        interstitialAd6.load(a);
                        return;
                    } else {
                        Intrinsics.i("interstitialAd");
                        throw null;
                    }
                }
                if (interstitialAd6 != null) {
                    interstitialAd6.load();
                    return;
                } else {
                    Intrinsics.i("interstitialAd");
                    throw null;
                }
        }
    }

    public /* synthetic */ jyk(InterstitialAdListener interstitialAdListener, Bundle bundle, MediationAdConfiguration mediationAdConfiguration, Context context, String str, int i) {
        this.a = i;
        this.d = interstitialAdListener;
        this.e = bundle;
        this.f = mediationAdConfiguration;
        this.b = context;
        this.c = str;
    }
}
