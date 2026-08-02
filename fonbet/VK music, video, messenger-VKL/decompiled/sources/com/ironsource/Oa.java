package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.s3q0;

/* loaded from: classes13.dex */
public final class Oa implements InterfaceC4655ya {
    private final C4484p0 a;
    private final W2 b;
    private final N2 c;
    private InterfaceC4673za d;
    private L2 f;
    private Ta e = new Pa(this);
    private final M0 g = new b();
    private final InterfaceC4663z0 h = new c();
    private final O2 i = new a();

    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            InterfaceC4673za m = Oa.this.m();
            if (m != null) {
                m.onAdLeftApplication();
            }
        }

        public void b() {
            InterfaceC4673za m = Oa.this.m();
            if (m != null) {
                m.k();
            }
        }

        public void c() {
            InterfaceC4673za m = Oa.this.m();
            if (m != null) {
                m.i();
            }
        }

        @Override // com.ironsource.K0
        public void e() {
            InterfaceC4673za m = Oa.this.m();
            if (m != null) {
                m.onAdClicked();
            }
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ s3q0 g() {
            a();
            return s3q0.a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ s3q0 h() {
            c();
            return s3q0.a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ s3q0 j() {
            b();
            return s3q0.a;
        }
    }

    public static final class b implements M0 {
        public b() {
        }

        @Override // com.ironsource.M0
        public void a(C4573u0 c4573u0) {
            Oa.this.l().a(c4573u0);
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            Oa.this.l().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC4663z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC4663z0
        public void a(LevelPlayAdInfo levelPlayAdInfo) {
            InterfaceC4673za m = Oa.this.m();
            if (m != null) {
                m.onAdDisplayed(levelPlayAdInfo);
            }
        }

        @Override // com.ironsource.InterfaceC4663z0
        public void c(IronSourceError ironSourceError) {
            InterfaceC4673za m = Oa.this.m();
            if (m != null) {
                m.d(ironSourceError);
            }
        }
    }

    public Oa(C4484p0 c4484p0, W2 w2, N2 n2) {
        this.a = c4484p0;
        this.b = w2;
        this.c = n2;
    }

    public final C4484p0 a() {
        return this.a;
    }

    public final void b(InterfaceC4673za interfaceC4673za) {
        this.d = interfaceC4673za;
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void c() {
        this.e.c();
    }

    public final O2 e() {
        return this.i;
    }

    public final M0 g() {
        return this.g;
    }

    public final InterfaceC4663z0 h() {
        return this.h;
    }

    public final N2 i() {
        return this.c;
    }

    public final W2 j() {
        return this.b;
    }

    public final L2 k() {
        return this.f;
    }

    public final Ta l() {
        return this.e;
    }

    public final InterfaceC4673za m() {
        return this.d;
    }

    public final void a(Ta ta) {
        this.e = ta;
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void b() {
        this.e.b();
    }

    public final void a(L2 l2) {
        this.f = l2;
    }

    public final void a(String str) {
        this.a.d().h().f("Banner Single Ad Unit Strategy - ".concat(str));
    }

    public final void a(C4573u0 c4573u0, L2 l2) {
        InterfaceC4673za interfaceC4673za;
        l2.a(this.b.getViewBinder(), this.h);
        LevelPlayAdInfo c2 = c4573u0.c();
        if (c2 == null || (interfaceC4673za = this.d) == null) {
            return;
        }
        interfaceC4673za.onAdLoaded(c2);
    }

    public final void a(IronSourceError ironSourceError) {
        InterfaceC4673za interfaceC4673za = this.d;
        if (interfaceC4673za != null) {
            interfaceC4673za.b(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void a(InterfaceC4673za interfaceC4673za) {
        this.d = interfaceC4673za;
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void d() {
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void f() {
    }
}
