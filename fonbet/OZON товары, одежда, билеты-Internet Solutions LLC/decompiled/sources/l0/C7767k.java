package l0;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.C7774s;
import m0.D0;

/* renamed from: l0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7767k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0<Object> f72102b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f72103c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<r<Object>, N> f72104d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7774s<Object> f72105e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c1.u<Object> f72106f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f72107g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7767k(D0 d02, Object obj, Function1 function1, C7774s c7774s, c1.u uVar, C4912a c4912a) {
        super(2);
        this.f72102b = d02;
        this.f72103c = obj;
        this.f72104d = function1;
        this.f72105e = c7774s;
        this.f72106f = uVar;
        this.f72107g = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            N C11 = interfaceC3967k2.C();
            InterfaceC3967k.a.C0506a a11 = InterfaceC3967k.a.a();
            Function1<r<Object>, N> function1 = this.f72104d;
            C7774s<Object> c7774s = this.f72105e;
            if (C11 == a11) {
                C11 = function1.invoke(c7774s);
                interfaceC3967k2.x(C11);
            }
            N n11 = (N) C11;
            D0<Object> d02 = this.f72102b;
            Object b11 = d02.m().b();
            Object obj = this.f72103c;
            boolean p11 = interfaceC3967k2.p(Intrinsics.d(b11, obj));
            Object C12 = interfaceC3967k2.C();
            if (p11 || C12 == InterfaceC3967k.a.a()) {
                C12 = Intrinsics.d(d02.m().b(), obj) ? androidx.compose.animation.s.f38816a : function1.invoke(c7774s).a();
                interfaceC3967k2.x(C12);
            }
            androidx.compose.animation.s sVar = (androidx.compose.animation.s) C12;
            Object C13 = interfaceC3967k2.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = new C7774s.a(Intrinsics.d(obj, d02.n()));
                interfaceC3967k2.x(C13);
            }
            C7774s.a aVar = (C7774s.a) C13;
            androidx.compose.animation.q c11 = n11.c();
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            boolean F11 = interfaceC3967k2.F(n11);
            Object C14 = interfaceC3967k2.C();
            if (F11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new C7761e(n11);
                interfaceC3967k2.x(C14);
            }
            androidx.compose.ui.e a12 = androidx.compose.ui.layout.b.a((InterfaceC6511n) C14, aVar2);
            aVar.b(Intrinsics.d(obj, d02.n()));
            androidx.compose.ui.e l02 = a12.l0(aVar);
            boolean F12 = interfaceC3967k2.F(obj);
            Object C15 = interfaceC3967k2.C();
            if (F12 || C15 == InterfaceC3967k.a.a()) {
                C15 = new C7762f(obj);
                interfaceC3967k2.x(C15);
            }
            Function1 function12 = (Function1) C15;
            boolean n12 = interfaceC3967k2.n(sVar);
            Object C16 = interfaceC3967k2.C();
            if (n12 || C16 == InterfaceC3967k.a.a()) {
                C16 = new C7763g(sVar);
                interfaceC3967k2.x(C16);
            }
            G.a(this.f72102b, function12, l02, c11, sVar, (Function2) C16, a1.c.c(-616195562, new C7766j(this.f72106f, obj, c7774s, this.f72107g), interfaceC3967k2), interfaceC3967k2, 12582912);
        }
        return Unit.f71690a;
    }
}
