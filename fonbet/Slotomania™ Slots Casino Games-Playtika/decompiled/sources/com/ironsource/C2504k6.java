package com.ironsource;

import android.app.Activity;
import com.ironsource.C2415f6;
import com.ironsource.InterfaceC2498k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2504k6 implements InterfaceC2576o6 {
    private final Xa a;
    private LevelPlayAdInfo b;
    private final InterfaceC2592p4 c;
    private final long d;

    public C2504k6(Xa adInternal, LevelPlayAdInfo adInfo, InterfaceC2592p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = adInternal;
        this.b = adInfo;
        this.c = currentTimeProvider;
        this.d = currentTimeProvider.a();
    }

    private final long d() {
        return this.c.a() - this.d;
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C2440gd a = this.a.f().a(this.a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.b, str);
        this.b = levelPlayAdInfo;
        Xa xa = this.a;
        xa.a(new C2540m6(xa, levelPlayAdInfo));
        this.a.c().a(activity, a);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC2576o6
    public InterfaceC2498k0 c() {
        G3 a = this.a.l().g().a(this.a.h());
        return a.d() ? InterfaceC2498k0.a.c.a(a.e()) : InterfaceC2498k0.b.a;
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void loadAd() {
        this.a.f().e().h().a(Long.valueOf(d()));
        this.a.a(this.b);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdClicked() {
        this.a.b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdClosed() {
        this.a.b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C2588p0 f = this.a.f();
        IronLog.INTERNAL.verbose(C2588p0.a(f, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        f.e().h().a(this.b, adInfo);
        this.b = adInfo;
        f.e(new Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2504k6.a(C2504k6.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a() {
        IronLog.INTERNAL.verbose(C2588p0.a(this.a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.a.a(C2415f6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2504k6 this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Ya k = this$0.a.k();
        if (k != null) {
            k.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
