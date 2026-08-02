package x1;

import D1.C2809k;
import Sc.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.c2;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.C10737n;
import xe.H0;

/* loaded from: classes.dex */
public final class S extends e.c implements N, F, Z1.d {

    /* renamed from: a, reason: collision with root package name */
    private Object f104846a;

    /* renamed from: b, reason: collision with root package name */
    private Object f104847b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f104848c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Function2<? super F, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f104849d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f104850e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private C10638m f104851f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final U0.b<a<?>> f104852g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final U0.b<a<?>> f104853h;

    /* renamed from: i, reason: collision with root package name */
    private C10638m f104854i;

    /* renamed from: j, reason: collision with root package name */
    private long f104855j;

    /* JADX INFO: Access modifiers changed from: private */
    final class a<R> implements InterfaceC10628c, Z1.d, kotlin.coroutines.d<R> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C10737n f104856a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ S f104857b;

        /* renamed from: c, reason: collision with root package name */
        private C10737n f104858c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private EnumC10640o f104859d = EnumC10640o.Main;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final kotlin.coroutines.g f104860e = kotlin.coroutines.g.f71771a;

        public a(@NotNull C10737n c10737n) {
            this.f104856a = c10737n;
            this.f104857b = S.this;
        }

        @Override // Z1.d
        public final float B(int i11) {
            return this.f104857b.B(i11);
        }

        @Override // Z1.d
        public final float C(float f7) {
            return f7 / this.f104857b.g();
        }

        @Override // Z1.d
        public final long D0(long j11) {
            return this.f104857b.D0(j11);
        }

