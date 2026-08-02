package com.ironsource;

import android.app.Activity;
import com.ironsource.C4347h6;
import com.ironsource.InterfaceC4394k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.kw6;

/* renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4436m6 implements InterfaceC4508q6 {
    private final Ya a;
    private LevelPlayAdInfo b;
    private final InterfaceC4488p4 c;
    private final long d;

    public C4436m6(Ya ya, LevelPlayAdInfo levelPlayAdInfo, InterfaceC4488p4 interfaceC4488p4) {
        this.a = ya;
        this.b = levelPlayAdInfo;
        this.c = interfaceC4488p4;
        this.d = interfaceC4488p4.a();
    }

    private final long d() {
        return this.c.a() - this.d;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(Activity activity, String str) {
        C4336gd a = this.a.f().a(this.a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.b, str);
        this.b = levelPlayAdInfo;
        Ya ya = this.a;
        ya.a(new C4472o6(ya, levelPlayAdInfo));
        this.a.c().a(activity, a);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public InterfaceC4394k0 c() {
        G3 a = this.a.l().g().a(this.a.h());
        return a.d() ? InterfaceC4394k0.a.c.a(a.e()) : InterfaceC4394k0.b.a;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void loadAd() {
        this.a.f().d().h().a(Long.valueOf(d()));
        this.a.a(this.b);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClicked() {
        this.a.b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClosed() {
        this.a.b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        C4484p0 f = this.a.f();
        IronLog.INTERNAL.verbose(C4484p0.a(f, "onAdInfoChanged adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        f.d().h().a(this.b, levelPlayAdInfo);
        this.b = levelPlayAdInfo;
        f.d(new kw6(12, this, levelPlayAdInfo));
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        this.a.b("onAdLoadFailed on loaded state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a() {
        IronLog.INTERNAL.verbose(C4484p0.a(this.a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.a.a(C4347h6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4436m6 c4436m6, LevelPlayAdInfo levelPlayAdInfo) {
        Za k = c4436m6.a.k();
        if (k != null) {
            k.onAdInfoChanged(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(LevelPlayAdError levelPlayAdError) {
        this.a.b("onAdDisplayFailed on loaded state with error: " + levelPlayAdError.getErrorMessage());
    }
}
