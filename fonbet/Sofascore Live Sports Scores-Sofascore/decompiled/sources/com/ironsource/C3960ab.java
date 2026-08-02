package com.ironsource;

import android.app.Activity;
import com.ironsource.Va;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3960ab {

    @NotNull
    private final F7 a;

    @NotNull
    private final Va b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ab$a */
    public static final class a implements InterfaceC4404y0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4404y0
        @NotNull
        public AbstractC4386x0 a(boolean z, @NotNull C4100h0 c4100h0) {
            c4100h0.getClass();
            return B9.z.a(c4100h0, C3960ab.this.a.f().a(), z);
        }
    }

    public C3960ab(@NotNull String str, @NotNull Va.b bVar, @NotNull C4243p0 c4243p0, @NotNull C4016c6 c4016c6, @NotNull F7 f7, @NotNull InterfaceC4193m4 interfaceC4193m4, @NotNull C4303s7 c4303s7, @NotNull X0 x0) {
        str.getClass();
        bVar.getClass();
        c4243p0.getClass();
        c4016c6.getClass();
        f7.getClass();
        interfaceC4193m4.getClass();
        c4303s7.getClass();
        x0.getClass();
        this.a = f7;
        this.b = new Va(LevelPlay.AdFormat.INTERSTITIAL, str, bVar, c4243p0, c4016c6, x0, a(), f7, interfaceC4193m4, c4303s7);
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.b.a(activity, str);
    }

    @NotNull
    public final String b() {
        String uuid = this.b.e().toString();
        uuid.getClass();
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

    public final void a(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.b.a(levelPlayInterstitialAdListener != null ? C4003bb.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(@Nullable LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setImpressionDataListener()");
        this.b.a(levelPlayImpressionDataListener);
    }

    private final InterfaceC4404y0 a() {
        return new a();
    }
}
