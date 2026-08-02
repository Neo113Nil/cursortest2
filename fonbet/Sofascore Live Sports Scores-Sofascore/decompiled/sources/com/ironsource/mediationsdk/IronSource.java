package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.L6;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class IronSource {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes4.dex */
    public enum a {
        REWARDED_VIDEO(L6.H0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");

        private String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return p.g().a(activity, iSBannerSize);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        p.g().e(str);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String a2;
        synchronized (IronSource.class) {
            a2 = p.g().a(context);
        }
        return a2;
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return p.g().d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return p.g().h(str);
    }

    public static void loadISDemandOnlyBanner(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        p.g().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyInterstitial(@NotNull Activity activity, String str) {
        p.g().a(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideo(@NotNull Activity activity, String str) {
        p.g().b(activity, str);
    }

    public static void setAdRevenueData(@NotNull String str, @NotNull JSONObject jSONObject) {
        p.g().a(str, jSONObject);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        p.g().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        p.g().a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setMediationType(String str) {
        p.g().f(str);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        p.g().c(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        p.g().a(str);
    }
}
