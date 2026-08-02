package defpackage;

import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.sofascore.model.firebase.AdType;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w09 extends AdManagerInterstitialAdLoadCallback {
    public final String a;
    public final wcd b;
    public final String c;
    public final Integer d;
    public final AdType.Interstitial e;
    public final d4a f;

    public w09(String str, wcd wcdVar, String str2, Integer num, AdType.Interstitial interstitial, x09 x09Var) {
        str.getClass();
        interstitial.getClass();
        this.a = str;
        this.b = wcdVar;
        this.c = str2;
        this.d = num;
        this.e = interstitial;
        this.f = new d4a(x09Var);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        loadAdError.getClass();
        ia0 ia0Var = ia0.q;
        Context applicationContext = ok3.p().getApplicationContext();
        applicationContext.getClass();
        ru ruVar = ru.GOOGLE;
        int code = loadAdError.getCode();
        String message = loadAdError.getMessage();
        message.getClass();
        nv.j(applicationContext, this.c, this.e, ruVar, this.a, code, message, qu.LOAD, null, null, 768);
        d4a d4aVar = this.f;
        Function1 function1 = (Function1) d4aVar.b;
        d4aVar.b = null;
        Function1 function12 = function1;
        if (function12 != null) {
            p2g p2gVar = w2g.b;
            String message2 = loadAdError.getMessage();
            loadAdError.getCode();
            this.a.getClass();
            function12.invoke(new w2g(new u2g(new wo0(message2))));
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        AdManagerInterstitialAd adManagerInterstitialAd2 = adManagerInterstitialAd;
        adManagerInterstitialAd2.getClass();
        ia0 ia0Var = ia0.q;
        Context applicationContext = ok3.p().getApplicationContext();
        applicationContext.getClass();
        nv.e(applicationContext, this.c, this.e, ru.GOOGLE, this.a, null, null, null, 224);
        d4a d4aVar = this.f;
        Function1 function1 = (Function1) d4aVar.b;
        d4aVar.b = null;
        Function1 function12 = function1;
        if (function12 != null) {
            p2g p2gVar = w2g.b;
            function12.invoke(new w2g(new a19(adManagerInterstitialAd2, this.b, this.c, this.d, this.e)));
        }
    }
}
