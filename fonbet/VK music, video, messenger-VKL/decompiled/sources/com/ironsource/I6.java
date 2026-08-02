package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes13.dex */
public final class I6 implements J6 {
    private final D6 a;
    private final C4525r6 b;

    public I6(D6 d6, C4525r6 c4525r6) {
        this.a = d6;
        this.b = c4525r6;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        D6 d6 = this.a;
        d6.a(new H6(d6, this.b));
        this.a.d().b(levelPlayAdInfo);
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        this.a.d().a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        this.a.a("show failed while loading");
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        D6 d6 = this.a;
        d6.a(new E6(d6, this.b, false, 4, null));
        this.a.d().a(ironSourceError);
    }

    @Override // com.ironsource.J6
    public void a() {
        this.a.a("ad expired while loading");
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("show success while loading");
    }
}
