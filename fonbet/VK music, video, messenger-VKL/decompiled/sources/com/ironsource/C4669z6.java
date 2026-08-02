package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.epx;
import xsna.s3q0;
import xsna.zcl;

/* renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4669z6 implements C6 {
    private final C4633x6 a;
    private final C4525r6 b;
    private C4525r6 c;
    private boolean d;

    public C4669z6(C4633x6 c4633x6, C4525r6 c4525r6, C4525r6 c4525r62, boolean z) {
        this.a = c4633x6;
        this.b = c4525r6;
        this.c = c4525r62;
        this.d = z;
    }

    @Override // com.ironsource.C6
    public void a(Activity activity) {
        this.a.a(new B6(this.a, this.b, this.c));
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.C6
    public void b(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        if (epx.f(this.b, c4525r6)) {
            this.a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void c(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        if (c4525r6.equals(this.b)) {
            this.a.d().onAdInfoChanged(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        s3q0 s3q0Var;
        if (this.d) {
            this.a.a("load called while current ad is loaded");
            return;
        }
        this.d = true;
        LevelPlayAdInfo e = this.b.e();
        if (e != null) {
            this.a.d().b(e);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            this.a.a("current ad is loaded without ad info");
        } else if (this.c == null) {
            C4525r6 a = this.a.b().a(false, this.a.c());
            this.c = a;
            a.a(this.a);
        }
    }

    @Override // com.ironsource.C6
    public void b(C4525r6 c4525r6, IronSourceError ironSourceError) {
        if (c4525r6.equals(this.c)) {
            this.c = null;
        } else {
            this.a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        if (c4525r6.equals(this.b)) {
            this.a.a("show success when loaded");
        } else {
            this.a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C4669z6(C4633x6 c4633x6, C4525r6 c4525r6, C4525r6 c4525r62, boolean z, int i, zcl zclVar) {
        this(c4633x6, c4525r6, c4525r62, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6, IronSourceError ironSourceError) {
        if (c4525r6.equals(this.b)) {
            this.a.a("show failed when loaded");
        } else {
            this.a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void a(C4525r6 c4525r6) {
        if (c4525r6.equals(this.c)) {
            this.c = null;
        } else if (c4525r6.equals(this.b)) {
            a();
        }
    }

    private final void a() {
        C6 a6;
        C4525r6 c4525r6 = this.c;
        if (c4525r6 == null) {
            C4633x6 c4633x6 = this.a;
            c4633x6.a(new C4651y6(c4633x6));
        } else {
            if (c4525r6.e() != null) {
                a6 = new C4669z6(this.a, this.c, null, false, 8, null);
            } else {
                a6 = new A6(this.a, this.c, false);
            }
            this.a.a(a6);
        }
        this.a.d().a();
    }
}
