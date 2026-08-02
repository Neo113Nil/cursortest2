package com.ironsource;

import com.ironsource.E0;
import com.ironsource.InterfaceC4153k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4261q0 {

    @NotNull
    private final AbstractC4386x0 a;

    @NotNull
    private final T0 b;

    @Nullable
    private L0 c;

    @Nullable
    private InterfaceC4422z0 d;

    @NotNull
    private final Hg e;

    @NotNull
    private final WeakReference<J0> f;

    @Nullable
    private C4051e5 g;

    @NotNull
    private final C4391x5 h;

    public AbstractC4261q0(@NotNull C4243p0 c4243p0, @NotNull AbstractC4386x0 abstractC4386x0, @NotNull J0 j0) {
        c4243p0.getClass();
        abstractC4386x0.getClass();
        j0.getClass();
        this.a = abstractC4386x0;
        T0 t0 = new T0(c4243p0, abstractC4386x0, E0.b.MEDIATION);
        this.b = t0;
        this.e = new Hg(t0, abstractC4386x0, false, c(), null, null, 48, null);
        this.f = new WeakReference<>(j0);
        this.h = t0.f();
        IronLog.INTERNAL.verbose("adFormat = " + abstractC4386x0.b().a() + ", adUnitId = " + abstractC4386x0.b().c());
    }

    private final b c() {
        return new b();
    }

    @NotNull
    public abstract E a();

    public final void a(int i, @NotNull String str) {
        str.getClass();
        IronLog.INTERNAL.verbose(a("errorCode = " + i + ", errorReason = " + str));
        this.h.e().a(C4051e5.a(this.g), i, str, this.a.u());
        L0 l0 = this.c;
        if (l0 != null) {
            l0.b(new IronSourceError(i, str));
        }
    }

    @NotNull
    public C4296s0 b() {
        return new C4296s0(this.a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public InterfaceC4153k0 d() {
        if (this.e.g()) {
            return InterfaceC4153k0.b.a;
        }
        return new InterfaceC4153k0.a(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final AbstractC4386x0 e() {
        return this.a;
    }

    @NotNull
    public final T0 f() {
        return this.b;
    }

    @Nullable
    public final C4077fd g() {
        return this.a.b().f();
    }

    @NotNull
    public final String h() {
        return this.a.l();
    }

    @Nullable
    public final InterfaceC4422z0 i() {
        return this.d;
    }

    @Nullable
    public final L0 j() {
        return this.c;
    }

    @NotNull
    public final Hg k() {
        return this.e;
    }

    public final void b(@Nullable L0 l0) {
        this.c = l0;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.q0$b */
    public static final class b implements Pg {
        public b() {
        }

        @Override // com.ironsource.Pg
        public void a(@NotNull B b) {
            b.getClass();
            AbstractC4261q0.this.f().f().a().e(AbstractC4261q0.this.h());
            L0 j = AbstractC4261q0.this.j();
            if (j != null) {
                j.b(new C4332u0(AbstractC4261q0.this, b.e()));
            }
        }

        @Override // com.ironsource.Pg
        public void b(@NotNull B b) {
            b.getClass();
            AbstractC4261q0.this.h.e().a(C4051e5.a(AbstractC4261q0.this.g), AbstractC4261q0.this.e().u());
            L0 j = AbstractC4261q0.this.j();
            if (j != null) {
                j.a(new C4332u0(AbstractC4261q0.this, b.e()));
            }
        }

        @Override // com.ironsource.Pg
        public void a(int i, @NotNull String str) {
            str.getClass();
            AbstractC4261q0.this.a(i, str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.q0$a */
    public class a implements F {
        public a() {
        }

        @Override // com.ironsource.F
        public void a(@NotNull B b, @NotNull IronSourceError ironSourceError) {
            b.getClass();
            ironSourceError.getClass();
            IronLog.INTERNAL.verbose(AbstractC4261q0.this.a(b.q()));
            AbstractC4261q0.this.h.a().a(AbstractC4261q0.this.h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), null);
            InterfaceC4422z0 i = AbstractC4261q0.this.i();
            if (i != null) {
                i.c(ironSourceError);
            }
        }

        @Override // com.ironsource.F
        public void b(@NotNull B b) {
            b.getClass();
            IronLog.INTERNAL.verbose(AbstractC4261q0.this.a(b.q()));
            AbstractC4261q0.this.k().d(b);
            AbstractC4261q0.this.h.a().g(AbstractC4261q0.this.h());
            AbstractC4261q0.this.f().l().b(AbstractC4261q0.this.e().b().a());
        }

        @Override // com.ironsource.F
        public void a(@NotNull B b) {
            b.getClass();
            AbstractC4261q0.this.h.a().a(AbstractC4261q0.this.h());
            J0 j0 = (J0) AbstractC4261q0.this.f.get();
            if (j0 != null) {
                j0.e();
            }
        }
    }

    public final void a(@Nullable InterfaceC4422z0 interfaceC4422z0) {
        this.d = interfaceC4422z0;
    }

    public void a(@NotNull L0 l0) {
        l0.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.b.a(b());
        this.c = l0;
        this.h.a(this.a.u());
        this.g = new C4051e5();
        this.e.a(a());
    }

    public final void a(@NotNull K k, @NotNull InterfaceC4422z0 interfaceC4422z0) {
        k.getClass();
        interfaceC4422z0.getClass();
        this.d = interfaceC4422z0;
        this.e.a(k, false);
    }

    public final void a(boolean z) {
        IronLog.INTERNAL.verbose(C4243p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.e.c();
        if (z) {
            this.b.f().e().a(this.b.g());
        }
    }

    @NotNull
    public final String a(@Nullable String str) {
        return C4243p0.a(this.b, str, (String) null, 2, (Object) null);
    }
}
