package com.ironsource;

import android.app.Activity;
import com.ironsource.C2415f6;
import com.ironsource.InterfaceC2498k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2522l6 implements InterfaceC2576o6 {
    private final Xa a;
    private final InterfaceC2592p4 b;
    private final long c;
    private final LevelPlayAdInfo d;

    public C2522l6(Xa adInternal, InterfaceC2592p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = adInternal;
        this.b = currentTimeProvider;
        this.c = currentTimeProvider.a();
        String uuid = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.d = new LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.d);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public LevelPlayAdInfo b() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC2576o6
    public InterfaceC2498k0 c() {
        return new InterfaceC2498k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void loadAd() {
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.b.a() - this.c);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdClicked() {
        this.a.b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdClosed() {
        this.a.b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(error, this.b.a() - this.c);
        this.a.a(C2415f6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Xa xa = this.a;
        xa.a(new C2504k6(xa, adInfo, this.b));
        this.a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a() {
        this.a.b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC2576o6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
