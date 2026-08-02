package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes13.dex */
public final class A6 implements C6 {
    private final C4633x6 a;
    private final C4525r6 b;
    private boolean c;

    public A6(C4633x6 c4633x6, C4525r6 c4525r6, boolean z) {
        this.a = c4633x6;
        this.b = c4525r6;
        this.c = z;
    }

    @Override // com.ironsource.C6
    public void a(Activity activity) {
        this.a.a("show called while loading");
    }

    @Override // com.ironsource.C6
    public void b(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        if (!this.c) {
            this.a.a(new C4669z6(this.a, this.b, null, false));
            return;
        }
        C4525r6 a = this.a.b().a(false, this.a.c());
        this.a.a(new C4669z6(this.a, this.b, a, true));
        this.a.d().b(levelPlayAdInfo);
        a.a(this.a);
    }

    @Override // com.ironsource.C6
    public void c(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("ad info changed while loading");
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        if (this.c) {
            this.a.a("load called while loading");
        }
        this.c = true;
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.a.a("show success while loading");
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6, IronSourceError ironSourceError) {
        this.a.a("show failed while loading");
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6) {
        this.a.a("ad expired while loading");
    }

    @Override // com.ironsource.C6
    public void b(C4525r6 c4525r6, IronSourceError ironSourceError) {
        this.a.a(new C4651y6(this.a));
        if (this.c) {
            this.a.d().a(ironSourceError);
        }
    }
}
