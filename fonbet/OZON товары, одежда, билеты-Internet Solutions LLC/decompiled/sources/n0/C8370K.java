package n0;

import D1.AbstractC2810k0;
import D1.C2809k;
import D1.C2811l;
import D1.E0;
import D1.InterfaceC2819t;
import D1.InterfaceC2821v;
import D1.r0;
import D1.s0;
import S0.A1;
import S0.C3991w0;
import S0.n1;
import android.view.View;
import androidx.compose.ui.e;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import ze.C11115c;

/* renamed from: n0.K, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8370K extends e.c implements InterfaceC2821v, InterfaceC2819t, E0, r0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f76072a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7737t f76073b;

    /* renamed from: c, reason: collision with root package name */
    private float f76074c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f76075d;

    /* renamed from: e, reason: collision with root package name */
    private long f76076e;

    /* renamed from: f, reason: collision with root package name */
    private float f76077f;

    /* renamed from: g, reason: collision with root package name */
    private float f76078g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f76079h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private Y f76080i;

    /* renamed from: j, reason: collision with root package name */
    private View f76081j;

    /* renamed from: k, reason: collision with root package name */
    private Z1.d f76082k;

    /* renamed from: l, reason: collision with root package name */
    private X f76083l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f76084m;

    /* renamed from: n, reason: collision with root package name */
    private A1<C7459e> f76085n;

    /* renamed from: o, reason: collision with root package name */
    private long f76086o;

    /* renamed from: p, reason: collision with root package name */
    private Z1.q f76087p;

    /* renamed from: q, reason: collision with root package name */
    private C11115c f76088q;

    /* renamed from: n0.K$a */
    static final class a extends AbstractC7737t implements Function0<C7459e> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C7459e invoke() {
            B1.B J12 = C8370K.J1(C8370K.this);
            return C7459e.a(J12 != null ? J12.y(0L) : 9205357640488583168L);
        }
    }

    /* renamed from: n0.K$b */
    static final class b extends AbstractC7737t implements Function0<C7459e> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C7459e invoke() {
            return C7459e.a(C8370K.this.f76086o);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {380, 384}, m = "invokeSuspend")
    /* renamed from: n0.K$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f76091d;

        /* renamed from: n0.K$c$a */
        static final class a extends AbstractC7737t implements Function1<Long, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f76093b = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Long l11) {
                l11.longValue();
                return Unit.f71690a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return C8370K.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0034 -> B:8:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:6:0x004e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
                int r1 = r6.f76091d
                n0.K r2 = n0.C8370K.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                Sc.s.b(r7)
                goto L4e
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                Sc.s.b(r7)
                goto L30
            L1e:
                Sc.s.b(r7)
            L21:
                ze.c r7 = n0.C8370K.I1(r2)
                if (r7 == 0) goto L30
                r6.f76091d = r4
                java.lang.Object r7 = r7.i(r6)
                if (r7 != r0) goto L30
                goto L4d
            L30:
                n0.X r7 = n0.C8370K.K1(r2)
                if (r7 == 0) goto L21
                r6.f76091d = r3
                kotlin.coroutines.CoroutineContext r7 = r6.getContext()
                S0.f0 r7 = S0.C3961h0.a(r7)
                S0.g0 r1 = new S0.g0
                n0.K$c$a r5 = n0.C8370K.c.a.f76093b
                r1.<init>(r5)
                java.lang.Object r7 = r7.v(r1, r6)
                if (r7 != r0) goto L4e
            L4d:
                return r0
            L4e:
                n0.X r7 = n0.C8370K.K1(r2)
                if (r7 == 0) goto L21
                r7.c()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.C8370K.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: n0.K$d */
    static final class d extends AbstractC7737t implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C8370K.this.Q1();
            return Unit.f71690a;
        }
    }

    private C8370K() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8370K(float f7, float f11, float f12, long j11, Function1 function1, Function1 function12, Y y11, boolean z11, boolean z12) {
        this.f76072a = (AbstractC7737t) function1;
        this.f76073b = (AbstractC7737t) function12;
        this.f76074c = f7;
        this.f76075d = z11;
        this.f76076e = j11;
        this.f76077f = f11;
        this.f76078g = f12;
        this.f76079h = z12;
        this.f76080i = y11;
        this.f76084m = n1.f(null, n1.h());
        this.f76086o = 9205357640488583168L;
    }

    public static final B1.B J1(C8370K c8370k) {
        return (B1.B) c8370k.f76084m.getValue();
    }

    private final long N1() {
        if (this.f76085n == null) {
            this.f76085n = n1.e(new a());
        }
        A1<C7459e> a12 = this.f76085n;
        if (a12 != null) {
            return a12.getValue().n();
        }
        return 9205357640488583168L;
    }

    private final void O1() {
        X x11 = this.f76083l;
        if (x11 != null) {
            x11.dismiss();
        }
        View view = this.f76081j;
        if (view == null) {
            view = C2811l.a(this);
        }
        View view2 = view;
        this.f76081j = view2;
        Z1.d dVar = this.f76082k;
        if (dVar == null) {
            dVar = C2809k.f(this).E();
        }
        Z1.d dVar2 = dVar;
        this.f76082k = dVar2;
        this.f76083l = this.f76080i.b(view2, this.f76075d, this.f76076e, this.f76077f, this.f76078g, this.f76079h, dVar2, this.f76074c);
        R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void Q1() {
        Z1.d dVar = this.f76082k;
        if (dVar == null) {
            dVar = C2809k.f(this).E();
            this.f76082k = dVar;
        }
        long n11 = ((C7459e) this.f76072a.invoke(dVar)).n();
        if (!P9.a.d(n11) || !P9.a.d(N1())) {
            this.f76086o = 9205357640488583168L;
            X x11 = this.f76083l;
            if (x11 != null) {
                x11.dismiss();
                return;
            }
            return;
        }
        this.f76086o = C7459e.k(N1(), n11);
        if (this.f76083l == null) {
            O1();
        }
        X x12 = this.f76083l;
        if (x12 != null) {
            x12.b(this.f76086o, 9205357640488583168L, this.f76074c);
        }
        R1();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    private final void R1() {
        Z1.d dVar;
        X x11 = this.f76083l;
        if (x11 == null || (dVar = this.f76082k) == null || Z1.q.b(x11.a(), this.f76087p)) {
            return;
        }
        ?? r22 = this.f76073b;
        if (r22 != 0) {
            r22.invoke(Z1.j.a(dVar.o(Z1.r.b(x11.a()))));
        }
        this.f76087p = Z1.q.a(x11.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P1(float f7, float f11, float f12, long j11, @NotNull Function1 function1, Function1 function12, @NotNull Y y11, boolean z11, boolean z12) {
        float f13 = this.f76074c;
        long j12 = this.f76076e;
        float f14 = this.f76077f;
        boolean z13 = this.f76075d;
        float f15 = this.f76078g;
        boolean z14 = this.f76079h;
        Y y12 = this.f76080i;
        View view = this.f76081j;
        Z1.d dVar = this.f76082k;
        this.f76072a = (AbstractC7737t) function1;
        this.f76074c = f7;
        this.f76075d = z11;
        this.f76076e = j11;
        this.f76077f = f11;
        this.f76078g = f12;
        this.f76079h = z12;
        this.f76073b = (AbstractC7737t) function12;
        this.f76080i = y11;
        View a11 = C2811l.a(this);
        Z1.d E11 = C2809k.f(this).E();
        if (this.f76083l != null) {
            int i11 = C8371L.f76096b;
            if (((!Float.isNaN(f7) || !Float.isNaN(f13)) && f7 != f13 && !y11.a()) || j11 != j12 || !Z1.h.b(f11, f14) || !Z1.h.b(f12, f15) || z11 != z13 || z12 != z14 || !Intrinsics.d(y11, y12) || !a11.equals(view) || !Intrinsics.d(E11, dVar)) {
                O1();
            }
        }
        Q1();
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull I1.D d11) {
        d11.b(C8371L.a(), new b());
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        ((D1.J) interfaceC8410c).F0();
        C11115c c11115c = this.f76088q;
        if (c11115c != null) {
            c11115c.b(Unit.f71690a);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        onObservedReadsChanged();
        this.f76088q = ze.k.a(0, 7, null);
        C10727i.c(getCoroutineScope(), null, null, new c(null), 3);
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        X x11 = this.f76083l;
        if (x11 != null) {
            x11.dismiss();
        }
        this.f76083l = null;
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        s0.a(this, new d());
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f76084m.setValue(abstractC2810k0);
    }
}
