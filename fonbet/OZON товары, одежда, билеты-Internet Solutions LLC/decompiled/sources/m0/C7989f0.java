package m0;

import B4.C2581j;
import S0.C3961h0;
import S0.C3985t0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.InterfaceC10733l;

/* renamed from: m0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7989f0<S> extends S0<S> {

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final C8008p f73718r = new C8008p(0.0f);

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final C8008p f73719s = new C8008p(1.0f);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f73720t = 0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73721b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73722c;

    /* renamed from: d, reason: collision with root package name */
    private S f73723d;

    /* renamed from: e, reason: collision with root package name */
    private D0<S> f73724e;

    /* renamed from: f, reason: collision with root package name */
    private long f73725f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f73726g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C3985t0 f73727h;

    /* renamed from: i, reason: collision with root package name */
    private C10737n f73728i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Je.d f73729j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C7981b0 f73730k;

    /* renamed from: l, reason: collision with root package name */
    private long f73731l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.collection.J<b> f73732m;

    /* renamed from: n, reason: collision with root package name */
    private b f73733n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Function1<Long, Unit> f73734o;

    /* renamed from: p, reason: collision with root package name */
    private float f73735p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final Function1<Long, Unit> f73736q;

    /* renamed from: m0.f0$a */
    /* loaded from: classes8.dex */
    private static final class a {
    }

    /* renamed from: m0.f0$b */
    /* loaded from: classes8.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f73737a;

        /* renamed from: b, reason: collision with root package name */
        private c1 f73738b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f73739c;

        /* renamed from: d, reason: collision with root package name */
        private float f73740d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private C8008p f73741e = new C8008p(0.0f);

        /* renamed from: f, reason: collision with root package name */
        private C8008p f73742f;

        /* renamed from: g, reason: collision with root package name */
        private long f73743g;

        /* renamed from: h, reason: collision with root package name */
        private long f73744h;

        public final X0<C8008p> a() {
            return this.f73738b;
        }

        public final long b() {
            return this.f73744h;
        }

        public final long c() {
            return this.f73743g;
        }

        public final C8008p d() {
            return this.f73742f;
        }

        public final long e() {
            return this.f73737a;
        }

        @NotNull
        public final C8008p f() {
            return this.f73741e;
        }

        public final float g() {
            return this.f73740d;
        }

        public final boolean h() {
            return this.f73739c;
        }

        public final void i(c1 c1Var) {
            this.f73738b = c1Var;
        }

        public final void j(long j11) {
            this.f73744h = j11;
        }

        public final void k(boolean z11) {
            this.f73739c = z11;
        }

        public final void l(long j11) {
            this.f73743g = j11;
        }

        public final void m(C8008p c8008p) {
            this.f73742f = c8008p;
        }

        public final void n(long j11) {
            this.f73737a = j11;
        }

        public final void o(float f7) {
            this.f73740d = f7;
        }

        @NotNull
        public final String toString() {
            return "progress nanos: " + this.f73737a + ", animationSpec: " + this.f73738b + ", isComplete: " + this.f73739c + ", value: " + this.f73740d + ", start: " + this.f73741e + ", initialVelocity: " + this.f73742f + ", durationNanos: " + this.f73743g + ", animationSpecDuration: " + this.f73744h;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {477}, m = "invokeSuspend")
    /* renamed from: m0.f0$c */
    /* loaded from: classes8.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73745d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7989f0<S> f73746e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f73747f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D0<S> f73748g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Object obj, kotlin.coroutines.d dVar, C7989f0 c7989f0, D0 d02) {
            super(1, dVar);
            this.f73746e = c7989f0;
            this.f73747f = obj;
            this.f73748g = d02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new c(this.f73747f, dVar, this.f73746e, this.f73748g);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73745d;
            D0<S> d02 = this.f73748g;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7989f0<S> c7989f0 = this.f73746e;
                c7989f0.B();
                ((C7989f0) c7989f0).f73731l = Long.MIN_VALUE;
                C7989f0.v(c7989f0, 0.0f);
                S a11 = c7989f0.a();
                S s11 = this.f73747f;
                float f7 = s11.equals(a11) ? -4.0f : s11.equals(c7989f0.b()) ? -5.0f : -3.0f;
                d02.E(s11);
                d02.B(0L);
                c7989f0.O(s11);
                C7989f0.v(c7989f0, 0.0f);
                c7989f0.d(s11);
                d02.w(f7);
                if (f7 == -3.0f) {
                    this.f73745d = 1;
                    if (C7989f0.y(c7989f0, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            d02.t();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7989f0(C2581j c2581j) {
        super(0);
        C3991w0 f7;
        C3991w0 f11;
        f7 = n1.f(c2581j, D1.f25195a);
        this.f73721b = f7;
        f11 = n1.f(c2581j, D1.f25195a);
        this.f73722c = f11;
        this.f73723d = c2581j;
        this.f73726g = new C7997j0(this);
        this.f73727h = S0.C0.a(0.0f);
        this.f73729j = Je.e.a();
        this.f73730k = new C7981b0();
        this.f73731l = Long.MIN_VALUE;
        this.f73732m = new androidx.collection.J<>((Object) null);
        this.f73734o = new C7995i0(this);
        this.f73736q = new C7991g0(this);
    }

    public static Object A(C7989f0 c7989f0, Object obj, kotlin.coroutines.d dVar) {
        D0<S> d02 = c7989f0.f73724e;
        if (d02 == null) {
            return Unit.f71690a;
        }
        Object d11 = C7981b0.d(c7989f0.f73730k, new C7993h0(obj, null, c7989f0, d02), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        D0<S> d02 = this.f73724e;
        if (d02 != null) {
            d02.g();
        }
        this.f73732m.c();
        if (this.f73733n != null) {
            this.f73733n = null;
            this.f73727h.h(1.0f);
            L();
        }
    }

    public static Object K(C7989f0 c7989f0, float f7, kotlin.coroutines.d dVar) {
        return c7989f0.J(f7, c7989f0.f73721b.getValue(), (kotlin.coroutines.jvm.internal.j) dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        D0<S> d02 = this.f73724e;
        if (d02 == null) {
            return;
        }
        d02.z(C6915b.d(this.f73727h.getFloatValue() * d02.o()));
    }

    public static final Object h(C7989f0 c7989f0, kotlin.coroutines.d dVar) {
        if (c7989f0.f73731l != Long.MIN_VALUE) {
            Object z11 = c7989f0.z((kotlin.coroutines.jvm.internal.c) dVar);
            return z11 == Wc.a.COROUTINE_SUSPENDED ? z11 : Unit.f71690a;
        }
        kotlin.coroutines.jvm.internal.c cVar = (kotlin.coroutines.jvm.internal.c) dVar;
        Object v11 = C3961h0.a(cVar.getContext()).v(c7989f0.f73734o, cVar);
        return v11 == Wc.a.COROUTINE_SUSPENDED ? v11 : Unit.f71690a;
    }

    public static final void q(C7989f0 c7989f0) {
        D0<S> d02 = c7989f0.f73724e;
        if (d02 == null) {
            return;
        }
        b bVar = c7989f0.f73733n;
        if (bVar == null) {
            if (c7989f0.f73725f > 0) {
                C3985t0 c3985t0 = c7989f0.f73727h;
                if (c3985t0.getFloatValue() != 1.0f && !Intrinsics.d(c7989f0.f73722c.getValue(), c7989f0.f73721b.getValue())) {
                    b bVar2 = new b();
                    bVar2.o(c3985t0.getFloatValue());
                    long j11 = c7989f0.f73725f;
                    bVar2.l(j11);
                    bVar2.j(C6915b.d((1.0d - c3985t0.getFloatValue()) * j11));
                    bVar2.f().e(c3985t0.getFloatValue(), 0);
                    bVar = bVar2;
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            bVar.l(c7989f0.f73725f);
            c7989f0.f73732m.b(bVar);
            d02.A(bVar);
        }
        c7989f0.f73733n = null;
    }

    public static final void r(C7989f0 c7989f0, b bVar, long j11) {
        c7989f0.getClass();
        long e11 = bVar.e() + j11;
        bVar.n(e11);
        long b11 = bVar.b();
        if (e11 >= b11) {
            bVar.o(1.0f);
            return;
        }
        X0<C8008p> a11 = bVar.a();
        if (a11 == null) {
            float a12 = bVar.f().a(0);
            float f7 = e11 / b11;
            int i11 = W0.f73625j;
            bVar.o((1.0f * f7) + ((1 - f7) * a12));
            return;
        }
        C8008p f11 = bVar.f();
        C8008p d11 = bVar.d();
        if (d11 == null) {
            d11 = f73718r;
        }
        bVar.o(kotlin.ranges.h.d(a11.c(e11, f11, f73719s, d11).a(0), 0.0f, 1.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        if (S0.C3961h0.a(r0.getContext()).v(r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(C7989f0 c7989f0, kotlin.coroutines.jvm.internal.c cVar) {
        C7999k0 c7999k0;
        Wc.a aVar;
        int i11;
        c7989f0.getClass();
        if (cVar instanceof C7999k0) {
            c7999k0 = (C7999k0) cVar;
            int i12 = c7999k0.f73792g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c7999k0.f73792g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c7999k0.f73790e;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c7999k0.f73792g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (c7989f0.f73732m.f38647b == 0 && c7989f0.f73733n == null) {
                        return Unit.f71690a;
                    }
                    if (B0.i(c7999k0.getContext()) == 0.0f) {
                        c7989f0.B();
                        c7989f0.f73731l = Long.MIN_VALUE;
                        return Unit.f71690a;
                    }
                    if (c7989f0.f73731l == Long.MIN_VALUE) {
                        Function1<Long, Unit> function1 = c7989f0.f73734o;
                        c7999k0.f73789d = c7989f0;
                        c7999k0.f73792g = 1;
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7989f0 = c7999k0.f73789d;
                    Sc.s.b(obj);
                }
                do {
                    if (c7989f0.f73732m.f38647b == 0 && c7989f0.f73733n == null) {
                        c7989f0.f73731l = Long.MIN_VALUE;
                        return Unit.f71690a;
                    }
                    c7999k0.f73789d = c7989f0;
                    c7999k0.f73792g = 2;
                } while (c7989f0.z(c7999k0) != aVar);
                return aVar;
            }
        }
        c7999k0 = new C7999k0(c7989f0, cVar);
        Object obj2 = c7999k0.f73790e;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c7999k0.f73792g;
        if (i11 != 0) {
        }
        do {
            if (c7989f0.f73732m.f38647b == 0) {
                c7989f0.f73731l = Long.MIN_VALUE;
                return Unit.f71690a;
            }
            c7999k0.f73789d = c7989f0;
            c7999k0.f73792g = 2;
        } while (c7989f0.z(c7999k0) != aVar);
        return aVar;
    }

    public static final void v(C7989f0 c7989f0, float f7) {
        c7989f0.f73727h.h(f7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r5.f73729j.a(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(C7989f0 c7989f0, kotlin.coroutines.jvm.internal.c cVar) {
        C8003m0 frame;
        Wc.a aVar;
        int i11;
        Object value;
        Object n11;
        C7989f0 c7989f02;
        Object obj;
        c7989f0.getClass();
        if (cVar instanceof C8003m0) {
            frame = (C8003m0) cVar;
            int i12 = frame.f73826h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f73826h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = frame.f73824f;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f73826h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    value = c7989f0.f73721b.getValue();
                    frame.f73822d = c7989f0;
                    frame.f73823e = value;
                    frame.f73826h = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = frame.f73823e;
                        c7989f02 = frame.f73822d;
                        Sc.s.b(obj2);
                        if (!Intrinsics.d(obj2, obj)) {
                            return Unit.f71690a;
                        }
                        c7989f02.f73731l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = frame.f73823e;
                    C7989f0 c7989f03 = frame.f73822d;
                    Sc.s.b(obj2);
                    value = obj3;
                    c7989f0 = c7989f03;
                }
                frame.f73822d = c7989f0;
                frame.f73823e = value;
                frame.f73826h = 2;
                C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                c10737n.o();
                c7989f0.f73728i = c10737n;
                c7989f0.f73729j.c(null);
                n11 = c10737n.n();
                if (n11 == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (n11 != aVar) {
                    c7989f02 = c7989f0;
                    obj = value;
                    obj2 = n11;
                    if (!Intrinsics.d(obj2, obj)) {
                    }
                }
                return aVar;
            }
        }
        frame = new C8003m0(c7989f0, cVar);
        Object obj22 = frame.f73824f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f73826h;
        if (i11 != 0) {
        }
        frame.f73822d = c7989f0;
        frame.f73823e = value;
        frame.f73826h = 2;
        C10737n c10737n2 = new C10737n(1, Wc.b.b(frame));
        c10737n2.o();
        c7989f0.f73728i = c10737n2;
        c7989f0.f73729j.c(null);
        n11 = c10737n2.n();
        if (n11 == aVar) {
        }
        if (n11 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(C7989f0 c7989f0, kotlin.coroutines.jvm.internal.c cVar) {
        C8005n0 frame;
        int i11;
        C7989f0 c7989f02;
        Object obj;
        boolean d11;
        C7989f0 c7989f03;
        c7989f0.getClass();
        if (cVar instanceof C8005n0) {
            frame = (C8005n0) cVar;
            int i12 = frame.f73831h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f73831h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = frame.f73829f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f73831h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    Object value = c7989f0.f73721b.getValue();
                    frame.f73827d = c7989f0;
                    frame.f73828e = value;
                    frame.f73831h = 1;
                    if (c7989f0.f73729j.a(frame) != aVar) {
                        c7989f02 = c7989f0;
                        obj = value;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = frame.f73828e;
                    c7989f03 = frame.f73827d;
                    Sc.s.b(obj2);
                    if (!Intrinsics.d(obj2, obj)) {
                        c7989f03.f73731l = Long.MIN_VALUE;
                        throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                    }
                    return Unit.f71690a;
                }
                obj = frame.f73828e;
                c7989f02 = frame.f73827d;
                Sc.s.b(obj2);
                d11 = Intrinsics.d(obj, c7989f02.f73723d);
                Je.d dVar = c7989f02.f73729j;
                if (!d11) {
                    dVar.c(null);
                    return Unit.f71690a;
                }
                frame.f73827d = c7989f02;
                frame.f73828e = obj;
                frame.f73831h = 2;
                C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                c10737n.o();
                c7989f02.f73728i = c10737n;
                dVar.c(null);
                obj2 = c10737n.n();
                if (obj2 == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (obj2 != aVar) {
                    c7989f03 = c7989f02;
                    if (!Intrinsics.d(obj2, obj)) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        frame = new C8005n0(c7989f0, cVar);
        Object obj22 = frame.f73829f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f73831h;
        if (i11 != 0) {
        }
        d11 = Intrinsics.d(obj, c7989f02.f73723d);
        Je.d dVar2 = c7989f02.f73729j;
        if (!d11) {
        }
    }

    private final Object z(kotlin.coroutines.jvm.internal.c cVar) {
        float i11 = B0.i(cVar.getContext());
        if (i11 <= 0.0f) {
            B();
            return Unit.f71690a;
        }
        this.f73735p = i11;
        Object v11 = C3961h0.a(cVar.getContext()).v(this.f73736q, cVar);
        return v11 == Wc.a.COROUTINE_SUSPENDED ? v11 : Unit.f71690a;
    }

    public final S C() {
        return this.f73723d;
    }

    public final InterfaceC10733l<S> D() {
        return this.f73728i;
    }

    @NotNull
    public final Je.d E() {
        return this.f73729j;
    }

    public final float F() {
        return this.f73727h.getFloatValue();
    }

    public final long G() {
        return this.f73725f;
    }

    public final void H() {
        Function1 function1;
        c1.y e11 = H0.e();
        function1 = H0.f73534a;
        e11.k(this, function1, this.f73726g);
    }

    public final void I() {
        long j11 = this.f73725f;
        H();
        long j12 = this.f73725f;
        if (j11 != j12) {
            b bVar = this.f73733n;
            if (bVar == null) {
                if (j12 != 0) {
                    L();
                }
            } else {
                bVar.l(j12);
                if (bVar.a() == null) {
                    bVar.j(C6915b.d((1.0d - bVar.f().a(0)) * this.f73725f));
                }
            }
        }
    }

    public final Object J(float f7, Object obj, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        if (0.0f > f7 || f7 > 1.0f) {
            C7985d0.a("Expecting fraction between 0 and 1. Got " + f7);
            throw null;
        }
        D0<S> d02 = this.f73724e;
        if (d02 == null) {
            return Unit.f71690a;
        }
        Object d11 = C7981b0.d(this.f73730k, new C8001l0(obj, this.f73721b.getValue(), this, d02, f7, null), jVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final void M(S s11) {
        this.f73723d = s11;
    }

    public final void N() {
        this.f73728i = null;
    }

    public final void O(S s11) {
        this.f73721b.setValue(s11);
    }

    public final void P(long j11) {
        this.f73725f = j11;
    }

    public final Object Q(S s11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        D0<S> d02 = this.f73724e;
        if (d02 == null) {
            return Unit.f71690a;
        }
        if (Intrinsics.d(this.f73722c.getValue(), s11) && Intrinsics.d(this.f73721b.getValue(), s11)) {
            return Unit.f71690a;
        }
        Object d11 = C7981b0.d(this.f73730k, new c(s11, null, this, d02), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    @Override // m0.S0
    public final S a() {
        return (S) this.f73722c.getValue();
    }

    @Override // m0.S0
    public final S b() {
        return (S) this.f73721b.getValue();
    }

    @Override // m0.S0
    public final void d(S s11) {
        this.f73722c.setValue(s11);
    }

    @Override // m0.S0
    public final void f(@NotNull D0<S> d02) {
        D0<S> d03 = this.f73724e;
        if (d03 == null || Intrinsics.d(d02, d03)) {
            this.f73724e = d02;
            return;
        }
        C7985d0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f73724e + ", new instance: " + d02);
        throw null;
    }

    @Override // m0.S0
    public final void g() {
        this.f73724e = null;
        H0.e().i(this);
    }
}
