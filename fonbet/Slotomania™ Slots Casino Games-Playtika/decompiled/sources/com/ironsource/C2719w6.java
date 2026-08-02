package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2719w6 implements A6 {
    private final C2701v6 a;

    public C2719w6(C2701v6 strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
    }

    @Override // com.ironsource.A6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called before load success");
    }

    @Override // com.ironsource.A6
    public void b(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success before load called");
    }

    @Override // com.ironsource.A6
    public void c(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.A6
    public void loadAd() {
        C2594p6 a = this.a.b().a(true, this.a.c());
        this.a.a(new C2755y6(this.a, a, true));
        a.a(this.a);
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad expired before load called");
    }

    @Override // com.ironsource.A6
    public void b(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("load failed before load called");
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("ad display success before load called");
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad display failed before load called");
    }
}
