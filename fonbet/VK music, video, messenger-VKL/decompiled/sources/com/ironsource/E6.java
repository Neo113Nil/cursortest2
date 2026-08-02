package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class E6 implements J6 {
    private final D6 a;
    private final C4525r6 b;
    private final boolean c;

    public E6(D6 d6, C4525r6 c4525r6, boolean z) {
        this.a = d6;
        this.b = c4525r6;
        this.c = z;
    }

    @Override // com.ironsource.J6
    public void a(Activity activity) {
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.J6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a(this.c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.J6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a(this.c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        C4525r6 a = this.a.b().a(true, this.a.c());
        D6 d6 = this.a;
        d6.a(new I6(d6, a));
        a.a(this.a);
    }

    @Override // com.ironsource.J6
    public void c(IronSourceError ironSourceError) {
        this.a.a(this.c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ E6(D6 d6, C4525r6 c4525r6, boolean z, int i, zcl zclVar) {
        this(d6, c4525r6, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.J6
    public void a(IronSourceError ironSourceError) {
        this.a.a(this.c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.J6
    public void a() {
        this.a.a(this.c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.J6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a(this.c ? "show success on expired ad" : "show success before load called");
    }
}
