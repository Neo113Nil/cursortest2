package com.ironsource;

import android.app.Activity;
import com.ironsource.Ya;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4280db {
    private final I7 a;
    private final Ya b;

    /* renamed from: com.ironsource.db$a */
    public static final class a implements InterfaceC4645y0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4645y0
        public AbstractC4627x0 a(boolean z, C4341h0 c4341h0) {
            return C9.z.a(c4341h0, C4280db.this.a.f().a(), z);
        }
    }

    public C4280db(String str, Ya.b bVar, C4484p0 c4484p0, C4311f6 c4311f6, I7 i7, InterfaceC4488p4 interfaceC4488p4, C4616w7 c4616w7, Z0 z0) {
        this.a = i7;
        this.b = new Ya(LevelPlay.AdFormat.INTERSTITIAL, str, bVar, c4484p0, c4311f6, z0, a(), i7, interfaceC4488p4, c4616w7);
    }

    public final String b() {
        return this.b.e().toString();
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
        this.b.a(levelPlayInterstitialAdListener != null ? C4298eb.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(Activity activity, String str) {
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.b.a(activity, str);
    }

    private final InterfaceC4645y0 a() {
        return new a();
    }
}
