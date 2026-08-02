package ru.ozon.android.messenger.framework.presentation.search.composable;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.A1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.n1;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m0.C8004n;
import m0.EnumC7987e0;
import m0.G;
import m0.O;
import m0.T;
import m0.T0;
import m3.C8060b;
import u0.C9896e;
import u0.InterfaceC9894c;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.composable.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9523e extends AbstractC7737t implements InterfaceC6511n<InterfaceC9894c, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5179b.k f91653b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f91654c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f91655d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ List<C7807Z> f91656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9523e(C5179b.k kVar, float f7, float f11, List list) {
        super(3);
        C4912a c4912a = C9519a.f91646a;
        this.f91653b = kVar;
        this.f91654c = f7;
        this.f91655d = f11;
        this.f91656e = list;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9894c interfaceC9894c, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9894c BoxWithConstraints = interfaceC9894c;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(BoxWithConstraints) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Z1.d dVar = (Z1.d) interfaceC3967k2.m(K0.e());
            float d11 = BoxWithConstraints.d();
            float f7 = this.f91654c;
            float v12 = dVar.v1(d11 - (2 * f7));
            float v13 = ((Z1.d) interfaceC3967k2.m(K0.e())).v1(this.f91655d - f7);
            O.a a11 = T.a(T.c(null, interfaceC3967k2, 1), 0.0f, v12 + v13, C8004n.a(new T0(1300, 300, G.b()), EnumC7987e0.Restart, 4), null, interfaceC3967k2, 4152, 8);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            C5194q a12 = C5193p.a(this.f91653b, InterfaceC6250b.a.k(), interfaceC3967k2, 0);
            int I11 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a13 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a13);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c11 = P.c(interfaceC3967k2, a12, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            Object obj = C9896e.f99653a;
            interfaceC3967k2.o(2066415219);
            boolean n11 = interfaceC3967k2.n(a11);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = n1.e(new C9522d(this.f91656e, a11, v13));
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            C9519a.f91646a.invoke(obj, androidx.compose.foundation.layout.T.f(aVar, f7), (A1) C11, interfaceC3967k2, 6);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
