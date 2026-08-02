package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Lambda;
import xsna.fv8;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Ca implements InterfaceC4655ya {
    private final C4484p0 a;
    private final W2 b;
    private final long c;
    private final long d;
    private final J2 e;
    private InterfaceC4673za f;
    private final N2 g;
    private final Ff h;
    private final InterfaceC4488p4 i;
    private final boolean j;
    private M0 k;
    private InterfaceC4663z0 l;
    private O2 m;
    private Ma n;

    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            Ca.this.n().onAdLeftApplication();
        }

        public void b() {
            Ca.this.n().k();
        }

        public void c() {
            Ca.this.n().i();
        }

        @Override // com.ironsource.K0
        public void e() {
            Ca.this.n().onAdClicked();
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
            Ca.this.m().a(c4573u0);
        }

        @Override // com.ironsource.M0
        public void a(IronSourceError ironSourceError) {
            Ca.this.m().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC4663z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC4663z0
        public void a(LevelPlayAdInfo levelPlayAdInfo) {
            Ca.this.n().onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4663z0
        public void c(IronSourceError ironSourceError) {
            Ca.this.n().d(ironSourceError);
        }
    }

    public static final class d extends Lambda implements gzs<s3q0> {
        final /* synthetic */ L2 b;
        final /* synthetic */ AbstractC4308f3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L2 l2, AbstractC4308f3 abstractC4308f3) {
            super(0);
            this.b = l2;
            this.c = abstractC4308f3;
        }

        public final void a() {
            Ca.a(Ca.this, this.b, this.c, false, 4, (Object) null);
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            a();
            return s3q0.a;
        }
    }

    public static final class e extends Lambda implements gzs<s3q0> {
        final /* synthetic */ L2 b;
        final /* synthetic */ Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L2 l2, Long l) {
            super(0);
            this.b = l2;
            this.c = l;
        }

        public final void a() {
            Ca ca = Ca.this;
            ca.a((Ma) new Ga(ca, this.b, this.c));
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            a();
            return s3q0.a;
        }
    }

    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ L2 b;
        final /* synthetic */ AbstractC4308f3 c;
        final /* synthetic */ Long d;

        public static final class a extends Lambda implements gzs<s3q0> {
            final /* synthetic */ Ca a;
            final /* synthetic */ L2 b;
            final /* synthetic */ AbstractC4308f3 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ca ca, L2 l2, AbstractC4308f3 abstractC4308f3) {
                super(0);
                this.a = ca;
                this.b = l2;
                this.c = abstractC4308f3;
            }

            public final void a() {
                Ca.a(this.a, this.b, this.c, false, 4, (Object) null);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                a();
                return s3q0.a;
            }
        }

        public static final class b extends Lambda implements gzs<s3q0> {
            final /* synthetic */ Ca a;
            final /* synthetic */ L2 b;
            final /* synthetic */ Long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ca ca, L2 l2, Long l) {
                super(0);
                this.a = ca;
                this.b = l2;
                this.c = l;
            }

            public final void a() {
                Ca ca = this.a;
                ca.a((Ma) new Ga(ca, this.b, this.c));
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                a();
                return s3q0.a;
            }
        }

        public f(L2 l2, AbstractC4308f3 abstractC4308f3, Long l) {
            this.b = l2;
            this.c = abstractC4308f3;
            this.d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ca.this.k().getViewTreeObserver().isAlive()) {
                Ca.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (Ig.a(Ca.this.k(), new Rect())) {
                Ca.this.a().c(AbstractRunnableC4408ke.a.a(new a(Ca.this, this.b, this.c)));
            } else {
                Ca.this.a().c(AbstractRunnableC4408ke.a.a(new b(Ca.this, this.b, this.d)));
            }
        }
    }

    public Ca(C4484p0 c4484p0, W2 w2, long j, long j2, J2 j22, InterfaceC4673za interfaceC4673za, N2 n2, Ff ff, InterfaceC4488p4 interfaceC4488p4, boolean z) {
        this.a = c4484p0;
        this.b = w2;
        this.c = j;
        this.d = j2;
        this.e = j22;
        this.f = interfaceC4673za;
        this.g = n2;
        this.h = ff;
        this.i = interfaceC4488p4;
        this.j = z;
        this.k = new b();
        this.l = new c();
        this.m = new a();
        this.n = new Ea(this, false, 2, null);
    }

    public final C4484p0 a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void c() {
        this.n.c();
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void d() {
        this.n.d();
    }

    public final O2 e() {
        return this.m;
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void f() {
        this.n.f();
    }

    public final M0 g() {
        return this.k;
    }

    public final InterfaceC4663z0 h() {
        return this.l;
    }

    public final J2 i() {
        return this.e;
    }

    public final N2 j() {
        return this.g;
    }

    public final W2 k() {
        return this.b;
    }

    public final long l() {
        return this.c;
    }

    public final Ma m() {
        return this.n;
    }

    public final InterfaceC4673za n() {
        return this.f;
    }

    public final Ff o() {
        return this.h;
    }

    public final InterfaceC4488p4 p() {
        return this.i;
    }

    public final long q() {
        return this.d;
    }

    public final void r() {
        this.a.d().h().h("Banner view is not visible");
    }

    public final void a(M0 m0) {
        this.k = m0;
    }

    public final void b(InterfaceC4673za interfaceC4673za) {
        this.f = interfaceC4673za;
    }

    public final void a(InterfaceC4663z0 interfaceC4663z0) {
        this.l = interfaceC4663z0;
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void b() {
        this.n.b();
    }

    public final void a(O2 o2) {
        this.m = o2;
    }

    public final void a(Ma ma) {
        this.n = ma;
    }

    public final void a(String str) {
        this.a.d().h().f("Banner Reload Strategy - ".concat(str));
    }

    public final void a(C4573u0 c4573u0, L2 l2, L2 l22, AbstractC4308f3 abstractC4308f3, boolean z, Long l) {
        s3q0 s3q0Var;
        l2.a(this.b.getViewBinder(), this.l);
        LevelPlayAdInfo c2 = c4573u0.c();
        if (c2 != null) {
            this.f.onAdLoaded(c2);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            IronLog.INTERNAL.error(C4484p0.a(this.a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (l22 != null) {
            l22.a(false);
        }
        if (z) {
            this.n = new Ia(this, l2);
        } else {
            a(l2, abstractC4308f3, l);
        }
    }

    public final void a(IronSourceError ironSourceError, L2 l2, AbstractC4308f3 abstractC4308f3, boolean z, boolean z2, Long l) {
        this.f.b(ironSourceError);
        if (z2) {
            this.n = new Ia(this, l2);
        } else if (z) {
            a(l2, abstractC4308f3, l);
        } else {
            a(l2, abstractC4308f3, this.j);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Ca(C4484p0 c4484p0, W2 w2, long j, long j2, J2 j22, InterfaceC4673za interfaceC4673za, N2 n2, Ff ff, InterfaceC4488p4 interfaceC4488p4, boolean z, int i, zcl zclVar) {
        this(c4484p0, w2, j, j2, j22, interfaceC4673za, n2, r13, interfaceC4488p4, z);
        Ff ff2;
        if ((i & 128) != 0) {
            ff2 = new Ef(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        } else {
            ff2 = ff;
        }
    }

    public final void a(L2 l2, AbstractC4308f3 abstractC4308f3, Long l) {
        C4602vb.a(this.a, new fv8(this, l2, abstractC4308f3, l, 0), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ca ca, L2 l2, AbstractC4308f3 abstractC4308f3, Long l) {
        if (Ig.a(ca.b, new Rect())) {
            ca.a.c(AbstractRunnableC4408ke.a.a(ca.new d(l2, abstractC4308f3)));
        } else if (!ca.b.getViewTreeObserver().isAlive()) {
            ca.a.c(AbstractRunnableC4408ke.a.a(ca.new e(l2, l)));
        } else {
            ca.b.getViewTreeObserver().addOnGlobalLayoutListener(ca.new f(l2, abstractC4308f3, l));
        }
    }

    public static /* synthetic */ void a(Ca ca, L2 l2, AbstractC4308f3 abstractC4308f3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        ca.a(l2, abstractC4308f3, z);
    }

    public final void a(L2 l2, AbstractC4308f3 abstractC4308f3, boolean z) {
        L2 a2 = this.g.a(false);
        Ja ja = new Ja(this, l2, a2, this.i.a(), z);
        a(abstractC4308f3);
        this.n = ja;
        a2.a(this.k);
    }

    private final void a(AbstractC4308f3 abstractC4308f3) {
        this.a.d().h().a(abstractC4308f3.c(), abstractC4308f3.b(), abstractC4308f3.a());
    }

    @Override // com.ironsource.InterfaceC4655ya
    public void a(InterfaceC4673za interfaceC4673za) {
        this.f = interfaceC4673za;
    }
}
