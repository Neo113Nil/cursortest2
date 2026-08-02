package com.ironsource;

import android.app.Activity;
import com.ironsource.C4347h6;
import com.ironsource.InterfaceC4394k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.h12;

/* renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4472o6 implements InterfaceC4508q6 {
    private final Ya a;
    private final LevelPlayAdInfo b;

    public C4472o6(Ya ya, LevelPlayAdInfo levelPlayAdInfo) {
        this.a = ya;
        this.b = levelPlayAdInfo;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(Activity activity, String str) {
        this.a.a(new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.b);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public InterfaceC4394k0 c() {
        return new InterfaceC4394k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void loadAd() {
        Ya.a(this.a, new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClicked() {
        this.a.b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClosed() {
        this.a.b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        C4484p0 f = this.a.f();
        LevelPlayAdInfo levelPlayAdInfo2 = new LevelPlayAdInfo(levelPlayAdInfo, this.b.getPlacementName());
        IronLog.INTERNAL.verbose(C4484p0.a(f, "onAdDisplayed adInfo: " + levelPlayAdInfo2, (String) null, 2, (Object) null));
        f.d().h().e();
        Ya ya = this.a;
        ya.a(new C4490p6(ya, levelPlayAdInfo2));
        f.d(new h12(16, this, levelPlayAdInfo2));
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        this.a.b("onAdLoadFailed on showing state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(LevelPlayAdError levelPlayAdError) {
        this.a.a(a(levelPlayAdError, this.b));
        this.a.a(levelPlayAdError, this.b);
    }

    private final InterfaceC4508q6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C4220a5.a.a(C4249bg.a.a(levelPlayAdError))) {
            Ya ya = this.a;
            return new C4436m6(ya, levelPlayAdInfo, ya.j());
        }
        return new C4347h6(this.a, C4347h6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a() {
        this.a.b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4472o6 c4472o6, LevelPlayAdInfo levelPlayAdInfo) {
        Za k = c4472o6.a.k();
        if (k != null) {
            k.onAdDisplayed(levelPlayAdInfo);
        }
    }
}
