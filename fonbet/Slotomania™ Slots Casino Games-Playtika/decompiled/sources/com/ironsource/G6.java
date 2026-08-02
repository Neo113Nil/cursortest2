package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class G6 implements H6 {
    private final B6 a;
    private final C2594p6 b;

    public G6(B6 strategy, C2594p6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.H6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.H6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.H6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        B6 b6 = this.a;
        b6.a(new F6(b6, this.b));
        this.a.d().b(adInfo);
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        this.a.d().a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.H6
    public void c(IronSourceError ironSourceError) {
        this.a.a("show failed while loading");
    }

    @Override // com.ironsource.H6
    public void a(IronSourceError ironSourceError) {
        B6 b6 = this.a;
        b6.a(new C6(b6, this.b, false, 4, null));
        this.a.d().a(ironSourceError);
    }

    @Override // com.ironsource.H6
    public void a() {
        this.a.a("ad expired while loading");
    }

    @Override // com.ironsource.H6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success while loading");
    }
}
