package com.ironsource;

import com.ironsource.F0;
import com.ironsource.InterfaceC4394k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4502q0 {
    private final AbstractC4627x0 a;
    private final V0 b;
    private M0 c;
    private InterfaceC4663z0 d;
    private final Kg e;
    private final WeakReference<K0> f;
    private C4328g5 g;
    private final C4668z5 h;

    /* renamed from: com.ironsource.q0$b */
    public static final class b implements Sg {
        public b() {
        }

        @Override // com.ironsource.Sg
        public void a(int i, String str) {
            AbstractC4502q0.this.a(i, str);
        }

        @Override // com.ironsource.Sg
        public void b(B b) {
            AbstractC4502q0.this.h.e().a(C4328g5.a(AbstractC4502q0.this.g), AbstractC4502q0.this.e().u());
            M0 j = AbstractC4502q0.this.j();
            if (j != null) {
                j.a(new C4573u0(AbstractC4502q0.this, b.e()));
            }
        }

        @Override // com.ironsource.Sg
        public void a(B b) {
            AbstractC4502q0.this.f().d().a().e(AbstractC4502q0.this.h());
            M0 j = AbstractC4502q0.this.j();
            if (j != null) {
                j.b(new C4573u0(AbstractC4502q0.this, b.e()));
            }
        }
    }

    public AbstractC4502q0(C4484p0 c4484p0, AbstractC4627x0 abstractC4627x0, K0 k0) {
        this.a = abstractC4627x0;
        V0 v0 = new V0(c4484p0, abstractC4627x0, F0.b.MEDIATION);
        this.b = v0;
        this.e = new Kg(v0, abstractC4627x0, false, c(), null, null, 48, null);
        this.f = new WeakReference<>(k0);
        this.h = v0.d();
        IronLog.INTERNAL.verbose("adFormat = " + abstractC4627x0.b().a() + ", adUnitId = " + abstractC4627x0.b().c());
    }

    public abstract E a();

    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceC4394k0 d() {
        if (this.e.h()) {
            return InterfaceC4394k0.b.a;
        }
        return new InterfaceC4394k0.a(null, 1, 0 == true ? 1 : 0);
    }

    public final AbstractC4627x0 e() {
        return this.a;
    }

    public final V0 f() {
        return this.b;
    }

    public final C4336gd g() {
        return this.a.b().f();
    }

    public final String h() {
        return this.a.l();
    }

    public final InterfaceC4663z0 i() {
        return this.d;
    }

    public final M0 j() {
        return this.c;
    }

    public final Kg k() {
        return this.e;
    }

    private final b c() {
        return new b();
    }

    public final void a(InterfaceC4663z0 interfaceC4663z0) {
        this.d = interfaceC4663z0;
    }

    public final void b(M0 m0) {
        this.c = m0;
    }

    public void a(M0 m0) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.b.a(b());
        this.c = m0;
        this.h.a(this.a.u());
        this.g = new C4328g5();
        this.e.a(a());
    }

    public C4537s0 b() {
        return new C4537s0(this.a.b());
    }

    /* renamed from: com.ironsource.q0$a */
    public class a implements F {
        public a() {
        }

        @Override // com.ironsource.F
        public void a(B b, IronSourceError ironSourceError) {
            IronLog.INTERNAL.verbose(AbstractC4502q0.this.a(b.q()));
            AbstractC4502q0.this.h.a().a(AbstractC4502q0.this.h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), null);
            InterfaceC4663z0 i = AbstractC4502q0.this.i();
            if (i != null) {
                i.c(ironSourceError);
            }
        }

        @Override // com.ironsource.F
        public void b(B b) {
            IronLog.INTERNAL.verbose(AbstractC4502q0.this.a(b.q()));
            AbstractC4502q0.this.k().d(b);
            AbstractC4502q0.this.h.a().g(AbstractC4502q0.this.h());
            AbstractC4502q0.this.f().k().b(AbstractC4502q0.this.e().b().a());
        }

        @Override // com.ironsource.F
        public void a(B b) {
            AbstractC4502q0.this.h.a().a(AbstractC4502q0.this.h());
            K0 k0 = (K0) AbstractC4502q0.this.f.get();
            if (k0 != null) {
                k0.e();
            }
        }
    }

    public final void a(K k, InterfaceC4663z0 interfaceC4663z0) {
        this.d = interfaceC4663z0;
        this.e.a(k, false);
    }

    public final void a(boolean z) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.e.d();
        if (z) {
            this.b.d().e().a(this.b.e());
        }
    }

    public final void a(int i, String str) {
        IronLog.INTERNAL.verbose(a("errorCode = " + i + ", errorReason = " + str));
        this.h.e().a(C4328g5.a(this.g), i, str, this.a.u());
        M0 m0 = this.c;
        if (m0 != null) {
            m0.a(new IronSourceError(i, str));
        }
    }

    public final String a(String str) {
        return C4484p0.a(this.b, str, (String) null, 2, (Object) null);
    }
}
