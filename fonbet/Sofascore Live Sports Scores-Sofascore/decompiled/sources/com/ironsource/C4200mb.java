package com.ironsource;

import android.app.Activity;
import com.ironsource.Va;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4200mb {

    @NotNull
    private final Va a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.mb$a */
    public static final class a implements InterfaceC4404y0 {
        final /* synthetic */ F7 a;

        public a(F7 f7) {
            this.a = f7;
        }

        @Override // com.ironsource.InterfaceC4404y0
        @NotNull
        public AbstractC4386x0 a(boolean z, @NotNull C4100h0 c4100h0) {
            c4100h0.getClass();
            return C4006be.z.a(c4100h0, this.a.f().a(), z);
        }
    }

    public C4200mb(@NotNull String str, @NotNull Va.b bVar, @NotNull C4243p0 c4243p0, @NotNull C4016c6 c4016c6, @NotNull F7 f7, @NotNull InterfaceC4193m4 interfaceC4193m4, @NotNull C4303s7 c4303s7, @NotNull X0 x0) {
        str.getClass();
        bVar.getClass();
        c4243p0.getClass();
        c4016c6.getClass();
        f7.getClass();
        interfaceC4193m4.getClass();
        c4303s7.getClass();
        x0.getClass();
        this.a = new Va(LevelPlay.AdFormat.REWARDED, str, bVar, c4243p0, c4016c6, x0, a(f7), f7, interfaceC4193m4, c4303s7);
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.a.a(activity, str);
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.a.n();
    }

    @NotNull
    public final String a() {
        String uuid = this.a.e().toString();
        uuid.getClass();
        return uuid;
    }

    public final void a(@Nullable LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.a.a(levelPlayRewardedAdListener != null ? C4218nb.b(levelPlayRewardedAdListener) : null);
    }

    public final void a(@Nullable LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.API.info("LevelPlayRewardedAd.setImpressionDataListener()");
        this.a.a(levelPlayImpressionDataListener);
    }

    @NotNull
    public final LevelPlayReward a(@Nullable String str) {
        IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.a.a(str);
    }

    private final a a(F7 f7) {
        return new a(f7);
    }
}
