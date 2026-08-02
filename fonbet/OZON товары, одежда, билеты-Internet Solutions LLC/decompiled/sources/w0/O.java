package w0;

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
import hd.C6915b;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.ranges.IntRange;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.C9110K;
import r0.InterfaceC9108I;
import x0.C10583L;
import x0.C10598c;
import x0.C10606k;
import x0.b0;
import x0.c0;

/* loaded from: classes8.dex */
public final class O implements InterfaceC9108I {

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final C5517t f103208t = C5499b.a(a.f103229b, b.f103230b);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f103209u = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10381H f103210a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10384K f103211b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f103212c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final t0.q f103213d;

    /* renamed from: e, reason: collision with root package name */
    private float f103214e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC9108I f103215f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f103216g;

    /* renamed from: h, reason: collision with root package name */
    private D1.H f103217h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final e f103218i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C10598c f103219j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<C10378E> f103220k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C10606k f103221l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.o f103222m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final c f103223n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C10583L f103224o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0<Unit> f103225p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0<Unit> f103226q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C3991w0 f103227r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final C3991w0 f103228s;

    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, O, List<? extends Integer>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f103229b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Integer> invoke(InterfaceC5518u interfaceC5518u, O o11) {
            O o12 = o11;
            return C7714v.b0(Integer.valueOf(o12.m()), Integer.valueOf(o12.n()));
        }
    }

    static final class b extends AbstractC7737t implements Function1<List<? extends Integer>, O> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f103230b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final O invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new O(list2.get(0).intValue(), list2.get(1).intValue());
        }
    }

    public static final class c {
        c() {
        }
    }

    static final class d extends AbstractC7737t implements Function1<b0, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f103233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(1);
            this.f103233c = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(b0 b0Var) {
            b0 b0Var2 = b0Var;
            InterfaceC10381H interfaceC10381H = O.this.f103210a;
            AbstractC5715f a11 = AbstractC5715f.a.a();
            AbstractC5715f.a.d(a11, AbstractC5715f.a.b(a11), a11 != null ? a11.h() : null);
            interfaceC10381H.a(b0Var2, this.f103233c);
            return Unit.f71690a;
        }
    }

    public static final class e implements p0 {
        e() {
        }

        @Override // B1.p0
        public final void b0(@NotNull D1.H h11) {
            O.this.f103217h = h11;
        }
    }

    static final class f extends AbstractC7737t implements Function1<Float, Float> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f7) {
            return Float.valueOf(-O.this.z(-f7.floatValue()));
        }
    }

    public O() {
        this(0, 0, new C10385a());
    }

    public final void A(int i11, int i12, boolean z11) {
        C10384K c10384k = this.f103211b;
        if (c10384k.a() != i11 || c10384k.c() != 0) {
            this.f103220k.j();
        }
        c10384k.d(i11);
        D1.H h11 = this.f103217h;
        if (h11 != null) {
            h11.b();
        }
    }

    public final int B(@NotNull InterfaceC10396l interfaceC10396l, int i11) {
        return this.f103211b.h(interfaceC10396l, i11);
    }

    @Override // r0.InterfaceC9108I
    public final boolean a() {
        return this.f103215f.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC9108I
    public final boolean b() {
        return ((Boolean) this.f103227r.getValue()).booleanValue();
    }

    @Override // r0.InterfaceC9108I
    public final float c(float f7) {
        return this.f103215f.c(f7);
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
        P p11;
        int i11;
        O o11;
        if (cVar instanceof P) {
            p11 = (P) cVar;
            int i12 = p11.f103241i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                p11.f103241i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = p11.f103239g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = p11.f103241i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    p11.f103236d = this;
                    p11.f103237e = enumC8372M;
                    p11.f103238f = function2;
                    p11.f103241i = 1;
                    if (this.f103219j.a(p11) != aVar) {
                        o11 = this;
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
                function2 = p11.f103238f;
                enumC8372M = p11.f103237e;
                o11 = p11.f103236d;
                Sc.s.b(obj);
                InterfaceC9108I interfaceC9108I = o11.f103215f;
                p11.f103236d = null;
                p11.f103237e = null;
                p11.f103238f = null;
                p11.f103241i = 2;
            }
        }
        p11 = new P(this, cVar);
        Object obj2 = p11.f103239g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = p11.f103241i;
        if (i11 != 0) {
        }
        InterfaceC9108I interfaceC9108I2 = o11.f103215f;
        p11.f103236d = null;
        p11.f103237e = null;
        p11.f103238f = null;
        p11.f103241i = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC9108I
    public final boolean e() {
        return ((Boolean) this.f103228s.getValue()).booleanValue();
    }

    public final void j(@NotNull C10377D c10377d, boolean z11) {
        this.f103214e -= c10377d.k();
        this.f103212c.setValue(c10377d);
        this.f103228s.setValue(Boolean.valueOf(c10377d.i()));
        this.f103227r.setValue(Boolean.valueOf(c10377d.j()));
        C10384K c10384k = this.f103211b;
        if (z11) {
            c10384k.g(c10377d.m());
            return;
        }
        c10384k.f(c10377d);
        if (this.f103216g) {
            ((C10385a) this.f103210a).c(c10377d);
        }
    }

    @NotNull
    public final C10598c k() {
        return this.f103219j;
    }

    @NotNull
    public final C10606k l() {
        return this.f103221l;
    }

    public final int m() {
        return this.f103211b.a();
    }

    public final int n() {
        return this.f103211b.c();
    }

    @NotNull
    public final t0.q o() {
        return this.f103213d;
    }

    @NotNull
    public final LazyLayoutItemAnimator<C10378E> p() {
        return this.f103220k;
    }

    @NotNull
    public final InterfaceC10374A q() {
        return (InterfaceC10374A) this.f103212c.getValue();
    }

    @NotNull
    public final InterfaceC3978p0<Unit> r() {
        return this.f103226q;
    }

    @NotNull
    public final IntRange s() {
        return (IntRange) this.f103211b.b().getValue();
    }

    @NotNull
    public final C10583L t() {
        return this.f103224o;
    }

    @NotNull
    public final InterfaceC3978p0<Unit> u() {
        return this.f103225p;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.o v() {
        return this.f103222m;
    }

    public final o0 w() {
        return this.f103217h;
    }

    @NotNull
    public final p0 x() {
        return this.f103218i;
    }

    public final float y() {
        return this.f103214e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float z(float f7) {
        if ((f7 < 0.0f && !b()) || (f7 > 0.0f && !e())) {
            return 0.0f;
        }
        if (Math.abs(this.f103214e) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f103214e).toString());
        }
        float f11 = this.f103214e + f7;
        this.f103214e = f11;
        if (Math.abs(f11) > 0.5f) {
            C10377D c10377d = (C10377D) this.f103212c.getValue();
            float f12 = this.f103214e;
            boolean o11 = c10377d.o(C6915b.c(f12));
            c cVar = this.f103223n;
            InterfaceC10381H interfaceC10381H = this.f103210a;
            if (o11) {
                j(c10377d, true);
                c0.b(this.f103225p);
                float f13 = f12 - this.f103214e;
                if (this.f103216g) {
                    ((C10385a) interfaceC10381H).b(cVar, f13, c10377d);
                }
            } else {
                D1.H h11 = this.f103217h;
                if (h11 != null) {
                    h11.b();
                }
                float f14 = f12 - this.f103214e;
                InterfaceC10374A q11 = q();
                if (this.f103216g) {
                    ((C10385a) interfaceC10381H).b(cVar, f14, q11);
                }
            }
        }
        if (Math.abs(this.f103214e) <= 0.5f) {
            return f7;
        }
        float f15 = f7 - this.f103214e;
        this.f103214e = 0.0f;
        return f15;
    }

    public O(int i11, int i12) {
        this(i11, i12, new C10385a());
    }

    public O(int i11, int i12, @NotNull InterfaceC10381H interfaceC10381H) {
        C10377D c10377d;
        C3991w0 f7;
        C3991w0 f11;
        this.f103210a = interfaceC10381H;
        this.f103211b = new C10384K(i11, i12);
        c10377d = S.f103244a;
        this.f103212c = n1.f(c10377d, n1.h());
        this.f103213d = t0.p.a();
        this.f103215f = C9110K.a(new f());
        this.f103216g = true;
        this.f103218i = new e();
        this.f103219j = new C10598c();
        this.f103220k = new LazyLayoutItemAnimator<>();
        this.f103221l = new C10606k();
        this.f103222m = new androidx.compose.foundation.lazy.layout.o(null, new d(i11));
        this.f103223n = new c();
        this.f103224o = new C10583L();
        this.f103225p = c0.a();
        this.f103226q = c0.a();
        Boolean bool = Boolean.FALSE;
        f7 = n1.f(bool, D1.f25195a);
        this.f103227r = f7;
        f11 = n1.f(bool, D1.f25195a);
        this.f103228s = f11;
    }
}
