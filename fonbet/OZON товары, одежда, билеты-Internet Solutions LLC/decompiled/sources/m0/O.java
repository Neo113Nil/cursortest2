package m0;

import Ae.InterfaceC2395h;
import Bl0.C2652m;
import S0.A1;
import S0.C3969l;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<a<?, ?>> f73566a = new U0.b<>(new a[16]);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73567b;

    /* renamed from: c, reason: collision with root package name */
    private long f73568c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73569d;

    public final class a<T, V extends AbstractC8015t> implements A1<T> {

        /* renamed from: a, reason: collision with root package name */
        private Number f73570a;

        /* renamed from: b, reason: collision with root package name */
        private Number f73571b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final U0<T, V> f73572c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final C3991w0 f73573d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private InterfaceC8002m<T> f73574e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private C0<T, V> f73575f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f73576g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f73577h;

        /* renamed from: i, reason: collision with root package name */
        private long f73578i;

        public a(Number number, Number number2, @NotNull U0 u02, @NotNull N n11) {
            C3991w0 f7;
            this.f73570a = number;
            this.f73571b = number2;
            this.f73572c = u02;
            f7 = n1.f(number, D1.f25195a);
            this.f73573d = f7;
            this.f73574e = n11;
            this.f73575f = new C0<>(n11, u02, this.f73570a, this.f73571b, null);
        }

        public final T b() {
            return (T) this.f73570a;
        }

        @Override // S0.A1
        public final T getValue() {
            return this.f73573d.getValue();
        }

        public final T k() {
            return (T) this.f73571b;
        }

        public final boolean m() {
            return this.f73576g;
        }

        public final void o(long j11) {
            O.d(O.this, false);
            if (this.f73577h) {
                this.f73577h = false;
                this.f73578i = j11;
            }
            long j12 = j11 - this.f73578i;
            this.f73573d.setValue(this.f73575f.e(j12));
            this.f73576g = this.f73575f.b(j12);
        }

        public final void s() {
            this.f73577h = true;
        }

        public final void v() {
            this.f73573d.setValue(this.f73575f.f());
            this.f73577h = true;
        }

        public final void w(Number number, Number number2, @NotNull InterfaceC8002m interfaceC8002m) {
            this.f73570a = number;
            this.f73571b = number2;
            this.f73574e = interfaceC8002m;
            this.f73575f = new C0<>(interfaceC8002m, this.f73572c, number, number2, null);
            O.d(O.this, true);
            this.f73576g = false;
            this.f73577h = true;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {181, 205}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        kotlin.jvm.internal.J f73580d;

        /* renamed from: e, reason: collision with root package name */
        int f73581e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f73582f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<A1<Long>> f73583g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ O f73584h;

        static final class a extends AbstractC7737t implements Function1<Long, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3978p0<A1<Long>> f73585b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ O f73586c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.J f73587d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ xe.M f73588e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3978p0<A1<Long>> interfaceC3978p0, O o11, kotlin.jvm.internal.J j11, xe.M m11) {
                super(1);
                this.f73585b = interfaceC3978p0;
                this.f73586c = o11;
                this.f73587d = j11;
                this.f73588e = m11;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Long l11) {
                long longValue = l11.longValue();
                A1<Long> value = this.f73585b.getValue();
                long longValue2 = value != null ? value.getValue().longValue() : longValue;
                O o11 = this.f73586c;
                long j11 = o11.f73568c;
                int i11 = 0;
                xe.M m11 = this.f73588e;
                kotlin.jvm.internal.J j12 = this.f73587d;
                if (j11 == Long.MIN_VALUE || j12.f71784a != B0.i(m11.getCoroutineContext())) {
                    o11.f73568c = longValue;
                    U0.b bVar = o11.f73566a;
                    int m12 = bVar.m();
                    if (m12 > 0) {
                        Object[] l12 = bVar.l();
                        int i12 = 0;
                        do {
                            ((a) l12[i12]).s();
                            i12++;
                        } while (i12 < m12);
                    }
                    j12.f71784a = B0.i(m11.getCoroutineContext());
                }
                if (j12.f71784a == 0.0f) {
                    U0.b bVar2 = o11.f73566a;
                    int m13 = bVar2.m();
                    if (m13 > 0) {
                        Object[] l13 = bVar2.l();
                        do {
                            ((a) l13[i11]).v();
                            i11++;
                        } while (i11 < m13);
                    }
                } else {
                    O.c(o11, (long) ((longValue2 - o11.f73568c) / j12.f71784a));
                }
                return Unit.f71690a;
            }
        }

        /* renamed from: m0.O$b$b, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        static final class C1248b extends AbstractC7737t implements Function0<Float> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ xe.M f73589b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1248b(xe.M m11) {
                super(0);
                this.f73589b = m11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(B0.i(this.f73589b.getCoroutineContext()));
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes8.dex */
        static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<Float, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ float f73590d;

            c() {
                super(2, null);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                c cVar = new c(2, dVar);
                cVar.f73590d = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Float f7, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((c) create(Float.valueOf(f7.floatValue()), dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                return Boolean.valueOf(this.f73590d > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3978p0<A1<Long>> interfaceC3978p0, O o11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f73583g = interfaceC3978p0;
            this.f73584h = o11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f73583g, this.f73584h, dVar);
            bVar.f73582f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
        
            if (Ae.C2399j.v(r4, r5, r7) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
        
            if (m0.M.a(r4, r7) == r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006f -> B:6:0x003a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0055 -> B:6:0x003a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            xe.M m11;
            kotlin.jvm.internal.J j11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73581e;
            if (i11 == 0) {
                Sc.s.b(obj);
                m11 = (xe.M) this.f73582f;
                j11 = new kotlin.jvm.internal.J();
                j11.f71784a = 1.0f;
            } else if (i11 == 1) {
                j11 = this.f73580d;
                xe.M m12 = (xe.M) this.f73582f;
                Sc.s.b(obj);
                m11 = m12;
                if (j11.f71784a == 0.0f) {
                    InterfaceC2395h m13 = n1.m(new C1248b(m11));
                    c cVar = new c();
                    this.f73582f = m11;
                    this.f73580d = j11;
                    this.f73581e = 2;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = this.f73580d;
                xe.M m14 = (xe.M) this.f73582f;
                Sc.s.b(obj);
                m11 = m14;
            }
            a aVar2 = new a(this.f73583g, this.f73584h, j11, m11);
            this.f73582f = m11;
            this.f73580d = j11;
            this.f73581e = 1;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        c(int i11) {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            O.this.h(interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public O() {
        C3991w0 f7;
        C3991w0 f11;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f73567b = f7;
        this.f73568c = Long.MIN_VALUE;
        f11 = n1.f(Boolean.TRUE, D1.f25195a);
        this.f73569d = f11;
    }

    public static final void c(O o11, long j11) {
        boolean z11;
        U0.b<a<?, ?>> bVar = o11.f73566a;
        int m11 = bVar.m();
        if (m11 > 0) {
            a<?, ?>[] l11 = bVar.l();
            z11 = true;
            int i11 = 0;
            do {
                a<?, ?> aVar = l11[i11];
                if (!aVar.m()) {
                    aVar.o(j11);
                }
                if (!aVar.m()) {
                    z11 = false;
                }
                i11++;
            } while (i11 < m11);
        } else {
            z11 = true;
        }
        o11.f73569d.setValue(Boolean.valueOf(!z11));
    }

    public static final void d(O o11, boolean z11) {
        o11.f73567b.setValue(Boolean.valueOf(z11));
    }

    public final void f(@NotNull a<?, ?> aVar) {
        this.f73566a.b(aVar);
        this.f73567b.setValue(Boolean.TRUE);
    }

    public final void g(@NotNull a<?, ?> aVar) {
        this.f73566a.s(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-318043801);
        if ((((u11.F(this) ? 4 : 2) | i11) & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            if (((Boolean) this.f73569d.getValue()).booleanValue() || ((Boolean) this.f73567b.getValue()).booleanValue()) {
                u11.o(1719915818);
                boolean F11 = u11.F(this);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new b(interfaceC3978p0, this, null);
                    u11.x(C12);
                }
                S0.Q.e(u11, this, (Function2) C12);
                u11.k();
            } else {
                u11.o(1721436120);
                u11.k();
            }
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(i11));
        }
    }
}
