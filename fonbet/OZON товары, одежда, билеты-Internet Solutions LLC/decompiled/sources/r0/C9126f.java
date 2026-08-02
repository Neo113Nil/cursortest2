package r0;

import B0.A0;
import D1.AbstractC2810k0;
import D1.C2805i;
import D1.C2809k;
import D1.InterfaceC2803h;
import Sc.r;
import androidx.compose.ui.e;
import java.util.concurrent.CancellationException;
import k1.C7459e;
import k1.C7460f;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.C10737n;
import xe.C10740o0;
import xe.E0;
import xe.InterfaceC10733l;

/* renamed from: r0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9126f extends e.c implements z0.d, D1.B, InterfaceC2803h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private EnumC9142v f82565a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9113N f82566b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f82567c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9124d f82568d;

    /* renamed from: f, reason: collision with root package name */
    private B1.B f82570f;

    /* renamed from: g, reason: collision with root package name */
    private C7460f f82571g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f82572h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f82574j;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9123c f82569e = new C9123c();

    /* renamed from: i, reason: collision with root package name */
    private long f82573i = 0;

    /* renamed from: r0.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function0<C7460f> f82575a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C10737n f82576b;

        public a(@NotNull Function0 function0, @NotNull C10737n c10737n) {
            this.f82575a = function0;
            this.f82576b = c10737n;
        }

        @NotNull
        public final InterfaceC10733l<Unit> a() {
            return this.f82576b;
        }

        @NotNull
        public final Function0<C7460f> b() {
            return this.f82575a;
        }

        @NotNull
        public final String toString() {
            String str;
            C10737n c10737n = this.f82576b;
            xe.L l11 = (xe.L) c10737n.getContext().get(xe.L.f105409b);
            String q11 = l11 != null ? l11.q() : null;
            StringBuilder sb2 = new StringBuilder("Request@");
            String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            sb2.append(num);
            if (q11 == null || (str = A0.b("[", q11, "](")) == null) {
                str = "(";
            }
            sb2.append(str);
            sb2.append("currentBounds()=");
            sb2.append(this.f82575a.invoke());
            sb2.append(", continuation=");
            sb2.append(c10737n);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* renamed from: r0.f$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82577a;

        static {
            int[] iArr = new int[EnumC9142v.values().length];
            try {
                iArr[EnumC9142v.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9142v.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82577a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {196}, m = "invokeSuspend")
    /* renamed from: r0.f$c */
    /* loaded from: classes8.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82578d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f82579e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Z f82581g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC9124d f82582h;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {201}, m = "invokeSuspend")
        /* renamed from: r0.f$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9141u, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f82583d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f82584e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Z f82585f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C9126f f82586g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC9124d f82587h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ B0 f82588i;

            /* renamed from: r0.f$c$a$a, reason: collision with other inner class name */
            static final class C1406a extends AbstractC7737t implements Function1<Float, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C9126f f82589b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ B0 f82590c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC9141u f82591d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1406a(C9126f c9126f, B0 b02, InterfaceC9141u interfaceC9141u) {
                    super(1);
                    this.f82589b = c9126f;
                    this.f82590c = b02;
                    this.f82591d = interfaceC9141u;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Float f7) {
                    float floatValue = f7.floatValue();
                    C9126f c9126f = this.f82589b;
                    float f11 = c9126f.f82567c ? 1.0f : -1.0f;
                    C9113N c9113n = c9126f.f82566b;
                    float w11 = c9113n.w(c9113n.s(this.f82591d.b(c9113n.s(c9113n.x(f11 * floatValue))))) * f11;
                    if (Math.abs(w11) < Math.abs(floatValue)) {
                        this.f82590c.j(C10740o0.a("Scroll animation cancelled because scroll was not consumed (" + w11 + " < " + floatValue + ')', null));
                    }
                    return Unit.f71690a;
                }
            }

            /* renamed from: r0.f$c$a$b */
            static final class b extends AbstractC7737t implements Function0<Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C9126f f82592b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Z f82593c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC9124d f82594d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C9126f c9126f, Z z11, InterfaceC9124d interfaceC9124d) {
                    super(0);
                    this.f82592b = c9126f;
                    this.f82593c = z11;
                    this.f82594d = interfaceC9124d;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    C9126f c9126f = this.f82592b;
                    C9123c c9123c = c9126f.f82569e;
                    while (true) {
                        if (!c9123c.f82552a.p()) {
                            break;
                        }
                        C7460f invoke = ((a) c9123c.f82552a.q()).b().invoke();
                        if (!(invoke == null ? true : C9126f.V1(c9126f, invoke))) {
                            break;
                        }
                        InterfaceC10733l<Unit> a11 = ((a) c9123c.f82552a.u(c9123c.f82552a.m() - 1)).a();
                        Unit unit = Unit.f71690a;
                        r.Companion companion = Sc.r.INSTANCE;
                        ((C10737n) a11).resumeWith(unit);
                    }
                    if (c9126f.f82572h) {
                        C7460f S12 = c9126f.S1();
                        if (S12 != null && C9126f.V1(c9126f, S12)) {
                            c9126f.f82572h = false;
                        }
                    }
                    this.f82593c.i(C9126f.I1(c9126f, this.f82594d));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z11, C9126f c9126f, InterfaceC9124d interfaceC9124d, B0 b02, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f82585f = z11;
                this.f82586g = c9126f;
                this.f82587h = interfaceC9124d;
                this.f82588i = b02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f82585f, this.f82586g, this.f82587h, this.f82588i, dVar);
                aVar.f82584e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC9141u interfaceC9141u, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(interfaceC9141u, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f82583d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    InterfaceC9141u interfaceC9141u = (InterfaceC9141u) this.f82584e;
                    InterfaceC9124d interfaceC9124d = this.f82587h;
                    C9126f c9126f = this.f82586g;
                    float I12 = C9126f.I1(c9126f, interfaceC9124d);
                    Z z11 = this.f82585f;
                    z11.i(I12);
                    C1406a c1406a = new C1406a(c9126f, this.f82588i, interfaceC9141u);
                    b bVar = new b(c9126f, z11, interfaceC9124d);
                    this.f82583d = 1;
                    if (z11.g(c1406a, bVar, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Z z11, InterfaceC9124d interfaceC9124d, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f82581g = z11;
            this.f82582h = interfaceC9124d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = C9126f.this.new c(this.f82581g, this.f82582h, dVar);
            cVar.f82579e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82578d;
            C9126f c9126f = C9126f.this;
            try {
                try {
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        B0 g10 = E0.g(((xe.M) this.f82579e).getCoroutineContext());
                        c9126f.f82574j = true;
                        C9113N c9113n = c9126f.f82566b;
                        EnumC8372M enumC8372M = EnumC8372M.Default;
                        a aVar2 = new a(this.f82581g, C9126f.this, this.f82582h, g10, null);
                        this.f82578d = 1;
                        if (c9113n.t(enumC8372M, aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    c9126f.f82569e.d();
                    c9126f.f82574j = false;
                    c9126f.f82569e.b(null);
                    c9126f.f82572h = false;
                    return Unit.f71690a;
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Throwable th2) {
                c9126f.f82574j = false;
                c9126f.f82569e.b(null);
                c9126f.f82572h = false;
                throw th2;
            }
        }
    }

    public C9126f(@NotNull EnumC9142v enumC9142v, @NotNull C9113N c9113n, boolean z11, InterfaceC9124d interfaceC9124d) {
        this.f82565a = enumC9142v;
        this.f82566b = c9113n;
        this.f82567c = z11;
        this.f82568d = interfaceC9124d;
    }

    public static final float I1(C9126f c9126f, InterfaceC9124d interfaceC9124d) {
        C7460f c7460f;
        int compare;
        if (Z1.q.c(c9126f.f82573i, 0L)) {
            return 0.0f;
        }
        U0.b bVar = c9126f.f82569e.f82552a;
        int m11 = bVar.m();
        if (m11 > 0) {
            int i11 = m11 - 1;
            Object[] l11 = bVar.l();
            c7460f = null;
            while (true) {
                C7460f invoke = ((a) l11[i11]).b().invoke();
                if (invoke != null) {
                    long p11 = invoke.p();
                    long b11 = Z1.r.b(c9126f.f82573i);
                    int i12 = b.f82577a[c9126f.f82565a.ordinal()];
                    if (i12 == 1) {
                        compare = Float.compare(C7464j.d(p11), C7464j.d(b11));
                    } else {
                        if (i12 != 2) {
                            throw new Sc.o();
                        }
                        compare = Float.compare(C7464j.f(p11), C7464j.f(b11));
                    }
                    if (compare <= 0) {
                        c7460f = invoke;
                    } else if (c7460f == null) {
                        c7460f = invoke;
                    }
                }
                i11--;
                if (i11 < 0) {
                    break;
                }
            }
        } else {
            c7460f = null;
        }
        if (c7460f == null) {
            C7460f S12 = c9126f.f82572h ? c9126f.S1() : null;
            if (S12 == null) {
                return 0.0f;
            }
            c7460f = S12;
        }
        long b12 = Z1.r.b(c9126f.f82573i);
        int i13 = b.f82577a[c9126f.f82565a.ordinal()];
        if (i13 == 1) {
            return interfaceC9124d.b(c7460f.q(), c7460f.h() - c7460f.q(), C7464j.d(b12));
        }
        if (i13 == 2) {
            return interfaceC9124d.b(c7460f.n(), c7460f.o() - c7460f.n(), C7464j.f(b12));
        }
        throw new Sc.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7460f S1() {
        if (isAttached()) {
            AbstractC2810k0 e11 = C2809k.e(this);
            B1.B b11 = this.f82570f;
            if (b11 != null) {
                if (!b11.I()) {
                    b11 = null;
                }
                if (b11 != null) {
                    return e11.K(b11, false);
                }
            }
        }
        return null;
    }

    private final boolean U1(long j11, C7460f c7460f) {
        long Y12 = Y1(j11, c7460f);
        return Math.abs(C7459e.g(Y12)) <= 0.5f && Math.abs(C7459e.h(Y12)) <= 0.5f;
    }

    static /* synthetic */ boolean V1(C9126f c9126f, C7460f c7460f) {
        return c9126f.U1(c9126f.f82573i, c7460f);
    }

    private final void W1() {
        InterfaceC9124d interfaceC9124d = this.f82568d;
        if (interfaceC9124d == null) {
            interfaceC9124d = (InterfaceC9124d) C2805i.a(this, C9125e.a());
        }
        if (this.f82574j) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        C10727i.c(getCoroutineScope(), null, xe.O.UNDISPATCHED, new c(new Z(interfaceC9124d.a()), interfaceC9124d, null), 1);
    }

    private final long Y1(long j11, C7460f c7460f) {
        long b11 = Z1.r.b(j11);
        int i11 = b.f82577a[this.f82565a.ordinal()];
        if (i11 == 1) {
            InterfaceC9124d interfaceC9124d = this.f82568d;
            if (interfaceC9124d == null) {
                interfaceC9124d = (InterfaceC9124d) C2805i.a(this, C9125e.a());
            }
            return P9.a.a(0.0f, interfaceC9124d.b(c7460f.q(), c7460f.h() - c7460f.q(), C7464j.d(b11)));
        }
        if (i11 != 2) {
            throw new Sc.o();
        }
        InterfaceC9124d interfaceC9124d2 = this.f82568d;
        if (interfaceC9124d2 == null) {
            interfaceC9124d2 = (InterfaceC9124d) C2805i.a(this, C9125e.a());
        }
        return P9.a.a(interfaceC9124d2.b(c7460f.n(), c7460f.o() - c7460f.n(), C7464j.f(b11)), 0.0f);
    }

    @Override // D1.B
    public final void E(long j11) {
        int i11;
        C7460f S12;
        long j12 = this.f82573i;
        this.f82573i = j11;
        int i12 = b.f82577a[this.f82565a.ordinal()];
        if (i12 == 1) {
            i11 = Intrinsics.i((int) (j11 & 4294967295L), (int) (4294967295L & j12));
        } else {
            if (i12 != 2) {
                throw new Sc.o();
            }
            i11 = Intrinsics.i((int) (j11 >> 32), (int) (j12 >> 32));
        }
        if (i11 < 0 && (S12 = S1()) != null) {
            C7460f c7460f = this.f82571g;
            if (c7460f == null) {
                c7460f = S12;
            }
            if (!this.f82574j && !this.f82572h && U1(j12, c7460f) && !U1(j11, S12)) {
                this.f82572h = true;
                W1();
            }
            this.f82571g = S12;
        }
    }

    public final Object Q1(@NotNull Function0<C7460f> function0, @NotNull kotlin.coroutines.d<? super Unit> frame) {
        C7460f invoke = function0.invoke();
        if (invoke == null || U1(this.f82573i, invoke)) {
            return Unit.f71690a;
        }
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        if (this.f82569e.c(new a(function0, c10737n)) && !this.f82574j) {
            W1();
        }
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    @NotNull
    public final C7460f R1(@NotNull C7460f c7460f) {
        if (Z1.q.c(this.f82573i, 0L)) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return c7460f.A(Y1(this.f82573i, c7460f) ^ (-9223372034707292160L));
    }

    public final long T1() {
        return this.f82573i;
    }

    public final void X1(B1.B b11) {
        this.f82570f = b11;
    }

    public final void Z1(@NotNull EnumC9142v enumC9142v, boolean z11, InterfaceC9124d interfaceC9124d) {
        this.f82565a = enumC9142v;
        this.f82567c = z11;
        this.f82568d = interfaceC9124d;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }
}
