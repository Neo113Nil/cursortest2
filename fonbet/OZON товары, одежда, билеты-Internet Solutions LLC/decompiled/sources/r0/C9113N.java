package r0;

import androidx.compose.foundation.gestures.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import w1.C10407b;

/* renamed from: r0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9113N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC9108I f82421a;

    /* renamed from: b, reason: collision with root package name */
    private n0.W f82422b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private InterfaceC9138r f82423c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private EnumC9142v f82424d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f82425e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private C10407b f82426f;

    /* renamed from: g, reason: collision with root package name */
    private int f82427g = 1;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private InterfaceC9106G f82428h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final a f82429i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function1<C7459e, C7459e> f82430j;

    /* renamed from: r0.N$a */
    public static final class a implements InterfaceC9141u {
        a() {
        }

        @Override // r0.InterfaceC9141u
        public final long a(int i11, long j11) {
            C9113N c9113n = C9113N.this;
            c9113n.f82427g = i11;
            n0.W w11 = c9113n.f82422b;
            return (w11 == null || !C9113N.h(c9113n)) ? C9113N.i(c9113n, c9113n.f82428h, j11, i11) : w11.c(j11, c9113n.f82427g, c9113n.f82430j);
        }

        @Override // r0.InterfaceC9141u
        public final long b(long j11) {
            C9113N c9113n = C9113N.this;
            return C9113N.i(c9113n, c9113n.f82428h, j11, 1);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {745, 748, 751}, m = "invokeSuspend")
    /* renamed from: r0.N$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<Z1.w, kotlin.coroutines.d<? super Z1.w>, Object> {

        /* renamed from: d, reason: collision with root package name */
        long f82432d;

        /* renamed from: e, reason: collision with root package name */
        int f82433e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ long f82434f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = C9113N.this.new b(dVar);
            bVar.f82434f = ((Z1.w) obj).i();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Z1.w wVar, kotlin.coroutines.d<? super Z1.w> dVar) {
            return ((b) create(Z1.w.a(wVar.i()), dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        
            if (r15 == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            long j11;
            long j12;
            long j13;
            long j14;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82433e;
            C9113N c9113n = C9113N.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                j11 = this.f82434f;
                C10407b c10407b = c9113n.f82426f;
                this.f82434f = j11;
                this.f82433e = 1;
                obj = c10407b.c(j11, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j14 = this.f82432d;
                        j13 = this.f82434f;
                        Sc.s.b(obj);
                        return Z1.w.a(Z1.w.e(j13, Z1.w.e(j14, ((Z1.w) obj).i())));
                    }
                    j12 = this.f82432d;
                    j11 = this.f82434f;
                    Sc.s.b(obj);
                    long i12 = ((Z1.w) obj).i();
                    C10407b c10407b2 = c9113n.f82426f;
                    long e11 = Z1.w.e(j12, i12);
                    this.f82434f = j11;
                    this.f82432d = i12;
                    this.f82433e = 3;
                    obj = c10407b2.a(e11, i12, this);
                    if (obj != aVar) {
                        j13 = j11;
                        j14 = i12;
                        return Z1.w.a(Z1.w.e(j13, Z1.w.e(j14, ((Z1.w) obj).i())));
                    }
                    return aVar;
                }
                j11 = this.f82434f;
                Sc.s.b(obj);
            }
            long e12 = Z1.w.e(j11, ((Z1.w) obj).i());
            this.f82434f = j11;
            this.f82432d = e12;
            this.f82433e = 2;
            obj = c9113n.n(e12, this);
            if (obj != aVar) {
                j12 = e12;
                long i122 = ((Z1.w) obj).i();
                C10407b c10407b22 = c9113n.f82426f;
                long e112 = Z1.w.e(j12, i122);
                this.f82434f = j11;
                this.f82432d = i122;
                this.f82433e = 3;
                obj = c10407b22.a(e112, i122, this);
                if (obj != aVar) {
                }
            }
            return aVar;
        }
    }

    /* renamed from: r0.N$c */
    static final class c extends AbstractC7737t implements Function1<C7459e, C7459e> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C7459e invoke(C7459e c7459e) {
            long n11 = c7459e.n();
            C9113N c9113n = C9113N.this;
            return C7459e.a(C9113N.i(c9113n, c9113n.f82428h, n11, c9113n.f82427g));
        }
    }

    public C9113N(n0.W w11, @NotNull InterfaceC9138r interfaceC9138r, @NotNull EnumC9142v enumC9142v, @NotNull InterfaceC9108I interfaceC9108I, @NotNull C10407b c10407b, boolean z11) {
        J.c cVar;
        this.f82421a = interfaceC9108I;
        this.f82422b = w11;
        this.f82423c = interfaceC9138r;
        this.f82424d = enumC9142v;
        this.f82425e = z11;
        this.f82426f = c10407b;
        cVar = androidx.compose.foundation.gestures.J.f39038b;
        this.f82428h = cVar;
        this.f82429i = new a();
        this.f82430j = new c();
    }

    public static final boolean h(C9113N c9113n) {
        return c9113n.f82421a.b() || c9113n.f82421a.e();
    }

    public static final long i(C9113N c9113n, InterfaceC9106G interfaceC9106G, long j11, int i11) {
        long d11 = c9113n.f82426f.d(i11, j11);
        long j12 = C7459e.j(j11, d11);
        long s11 = c9113n.s(c9113n.x(interfaceC9106G.a(c9113n.w(c9113n.s(c9113n.v(j12))))));
        return C7459e.k(C7459e.k(d11, s11), c9113n.f82426f.b(i11, s11, C7459e.j(j12, s11)));
    }

    public static final float l(C9113N c9113n, long j11) {
        return c9113n.f82424d == EnumC9142v.Horizontal ? Z1.w.c(j11) : Z1.w.d(j11);
    }

    public static final long m(C9113N c9113n, long j11, float f7) {
        return c9113n.f82424d == EnumC9142v.Horizontal ? Z1.w.b(f7, 0.0f, 2, j11) : Z1.w.b(0.0f, f7, 1, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(long j11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9111L c9111l;
        int i11;
        kotlin.jvm.internal.L l11;
        if (cVar instanceof C9111L) {
            c9111l = (C9111L) cVar;
            int i12 = c9111l.f82410g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9111l.f82410g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9111l.f82408e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9111l.f82410g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.L l12 = new kotlin.jvm.internal.L();
                    l12.f71786a = j11;
                    EnumC8372M enumC8372M = EnumC8372M.Default;
                    Function2 c9112m = new C9112M(this, l12, j11, null);
                    c9111l.f82407d = l12;
                    c9111l.f82410g = 1;
                    if (t(enumC8372M, c9112m, c9111l) == obj2) {
                        return obj2;
                    }
                    l11 = l12;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l11 = c9111l.f82407d;
                    Sc.s.b(obj);
                }
                return Z1.w.a(l11.f71786a);
            }
        }
        c9111l = new C9111L(this, cVar);
        Object obj3 = c9111l.f82408e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9111l.f82410g;
        if (i11 != 0) {
        }
        return Z1.w.a(l11.f71786a);
    }

    public final boolean o() {
        return this.f82424d == EnumC9142v.Vertical;
    }

    public final Object p(long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        long b11 = Z1.w.b(0.0f, 0.0f, this.f82424d == EnumC9142v.Horizontal ? 1 : 2, j11);
        b bVar = new b(null);
        n0.W w11 = this.f82422b;
        if (w11 == null || !(this.f82421a.b() || this.f82421a.e())) {
            Object invoke = bVar.invoke(Z1.w.a(b11), dVar);
            return invoke == Wc.a.COROUTINE_SUSPENDED ? invoke : Unit.f71690a;
        }
        Object d11 = w11.d(b11, bVar, dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final long q(long j11) {
        if (this.f82421a.a()) {
            return 0L;
        }
        return x(r(this.f82421a.c(r(w(j11)))));
    }

    public final float r(float f7) {
        return this.f82425e ? f7 * (-1) : f7;
    }

    public final long s(long j11) {
        return this.f82425e ? C7459e.l(-1.0f, j11) : j11;
    }

    public final Object t(@NotNull EnumC8372M enumC8372M, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object d11 = this.f82421a.d(enumC8372M, new C9114O(null, function2, this), cVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final boolean u() {
        if (this.f82421a.a()) {
            return true;
        }
        n0.W w11 = this.f82422b;
        return w11 != null ? w11.a() : false;
    }

    public final long v(long j11) {
        return C7459e.b(j11, 0.0f, this.f82424d == EnumC9142v.Horizontal ? 1 : 2);
    }

    public final float w(long j11) {
        return this.f82424d == EnumC9142v.Horizontal ? C7459e.g(j11) : C7459e.h(j11);
    }

    public final long x(float f7) {
        if (f7 == 0.0f) {
            return 0L;
        }
        return this.f82424d == EnumC9142v.Horizontal ? P9.a.a(f7, 0.0f) : P9.a.a(0.0f, f7);
    }

    public final boolean y(n0.W w11, @NotNull InterfaceC9138r interfaceC9138r, @NotNull EnumC9142v enumC9142v, @NotNull InterfaceC9108I interfaceC9108I, @NotNull C10407b c10407b, boolean z11) {
        boolean z12;
        boolean z13 = true;
        if (Intrinsics.d(this.f82421a, interfaceC9108I)) {
            z12 = false;
        } else {
            this.f82421a = interfaceC9108I;
            z12 = true;
        }
        this.f82422b = w11;
        if (this.f82424d != enumC9142v) {
            this.f82424d = enumC9142v;
            z12 = true;
        }
        if (this.f82425e != z11) {
            this.f82425e = z11;
        } else {
            z13 = z12;
        }
        this.f82423c = interfaceC9138r;
        this.f82426f = c10407b;
        return z13;
    }
}
