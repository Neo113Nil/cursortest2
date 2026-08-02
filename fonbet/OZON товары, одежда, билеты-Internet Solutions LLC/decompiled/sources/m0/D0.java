package m0;

import Bl0.C2652m;
import S0.A1;
import S0.C3959g1;
import S0.C3969l;
import S0.C3985t0;
import S0.C3989v0;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.n1;
import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7989f0;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* loaded from: classes.dex */
public final class D0<S> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S0<S> f73475a;

    /* renamed from: b, reason: collision with root package name */
    private final D0<?> f73476b;

    /* renamed from: c, reason: collision with root package name */
    private final String f73477c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73478d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73479e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3989v0 f73480f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3989v0 f73481g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73482h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1.u<D0<S>.d<?, ?>> f73483i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1.u<D0<?>> f73484j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73485k;

    /* renamed from: l, reason: collision with root package name */
    private long f73486l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final A1 f73487m;

    /* loaded from: classes8.dex */
    public final class a<T, V extends AbstractC8015t> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final U0<T, V> f73488a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C3991w0 f73489b;

        /* renamed from: m0.D0$a$a, reason: collision with other inner class name */
        public final class C1247a<T, V extends AbstractC8015t> implements A1<T> {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final D0<S>.d<T, V> f73491a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private AbstractC7737t f73492b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private AbstractC7737t f73493c;

            /* JADX WARN: Multi-variable type inference failed */
            public C1247a(@NotNull D0<S>.d<T, V> dVar, @NotNull Function1<? super b<S>, ? extends H<T>> function1, @NotNull Function1<? super S, ? extends T> function12) {
                this.f73491a = dVar;
                this.f73492b = (AbstractC7737t) function1;
                this.f73493c = (AbstractC7737t) function12;
            }

            @NotNull
            public final D0<S>.d<T, V> b() {
                return this.f73491a;
            }

            @Override // S0.A1
            public final T getValue() {
                v(D0.this.m());
                return this.f73491a.getValue();
            }

            @NotNull
            public final Function1<S, T> k() {
                return (Function1<S, T>) this.f73493c;
            }

            @NotNull
            public final Function1<b<S>, H<T>> m() {
                return (Function1<b<S>, H<T>>) this.f73492b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void o(@NotNull Function1<? super S, ? extends T> function1) {
                this.f73493c = (AbstractC7737t) function1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void s(@NotNull Function1<? super b<S>, ? extends H<T>> function1) {
                this.f73492b = (AbstractC7737t) function1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
            /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
            /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
            /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
            public final void v(@NotNull b<S> bVar) {
                Object invoke = this.f73493c.invoke(bVar.b());
                boolean p11 = D0.this.p();
                D0<S>.d<T, V> dVar = this.f73491a;
                if (p11) {
                    dVar.C(this.f73493c.invoke(bVar.c()), invoke, (H) this.f73492b.invoke(bVar));
                } else {
                    dVar.E(invoke, (H) this.f73492b.invoke(bVar));
                }
            }
        }

        public a(@NotNull U0<T, V> u02, @NotNull String str) {
            C3991w0 f7;
            this.f73488a = u02;
            f7 = n1.f(null, D1.f25195a);
            this.f73489b = f7;
        }

        @NotNull
        public final C1247a a(@NotNull Function1 function1, @NotNull Function1 function12) {
            D0<S>.C1247a<T, V>.a<T, V> b11 = b();
            D0<S> d02 = D0.this;
            if (b11 == null) {
                Object invoke = function12.invoke(d02.h());
                Object invoke2 = function12.invoke(d02.h());
                U0<T, V> u02 = this.f73488a;
                AbstractC8015t abstractC8015t = (AbstractC8015t) ((V0) u02).a().invoke(invoke2);
                abstractC8015t.d();
                b11 = new C1247a<>(d02.new d(invoke, abstractC8015t, u02), function1, function12);
                this.f73489b.setValue(b11);
                d02.c(b11.b());
            }
            b11.o(function12);
            b11.s(function1);
            b11.v(d02.m());
            return b11;
        }

        public final D0<S>.C1247a<T, V>.a<T, V> b() {
            return (C1247a) this.f73489b.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c() {
            D0<S>.C1247a<T, V>.a<T, V> b11 = b();
            if (b11 != null) {
                D0<S>.d<T, V> b12 = b11.b();
                Function1<S, T> k11 = b11.k();
                D0<S> d02 = D0.this;
                b12.C(k11.invoke(d02.m().c()), b11.k().invoke(d02.m().b()), b11.m().invoke(d02.m()));
            }
        }
    }

    public interface b<S> {
        default boolean a(S s11, S s12) {
            return Intrinsics.d(s11, c()) && Intrinsics.d(s12, b());
        }

        S b();

        S c();
    }

    private static final class c<S> implements b<S> {

        /* renamed from: a, reason: collision with root package name */
        private final S f73495a;

        /* renamed from: b, reason: collision with root package name */
        private final S f73496b;

        public c(S s11, S s12) {
            this.f73495a = s11;
            this.f73496b = s12;
        }

        @Override // m0.D0.b
        public final S b() {
            return this.f73496b;
        }

        @Override // m0.D0.b
        public final S c() {
            return this.f73495a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.d(this.f73495a, bVar.c())) {
                return Intrinsics.d(this.f73496b, bVar.b());
            }
            return false;
        }

        public final int hashCode() {
            S s11 = this.f73495a;
            int hashCode = (s11 != null ? s11.hashCode() : 0) * 31;
            S s12 = this.f73496b;
            return hashCode + (s12 != null ? s12.hashCode() : 0);
        }
    }

    public final class d<T, V extends AbstractC8015t> implements A1<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final U0<T, V> f73497a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C3991w0 f73498b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C3991w0 f73499c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final C3991w0 f73500d;

        /* renamed from: e, reason: collision with root package name */
        private C7989f0.b f73501e;

        /* renamed from: f, reason: collision with root package name */
        private C0<T, V> f73502f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final C3991w0 f73503g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final C3985t0 f73504h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f73505i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final C3991w0 f73506j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private V f73507k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final C3989v0 f73508l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f73509m;

        /* renamed from: n, reason: collision with root package name */
        @NotNull
        private final C8011q0 f73510n;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, @NotNull AbstractC8015t abstractC8015t, @NotNull U0 u02) {
            C3991w0 f7;
            C3991w0 f11;
            C3991w0 f12;
            C3991w0 f13;
            C3991w0 f14;
            this.f73497a = u02;
            f7 = n1.f(obj, D1.f25195a);
            this.f73498b = f7;
            T t2 = null;
            f11 = n1.f(C8004n.c(0.0f, null, 7), D1.f25195a);
            this.f73499c = f11;
            f12 = n1.f(new C0((H) f11.getValue(), u02, obj, f7.getValue(), abstractC8015t), D1.f25195a);
            this.f73500d = f12;
            f13 = n1.f(Boolean.TRUE, D1.f25195a);
            this.f73503g = f13;
            this.f73504h = S0.C0.a(-1.0f);
            f14 = n1.f(obj, D1.f25195a);
            this.f73506j = f14;
            this.f73507k = abstractC8015t;
            this.f73508l = C3959g1.a(k().c());
            Float f15 = l1.a().get(u02);
            if (f15 != null) {
                float floatValue = f15.floatValue();
                V invoke = u02.a().invoke(obj);
                int b11 = invoke.b();
                for (int i11 = 0; i11 < b11; i11++) {
                    invoke.e(floatValue, i11);
                }
                t2 = this.f73497a.b().invoke(invoke);
            }
            this.f73510n = C8004n.c(0.0f, t2, 3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v4, types: [m0.r0] */
        private final void B(T t2, boolean z11) {
            C0<T, V> c02 = this.f73502f;
            T f7 = c02 != null ? c02.f() : null;
            C3991w0 c3991w0 = this.f73498b;
            boolean d11 = Intrinsics.d(f7, c3991w0.getValue());
            C3989v0 c3989v0 = this.f73508l;
            C3991w0 c3991w02 = this.f73500d;
            H h11 = this.f73510n;
            if (d11) {
                c3991w02.setValue(new C0(h11, this.f73497a, t2, t2, this.f73507k.c()));
                this.f73505i = true;
                c3989v0.t(k().c());
                return;
            }
            C3991w0 c3991w03 = this.f73499c;
            if (!z11 || this.f73509m) {
                h11 = (H) c3991w03.getValue();
            } else if (((H) c3991w03.getValue()) instanceof C8011q0) {
                h11 = (H) c3991w03.getValue();
            }
            D0<S> d02 = D0.this;
            if (d02.l() > 0) {
                h11 = new C8012r0(h11, d02.l());
            }
            c3991w02.setValue(new C0(h11, this.f73497a, t2, c3991w0.getValue(), this.f73507k));
            c3989v0.t(k().c());
            this.f73505i = false;
            D0.b(d02);
        }

        public final void A(T t2) {
            this.f73506j.setValue(t2);
        }

        public final void C(T t2, T t11, @NotNull H<T> h11) {
            this.f73498b.setValue(t11);
            this.f73499c.setValue(h11);
            if (Intrinsics.d(k().h(), t2) && Intrinsics.d(k().f(), t11)) {
                return;
            }
            B(t2, false);
        }

        public final void D() {
            C0<T, V> c02;
            C7989f0.b bVar = this.f73501e;
            if (bVar == null || (c02 = this.f73502f) == null) {
                return;
            }
            long d11 = C6915b.d(bVar.c() * bVar.g());
            T e11 = c02.e(d11);
            if (this.f73505i) {
                k().j(e11);
            }
            k().i(e11);
            this.f73508l.t(k().c());
            if (this.f73504h.getFloatValue() == -2.0f || this.f73505i) {
                A(e11);
            } else {
                x(D0.this.l());
            }
            if (d11 < bVar.c()) {
                bVar.k(false);
            } else {
                this.f73501e = null;
                this.f73502f = null;
            }
        }

        public final void E(T t2, @NotNull H<T> h11) {
            if (this.f73505i) {
                C0<T, V> c02 = this.f73502f;
                if (Intrinsics.d(t2, c02 != null ? c02.f() : null)) {
                    return;
                }
            }
            C3991w0 c3991w0 = this.f73498b;
            boolean d11 = Intrinsics.d(c3991w0.getValue(), t2);
            C3985t0 c3985t0 = this.f73504h;
            if (d11 && c3985t0.getFloatValue() == -1.0f) {
                return;
            }
            c3991w0.setValue(t2);
            this.f73499c.setValue(h11);
            B(c3985t0.getFloatValue() == -3.0f ? t2 : this.f73506j.getValue(), !s());
            this.f73503g.setValue(Boolean.valueOf(c3985t0.getFloatValue() == -3.0f));
            if (c3985t0.getFloatValue() >= 0.0f) {
                A(k().e((long) (c3985t0.getFloatValue() * k().c())));
            } else if (c3985t0.getFloatValue() == -3.0f) {
                A(t2);
            }
            this.f73505i = false;
            z(-1.0f);
        }

        public final void b() {
            this.f73502f = null;
            this.f73501e = null;
            this.f73505i = false;
        }

        @Override // S0.A1
        public final T getValue() {
            return this.f73506j.getValue();
        }

        @NotNull
        public final C0<T, V> k() {
            return (C0) this.f73500d.getValue();
        }

        public final long m() {
            return this.f73508l.n();
        }

        public final C7989f0.b o() {
            return this.f73501e;
        }

        public final boolean s() {
            return ((Boolean) this.f73503g.getValue()).booleanValue();
        }

        @NotNull
        public final String toString() {
            return "current value: " + this.f73506j.getValue() + ", target: " + this.f73498b.getValue() + ", spec: " + ((H) this.f73499c.getValue());
        }

        public final void v(long j11, boolean z11) {
            if (z11) {
                j11 = k().c();
            }
            A(k().e(j11));
            this.f73507k = k().g(j11);
            if (k().b(j11)) {
                this.f73503g.setValue(Boolean.TRUE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void w(float f7) {
            if (f7 != -4.0f && f7 != -5.0f) {
                z(f7);
                return;
            }
            C0<T, V> c02 = this.f73502f;
            if (c02 != null) {
                k().i(c02.f());
                this.f73501e = null;
                this.f73502f = null;
            }
            Object h11 = f7 == -4.0f ? k().h() : k().f();
            k().i(h11);
            k().j(h11);
            A(h11);
            this.f73508l.t(k().c());
        }

        public final void x(long j11) {
            if (this.f73504h.getFloatValue() == -1.0f) {
                this.f73509m = true;
                if (Intrinsics.d(k().f(), k().h())) {
                    A(k().f());
                } else {
                    A(k().e(j11));
                    this.f73507k = k().g(j11);
                }
            }
        }

        public final void y(@NotNull C7989f0.b bVar) {
            if (!Intrinsics.d(k().f(), k().h())) {
                this.f73502f = k();
                this.f73501e = bVar;
            }
            C3991w0 c3991w0 = this.f73506j;
            T value = c3991w0.getValue();
            T value2 = c3991w0.getValue();
            AbstractC8015t c11 = this.f73507k.c();
            this.f73500d.setValue(new C0(this.f73510n, this.f73497a, value, value2, c11));
            this.f73508l.t(k().c());
            this.f73505i = true;
        }

        public final void z(float f7) {
            this.f73504h.h(f7);
        }
    }

    /* loaded from: classes8.dex */
    static final class e extends AbstractC7737t implements Function1<S0.N, S0.M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xe.M f73512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D0<S> f73513c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(xe.M m11, D0<S> d02) {
            super(1);
            this.f73512b = m11;
            this.f73513c = d02;
        }

        @Override // kotlin.jvm.functions.Function1
        public final S0.M invoke(S0.N n11) {
            C10727i.c(this.f73512b, null, xe.O.UNDISPATCHED, new E0(this.f73513c, null), 1);
            return new F0();
        }
    }

    static final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D0<S> f73514b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f73515c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f73516d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(D0<S> d02, S s11, int i11) {
            super(2);
            this.f73514b = d02;
            this.f73515c = s11;
            this.f73516d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f73516d | 1);
            this.f73514b.e(this.f73515c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function0<Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D0<S> f73517b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(D0<S> d02) {
            super(0);
            this.f73517b = d02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(this.f73517b.f());
        }
    }

    public D0() {
        throw null;
    }

    public D0(@NotNull S0<S> s02, D0<?> d02, String str) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        this.f73475a = s02;
        this.f73476b = d02;
        this.f73477c = str;
        f7 = n1.f(s02.a(), D1.f25195a);
        this.f73478d = f7;
        f11 = n1.f(new c(s02.a(), s02.a()), D1.f25195a);
        this.f73479e = f11;
        this.f73480f = C3959g1.a(0L);
        this.f73481g = C3959g1.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        f12 = n1.f(bool, D1.f25195a);
        this.f73482h = f12;
        this.f73483i = new c1.u<>();
        this.f73484j = new c1.u<>();
        f13 = n1.f(bool, D1.f25195a);
        this.f73485k = f13;
        this.f73487m = n1.e(new g(this));
        s02.f(this);
    }

    public static final void b(D0 d02) {
        d02.f73482h.setValue(Boolean.TRUE);
        if (d02.p()) {
            c1.u<D0<S>.d<?, ?>> uVar = d02.f73483i;
            int size = uVar.size();
            long j11 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                D0<S>.d<?, ?> dVar = uVar.get(i11);
                j11 = Math.max(j11, dVar.m());
                dVar.x(d02.f73486l);
            }
            d02.f73482h.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f() {
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j11 = Math.max(j11, uVar.get(i11).m());
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            j11 = Math.max(j11, uVar2.get(i12).f());
        }
        return j11;
    }

    private final void x() {
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            uVar.get(i11).z(-2.0f);
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            uVar2.get(i12).x();
        }
    }

    public final void A(@NotNull C7989f0.b bVar) {
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            uVar.get(i11).y(bVar);
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            uVar2.get(i12).A(bVar);
        }
    }

    public final void B(long j11) {
        if (this.f73476b == null) {
            this.f73480f.t(j11);
        }
    }

    public final void C(boolean z11) {
        this.f73485k.setValue(Boolean.valueOf(z11));
    }

    public final void D() {
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            uVar.get(i11).D();
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            uVar2.get(i12).D();
        }
    }

    public final void E(S s11) {
        C3991w0 c3991w0 = this.f73478d;
        if (Intrinsics.d(c3991w0.getValue(), s11)) {
            return;
        }
        this.f73479e.setValue(new c(c3991w0.getValue(), s11));
        S0<S> s02 = this.f73475a;
        if (!Intrinsics.d(s02.a(), c3991w0.getValue())) {
            s02.d(c3991w0.getValue());
        }
        c3991w0.setValue(s11);
        if (this.f73481g.n() == Long.MIN_VALUE) {
            this.f73482h.setValue(Boolean.TRUE);
        }
        x();
    }

    public final void c(@NotNull d dVar) {
        this.f73483i.add(dVar);
    }

    public final void d(@NotNull D0 d02) {
        this.f73484j.add(d02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(S s11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1493585151);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(s11) : u11.F(s11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(this) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else if (p()) {
            u11.o(1823992347);
            u11.k();
        } else {
            u11.o(1822507602);
            E(s11);
            if (Intrinsics.d(s11, this.f73475a.a())) {
                if (!(this.f73481g.n() != Long.MIN_VALUE) && !((Boolean) this.f73482h.getValue()).booleanValue()) {
                    u11.o(1823982427);
                    u11.k();
                    u11.k();
                }
            }
            u11.o(1822738893);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a11 = ((S0.D) C11).a();
            boolean F11 = u11.F(a11) | ((i12 & 112) == 32);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new e(a11, this);
                u11.x(C12);
            }
            S0.Q.b(a11, this, (Function1) C12, u11);
            u11.k();
            u11.k();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(this, s11, i11));
        }
    }

    public final void g() {
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            uVar.get(i11).b();
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            uVar2.get(i12).g();
        }
    }

    public final S h() {
        return this.f73475a.a();
    }

    public final boolean i() {
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (uVar.get(i11).o() != null) {
                return true;
            }
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (uVar2.get(i12).i()) {
                return true;
            }
        }
        return false;
    }

    public final String j() {
        return this.f73477c;
    }

    public final long k() {
        return this.f73486l;
    }

    public final long l() {
        D0<?> d02 = this.f73476b;
        return d02 != null ? d02.l() : this.f73480f.n();
    }

    @NotNull
    public final b<S> m() {
        return (b) this.f73479e.getValue();
    }

    public final S n() {
        return (S) this.f73478d.getValue();
    }

    public final long o() {
        return ((Number) this.f73487m.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.f73485k.getValue()).booleanValue();
    }

    public final void q() {
        t();
        this.f73475a.g();
    }

    public final void r(float f7, long j11) {
        C3989v0 c3989v0 = this.f73481g;
        if (c3989v0.n() == Long.MIN_VALUE) {
            c3989v0.t(j11);
            this.f73475a.e(true);
        }
        long n11 = j11 - c3989v0.n();
        if (f7 != 0.0f) {
            n11 = C6915b.d(n11 / f7);
        }
        B(n11);
        s(n11, f7 == 0.0f);
    }

    public final void s(long j11, boolean z11) {
        C3989v0 c3989v0 = this.f73481g;
        long n11 = c3989v0.n();
        S0<S> s02 = this.f73475a;
        boolean z12 = true;
        if (n11 == Long.MIN_VALUE) {
            c3989v0.t(j11);
            s02.e(true);
        } else if (!s02.c()) {
            s02.e(true);
        }
        this.f73482h.setValue(Boolean.FALSE);
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            D0<S>.d<?, ?> dVar = uVar.get(i11);
            if (!dVar.s()) {
                dVar.v(j11, z11);
            }
            if (!dVar.s()) {
                z12 = false;
            }
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            D0<?> d02 = uVar2.get(i12);
            T value = d02.f73478d.getValue();
            S0<?> s03 = d02.f73475a;
            if (!Intrinsics.d(value, s03.a())) {
                d02.s(j11, z11);
            }
            if (!Intrinsics.d(d02.f73478d.getValue(), s03.a())) {
                z12 = false;
            }
        }
        if (z12) {
            t();
        }
    }

    public final void t() {
        this.f73481g.t(Long.MIN_VALUE);
        S0<S> s02 = this.f73475a;
        if (s02 instanceof Y) {
            s02.d(this.f73478d.getValue());
        }
        B(0L);
        s02.e(false);
        c1.u<D0<?>> uVar = this.f73484j;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            uVar.get(i11).t();
        }
    }

    @NotNull
    public final String toString() {
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        String str = "Transition animation values: ";
        for (int i11 = 0; i11 < size; i11++) {
            str = str + uVar.get(i11) + ", ";
        }
        return str;
    }

    public final void u(@NotNull D0<S>.d<?, ?> dVar) {
        this.f73483i.remove(dVar);
    }

    public final void v(@NotNull D0 d02) {
        this.f73484j.remove(d02);
    }

    public final void w(float f7) {
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            uVar.get(i11).w(f7);
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            uVar2.get(i12).w(f7);
        }
    }

    public final void y(long j11, Object obj, Object obj2) {
        this.f73481g.t(Long.MIN_VALUE);
        S0<S> s02 = this.f73475a;
        s02.e(false);
        boolean p11 = p();
        C3991w0 c3991w0 = this.f73478d;
        if (!p11 || !Intrinsics.d(s02.a(), obj) || !Intrinsics.d(c3991w0.getValue(), obj2)) {
            if (!Intrinsics.d(s02.a(), obj) && (s02 instanceof Y)) {
                s02.d(obj);
            }
            c3991w0.setValue(obj2);
            C(true);
            this.f73479e.setValue(new c(obj, obj2));
        }
        c1.u<D0<?>> uVar = this.f73484j;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            D0<?> d02 = uVar.get(i11);
            Intrinsics.g(d02, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (d02.p()) {
                d02.y(j11, d02.f73475a.a(), d02.f73478d.getValue());
            }
        }
        c1.u<D0<S>.d<?, ?>> uVar2 = this.f73483i;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            uVar2.get(i12).x(j11);
        }
        this.f73486l = j11;
    }

    public final void z(long j11) {
        C3989v0 c3989v0 = this.f73481g;
        if (c3989v0.n() == Long.MIN_VALUE) {
            c3989v0.t(j11);
        }
        B(j11);
        this.f73482h.setValue(Boolean.FALSE);
        c1.u<D0<S>.d<?, ?>> uVar = this.f73483i;
        int size = uVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            uVar.get(i11).x(j11);
        }
        c1.u<D0<?>> uVar2 = this.f73484j;
        int size2 = uVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            D0<?> d02 = uVar2.get(i12);
            if (!Intrinsics.d(d02.f73478d.getValue(), d02.f73475a.a())) {
                d02.z(j11);
            }
        }
    }
}
