package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4651y6 implements C6 {
    private final C4633x6 a;

    public C4651y6(C4633x6 c4633x6) {
        this.a = c4633x6;
    }

    @Override // com.ironsource.C6
    public void a(Activity activity) {
        this.a.a("show called before load success");
    }

    @Override // com.ironsource.C6
    public void b(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("load success before load called");
    }

    @Override // com.ironsource.C6
    public void c(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        C4525r6 a = this.a.b().a(true, this.a.c());
        this.a.a(new A6(this.a, a, true));
        a.a(this.a);
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6) {
        this.a.a("ad expired before load called");
    }

    @Override // com.ironsource.C6
    public void b(C4525r6 c4525r6, IronSourceError ironSourceError) {
        this.a.a("load failed before load called");
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("ad display success before load called");
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6, IronSourceError ironSourceError) {
        this.a.a("ad display failed before load called");
    }
}
