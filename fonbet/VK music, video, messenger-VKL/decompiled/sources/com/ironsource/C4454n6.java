package com.ironsource;

import android.app.Activity;
import com.ironsource.C4347h6;
import com.ironsource.InterfaceC4394k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4454n6 implements InterfaceC4508q6 {
    private final Ya a;
    private final InterfaceC4488p4 b;
    private final long c;
    private final LevelPlayAdInfo d;

    public C4454n6(Ya ya, InterfaceC4488p4 interfaceC4488p4) {
        this.a = ya;
        this.b = interfaceC4488p4;
        this.c = interfaceC4488p4.a();
        this.d = new LevelPlayAdInfo(ya.e().toString(), ya.h(), ya.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(Activity activity, String str) {
        this.a.a(new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.d);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public LevelPlayAdInfo b() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public InterfaceC4394k0 c() {
        return new InterfaceC4394k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void loadAd() {
        this.a.a(new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.b.a() - this.c);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClicked() {
        this.a.b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClosed() {
        this.a.b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        this.a.a(levelPlayAdError, this.b.a() - this.c);
        this.a.a(C4347h6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        Ya ya = this.a;
        ya.a(new C4436m6(ya, levelPlayAdInfo, this.b));
        this.a.a(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a() {
        this.a.b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(LevelPlayAdError levelPlayAdError) {
        this.a.b("onAdDisplayFailed on loading state with error: " + levelPlayAdError.getErrorMessage());
    }
}