        @Override // Z1.k
        public final long F(float f7) {
            return this.f104857b.F(f7);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        @Override // x1.InterfaceC10628c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object J0(long j11, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
            Q q11;
            int i11;
            try {
                if (aVar instanceof Q) {
                    q11 = (Q) aVar;
                    int i12 = q11.f104845f;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        q11.f104845f = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = q11.f104843d;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = q11.f104845f;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                            return obj;
                        }
                        Sc.s.b(obj);
                        q11.f104845f = 1;
                        Object k12 = k1(j11, function2, q11);
                        return k12 == aVar2 ? aVar2 : k12;
                    }
                }
                if (i11 == 0) {
                }
            } catch (C10641p unused) {
                return null;
            }
            q11 = new Q(this, aVar);
            Object obj2 = q11.f104843d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = q11.f104845f;
        }

        @Override // x1.InterfaceC10628c
        public final long W0() {
            return S.this.W0();
        }

        @Override // Z1.d
        public final int Y0(float f7) {
            return this.f104857b.Y0(f7);
        }

        @Override // Z1.d
        public final float Z0(long j11) {
            return this.f104857b.Z0(j11);
        }

        @Override // x1.InterfaceC10628c
        public final long a() {
            return S.this.f104855j;
        }

        @Override // x1.InterfaceC10628c
        @NotNull
        public final c2 b() {
            return S.this.b();
        }

        @Override // x1.InterfaceC10628c
        @NotNull
        public final C10638m b1() {
            return S.this.f104851f;
        }

        @Override // Z1.d
        public final float g() {
            return this.f104857b.g();
        }

        @Override // kotlin.coroutines.d
        @NotNull
        public final CoroutineContext getContext() {
            return this.f104860e;
        }

        @Override // x1.InterfaceC10628c
        public final Object i0(@NotNull EnumC10640o enumC10640o, @NotNull kotlin.coroutines.jvm.internal.a frame) {
            C10737n c10737n = new C10737n(1, Wc.b.b(frame));
            c10737n.o();
            this.f104859d = enumC10640o;
            this.f104858c = c10737n;
            Object n11 = c10737n.n();
            if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return n11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [xe.B0] */
        /* JADX WARN: Type inference failed for: r7v4, types: [xe.B0] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // x1.InterfaceC10628c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object k1(long j11, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
            O o11;
            int i11;
            C10737n c10737n;
            try {
                if (aVar instanceof O) {
                    o11 = (O) aVar;
                    int i12 = o11.f104839g;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        o11.f104839g = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = o11.f104837e;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = o11.f104839g;
                        if (i11 != 0) {
                            Sc.s.b(obj);
                            if (j11 <= 0 && (c10737n = this.f104858c) != null) {
                                r.Companion companion = Sc.r.INSTANCE;
                                c10737n.resumeWith(Sc.s.a(new C10641p(j11)));
                            }
                            B0 c11 = C10727i.c(S.this.getCoroutineScope(), null, null, new P(j11, this, null), 3);
                            o11.f104836d = c11;
                            o11.f104839g = 1;
                            obj = function2.invoke(this, o11);
                            j11 = c11;
                            if (obj == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            B0 b02 = (B0) o11.f104836d;
                            Sc.s.b(obj);
                            j11 = b02;
                        }
                        return obj;
                    }
                }
                if (i11 != 0) {
                }
                return obj;
            } finally {
                j11.j(C10629d.f104867a);
            }
            o11 = new O(this, aVar);
            Object obj2 = o11.f104837e;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = o11.f104839g;
        }

        @Override // Z1.d
        public final long o(long j11) {
            return this.f104857b.o(j11);
        }

        @Override // Z1.k
        public final float p(long j11) {
            return this.f104857b.p(j11);
        }

        @Override // Z1.d
        public final long r(float f7) {
            return this.f104857b.r(f7);
        }

        @Override // kotlin.coroutines.d
        public final void resumeWith(@NotNull Object obj) {
            U0.b bVar = S.this.f104852g;
            S s11 = S.this;
            synchronized (bVar) {
                s11.f104852g.s(this);
                Unit unit = Unit.f71690a;
            }
            this.f104856a.resumeWith(obj);
        }

        public final void s(Throwable th2) {
            C10737n c10737n = this.f104858c;
            if (c10737n != null) {
                c10737n.A(th2);
            }
            this.f104858c = null;
        }

        public final void t(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o) {
            C10737n c10737n;
            if (enumC10640o != this.f104859d || (c10737n = this.f104858c) == null) {
                return;
            }
            this.f104858c = null;
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(c10638m);
        }

        @Override // Z1.k
        public final float u1() {
            return this.f104857b.u1();
        }

        @Override // Z1.d
        public final float v1(float f7) {
            return this.f104857b.g() * f7;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104862a;

        static {
            int[] iArr = new int[EnumC10640o.values().length];
            try {
                iArr[EnumC10640o.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10640o.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10640o.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104862a = iArr;
        }
    }

    static final class c extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<R> f104863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f104863b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f104863b.s(th2);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {616}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f104864d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return S.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f104864d;
            if (i11 == 0) {
                Sc.s.b(obj);
                S s11 = S.this;
                Function2<F, kotlin.coroutines.d<? super Unit>, Object> M12 = s11.M1();
                this.f104864d = 1;
                if (M12.invoke(s11, this) == aVar) {
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

    public S(Object obj, Object obj2, Object[] objArr, @NotNull Function2<? super F, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        C10638m c10638m;
        this.f104846a = obj;
        this.f104847b = obj2;
        this.f104848c = objArr;
        this.f104849d = function2;
        c10638m = L.f104833a;
        this.f104851f = c10638m;
        this.f104852g = new U0.b<>(new a[16]);
        this.f104853h = new U0.b<>(new a[16]);
        this.f104855j = 0L;
    }

    private final void L1(C10638m c10638m, EnumC10640o enumC10640o) {
        U0.b<a<?>> bVar;
        int m11;
        synchronized (this.f104852g) {
            U0.b<a<?>> bVar2 = this.f104853h;
            bVar2.c(bVar2.m(), this.f104852g);
        }
        try {
            int i11 = b.f104862a[enumC10640o.ordinal()];
            if (i11 == 1 || i11 == 2) {
                U0.b<a<?>> bVar3 = this.f104853h;
                int m12 = bVar3.m();
                if (m12 > 0) {
                    a<?>[] l11 = bVar3.l();
                    int i12 = 0;
                    do {
                        l11[i12].t(c10638m, enumC10640o);
                        i12++;
                    } while (i12 < m12);
                }
            } else if (i11 == 3 && (m11 = (bVar = this.f104853h).m()) > 0) {
                int i13 = m11 - 1;
                a<?>[] l12 = bVar.l();
                do {
                    l12[i13].t(c10638m, enumC10640o);
                    i13--;
                } while (i13 >= 0);
            }
        } finally {
            this.f104853h.h();
        }
    }

    @Override // D1.C0
    public final void D1() {
        v0();
    }

    @NotNull
    public final Function2<F, kotlin.coroutines.d<? super Unit>, Object> M1() {
        return this.f104849d;
    }

    @Override // x1.F
    public final <R> Object N0(@NotNull Function2<? super InterfaceC10628c, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> frame) {
        Wc.a aVar;
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        a completion = new a(c10737n);
        synchronized (this.f104852g) {
            this.f104852g.b(completion);
            Intrinsics.checkNotNullParameter(function2, "<this>");
            Intrinsics.checkNotNullParameter(completion, "completion");
            kotlin.coroutines.d b11 = Wc.b.b(Wc.b.a(completion, completion, function2));
            aVar = Wc.a.COROUTINE_SUSPENDED;
            kotlin.coroutines.h hVar = new kotlin.coroutines.h(b11, aVar);
            r.Companion companion = Sc.r.INSTANCE;
            hVar.resumeWith(Unit.f71690a);
        }
        c10737n.q(new c(completion));
        Object n11 = c10737n.n();
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public final void N1(Object obj, Object obj2, Object[] objArr, @NotNull Function2<? super F, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        boolean z11 = !Intrinsics.d(this.f104846a, obj);
        this.f104846a = obj;
        if (!Intrinsics.d(this.f104847b, obj2)) {
            z11 = true;
        }
        this.f104847b = obj2;
        Object[] objArr2 = this.f104848c;
        if (objArr2 != null && objArr == null) {
            z11 = true;
        }
        if (objArr2 == null && objArr != null) {
            z11 = true;
        }
        boolean z12 = (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) ? z11 : true;
        this.f104848c = objArr;
        if (z12) {
            v0();
        }
        this.f104849d = function2;
    }

    public final long W0() {
        long D02 = D0(b().f());
        long j11 = this.f104855j;
        return C7465k.a(Math.max(0.0f, C7464j.f(D02) - ((int) (j11 >> 32))) / 2.0f, Math.max(0.0f, C7464j.d(D02) - ((int) (j11 & 4294967295L))) / 2.0f);
    }

    @Override // x1.F
    public final long a() {
        return this.f104855j;
    }

    @Override // x1.F
    @NotNull
    public final c2 b() {
        return C2809k.f(this).k0();
    }

    @Override // Z1.d
    public final float g() {
        return C2809k.f(this).E().g();
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        v0();
        super.onDetach();
    }

    @Override // D1.C0
    public final void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        this.f104855j = j11;
        if (enumC10640o == EnumC10640o.Initial) {
            this.f104851f = c10638m;
        }
        if (this.f104850e == null) {
            this.f104850e = C10727i.c(getCoroutineScope(), null, xe.O.UNDISPATCHED, new d(null), 1);
        }
        L1(c10638m, enumC10640o);
        List<x> b11 = c10638m.b();
        int size = b11.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                c10638m = null;
                break;
            } else if (!C10639n.c(b11.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        this.f104854i = c10638m;
    }

    @Override // D1.C0
    public final void r0() {
        C10638m c10638m = this.f104854i;
        if (c10638m == null) {
            return;
        }
        List<x> b11 = c10638m.b();
        int size = b11.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (b11.get(i11).g()) {
                List<x> b12 = c10638m.b();
                ArrayList arrayList = new ArrayList(b12.size());
                int size2 = b12.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    x xVar = b12.get(i12);
                    arrayList.add(new x(xVar.d(), xVar.m(), xVar.f(), false, xVar.h(), xVar.m(), xVar.f(), xVar.g(), xVar.g(), 1, 0L));
                }
                C10638m c10638m2 = new C10638m(arrayList, null);
                this.f104851f = c10638m2;
                L1(c10638m2, EnumC10640o.Initial);
                L1(c10638m2, EnumC10640o.Main);
                L1(c10638m2, EnumC10640o.Final);
                this.f104854i = null;
                return;
            }
        }
    }

    @Override // D1.C0
    public final void s1() {
        v0();
    }

    @Override // Z1.k
    public final float u1() {
        return C2809k.f(this).E().u1();
    }

    @Override // x1.N
    public final void v0() {
        B0 b02 = this.f104850e;
        if (b02 != null) {
            ((H0) b02).j(new E("Pointer input was reset"));
            this.f104850e = null;
        }
    }
}
