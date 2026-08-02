package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.x6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2737x6 implements A6 {
    private final C2701v6 a;
    private final C2594p6 b;
    private C2594p6 c;
    private boolean d;

    public C2737x6(C2701v6 strategy, C2594p6 currentAdUnit, C2594p6 c2594p6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = c2594p6;
        this.d = z;
    }

    @Override // com.ironsource.A6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a(new C2773z6(this.a, this.b, this.c));
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.A6
    public void b(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(this.b, adUnit)) {
            this.a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.A6
    public void c(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.A6
    public void loadAd() {
        Unit unit;
        if (this.d) {
            this.a.a("load called while current ad is loaded");
            return;
        }
        this.d = true;
        LevelPlayAdInfo e = this.b.e();
        if (e != null) {
            this.a.d().b(e);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.a.a("current ad is loaded without ad info");
        } else if (this.c == null) {
            C2594p6 a = this.a.b().a(false, this.a.c());
            this.c = a;
            a.a(this.a);
        }
    }

    @Override // com.ironsource.A6
    public void b(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else {
            this.a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.a("show success when loaded");
        } else {
            this.a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C2737x6(C2701v6 c2701v6, C2594p6 c2594p6, C2594p6 c2594p62, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2701v6, c2594p6, c2594p62, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.a("show failed when loaded");
        } else {
            this.a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.A6
    public void a(C2594p6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else if (Intrinsics.areEqual(adUnit, this.b)) {
            a();
        }
    }

    private final void a() {
        A6 c2755y6;
        C2594p6 c2594p6 = this.c;
        if (c2594p6 == null) {
            C2701v6 c2701v6 = this.a;
            c2701v6.a(new C2719w6(c2701v6));
        } else {
            if ((c2594p6 != null ? c2594p6.e() : null) != null) {
                C2701v6 c2701v62 = this.a;
                C2594p6 c2594p62 = this.c;
                Intrinsics.checkNotNull(c2594p62);
                c2755y6 = new C2737x6(c2701v62, c2594p62, null, false, 8, null);
            } else {
                C2701v6 c2701v63 = this.a;
                C2594p6 c2594p63 = this.c;
                Intrinsics.checkNotNull(c2594p63);
                c2755y6 = new C2755y6(c2701v63, c2594p63, false);
            }
            this.a.a(c2755y6);
        }
        this.a.d().a();
    }
}
