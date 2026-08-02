package d2;

import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import i1.C6981a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes8.dex */
final class z extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6034K f61087b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f61088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(C6034K c6034k, InterfaceC3978p0 interfaceC3978p0) {
        super(2);
        this.f61087b = c6034k;
        this.f61088c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e c11 = I1.o.c(androidx.compose.ui.e.f40358c0, false, w.f61084b);
            C6034K c6034k = this.f61087b;
            boolean F11 = interfaceC3967k2.F(c6034k);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new x(c6034k);
                interfaceC3967k2.x(C11);
            }
            androidx.compose.ui.e a11 = C6981a.a(androidx.compose.ui.layout.g.a(c11, (Function1) C11), c6034k.c() ? 1.0f : 0.0f);
            C4912a c12 = a1.c.c(606497925, new y(this.f61088c), interfaceC3967k2);
            C6024A c6024a = C6024A.f60972a;
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, a11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            F1.b(interfaceC3967k2, c6024a, InterfaceC2801g.a.e());
            F1.b(interfaceC3967k2, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(b11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            c12.invoke(interfaceC3967k2, 6);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
