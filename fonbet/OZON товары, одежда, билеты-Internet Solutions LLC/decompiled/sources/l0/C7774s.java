package l0;

import B1.m0;
import S0.A1;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C8004n;
import m0.C8010q;
import m0.D0;
import m0.H0;
import m0.W0;
import org.jetbrains.annotations.NotNull;

/* renamed from: l0.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7774s<S> implements r<S> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D0<S> f72132a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC6250b f72133b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f72134c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.collection.L<S, A1<Z1.q>> f72135d;

    /* renamed from: l0.s$a */
    public static final class a implements B1.j0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C3991w0 f72136a;

        public a(boolean z11) {
            C3991w0 f7;
            f7 = n1.f(Boolean.valueOf(z11), D1.f25195a);
            this.f72136a = f7;
        }

        @Override // B1.j0
        @NotNull
        public final Object M(@NotNull Z1.d dVar, Object obj) {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.f72136a.getValue()).booleanValue();
        }

        public final void b(boolean z11) {
            this.f72136a.setValue(Boolean.valueOf(z11));
        }
    }

    /* renamed from: l0.s$b */
    private final class b extends f0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final D0<S>.a<Z1.q, C8010q> f72137a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC3978p0 f72138b;

        /* renamed from: l0.s$b$a */
        static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7774s<S> f72140b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ B1.m0 f72141c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f72142d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7774s<S> c7774s, B1.m0 m0Var, long j11) {
                super(1);
                this.f72140b = c7774s;
                this.f72141c = m0Var;
                this.f72142d = j11;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(m0.a aVar) {
                InterfaceC6250b e11 = this.f72140b.e();
                B1.m0 m0Var = this.f72141c;
                aVar.f(m0Var, e11.a(Z1.r.a(m0Var.u0(), m0Var.l0()), this.f72142d, Z1.s.Ltr), 0.0f);
                return Unit.f71690a;
            }
        }

        /* renamed from: l0.s$b$b, reason: collision with other inner class name */
        static final class C1194b extends AbstractC7737t implements Function1<D0.b<S>, m0.H<Z1.q>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7774s<S> f72143b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C7774s<S>.b f72144c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1194b(C7774s<S> c7774s, C7774s<S>.b bVar) {
                super(1);
                this.f72143b = c7774s;
                this.f72144c = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final m0.H<Z1.q> invoke(Object obj) {
                m0.H<Z1.q> b11;
                D0.b bVar = (D0.b) obj;
                C7774s<S> c7774s = this.f72143b;
                A1 a12 = (A1) c7774s.f().b(bVar.c());
                long e11 = a12 != null ? ((Z1.q) a12.getValue()).e() : 0L;
                A1 a13 = (A1) c7774s.f().b(bVar.b());
                long e12 = a13 != null ? ((Z1.q) a13.getValue()).e() : 0L;
                i0 value = this.f72144c.a().getValue();
                return (value == null || (b11 = value.b(e11, e12)) == null) ? C8004n.c(0.0f, null, 7) : b11;
            }
        }

        /* renamed from: l0.s$b$c */
        static final class c extends AbstractC7737t implements Function1<S, Z1.q> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7774s<S> f72145b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C7774s<S> c7774s) {
                super(1);
                this.f72145b = c7774s;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Z1.q invoke(Object obj) {
                A1<Z1.q> b11 = this.f72145b.f().b(obj);
                return Z1.q.a(b11 != null ? b11.getValue().e() : 0L);
            }
        }

        public b(@NotNull D0.a aVar, @NotNull InterfaceC3978p0 interfaceC3978p0) {
            this.f72137a = aVar;
            this.f72138b = interfaceC3978p0;
        }

        @Override // B1.J
        @NotNull
        public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
            B1.W z02;
            B1.m0 a02 = u11.a0(j11);
            C7774s<S> c7774s = C7774s.this;
            D0.a.C1247a a11 = this.f72137a.a(new C1194b(c7774s, this), new c(c7774s));
            c7774s.getClass();
            long a12 = y11.R0() ? Z1.r.a(a02.u0(), a02.l0()) : ((Z1.q) a11.getValue()).e();
            z02 = y11.z0((int) (a12 >> 32), (int) (4294967295L & a12), kotlin.collections.U.c(), new a(c7774s, a02, a12));
            return z02;
        }

        @NotNull
        public final A1<i0> a() {
            return this.f72138b;
        }
    }

    public C7774s(@NotNull D0 d02, @NotNull InterfaceC6250b interfaceC6250b) {
        C3991w0 f7;
        this.f72132a = d02;
        this.f72133b = interfaceC6250b;
        f7 = n1.f(Z1.q.a(0L), D1.f25195a);
        this.f72134c = f7;
        long[] jArr = androidx.collection.W.f38661a;
        this.f72135d = new androidx.collection.L<>((Object) null);
    }

    @Override // m0.D0.b
    public final S b() {
        return this.f72132a.m().b();
    }

    @Override // m0.D0.b
    public final S c() {
        return this.f72132a.m().c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final androidx.compose.ui.e d(@NotNull N n11, InterfaceC3967k interfaceC3967k) {
        boolean n12 = interfaceC3967k.n(this);
        Object C11 = interfaceC3967k.C();
        if (n12 || C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(Boolean.FALSE, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        InterfaceC3978p0 l11 = n1.l(n11.b(), interfaceC3967k);
        D0<S> d02 = this.f72132a;
        if (Intrinsics.d(d02.h(), d02.n())) {
            interfaceC3978p0.setValue(Boolean.FALSE);
        } else if (l11.getValue() != 0) {
            interfaceC3978p0.setValue(Boolean.TRUE);
        }
        if (!((Boolean) interfaceC3978p0.getValue()).booleanValue()) {
            interfaceC3967k.o(249353726);
            interfaceC3967k.k();
            return androidx.compose.ui.e.f40358c0;
        }
        interfaceC3967k.o(249037309);
        D0.a c11 = H0.c(this.f72132a, W0.j(), null, interfaceC3967k, 0, 2);
        boolean n13 = interfaceC3967k.n(c11);
        Object C12 = interfaceC3967k.C();
        if (n13 || C12 == InterfaceC3967k.a.a()) {
            i0 i0Var = (i0) l11.getValue();
            C12 = ((i0Var == null || i0Var.a()) ? C6988h.b(androidx.compose.ui.e.f40358c0) : androidx.compose.ui.e.f40358c0).l0(new b(c11, l11));
            interfaceC3967k.x(C12);
        }
        androidx.compose.ui.e eVar = (androidx.compose.ui.e) C12;
        interfaceC3967k.k();
        return eVar;
    }

    @NotNull
    public final InterfaceC6250b e() {
        return this.f72133b;
    }

    @NotNull
    public final androidx.collection.L<S, A1<Z1.q>> f() {
        return this.f72135d;
    }

    public final void g(@NotNull InterfaceC6250b interfaceC6250b) {
        this.f72133b = interfaceC6250b;
    }

    public final void h(long j11) {
        this.f72134c.setValue(Z1.q.a(j11));
    }
}
