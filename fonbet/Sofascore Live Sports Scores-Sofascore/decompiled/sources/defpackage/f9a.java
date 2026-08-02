package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.adsbynimbus.google.DynamicPriceWinLossKt;
import com.adsbynimbus.google.GoogleAuctionData;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.ResponseInfo;
import com.sofascore.model.firebase.AdType;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f9a extends y8a {
    public final /* synthetic */ GoogleAuctionData a;
    public final /* synthetic */ zrh b;
    public final /* synthetic */ g9a c;
    public final /* synthetic */ jcd d;
    public final /* synthetic */ Function0 e;

    public f9a(GoogleAuctionData googleAuctionData, zrh zrhVar, g9a g9aVar, jcd jcdVar, Function0 function0) {
        this.a = googleAuctionData;
        this.b = zrhVar;
        this.c = g9aVar;
        this.d = jcdVar;
        this.e = function0;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        Application application = this.c.b;
        application.getClass();
        zrh zrhVar = this.b;
        nv.i(application, zrhVar.b(), zrhVar.getAdType(), zrhVar.getProvider(), zrhVar.getPosition(), null, null, 96);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        zrh zrhVar = this.b;
        zrhVar.release();
        AdType.Interstitial adType = zrhVar.getAdType();
        g9a g9aVar = this.c;
        g9aVar.k(adType).j(null);
        Function0 function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
        Application application = g9aVar.b;
        application.getClass();
        nv.c(application, zrhVar.b(), zrhVar.getAdType(), zrhVar.getProvider(), zrhVar.getPosition());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        GoogleAuctionData googleAuctionData;
        adError.getClass();
        g9a g9aVar = this.c;
        Application application = g9aVar.b;
        application.getClass();
        zrh zrhVar = this.b;
        String b = zrhVar.b();
        AdType.Interstitial adType = zrhVar.getAdType();
        ru provider = zrhVar.getProvider();
        String position = zrhVar.getPosition();
        int code = adError.getCode();
        String message = adError.getMessage();
        message.getClass();
        nv.j(application, b, adType, provider, position, code, message, qu.SHOW, null, null, 768);
        if (ph0.s(adError.getCode(), new int[]{3, 9}) && (googleAuctionData = this.a) != null) {
            DynamicPriceWinLossKt.notifyNoFill(this.d, googleAuctionData);
        }
        LinkedHashMap linkedHashMap = nk.a;
        AdType.Interstitial adType2 = zrhVar.getAdType();
        adType2.getClass();
        nk.a.remove(adType2);
        zrhVar.release();
        g9aVar.k(zrhVar.getAdType()).j(null);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        Bundle responseExtras;
        String string;
        zrh zrhVar = this.b;
        GoogleAuctionData googleAuctionData = this.a;
        if (googleAuctionData != null) {
            DynamicPriceWinLossKt.notifyImpression(this.d, googleAuctionData, zrhVar.e());
        }
        ResponseInfo e = zrhVar.e();
        Long k0 = (e == null || (responseExtras = e.getResponseExtras()) == null || (string = responseExtras.getString("line_item_id")) == null) ? null : StringsKt.k0(string);
        Application application = this.c.b;
        application.getClass();
        nv.l(application, zrhVar.b(), zrhVar.getAdType(), zrhVar.getProvider(), zrhVar.getPosition(), null, k0, 128);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        LinkedHashMap linkedHashMap = nk.a;
        AdType.Interstitial adType = this.b.getAdType();
        adType.getClass();
        nk.a.remove(adType);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        GoogleAuctionData googleAuctionData;
        str.getClass();
        str2.getClass();
        if (!this.b.c(str, str2) || (googleAuctionData = this.a) == null) {
            return;
        }
        googleAuctionData.setNimbusWin(true);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        adValue.getClass();
        Application application = this.c.b;
        application.getClass();
        zrh zrhVar = this.b;
        nv.m(application, zrhVar.b(), zrhVar.getAdType(), zrhVar.getProvider(), zrhVar.getPosition(), adValue, null);
        GoogleAuctionData googleAuctionData = this.a;
        if (googleAuctionData != null) {
            googleAuctionData.onPaidEvent(adValue);
        }
    }
}
