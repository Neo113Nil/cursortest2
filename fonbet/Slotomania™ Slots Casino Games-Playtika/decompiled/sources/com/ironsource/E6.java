package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class E6 implements H6 {
    private final B6 a;
    private final C2594p6 b;
    private final C2594p6 c;

    public E6(B6 strategy, C2594p6 currentAdUnit, C2594p6 progressiveAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
    }

    @Override // com.ironsource.H6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.H6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.H6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        B6 b6 = this.a;
        b6.a(new D6(b6, this.b, this.c, adInfo));
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        B6 b6 = this.a;
        b6.a(new G6(b6, this.c));
    }

    @Override // com.ironsource.H6
    public void a(IronSourceError ironSourceError) {
        B6 b6 = this.a;
        b6.a(new C6(b6, this.b, false, 4, null));
    }

    @Override // com.ironsource.H6
    public void a() {
        this.a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.H6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success before progressive load success");
    }

    @Override // com.ironsource.H6
    public void c(IronSourceError ironSourceError) {
        this.a.a("show failed before progressive load success");
    }
}
