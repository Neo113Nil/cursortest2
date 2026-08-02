package com.adsbynimbus.google;

import android.app.Activity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import defpackage.fhh;
import defpackage.hcd;
import defpackage.ky1;
import defpackage.qyf;
import defpackage.rik;
import defpackage.xka;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "activity", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DynamicPriceRenderer$handleEventForNimbus$2$1$1$onAdShowedFullScreenContent$1 extends xka implements Function1<Activity, Unit> {
    public final /* synthetic */ hcd i;
    public final /* synthetic */ InterstitialAd j;
    public final /* synthetic */ RenderEvent k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lhcd;TT;Lcom/adsbynimbus/google/RenderEvent;)V */
    public DynamicPriceRenderer$handleEventForNimbus$2$1$1$onAdShowedFullScreenContent$1(hcd hcdVar, InterstitialAd interstitialAd, RenderEvent renderEvent) {
        super(1);
        this.i = hcdVar;
        this.j = interstitialAd;
        this.k = renderEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Activity activity) {
        Activity activity2;
        String asErrorMessage;
        activity.getClass();
        ky1 ky1Var = null;
        InterstitialAd interstitialAd = this.j;
        hcd hcdVar = this.i;
        if (hcdVar != null) {
            fhh fhhVar = qyf.a;
            ky1 u = rik.u(activity, hcdVar);
            if (u != null) {
                activity2 = activity;
                u.d.add(new AdManagerControllerListener(this.k, activity2, interstitialAd.getFullScreenContentCallback(), null, 8, null));
                ky1Var = u;
                if (ky1Var == null) {
                    ky1Var.l();
                    return;
                }
                DynamicPriceRenderer.destroy(activity2);
                FullScreenContentCallback fullScreenContentCallback = interstitialAd.getFullScreenContentCallback();
                if (fullScreenContentCallback != null) {
                    asErrorMessage = DynamicPriceRenderer.getAsErrorMessage("Controller was null");
                    fullScreenContentCallback.onAdFailedToShowFullScreenContent(new AdError(-6, asErrorMessage, "Adsbynimbus"));
                    return;
                }
                return;
            }
        }
        activity2 = activity;
        if (ky1Var == null) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Activity) obj);
        return Unit.a;
    }
}
