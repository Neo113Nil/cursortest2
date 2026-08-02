package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4394k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.zcl;

/* renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4347h6 implements InterfaceC4508q6 {
    private final Ya a;
    private final a b;
    private final LevelPlayAdInfo c;

    /* renamed from: com.ironsource.h6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C4347h6(Ya ya, a aVar) {
        this.a = ya;
        this.b = aVar;
        this.c = new LevelPlayAdInfo(ya.e().toString(), ya.h(), ya.d().toString(), null, null, null, null, 120, null);
    }

    private final boolean d() {
        if (this.a.h().length() == 0) {
            Ya.a(this.a, new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.a.f().f()) {
            Ya.a(this.a, new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        Va a2 = this.a.l().f().a();
        if (a2 != null && a2.a(this.a.h(), this.a.d())) {
            return true;
        }
        Ya.a(this.a, new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(Activity activity, String str) {
        this.a.a(new LevelPlayAdError(this.a.e().toString(), this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.b == a.Expired ? "Show called on expired ad" : "Show called before load success"), this.c);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public LevelPlayAdInfo b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4508q6
    public InterfaceC4394k0 c() {
        return new InterfaceC4394k0.a(this.b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void loadAd() {
        if (d()) {
            this.a.o();
        }
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClicked() {
        this.a.b("onAdClicked on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdClosed() {
        this.a.b("onAdClosed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdDisplayed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdInfoChanged on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        this.a.b("onAdLoadFailed on " + this.b + " state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.b("onAdLoaded on " + this.b + " state");
    }

    public /* synthetic */ C4347h6(Ya ya, a aVar, int i, zcl zclVar) {
        this(ya, (i & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a(LevelPlayAdError levelPlayAdError) {
        this.a.b("onAdDisplayFailed on " + this.b + " state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4508q6
    public void a() {
        this.a.b("onAdExpired on " + this.b + " state");
    }
}
