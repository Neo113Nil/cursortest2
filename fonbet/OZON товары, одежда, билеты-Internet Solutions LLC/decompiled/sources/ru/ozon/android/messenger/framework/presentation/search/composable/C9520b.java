package ru.ozon.android.messenger.framework.presentation.search.composable;

import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import J0.P;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.composable.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9520b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9520b(androidx.compose.ui.e eVar) {
        super(2);
        this.f91648b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e g10 = T.g(this.f91648b, 16, 12);
            C5194q a11 = C5193p.a(C5179b.n(6), InterfaceC6250b.a.k(), interfaceC3967k2, 6);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, g10);
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
            Function2 c11 = P.c(interfaceC3967k2, a11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            d.b i11 = InterfaceC6250b.a.i();
            e.a aVar = androidx.compose.ui.e.f40358c0;
            Y b11 = X.b(C5179b.f(), i11, interfaceC3967k2, 48);
            int I12 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
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
            Function2 f12 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(f12, I12, interfaceC3967k2, I12);
            }
            F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), interfaceC3967k2, 0);
            int I13 = interfaceC3967k2.I();
            A0 d13 = interfaceC3967k2.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(interfaceC3967k2, layoutWeightElement);
            Function0 a14 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a14);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f14 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d13);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I13))) {
                Nk.a.d(f14, I13, interfaceC3967k2, I13);
            }
            F1.b(interfaceC3967k2, f13, InterfaceC2801g.a.f());
            float f15 = 18;
            j.e(a0.o(aVar, UserVerificationMethods.USER_VERIFY_PATTERN, f15), interfaceC3967k2, 0);
            interfaceC3967k2.f();
            j.e(a0.o(aVar, 32, f15), interfaceC3967k2, 0);
            interfaceC3967k2.f();
            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.i(), interfaceC3967k2, 48);
            int I14 = interfaceC3967k2.I();
            A0 d14 = interfaceC3967k2.d();
            androidx.compose.ui.e f16 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
            Function0 a15 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a15);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f17 = C3173b.f(interfaceC3967k2, b13, interfaceC3967k2, d14);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I14))) {
                Nk.a.d(f17, I14, interfaceC3967k2, I14);
            }
            F1.b(interfaceC3967k2, f16, InterfaceC2801g.a.f());
            j.e(a0.e(a0.f(aVar, f15), 1.0f), interfaceC3967k2, 6);
            interfaceC3967k2.f();
            j.e(a0.e(a0.f(aVar, f15), 1.0f), interfaceC3967k2, 6);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
