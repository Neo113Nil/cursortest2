package com.ironsource;

import android.app.Activity;
import com.ironsource.C2415f6;
import com.ironsource.InterfaceC2498k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2540m6 implements InterfaceC2576o6 {
    private final Xa a;
    private final LevelPlayAdInfo b;

    public C2540m6(Xa adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a = adInternal;
        this.b = adInfo;
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.b);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC2576o6
    public InterfaceC2498k0 c() {
        return new InterfaceC2498k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void loadAd() {
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        Xa.a(this.a, new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdClicked() {
        this.a.b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdClosed() {
        this.a.b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C2588p0 f = this.a.f();
        final LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.b.getPlacementName());
        IronLog.INTERNAL.verbose(C2588p0.a(f, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        f.e().h().e();
        Xa xa = this.a;
        xa.a(new C2558n6(xa, levelPlayAdInfo));
        f.e(new Runnable() { // from class: com.ironsource.m6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2540m6.a(C2540m6.this, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(a(error, this.b));
        this.a.a(error, this.b);
    }

    private final InterfaceC2576o6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C2324a5.a.a(Yf.a.a(levelPlayAdError))) {
            Xa xa = this.a;
            return new C2504k6(xa, levelPlayAdInfo, xa.j());
        }
        return new C2415f6(this.a, C2415f6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a() {
        this.a.b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2540m6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        Ya k = this$0.a.k();
        if (k != null) {
            k.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
