package com.ironsource;

import com.ironsource.F0;
import com.ironsource.InterfaceC2498k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC2606q0 {
    private final AbstractC2731x0 a;
    private final S6 b;
    private final V0 c;
    private M0 d;
    private InterfaceC2767z0 e;
    private final Eg f;
    private final WeakReference<K0> g;
    private C2432g5 h;
    private final C2772z5 i;

    /* renamed from: com.ironsource.q0$b */
    public static final class b implements Mg {
        b() {
        }

        @Override // com.ironsource.Mg
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            AbstractC2606q0.this.a(i, errorReason);
        }

        @Override // com.ironsource.Mg
        public void b(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC2606q0.this.i.e().a(C2432g5.a(AbstractC2606q0.this.h), AbstractC2606q0.this.e().u());
            M0 j = AbstractC2606q0.this.j();
            if (j != null) {
                j.a(new C2677u0(AbstractC2606q0.this, instance.e()));
            }
        }

        @Override // com.ironsource.Mg
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC2606q0.this.f().e().a().e(AbstractC2606q0.this.h());
            M0 j = AbstractC2606q0.this.j();
            if (j != null) {
                j.b(new C2677u0(AbstractC2606q0.this, instance.e()));
            }
        }
    }

    public AbstractC2606q0(C2588p0 adTools, AbstractC2731x0 adUnitData, K0 listener, S6 taskScheduler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.a = adUnitData;
        this.b = taskScheduler;
        V0 v0 = new V0(adTools, adUnitData, F0.b.MEDIATION);
        this.c = v0;
        this.f = new Eg(v0, adUnitData, false, c(), null, null, 48, null);
        this.g = new WeakReference<>(listener);
        this.i = v0.e();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    protected abstract E a();

    public InterfaceC2498k0 d() {
        return this.f.h() ? InterfaceC2498k0.b.a : new InterfaceC2498k0.a(null, 1, null);
    }

    protected final AbstractC2731x0 e() {
        return this.a;
    }

    protected final V0 f() {
        return this.c;
    }

    protected final C2440gd g() {
        return this.a.b().f();
    }

    protected final String h() {
        return this.a.l();
    }

    protected final InterfaceC2767z0 i() {
        return this.e;
    }

    protected final M0 j() {
        return this.d;
    }

    protected final Eg k() {
        return this.f;
    }

    private final b c() {
        return new b();
    }

    protected final void a(InterfaceC2767z0 interfaceC2767z0) {
        this.e = interfaceC2767z0;
    }

    protected final void b(M0 m0) {
        this.d = m0;
    }

    public void a(M0 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C2588p0.a(this.c, (String) null, (String) null, 3, (Object) null));
        this.c.a(b());
        this.d = loadListener;
        this.i.a(this.a.u());
        this.h = new C2432g5();
        this.f.a(a());
    }

    public C2641s0 b() {
        return new C2641s0(this.a.b());
    }

    /* renamed from: com.ironsource.q0$a */
    protected class a implements F {
        public a() {
        }

        @Override // com.ironsource.F
        public void a(B instance, IronSourceError error) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.INTERNAL.verbose(AbstractC2606q0.this.a(instance.q()));
            AbstractC2606q0.this.i.a().a(AbstractC2606q0.this.h(), error.getErrorCode(), error.getErrorMessage(), null);
            InterfaceC2767z0 i = AbstractC2606q0.this.i();
            if (i != null) {
                i.c(error);
            }
        }

        @Override // com.ironsource.F
        public void b(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC2606q0.this.a(instance.q()));
            AbstractC2606q0.this.k().d(instance);
            AbstractC2606q0.this.i.a().g(AbstractC2606q0.this.h());
            AbstractC2606q0.this.f().l().b(AbstractC2606q0.this.e().b().a());
        }

        @Override // com.ironsource.F
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC2606q0.this.i.a().a(AbstractC2606q0.this.h());
            K0 k0 = (K0) AbstractC2606q0.this.g.get();
            if (k0 != null) {
                k0.e();
            }
        }
    }

    public final void a(K adInstancePresenter, InterfaceC2767z0 displayListener) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.e = displayListener;
        this.f.a(adInstancePresenter, false);
    }

    public final void a(boolean z) {
        IronLog.INTERNAL.verbose(C2588p0.a(this.c, (String) null, (String) null, 3, (Object) null));
        this.f.d();
        if (z) {
            this.c.e().e().a(this.c.f());
        }
    }

    protected final void a(int i, String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i + ", errorReason = " + errorReason));
        this.i.e().a(C2432g5.a(this.h), i, errorReason, this.a.u());
        M0 m0 = this.d;
        if (m0 != null) {
            m0.a(new IronSourceError(i, errorReason));
        }
    }

    protected final String a(String str) {
        return C2588p0.a(this.c, str, (String) null, 2, (Object) null);
    }

    public /* synthetic */ AbstractC2606q0(C2588p0 c2588p0, AbstractC2731x0 abstractC2731x0, K0 k0, S6 s6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2588p0, abstractC2731x0, k0, (i & 8) != 0 ? new S6(T6.a(c2588p0.a())) : s6);
    }
}
