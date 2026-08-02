package v0;

import B0.C0;
import B1.o0;
import B1.p0;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import b1.C5499b;
import b1.C5517t;
import b1.InterfaceC5518u;
import c1.AbstractC5715f;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.ranges.IntRange;
import m0.AbstractC8015t;
import m0.C8006o;
import m0.C8008p;
import m0.U0;
import m0.W0;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.C9110K;
import r0.InterfaceC9106G;
import r0.InterfaceC9108I;
import x0.C10583L;
import x0.C10598c;
import x0.C10603h;
import x0.C10606k;
import x0.b0;
import x0.c0;
import xe.C10727i;

/* loaded from: classes.dex */
public final class I implements InterfaceC9108I {

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final C5517t f101467x = C5499b.a(a.f101492b, b.f101493b);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f101468y = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10160E f101469a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f101470b;

    /* renamed from: c, reason: collision with root package name */
    private C10157B f101471c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final H f101472d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10167g f101473e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f101474f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final t0.q f101475g;

    /* renamed from: h, reason: collision with root package name */
    private float f101476h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC9108I f101477i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f101478j;

    /* renamed from: k, reason: collision with root package name */
    private D1.H f101479k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final e f101480l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C10598c f101481m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<C10158C> f101482n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C10606k f101483o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.o f101484p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final c f101485q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C10583L f101486r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0<Unit> f101487s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C3991w0 f101488t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final C3991w0 f101489u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0<Unit> f101490v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private C8006o<Float, C8008p> f101491w;

    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, I, List<? extends Integer>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f101492b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Integer> invoke(InterfaceC5518u interfaceC5518u, I i11) {
            I i12 = i11;
            return C7714v.b0(Integer.valueOf(i12.o()), Integer.valueOf(i12.p()));
        }
    }

    static final class b extends AbstractC7737t implements Function1<List<? extends Integer>, I> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f101493b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final I invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new I(list2.get(0).intValue(), list2.get(1).intValue());
        }
    }

    public static final class c {
        c() {
        }
    }

    static final class d extends AbstractC7737t implements Function1<b0, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f101496c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(1);
            this.f101496c = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(b0 b0Var) {
            b0 b0Var2 = b0Var;
            InterfaceC10160E interfaceC10160E = I.this.f101469a;
            AbstractC5715f a11 = AbstractC5715f.a.a();
            AbstractC5715f.a.d(a11, AbstractC5715f.a.b(a11), a11 != null ? a11.h() : null);
            interfaceC10160E.a(b0Var2, this.f101496c);
            return Unit.f71690a;
        }
    }

    public static final class e implements p0 {
        e() {
        }

        @Override // B1.p0
        public final void b0(@NotNull D1.H h11) {
            I.this.f101479k = h11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1", f = "LazyListState.kt", l = {338}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f101498d;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {
            a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(2, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                return Unit.f71690a;
            }
        }

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return I.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f101498d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a(2, null);
                this.f101498d = 1;
                if (I.this.d(EnumC8372M.Default, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f101501e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f101502f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, int i12, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f101501e = i11;
            this.f101502f = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return I.this.new g(this.f101501e, this.f101502f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            I.this.H(this.f101501e, this.f101502f, true);
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function1<Float, Float> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f7) {
            return Float.valueOf(-I.this.E(-f7.floatValue()));
        }
    }

    public I() {
        this(0, 0, new C10161a());
    }

    public final o0 A() {
        return this.f101479k;
    }

    @NotNull
    public final p0 B() {
        return this.f101480l;
    }

    public final float C() {
        return this.f101491w.getValue().floatValue();
    }

    public final float D() {
        return this.f101476h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float E(float f7) {
        if ((f7 < 0.0f && !b()) || (f7 > 0.0f && !e())) {
            return 0.0f;
        }
        if (Math.abs(this.f101476h) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f101476h).toString());
        }
        float f11 = this.f101476h + f7;
        this.f101476h = f11;
        if (Math.abs(f11) > 0.5f) {
            C10157B c10157b = (C10157B) this.f101474f.getValue();
            float f12 = this.f101476h;
            int round = Math.round(f12);
            C10157B c10157b2 = this.f101471c;
            boolean r11 = c10157b.r(round, !this.f101470b);
            if (r11 && c10157b2 != null) {
                r11 = c10157b2.r(round, true);
            }
            c cVar = this.f101485q;
            InterfaceC10160E interfaceC10160E = this.f101469a;
            if (r11) {
                l(c10157b, this.f101470b, true);
                c0.b(this.f101490v);
                float f13 = f12 - this.f101476h;
                if (this.f101478j) {
                    ((C10161a) interfaceC10160E).b(cVar, f13, c10157b);
                }
            } else {
                D1.H h11 = this.f101479k;
                if (h11 != null) {
                    h11.b();
                }
                float f14 = f12 - this.f101476h;
                y t2 = t();
                if (this.f101478j) {
                    ((C10161a) interfaceC10160E).b(cVar, f14, t2);
                }
            }
        }
        if (Math.abs(this.f101476h) <= 0.5f) {
            return f7;
        }
        float f15 = f7 - this.f101476h;
        this.f101476h = 0.0f;
        return f15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(int i11, int i12) {
        if (this.f101477i.a()) {
            C10727i.c(((C10157B) this.f101474f.getValue()).m(), null, null, new f(null), 3);
        }
        H(i11, i12, false);
    }

    public final Object G(int i11, int i12, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = d(EnumC8372M.Default, new g(i11, i12, null), (kotlin.coroutines.jvm.internal.c) dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final void H(int i11, int i12, boolean z11) {
        H h11 = this.f101472d;
        if (h11.a() != i11 || h11.c() != i12) {
            this.f101482n.j();
        }
        h11.d(i11, i12);
        if (!z11) {
            c0.b(this.f101487s);
            return;
        }
        D1.H h12 = this.f101479k;
        if (h12 != null) {
            h12.b();
        }
    }

    public final int I(@NotNull o oVar, int i11) {
        return this.f101472d.h(oVar, i11);
    }

    @Override // r0.InterfaceC9108I
    public final boolean a() {
        return this.f101477i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC9108I
    public final boolean b() {
        return ((Boolean) this.f101488t.getValue()).booleanValue();
    }

    @Override // r0.InterfaceC9108I
    public final float c(float f7) {
        return this.f101477i.c(f7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r8.d(r6, r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // r0.InterfaceC9108I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull EnumC8372M enumC8372M, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        J j11;
        int i11;
        I i12;
        if (cVar instanceof J) {
            j11 = (J) cVar;
            int i13 = j11.f101509i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                j11.f101509i = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = j11.f101507g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = j11.f101509i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    j11.f101504d = this;
                    j11.f101505e = enumC8372M;
                    j11.f101506f = function2;
                    j11.f101509i = 1;
                    if (this.f101481m.a(j11) != aVar) {
                        i12 = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                function2 = j11.f101506f;
                enumC8372M = j11.f101505e;
                i12 = j11.f101504d;
                Sc.s.b(obj);
                InterfaceC9108I interfaceC9108I = i12.f101477i;
                j11.f101504d = null;
                j11.f101505e = null;
                j11.f101506f = null;
                j11.f101509i = 2;
            }
        }
        j11 = new J(this, cVar);
        Object obj2 = j11.f101507g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = j11.f101509i;
        if (i11 != 0) {
        }
        InterfaceC9108I interfaceC9108I2 = i12.f101477i;
        j11.f101504d = null;
        j11.f101505e = null;
        j11.f101506f = null;
        j11.f101509i = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC9108I
    public final boolean e() {
        return ((Boolean) this.f101489u.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object k(int i11, int i12, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object d11 = C10603h.d(this.f101473e, i11, i12, ((C10157B) this.f101474f.getValue()).n(), jVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final void l(@NotNull C10157B c10157b, boolean z11, boolean z12) {
        float f7;
        if (!z11 && this.f101470b) {
            this.f101471c = c10157b;
            return;
        }
        if (z11) {
            this.f101470b = true;
        }
        this.f101489u.setValue(Boolean.valueOf(c10157b.i()));
        this.f101488t.setValue(Boolean.valueOf(c10157b.j()));
        this.f101476h -= c10157b.l();
        this.f101474f.setValue(c10157b);
        H h11 = this.f101472d;
        if (z12) {
            h11.g(c10157b.p());
        } else {
            h11.f(c10157b);
            if (this.f101478j) {
                ((C10161a) this.f101469a).c(c10157b);
            }
        }
        if (z11) {
            float q11 = c10157b.q();
            Z1.d n11 = c10157b.n();
            xe.M m11 = c10157b.m();
            f7 = M.f101514a;
            if (q11 <= n11.v1(f7)) {
                return;
            }
            AbstractC5715f a11 = AbstractC5715f.a.a();
            Function1<Object, Unit> h12 = a11 != null ? a11.h() : null;
            AbstractC5715f b11 = AbstractC5715f.a.b(a11);
            try {
                float floatValue = this.f101491w.getValue().floatValue();
                if (this.f101491w.v()) {
                    this.f101491w = C0.b(this.f101491w, floatValue - q11, 0.0f, 30);
                    C10727i.c(m11, null, null, new K(this, null), 3);
                } else {
                    this.f101491w = new C8006o<>(W0.b(), Float.valueOf(-q11), null, 60);
                    C10727i.c(m11, null, null, new L(this, null), 3);
                }
                AbstractC5715f.a.d(a11, b11, h12);
            } catch (Throwable th2) {
                AbstractC5715f.a.d(a11, b11, h12);
                throw th2;
            }
        }
    }

    @NotNull
    public final C10598c m() {
        return this.f101481m;
    }

    @NotNull
    public final C10606k n() {
        return this.f101483o;
    }

    public final int o() {
        return this.f101472d.a();
    }

    public final int p() {
        return this.f101472d.c();
    }

    public final boolean q() {
        return this.f101470b;
    }

    @NotNull
    public final t0.q r() {
        return this.f101475g;
    }

    @NotNull
    public final LazyLayoutItemAnimator<C10158C> s() {
        return this.f101482n;
    }

    @NotNull
    public final y t() {
        return (y) this.f101474f.getValue();
    }

    @NotNull
    public final InterfaceC3978p0<Unit> u() {
        return this.f101487s;
    }

    @NotNull
    public final IntRange v() {
        return (IntRange) this.f101472d.b().getValue();
    }

    @NotNull
    public final C10583L w() {
        return this.f101486r;
    }

    @NotNull
    public final InterfaceC3978p0<Unit> x() {
        return this.f101490v;
    }

    public final C10157B y() {
        return this.f101471c;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.o z() {
        return this.f101484p;
    }

    public I(int i11, int i12) {
        this(i11, i12, new C10161a());
    }

    public I(int i11, int i12, @NotNull InterfaceC10160E interfaceC10160E) {
        C10157B c10157b;
        C3991w0 f7;
        C3991w0 f11;
        this.f101469a = interfaceC10160E;
        this.f101472d = new H(i11, i12);
        this.f101473e = new C10167g(this);
        c10157b = M.f101515b;
        this.f101474f = n1.f(c10157b, n1.h());
        this.f101475g = t0.p.a();
        this.f101477i = C9110K.a(new h());
        this.f101478j = true;
        this.f101480l = new e();
        this.f101481m = new C10598c();
        this.f101482n = new LazyLayoutItemAnimator<>();
        this.f101483o = new C10606k();
        this.f101484p = new androidx.compose.foundation.lazy.layout.o(null, new d(i11));
        this.f101485q = new c();
        this.f101486r = new C10583L();
        this.f101487s = c0.a();
        Boolean bool = Boolean.FALSE;
        f7 = n1.f(bool, D1.f25195a);
        this.f101488t = f7;
        f11 = n1.f(bool, D1.f25195a);
        this.f101489u = f11;
        this.f101490v = c0.a();
        U0 b11 = W0.b();
        Float valueOf = Float.valueOf(0.0f);
        this.f101491w = new C8006o<>(b11, valueOf, (AbstractC8015t) b11.a().invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
