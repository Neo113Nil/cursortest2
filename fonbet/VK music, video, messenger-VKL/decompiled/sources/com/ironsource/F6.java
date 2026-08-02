package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes13.dex */
public final class F6 implements J6 {
    private final D6 a;
    private final C4525r6 b;
    private final C4525r6 c;
    private LevelPlayAdInfo d;

    public F6(D6 d6, C4525r6 c4525r6, C4525r6 c4525r62, LevelPlayAdInfo levelPlayAdInfo) {
        this.a = d6;
        this.b = c4525r6;
        this.c = c4525r62;
        this.d = levelPlayAdInfo;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        this.d = levelPlayAdInfo;
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        this.a.d().b(this.d);
        D6 d6 = this.a;
        d6.a(new H6(d6, this.c));
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        this.a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        this.a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.J6
    public void a() {
        D6 d6 = this.a;
        d6.a(new E6(d6, this.b, true));
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("show success on progressive ad unit that already loaded");
    }
}
