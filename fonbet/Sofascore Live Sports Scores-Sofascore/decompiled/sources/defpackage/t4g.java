package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.sofascore.model.firebase.AdType;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t4g extends m4g {
    public final /* synthetic */ ksh a;
    public final /* synthetic */ u4g b;
    public final /* synthetic */ AdType.RewardedInterstitial c;
    public final /* synthetic */ Function1 d;

    public t4g(ksh kshVar, u4g u4gVar, AdType.RewardedInterstitial rewardedInterstitial, Function1 function1) {
        this.a = kshVar;
        this.b = u4gVar;
        this.c = rewardedInterstitial;
        this.d = function1;
    }

    public final void a(c19 c19Var) {
        this.d.invoke(c19Var);
        Application application = this.b.b;
        application.getClass();
        g19 g19Var = (g19) this.a;
        String str = g19Var.c;
        g19Var.getClass();
        ru ruVar = ru.GOOGLE;
        nv.b(application, str, this.c, g19Var.e);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        Application application = this.b.b;
        application.getClass();
        g19 g19Var = (g19) this.a;
        String str = g19Var.c;
        g19Var.getClass();
        nv.i(application, str, this.c, ru.GOOGLE, g19Var.e, null, null, 96);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        u4g u4gVar = this.b;
        r4a.M(u4gVar.i);
        g19 g19Var = (g19) this.a;
        RewardedAd rewardedAd = g19Var.a;
        rewardedAd.setFullScreenContentCallback(null);
        rewardedAd.setOnPaidEventListener(null);
        g19Var.f = null;
        AdType.RewardedInterstitial rewardedInterstitial = this.c;
        u4gVar.l(rewardedInterstitial).j(null);
        Application application = u4gVar.b;
        application.getClass();
        String str = g19Var.c;
        g19Var.getClass();
        nv.c(application, str, rewardedInterstitial, ru.GOOGLE, g19Var.e);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        adError.getClass();
        u4g u4gVar = this.b;
        Application application = u4gVar.b;
        application.getClass();
        g19 g19Var = (g19) this.a;
        String str = g19Var.c;
        g19Var.getClass();
        ru ruVar = ru.GOOGLE;
        String str2 = g19Var.e;
        int code = adError.getCode();
        String message = adError.getMessage();
        message.getClass();
        nv.j(application, str, this.c, ruVar, str2, code, message, qu.SHOW, null, null, 768);
        RewardedAd rewardedAd = g19Var.a;
        rewardedAd.setFullScreenContentCallback(null);
        rewardedAd.setOnPaidEventListener(null);
        g19Var.f = null;
        u4gVar.l(this.c).j(null);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        ResponseInfo responseInfo;
        Bundle responseExtras;
        String string;
        ksh kshVar = this.a;
        Long l = null;
        g19 g19Var = kshVar instanceof g19 ? (g19) kshVar : null;
        if (g19Var != null && (responseInfo = g19Var.a.getResponseInfo()) != null && (responseExtras = responseInfo.getResponseExtras()) != null && (string = responseExtras.getString("line_item_id")) != null) {
            l = StringsKt.k0(string);
        }
        Application application = this.b.b;
        application.getClass();
        g19 g19Var2 = (g19) kshVar;
        String str = g19Var2.c;
        g19Var2.getClass();
        nv.l(application, str, this.c, ru.GOOGLE, g19Var2.e, null, l, 128);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        str.getClass();
        str2.getClass();
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        adValue.getClass();
        Application application = this.b.b;
        application.getClass();
        g19 g19Var = (g19) this.a;
        String str = g19Var.c;
        g19Var.getClass();
        nv.m(application, str, this.c, ru.GOOGLE, g19Var.e, adValue, null);
    }
}
