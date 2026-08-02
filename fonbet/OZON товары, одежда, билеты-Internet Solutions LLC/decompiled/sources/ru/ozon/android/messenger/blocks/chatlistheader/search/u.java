package ru.ozon.android.messenger.blocks.chatlistheader.search;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import Q1.K;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class u extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f84852b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextDTO f84853c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(K k11, TextDTO textDTO, Function0<Unit> function0) {
        super(3);
        this.f84852b = k11;
        this.f84853c = textDTO;
        this.f84854d = function0;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        TextDTO textDTO;
        Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> innerTextField = function2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.F(innerTextField) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e1.d h11 = InterfaceC6250b.a.h();
            e.a aVar = androidx.compose.ui.e.f40358c0;
            V f7 = C5185h.f(h11, false);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a11);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            Ek.a.g(f11, interfaceC3967k2, 274091691);
            K k11 = this.f84852b;
            if (k11.f().length() == 0 && (textDTO = this.f84853c) != null) {
                DsTextAtomKt.DsTextAtom(textDTO, aVar, interfaceC3967k2, 48, 0);
            }
            interfaceC3967k2.k();
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.i(), interfaceC3967k2, 54);
            int I12 = interfaceC3967k2.I();
            A0 d13 = interfaceC3967k2.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
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
            Function2 f13 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d13);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(f13, I12, interfaceC3967k2, I12);
            }
            F1.b(interfaceC3967k2, f12, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            androidx.compose.ui.e j11 = T.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 8, 0.0f, 11);
            V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I13 = interfaceC3967k2.I();
            A0 d14 = interfaceC3967k2.d();
            androidx.compose.ui.e f15 = androidx.compose.ui.c.f(interfaceC3967k2, j11);
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
            Function2 d15 = C2454a.d(interfaceC3967k2, f14, interfaceC3967k2, d14);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I13))) {
                Nk.a.d(d15, I13, interfaceC3967k2, I13);
            }
            F1.b(interfaceC3967k2, f15, InterfaceC2801g.a.f());
            innerTextField.invoke(interfaceC3967k2, Integer.valueOf(intValue & 14));
            interfaceC3967k2.f();
            l0.G.d(k11.f().length() > 0, null, androidx.compose.animation.b.h(null, 3), androidx.compose.animation.b.i(null, 3), null, a1.c.c(-1979194994, new t(this.f84854d), interfaceC3967k2), interfaceC3967k2, 1600518, 18);
            interfaceC3967k2.f();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
