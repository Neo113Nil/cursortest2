package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NotImplementedError;

/* loaded from: classes13.dex */
public final class Sb extends AbstractC4429m implements InterfaceC4335gc, M0, InterfaceC4663z0 {
    private final Vb b;
    private final C4484p0 c;
    private final C4263cc d;
    private C4299ec e;
    private LevelPlayAdInfo f = m();

    public Sb(Vb vb, C4484p0 c4484p0, C4263cc c4263cc) {
        this.b = vb;
        this.c = c4484p0;
        this.d = c4263cc;
    }

    private final LevelPlayAdInfo m() {
        return new LevelPlayAdInfo(this.d.b().toString(), this.d.c(), this.d.a().toString(), null, null, null, null, 120, null);
    }

    public final void a(Pb pb) {
        C4299ec c4299ec = this.e;
        if (c4299ec == null) {
            c4299ec = null;
        }
        c4299ec.a(new Xb(pb), this);
    }

    @Override // com.ironsource.InterfaceC4663z0
    public void c(IronSourceError ironSourceError) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.b(this.f);
    }

    public final void n() {
        this.f = m();
        C4299ec c4299ec = this.e;
        if (c4299ec == null) {
            c4299ec = null;
        }
        c4299ec.a(true);
    }

    public final void o() {
        C4299ec a = a(this.c, this.d);
        this.e = a;
        if (a == null) {
            a = null;
        }
        a.a((M0) this);
    }

    private final C4299ec a(C4484p0 c4484p0, C4263cc c4263cc) {
        IronLog.INTERNAL.verbose();
        return new C4299ec(c4484p0, C4317fc.y.a(c4263cc, l().a()), this);
    }

    @Override // com.ironsource.M0
    public void a(C4573u0 c4573u0) {
        LevelPlayAdInfo c = c4573u0.c();
        if (c != null) {
            this.f = c;
            this.b.a(c);
        }
    }

    @Override // com.ironsource.InterfaceC4663z0
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.b.onNativeAdLoadFailed(ironSourceError);
    }
}
