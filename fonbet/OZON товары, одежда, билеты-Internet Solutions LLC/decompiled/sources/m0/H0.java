package m0;

import S0.InterfaceC3967k;
import Sc.InterfaceC3999a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.D0;
import m0.D0.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<C7989f0<?>, Unit> f73534a = b.f73537b;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f73535b = Sc.k.a(Sc.n.NONE, a.f73536b);

    static final class a extends AbstractC7737t implements Function0<c1.y> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f73536b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final c1.y invoke() {
            c1.y yVar = new c1.y(G0.f73533b);
            yVar.l();
            return yVar;
        }
    }

    static final class b extends AbstractC7737t implements Function1<C7989f0<?>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f73537b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7989f0<?> c7989f0) {
            c7989f0.I();
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<S0.N, S0.M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D0<S> f73538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D0<S>.a<T, V> f73539c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D0<S> d02, D0<S>.a<T, V> aVar) {
            super(1);
            this.f73538b = d02;
            this.f73539c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final S0.M invoke(S0.N n11) {
            return new K0(this.f73538b, this.f73539c);
        }
    }

    @NotNull
    public static final D0 b(@NotNull D0 d02, l0.O o11, l0.O o12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && interfaceC3967k.n(d02)) || (i11 & 6) == 4;
        Object C11 = interfaceC3967k.C();
        if (z12 || C11 == InterfaceC3967k.a.a()) {
            C11 = new D0(new Y(o11), d02, d02.j() + " > EnterExitTransition");
            interfaceC3967k.x(C11);
        }
        D0 d03 = (D0) C11;
        if ((i12 <= 4 || !interfaceC3967k.n(d02)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean n11 = interfaceC3967k.n(d03) | z11;
        Object C12 = interfaceC3967k.C();
        if (n11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new J0(d02, d03);
            interfaceC3967k.x(C12);
        }
        S0.Q.c(d03, (Function1) C12, interfaceC3967k);
        if (d02.p()) {
            d03.y(d02.k(), o11, o12);
            return d03;
        }
        d03.E(o12);
        d03.C(false);
        return d03;
    }

    @NotNull
    public static final <S, T, V extends AbstractC8015t> D0<S>.a<T, V> c(@NotNull D0<S> d02, @NotNull U0<T, V> u02, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i13 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i13 > 4 && interfaceC3967k.n(d02)) || (i11 & 6) == 4;
        Object C11 = interfaceC3967k.C();
        if (z12 || C11 == InterfaceC3967k.a.a()) {
            C11 = d02.new a(u02, str);
            interfaceC3967k.x(C11);
        }
        D0<S>.a<T, V> aVar = (D0.a) C11;
        if ((i13 <= 4 || !interfaceC3967k.n(d02)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean F11 = interfaceC3967k.F(aVar) | z11;
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new c(d02, aVar);
            interfaceC3967k.x(C12);
        }
        S0.Q.c(aVar, (Function1) C12, interfaceC3967k);
        if (d02.p()) {
            aVar.c();
        }
        return aVar;
    }

    @NotNull
    public static final D0.d d(@NotNull D0 d02, Object obj, Object obj2, @NotNull H h11, @NotNull U0 u02, InterfaceC3967k interfaceC3967k, int i11) {
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && interfaceC3967k.n(d02)) || (i11 & 6) == 4;
        Object C11 = interfaceC3967k.C();
        if (z12 || C11 == InterfaceC3967k.a.a()) {
            AbstractC8015t abstractC8015t = (AbstractC8015t) u02.a().invoke(obj2);
            abstractC8015t.d();
            C11 = new D0.d(obj, abstractC8015t, u02);
            interfaceC3967k.x(C11);
        }
        D0.d dVar = (D0.d) C11;
        if (d02.p()) {
            dVar.C(obj, obj2, h11);
        } else {
            dVar.E(obj2, h11);
        }
        if ((i12 <= 4 || !interfaceC3967k.n(d02)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean n11 = interfaceC3967k.n(dVar) | z11;
        Object C12 = interfaceC3967k.C();
        if (n11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new M0(d02, dVar);
            interfaceC3967k.x(C12);
        }
        S0.Q.c(dVar, (Function1) C12, interfaceC3967k);
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public static final c1.y e() {
        return (c1.y) f73535b.getValue();
    }

    @NotNull
    public static final D0 f(@NotNull S0 s02, String str, InterfaceC3967k interfaceC3967k, int i11) {
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && interfaceC3967k.n(s02)) || (i11 & 6) == 4;
        Object C11 = interfaceC3967k.C();
        if (z12 || C11 == InterfaceC3967k.a.a()) {
            C11 = new D0(s02, null, str);
            interfaceC3967k.x(C11);
        }
        D0 d02 = (D0) C11;
        if (s02 instanceof C7989f0) {
            interfaceC3967k.o(1030413636);
            Object a11 = s02.a();
            Object b11 = s02.b();
            if ((i12 <= 4 || !interfaceC3967k.n(s02)) && (i11 & 6) != 4) {
                z11 = false;
            }
            Object C12 = interfaceC3967k.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new N0(s02, null);
                interfaceC3967k.x(C12);
            }
            S0.Q.g(a11, b11, (Function2) C12, interfaceC3967k);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(1030875195);
            d02.e(s02.b(), interfaceC3967k, 0);
            interfaceC3967k.k();
        }
        boolean n11 = interfaceC3967k.n(d02);
        Object C13 = interfaceC3967k.C();
        if (n11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new P0(d02);
            interfaceC3967k.x(C13);
        }
        S0.Q.c(d02, (Function1) C13, interfaceC3967k);
        return d02;
    }

    @NotNull
    public static final D0 g(Object obj, String str, InterfaceC3967k interfaceC3967k, int i11) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new D0(new Y(obj), null, str);
            interfaceC3967k.x(C11);
        }
        D0 d02 = (D0) C11;
        d02.e(obj, interfaceC3967k, (i11 & 8) | 48 | (i11 & 14));
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new R0(d02);
            interfaceC3967k.x(C12);
        }
        S0.Q.c(d02, (Function1) C12, interfaceC3967k);
        return d02;
    }

    @InterfaceC3999a
    @NotNull
    public static final D0 h(@NotNull Y y11, InterfaceC3967k interfaceC3967k) {
        return f(y11, "", interfaceC3967k, 48);
    }
}
