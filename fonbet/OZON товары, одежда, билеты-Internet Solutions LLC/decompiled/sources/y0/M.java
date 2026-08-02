package y0;

import c1.AbstractC5715f;
import e1.d;
import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n0.C8393n;
import r0.EnumC9142v;
import s0.InterfaceC9574q;
import u0.C9915y;
import x0.C10610o;
import x0.InterfaceC10573B;

/* loaded from: classes8.dex */
final class M extends AbstractC7737t implements Function2<InterfaceC10573B, Z1.b, N> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f105675b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC9142v f105676c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9915y f105677d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f105678e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10808o f105679f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.reflect.n f105680g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f105681h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ d.b f105682i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ d.a f105683j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f105684k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ InterfaceC9574q.a f105685l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ xe.M f105686m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(b0 b0Var, EnumC9142v enumC9142v, C9915y c9915y, float f7, C10808o c10808o, kotlin.reflect.n nVar, Function0 function0, d.b bVar, d.a aVar, int i11, InterfaceC9574q.a aVar2, xe.M m11) {
        super(2);
        this.f105675b = b0Var;
        this.f105676c = enumC9142v;
        this.f105677d = c9915y;
        this.f105678e = f7;
        this.f105679f = c10808o;
        this.f105680g = nVar;
        this.f105681h = function0;
        this.f105682i = bVar;
        this.f105683j = aVar;
        this.f105684k = i11;
        this.f105685l = aVar2;
        this.f105686m = m11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final N invoke(InterfaceC10573B interfaceC10573B, Z1.b bVar) {
        int i11;
        long j11;
        int i12;
        long j12;
        int i13;
        InterfaceC10573B interfaceC10573B2 = interfaceC10573B;
        long p11 = bVar.p();
        b0 b0Var = this.f105675b;
        b0Var.A().getValue();
        EnumC9142v enumC9142v = EnumC9142v.Vertical;
        EnumC9142v enumC9142v2 = this.f105676c;
        boolean z11 = enumC9142v2 == enumC9142v;
        C8393n.a(p11, z11 ? enumC9142v : EnumC9142v.Horizontal);
        C9915y c9915y = this.f105677d;
        int Y02 = z11 ? interfaceC10573B2.Y0(c9915y.b(interfaceC10573B2.getLayoutDirection())) : interfaceC10573B2.Y0(androidx.compose.foundation.layout.T.d(c9915y, interfaceC10573B2.getLayoutDirection()));
        int Y03 = z11 ? interfaceC10573B2.Y0(c9915y.c(interfaceC10573B2.getLayoutDirection())) : interfaceC10573B2.Y0(androidx.compose.foundation.layout.T.c(c9915y, interfaceC10573B2.getLayoutDirection()));
        int Y04 = interfaceC10573B2.Y0(c9915y.d());
        int Y05 = interfaceC10573B2.Y0(c9915y.a()) + Y04;
        int i14 = Y02 + Y03;
        int i15 = z11 ? Y05 : i14;
        if (z11) {
            Y03 = Y04;
        } else if (!z11) {
            Y03 = Y02;
        }
        int i16 = i15 - Y03;
        long k11 = Z1.c.k(-i14, -Y05, p11);
        b0Var.S(interfaceC10573B2);
        int Y06 = interfaceC10573B2.Y0(this.f105678e);
        int j13 = z11 ? Z1.b.j(p11) - Y05 : Z1.b.k(p11) - i14;
        long a11 = Z1.n.a(Y02, Y04);
        this.f105679f.getClass();
        if (j13 < 0) {
            i11 = Y03;
            j11 = k11;
            i12 = j13;
            j12 = a11;
            i13 = 0;
        } else {
            i11 = Y03;
            j11 = k11;
            i12 = j13;
            j12 = a11;
            i13 = i12;
        }
        b0Var.T(Z1.c.b(enumC9142v2 == enumC9142v ? Z1.b.k(j11) : i13, enumC9142v2 != enumC9142v ? Z1.b.j(j11) : i13, 5));
        F f7 = (F) this.f105680g.invoke();
        InterfaceC9574q.a aVar = this.f105685l;
        AbstractC5715f a12 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a12 != null ? a12.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a12);
        try {
            int P11 = b0Var.P(f7, b0Var.r());
            b0Var.r();
            float s11 = b0Var.s();
            b0Var.C();
            aVar.getClass();
            int c11 = C6915b.c(0 - ((i13 + Y06) * s11));
            Unit unit = Unit.f71690a;
            AbstractC5715f.a.d(a12, b11, h11);
            N c12 = K.c(interfaceC10573B2, this.f105681h.invoke().intValue(), f7, i12, i11, i16, Y06, P11, c11, j11, this.f105676c, this.f105682i, this.f105683j, j12, i13, this.f105684k, C10610o.a(f7, b0Var.G(), b0Var.q()), this.f105685l, b0Var.H(), this.f105686m, new L(interfaceC10573B2, p11, i14, Y05));
            b0Var.n(c12, false);
            return c12;
        } catch (Throwable th2) {
            AbstractC5715f.a.d(a12, b11, h11);
            throw th2;
        }
    }
}
