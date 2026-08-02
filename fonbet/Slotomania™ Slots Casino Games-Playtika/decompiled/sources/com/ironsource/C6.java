package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class C6 implements H6 {
    private final B6 a;
    private final C2594p6 b;
    private final boolean c;

    public C6(B6 strategy, C2594p6 c2594p6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
        this.b = c2594p6;
        this.c = z;
    }

    @Override // com.ironsource.H6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.H6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.H6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        C2594p6 a = this.a.b().a(true, this.a.c());
        B6 b6 = this.a;
        b6.a(new G6(b6, a));
        a.a(this.a);
    }

    @Override // com.ironsource.H6
    public void c(IronSourceError ironSourceError) {
        this.a.a(this.c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ C6(B6 b6, C2594p6 c2594p6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(b6, c2594p6, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.H6
    public void a(IronSourceError ironSourceError) {
        this.a.a(this.c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.H6
    public void a() {
        this.a.a(this.c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.H6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "show success on expired ad" : "show success before load called");
    }
}
