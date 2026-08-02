package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class F6 implements H6 {
    private final B6 a;
    private final C2594p6 b;

    public F6(B6 strategy, C2594p6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.H6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.H6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.H6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        B6 b6 = this.a;
        b6.a(new C6(b6, null, false, 4, null));
        this.a.loadAd();
    }

    @Override // com.ironsource.H6
    public void a(IronSourceError ironSourceError) {
        this.a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.H6
    public void c(IronSourceError ironSourceError) {
        if (!C2324a5.a.a(ironSourceError)) {
            B6 b6 = this.a;
            b6.a(new C6(b6, null, false, 4, null));
        }
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.H6
    public void a() {
        B6 b6 = this.a;
        b6.a(new C6(b6, null, true));
        this.a.d().a();
    }

    @Override // com.ironsource.H6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.d().a(adInfo);
        C2594p6 a = this.a.b().a(false, this.a.c());
        B6 b6 = this.a;
        b6.a(new E6(b6, this.b, a));
        a.a(this.a);
    }
}
