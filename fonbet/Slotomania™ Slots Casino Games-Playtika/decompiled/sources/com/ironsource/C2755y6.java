package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2755y6 implements A6 {
    private final C2701v6 a;
    private final C2594p6 b;
    private boolean c;

    public C2755y6(C2701v6 strategy, C2594p6 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.A6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called while loading");
    }

    @Override // com.ironsource.A6
    public void b(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.c) {
            this.a.a(new C2737x6(this.a, this.b, null, false));
            return;
        }
        C2594p6 a = this.a.b().a(false, this.a.c());
        this.a.a(new C2737x6(this.a, this.b, a, true));
        this.a.d().b(adInfo);
        a.a(this.a);
    }

    @Override // com.ironsource.A6
    public void c(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("ad info changed while loading");
    }

    @Override // com.ironsource.A6
    public void loadAd() {
        if (this.c) {
            this.a.a("load called while loading");
        }
        this.c = true;
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a("show success while loading");
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("show failed while loading");
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a("ad expired while loading");
    }

    @Override // com.ironsource.A6
    public void b(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a.a(new C2719w6(this.a));
        if (this.c) {
            this.a.d().a(ironSourceError);
        }
    }
}
