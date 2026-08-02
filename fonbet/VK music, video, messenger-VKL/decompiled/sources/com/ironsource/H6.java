package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes13.dex */
public final class H6 implements J6 {
    private final D6 a;
    private final C4525r6 b;

    public H6(D6 d6, C4525r6 c4525r6) {
        this.a = d6;
        this.b = c4525r6;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.d().onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        D6 d6 = this.a;
        d6.a(new E6(d6, null, false, 4, null));
        this.a.loadAd();
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        this.a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        if (!C4220a5.a.a(ironSourceError)) {
            D6 d6 = this.a;
            d6.a(new E6(d6, null, false, 4, null));
        }
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.J6
    public void a() {
        D6 d6 = this.a;
        d6.a(new E6(d6, null, true));
        this.a.d().a();
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.d().a(levelPlayAdInfo);
        C4525r6 a = this.a.b().a(false, this.a.c());
        D6 d6 = this.a;
        d6.a(new G6(d6, this.b, a));
        a.a(this.a);
    }
}
