package com.ironsource;

import android.app.Activity;
import com.ironsource.C4347h6;
import com.ironsource.InterfaceC4394k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.n52;
import xsna.nf0;
import xsna.sx3;

/* renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4490p6 implements InterfaceC4508q6 {
    private final Ya a;
    private final LevelPlayAdInfo b;

    public C4490p6(Ya ya, LevelPlayAdInfo levelPlayAdInfo) {
        this.a = ya;
        this.b = levelPlayAdInfo;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(Activity activity, String str) {
        this.a.a(new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.b);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public InterfaceC4394k0 c() {
        return new InterfaceC4394k0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void loadAd() {
        Ya.a(this.a, new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C4484p0.a(this.a.f(), "onAdClicked adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().d(new sx3(this, 16));
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C4484p0.a(this.a.f(), "onAdClosed adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().c(new nf0(this, 16));
        this.a.f().d(new n52(this, 19));
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        this.a.b("onAdLoadFailed on shown state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4490p6 c4490p6) {
        c4490p6.a.a(C4347h6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4490p6 c4490p6) {
        Za k = c4490p6.a.k();
        if (k != null) {
            k.onAdClosed(c4490p6.b);
        }
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a() {
        this.a.b("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(LevelPlayAdError levelPlayAdError) {
        this.a.b("onAdDisplayFailed on shown state with error: " + levelPlayAdError.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4490p6 c4490p6) {
        Za k = c4490p6.a.k();
        if (k != null) {
            k.onAdClicked(c4490p6.b);
        }
    }
}
