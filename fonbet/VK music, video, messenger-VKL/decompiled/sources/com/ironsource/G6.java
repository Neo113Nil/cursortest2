package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes13.dex */
public final class G6 implements J6 {
    private final D6 a;
    private final C4525r6 b;
    private final C4525r6 c;

    public G6(D6 d6, C4525r6 c4525r6, C4525r6 c4525r62) {
        this.a = d6;
        this.b = c4525r6;
        this.c = c4525r62;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        D6 d6 = this.a;
        d6.a(new F6(d6, this.b, this.c, levelPlayAdInfo));
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        D6 d6 = this.a;
        d6.a(new I6(d6, this.c));
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        D6 d6 = this.a;
        d6.a(new E6(d6, this.b, false, 4, null));
    }

    @Override // com.ironsource.J6
    public void a() {
        this.a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("show success before progressive load success");
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        this.a.a("show failed before progressive load success");
    }
}
