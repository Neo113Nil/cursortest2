package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class D6 implements H6 {
    private final B6 a;
    private final C2594p6 b;
    private final C2594p6 c;
    private LevelPlayAdInfo d;

    public D6(B6 strategy, C2594p6 currentAdUnit, C2594p6 progressiveAdUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
        this.d = adInfo;
    }

    @Override // com.ironsource.H6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.H6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d = adInfo;
    }

    @Override // com.ironsource.H6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        this.a.d().b(this.d);
        B6 b6 = this.a;
        b6.a(new F6(b6, this.c));
    }

    @Override // com.ironsource.H6
    public void c(IronSourceError ironSourceError) {
        this.a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.H6
    public void a(IronSourceError ironSourceError) {
        this.a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.H6
    public void a() {
        B6 b6 = this.a;
        b6.a(new C6(b6, this.b, true));
    }

    @Override // com.ironsource.H6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success on progressive ad unit that already loaded");
    }
}
