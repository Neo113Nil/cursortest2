package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2773z6 implements A6, InterfaceC2647s6 {
    private final C2701v6 a;
    private final C2594p6 b;
    private C2594p6 c;

    public C2773z6(C2701v6 strategy, C2594p6 currentAdUnit, C2594p6 c2594p6) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = c2594p6;
        currentAdUnit.a(this);
    }

    @Override // com.ironsource.A6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called while showing");
    }

    @Override // com.ironsource.A6
    public void b(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.A6
    public void c(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        this.a.c().e();
    }

    @Override // com.ironsource.A6
    public void loadAd() {
        this.a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC2647s6
    public void onClosed() {
        this.a.a(a(this, null, 1, null));
        this.a.c().onClosed();
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.d().a(adInfo);
        } else {
            this.a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.A6
    public void b(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (!Intrinsics.areEqual(adUnit, this.b)) {
            this.a.a("progressive show failed while showing current ad");
            return;
        }
        this.a.a(a(ironSourceError));
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC2647s6
    public void a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.a.c().a(reward);
    }

    static /* synthetic */ A6 a(C2773z6 c2773z6, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return c2773z6.a(ironSourceError);
    }

    private final A6 a(IronSourceError ironSourceError) {
        if (C2324a5.a.a(ironSourceError)) {
            return new C2737x6(this.a, this.b, this.c, true);
        }
        C2594p6 c2594p6 = this.c;
        if (c2594p6 == null) {
            return new C2719w6(this.a);
        }
        if (c2594p6.e() != null) {
            return new C2737x6(this.a, c2594p6, null, false, 8, null);
        }
        return new C2755y6(this.a, c2594p6, false);
    }
}
