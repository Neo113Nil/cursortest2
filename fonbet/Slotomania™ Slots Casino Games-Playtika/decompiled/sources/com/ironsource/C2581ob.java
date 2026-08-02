package com.ironsource;

import android.app.Activity;
import com.ironsource.Xa;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2581ob {
    private final Xa a;

    /* renamed from: com.ironsource.ob$a */
    public static final class a implements InterfaceC2749y0 {
        final /* synthetic */ H7 a;

        a(H7 h7) {
            this.a = h7;
        }

        @Override // com.ironsource.InterfaceC2749y0
        public AbstractC2731x0 a(boolean z, C2445h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return C2369ce.z.a(adProperties, this.a.f().a(), z);
        }
    }

    public C2581ob(String adUnitId, Xa.b config, C2588p0 adTools, C2379d6 adControllerFactory, H7 provider, InterfaceC2592p4 currentTimeProvider, C2702v7 idFactory, Z0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.a = new Xa(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(provider), provider, currentTimeProvider, idFactory);
    }

    public final String a() {
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
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
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.a.a(activity, str);
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.a.a(levelPlayRewardedAdListener != null ? C2599pb.b(levelPlayRewardedAdListener) : null);
    }

    public final LevelPlayReward a(String str) {
        IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.a.a(str);
    }

    private final a a(H7 h7) {
        return new a(h7);
    }
}
