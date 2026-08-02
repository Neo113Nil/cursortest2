package n0;

import S0.A1;
import S0.C3956f1;
import S0.C3987u0;
import S0.n1;
import b1.C5516s;
import b1.C5517t;
import b1.InterfaceC5518u;
import c1.AbstractC5715f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8011q0;
import org.jetbrains.annotations.NotNull;
import r0.C9105F;
import r0.C9110K;
import r0.InterfaceC9108I;

/* loaded from: classes8.dex */
public final class d0 implements InterfaceC9108I {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C5517t f76156i = C5516s.a(a.f76165b, b.f76166b);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3987u0 f76157a;

    /* renamed from: e, reason: collision with root package name */
    private float f76161e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3987u0 f76158b = C3956f1.a(0);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final t0.q f76159c = t0.p.a();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private C3987u0 f76160d = C3956f1.a(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC9108I f76162f = C9110K.a(new e());

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final A1 f76163g = n1.e(new d());

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final A1 f76164h = n1.e(new c());

    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, d0, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76165b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC5518u interfaceC5518u, d0 d0Var) {
            return Integer.valueOf(d0Var.m());
        }
    }

    static final class b extends AbstractC7737t implements Function1<Integer, d0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76166b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final d0 invoke(Integer num) {
            return new d0(num.intValue());
        }
    }

    static final class c extends AbstractC7737t implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(d0.this.m() > 0);
        }
    }

    static final class d extends AbstractC7737t implements Function0<Boolean> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            d0 d0Var = d0.this;
            return Boolean.valueOf(d0Var.m() < d0Var.l());
        }
    }

    static final class e extends AbstractC7737t implements Function1<Float, Float> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f7) {
            float floatValue = f7.floatValue();
            d0 d0Var = d0.this;
            float m11 = d0Var.f76161e + d0Var.m() + floatValue;
            float d11 = kotlin.ranges.h.d(m11, 0.0f, d0Var.l());
            boolean z11 = m11 == d11;
            float m12 = d11 - d0Var.m();
            int round = Math.round(m12);
            d0.i(d0Var, d0Var.m() + round);
            d0Var.f76161e = m12 - round;
            if (!z11) {
                floatValue = m12;
            }
            return Float.valueOf(floatValue);
        }
    }

    public d0(int i11) {
        this.f76157a = C3956f1.a(i11);
    }

    public static final void i(d0 d0Var, int i11) {
        d0Var.f76157a.d(i11);
    }

    public static Object j(d0 d0Var, int i11, kotlin.coroutines.d dVar) {
        Object a11 = C9105F.a(d0Var, i11 - d0Var.f76157a.getIntValue(), new C8011q0(null, 7), (kotlin.coroutines.jvm.internal.c) dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // r0.InterfaceC9108I
    public final boolean a() {
        return this.f76162f.a();
    }

    @Override // r0.InterfaceC9108I
    public final boolean b() {
        return ((Boolean) this.f76163g.getValue()).booleanValue();
    }

    @Override // r0.InterfaceC9108I
    public final float c(float f7) {
        return this.f76162f.c(f7);
    }

    @Override // r0.InterfaceC9108I
    public final Object d(@NotNull EnumC8372M enumC8372M, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object d11 = this.f76162f.d(enumC8372M, function2, cVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    @Override // r0.InterfaceC9108I
    public final boolean e() {
        return ((Boolean) this.f76164h.getValue()).booleanValue();
    }

    @NotNull
    public final t0.q k() {
        return this.f76159c;
    }

    public final int l() {
        return this.f76160d.getIntValue();
    }

    public final int m() {
        return this.f76157a.getIntValue();
    }

    public final Object n(int i11, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return C9105F.b(this, i11 - this.f76157a.getIntValue(), jVar);
    }

    public final void o(int i11) {
        C3987u0 c3987u0 = this.f76157a;
        this.f76160d.d(i11);
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            if (c3987u0.getIntValue() > i11) {
                c3987u0.d(i11);
            }
            Unit unit = Unit.f71690a;
        } finally {
            AbstractC5715f.a.d(a11, b11, h11);
        }
    }

    public final void p(int i11) {
        this.f76158b.d(i11);
    }
}
