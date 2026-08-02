package com.ironsource;

import android.app.Activity;
import com.ironsource.Ya;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4495pb {
    private final Ya a;

    /* renamed from: com.ironsource.pb$a */
    public static final class a implements InterfaceC4645y0 {
        final /* synthetic */ I7 a;

        public a(I7 i7) {
            this.a = i7;
        }

        @Override // com.ironsource.InterfaceC4645y0
        public AbstractC4627x0 a(boolean z, C4341h0 c4341h0) {
            return C4265ce.z.a(c4341h0, this.a.f().a(), z);
        }
    }

    public C4495pb(String str, Ya.b bVar, C4484p0 c4484p0, C4311f6 c4311f6, I7 i7, InterfaceC4488p4 interfaceC4488p4, C4616w7 c4616w7, Z0 z0) {
        this.a = new Ya(LevelPlay.AdFormat.REWARDED, str, bVar, c4484p0, c4311f6, z0, a(i7), i7, interfaceC4488p4, c4616w7);
    }

    public final String a() {
        return this.a.e().toString();
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.a.n();
    }

    public final void a(Activity activity, String str) {
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.a.a(activity, str);
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.a.a(levelPlayRewardedAdListener != null ? C4513qb.b(levelPlayRewardedAdListener) : null);
    }

    public final LevelPlayReward a(String str) {
        IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.a.a(str);
    }

    private final a a(I7 i7) {
        return new a(i7);
    }
}
