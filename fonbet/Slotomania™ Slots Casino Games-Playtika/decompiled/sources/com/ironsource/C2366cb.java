package com.ironsource;

import android.app.Activity;
import com.ironsource.Xa;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2366cb {
    private final H7 a;
    private final Xa b;

    /* renamed from: com.ironsource.cb$a */
    public static final class a implements InterfaceC2749y0 {
        a() {
        }

        @Override // com.ironsource.InterfaceC2749y0
        public AbstractC2731x0 a(boolean z, C2445h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return B9.z.a(adProperties, C2366cb.this.a.f().a(), z);
        }
    }

    public C2366cb(String adUnitId, Xa.b config, C2588p0 adTools, C2379d6 adControllerFactory, H7 provider, InterfaceC2592p4 currentTimeProvider, C2702v7 idFactory, Z0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.a = provider;
        this.b = new Xa(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(), provider, currentTimeProvider, idFactory);
    }

    public final String b() {
        String uuid = this.b.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.b.n();
    }

    public final void a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.b.a(levelPlayInterstitialAdListener != null ? C2384db.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.b.a(activity, str);
    }

    private final InterfaceC2749y0 a() {
        return new a();
    }
}
