package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* loaded from: classes13.dex */
public final class B6 implements C6, InterfaceC4579u6 {
    private final C4633x6 a;
    private final C4525r6 b;
    private C4525r6 c;

    public B6(C4633x6 c4633x6, C4525r6 c4525r6, C4525r6 c4525r62) {
        this.a = c4633x6;
        this.b = c4525r6;
        this.c = c4525r62;
        c4525r6.a(this);
    }

    @Override // com.ironsource.C6
    public void a(Activity activity) {
        this.a.a("show called while showing");
    }

    @Override // com.ironsource.C6
    public void b(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        if (c4525r6 == this.b) {
            this.a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.C6
    public void c(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        if (c4525r6 == this.b) {
            this.a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        this.a.c().e();
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        this.a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC4579u6
    public void onClosed() {
        this.a.a(a(this, null, 1, null));
        this.a.c().onClosed();
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        if (c4525r6.equals(this.b)) {
            this.a.d().a(levelPlayAdInfo);
        } else {
            this.a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.C6
    public void b(C4525r6 c4525r6, IronSourceError ironSourceError) {
        if (c4525r6 == this.c) {
            this.c = null;
        } else {
            this.a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6, IronSourceError ironSourceError) {
        if (!c4525r6.equals(this.b)) {
            this.a.a("progressive show failed while showing current ad");
            return;
        }
        this.a.a(a(ironSourceError));
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6) {
        if (c4525r6 == this.c) {
            this.c = null;
        } else {
            this.a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4579u6
    public void a(LevelPlayReward levelPlayReward) {
        this.a.c().a(levelPlayReward);
    }

    public static /* synthetic */ C6 a(B6 b6, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return b6.a(ironSourceError);
    }

    private final C6 a(IronSourceError ironSourceError) {
        if (C4220a5.a.a(ironSourceError)) {
            return new C4669z6(this.a, this.b, this.c, true);
        }
        C4525r6 c4525r6 = this.c;
        if (c4525r6 == null) {
            return new C4651y6(this.a);
        }
        if (c4525r6.e() != null) {
            return new C4669z6(this.a, c4525r6, null, false, 8, null);
        }
        return new A6(this.a, c4525r6, false);
    }
}
