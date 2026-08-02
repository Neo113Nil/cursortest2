package m0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7980b<T, V extends AbstractC8015t> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0<T, V> f73660a;

    /* renamed from: b, reason: collision with root package name */
    private final T f73661b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8006o<T, V> f73662c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73663d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73664e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C7981b0 f73665f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C8011q0<T> f73666g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final V f73667h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final V f73668i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private V f73669j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private V f73670k;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: m0.b$a */
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7980b<T, V> f73671d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f73672e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7980b<T, V> c7980b, T t2, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f73671d = c7980b;
            this.f73672e = t2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f73671d, this.f73672e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C7980b<T, V> c7980b = this.f73671d;
            C7980b.b(c7980b);
            Object a11 = C7980b.a(c7980b, this.f73672e);
            c7980b.h().z(a11);
            C7980b.d(c7980b, a11);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7980b(Object obj, @NotNull U0 u02, Object obj2) {
        C3991w0 f7;
        C3991w0 f11;
        this.f73660a = u02;
        this.f73661b = obj2;
        C8006o<T, V> c8006o = new C8006o<>(u02, obj, null, 60);
        this.f73662c = c8006o;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f73663d = f7;
        f11 = n1.f(obj, D1.f25195a);
        this.f73664e = f11;
        this.f73665f = new C7981b0();
        this.f73666g = new C8011q0<>(obj2, 3);
        V s11 = c8006o.s();
        V v11 = s11 instanceof C8008p ? C7984d.f73690e : s11 instanceof C8010q ? C7984d.f73691f : s11 instanceof r ? C7984d.f73692g : C7984d.f73693h;
        Intrinsics.g(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f73667h = v11;
        V s12 = c8006o.s();
        V v12 = s12 instanceof C8008p ? C7984d.f73686a : s12 instanceof C8010q ? C7984d.f73687b : s12 instanceof r ? C7984d.f73688c : C7984d.f73689d;
        Intrinsics.g(v12, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f73668i = v12;
        this.f73669j = v11;
        this.f73670k = v12;
    }

    public static final Object a(C7980b c7980b, Object obj) {
        V v11 = c7980b.f73667h;
        V v12 = c7980b.f73669j;
        boolean d11 = Intrinsics.d(v12, v11);
        V v13 = c7980b.f73670k;
        if (!d11 || !Intrinsics.d(v13, c7980b.f73668i)) {
            U0<T, V> u02 = c7980b.f73660a;
            V invoke = u02.a().invoke(obj);
            int b11 = invoke.b();
            boolean z11 = false;
            for (int i11 = 0; i11 < b11; i11++) {
                if (invoke.a(i11) < v12.a(i11) || invoke.a(i11) > v13.a(i11)) {
                    invoke.e(kotlin.ranges.h.d(invoke.a(i11), v12.a(i11), v13.a(i11)), i11);
                    z11 = true;
                }
            }
            if (z11) {
                return u02.b().invoke(invoke);
            }
        }
        return obj;
    }

    public static final void b(C7980b c7980b) {
        C8006o<T, V> c8006o = c7980b.f73662c;
        c8006o.s().d();
        c8006o.x(Long.MIN_VALUE);
        c7980b.f73663d.setValue(Boolean.FALSE);
    }

    public static final void c(C7980b c7980b) {
        c7980b.f73663d.setValue(Boolean.TRUE);
    }

    public static final void d(C7980b c7980b, Object obj) {
        c7980b.f73664e.setValue(obj);
    }

    public static Object e(C7980b c7980b, Comparable comparable, InterfaceC7976A interfaceC7976A, kotlin.coroutines.d dVar) {
        T value = c7980b.f73662c.getValue();
        U0<T, V> u02 = c7980b.f73660a;
        return C7981b0.d(c7980b.f73665f, new C7978a(c7980b, comparable, new C8027z(interfaceC7976A, u02, value, u02.a().invoke(comparable)), c7980b.f73662c.k(), null, null), dVar);
    }

    public static Object f(C7980b c7980b, Object obj, InterfaceC8002m interfaceC8002m, Function1 function1, kotlin.coroutines.d dVar, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC8002m = c7980b.f73666g;
        }
        Object invoke = c7980b.f73660a.b().invoke(c7980b.f73662c.s());
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        return C7981b0.d(c7980b.f73665f, new C7978a(c7980b, invoke, C7996j.a(interfaceC8002m, c7980b.f73660a, c7980b.f73662c.getValue(), obj, invoke), c7980b.f73662c.k(), function1, null), dVar);
    }

    @NotNull
    public final C8006o g() {
        return this.f73662c;
    }

    @NotNull
    public final C8006o<T, V> h() {
        return this.f73662c;
    }

    public final T i() {
        return this.f73664e.getValue();
    }

    @NotNull
    public final U0<T, V> j() {
        return this.f73660a;
    }

    public final T k() {
        return this.f73662c.getValue();
    }

    public final boolean l() {
        return ((Boolean) this.f73663d.getValue()).booleanValue();
    }

    public final Object m(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = C7981b0.d(this.f73665f, new a(this, t2, null), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final Object n(@NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object d11 = C7981b0.d(this.f73665f, new C7982c(this, null), jVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public /* synthetic */ C7980b(Object obj, U0 u02, Object obj2, int i11) {
        this(obj, u02, (i11 & 4) != 0 ? null : obj2);
    }
}
