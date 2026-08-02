package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.adsbynimbus.google.DynamicPriceWinLossKt;
import com.adsbynimbus.google.GoogleAuctionData;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.sofascore.model.firebase.AdType;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l11 extends AdListener {
    public final /* synthetic */ AdManagerAdView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ u11 c;
    public final /* synthetic */ AdType.Banner d;
    public final /* synthetic */ GoogleAuctionData e;

    public l11(AdManagerAdView adManagerAdView, int i, u11 u11Var, AdType.Banner banner, GoogleAuctionData googleAuctionData) {
        this.a = adManagerAdView;
        this.b = i;
        this.c = u11Var;
        this.d = banner;
        this.e = googleAuctionData;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        u11 u11Var = this.c;
        kf kfVar = u11Var.o;
        if (kfVar != null) {
            kfVar.invoke();
        }
        u11Var.e.l(null);
        FragmentActivity fragmentActivity = u11Var.b;
        String str = u11Var.C;
        ru ruVar = ru.GOOGLE;
        String adUnitId = this.a.getAdUnitId();
        adUnitId.getClass();
        nv.i(fragmentActivity, str, this.d, ruVar, adUnitId, null, null, 96);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        GoogleAuctionData googleAuctionData;
        loadAdError.getClass();
        ru ruVar = ru.GOOGLE;
        u11 u11Var = this.c;
        u11Var.w = ruVar;
        AdManagerAdView adManagerAdView = this.a;
        u11Var.x = adManagerAdView.getAdUnitId();
        FragmentActivity fragmentActivity = u11Var.b;
        String str = u11Var.B;
        String adUnitId = adManagerAdView.getAdUnitId();
        adUnitId.getClass();
        int code = loadAdError.getCode();
        String message = loadAdError.getMessage();
        message.getClass();
        nv.j(fragmentActivity, str, this.d, ruVar, adUnitId, code, message, qu.LOAD, null, null, 768);
        u11Var.i(true);
        if (!ph0.s(loadAdError.getCode(), new int[]{3, 9}) || (googleAuctionData = this.e) == null) {
            return;
        }
        DynamicPriceWinLossKt.notifyNoFill((jcd) u11Var.f.getValue(), googleAuctionData);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        ResponseInfo responseInfo;
        Bundle responseExtras;
        String string;
        u11 u11Var = this.c;
        AdManagerAdView adManagerAdView = this.a;
        u11Var.o(adManagerAdView);
        AdManagerAdView adManagerAdView2 = u11Var.l;
        Long k0 = (adManagerAdView2 == null || (responseInfo = adManagerAdView2.getResponseInfo()) == null || (responseExtras = responseInfo.getResponseExtras()) == null || (string = responseExtras.getString("line_item_id")) == null) ? null : StringsKt.k0(string);
        FragmentActivity fragmentActivity = u11Var.b;
        String str = u11Var.C;
        ru ruVar = ru.GOOGLE;
        String adUnitId = adManagerAdView.getAdUnitId();
        adUnitId.getClass();
        nv.l(fragmentActivity, str, this.d, ruVar, adUnitId, null, k0, 128);
        u11Var.D = u11Var.C;
        GoogleAuctionData googleAuctionData = this.e;
        if (googleAuctionData != null) {
            DynamicPriceWinLossKt.notifyImpression((jcd) u11Var.f.getValue(), googleAuctionData, adManagerAdView.getResponseInfo());
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        Bundle responseExtras;
        AdManagerAdView adManagerAdView = this.a;
        AdSize adSize = adManagerAdView.getAdSize();
        int height = adSize != null ? adSize.getHeight() : 0;
        int i = this.b;
        u11 u11Var = this.c;
        if (height > i) {
            String str = u11Var.B;
            ru ruVar = ru.GOOGLE;
            String adUnitId = adManagerAdView.getAdUnitId();
            adUnitId.getClass();
            ResponseInfo responseInfo = adManagerAdView.getResponseInfo();
            nv.j(u11Var.b, str, this.d, ruVar, adUnitId, -2, "oversized creative h=" + height + "dp line_item=" + ((responseInfo == null || (responseExtras = responseInfo.getResponseExtras()) == null) ? null : responseExtras.getString("line_item_id")), qu.LOAD, null, null, 768);
            u11Var.i(true);
            return;
        }
        u11Var.n(adManagerAdView);
        u11Var.a();
        ru ruVar2 = ru.GOOGLE;
        u11Var.w = ruVar2;
        u11Var.x = adManagerAdView.getAdUnitId();
        FragmentActivity fragmentActivity = u11Var.b;
        String str2 = u11Var.B;
        String adUnitId2 = adManagerAdView.getAdUnitId();
        adUnitId2.getClass();
        nv.e(fragmentActivity, str2, this.d, ruVar2, adUnitId2, null, null, null, 224);
        u11Var.C = u11Var.B;
        lf lfVar = u11Var.p;
        if (lfVar != null) {
            lfVar.invoke();
        }
    }
}
