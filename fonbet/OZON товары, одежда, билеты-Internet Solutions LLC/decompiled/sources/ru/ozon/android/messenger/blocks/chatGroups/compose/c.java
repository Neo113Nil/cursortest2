package ru.ozon.android.messenger.blocks.chatGroups.compose;

import A0.h;
import D1.InterfaceC2801g;
import I0.C3173b;
import J0.P;
import J0.u3;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import m3.C8060b;
import n0.d0;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f84671b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d0 f84672c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f84673d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.blocks.chatGroups.a, Unit> f84674e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f84675f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f84676g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e.a aVar, d0 d0Var, ArrayList arrayList, Function1 function1, boolean z11, float f7) {
        super(2);
        this.f84671b = aVar;
        this.f84672c = d0Var;
        this.f84673d = arrayList;
        this.f84674e = function1;
        this.f84675f = z11;
        this.f84676g = f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        long textSecondary;
        char c11;
        boolean z11;
        c cVar = this;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            float f7 = 10;
            boolean z12 = false;
            androidx.compose.ui.e a11 = z.a(T.h(cVar.f84671b, f7, 0.0f, 2), cVar.f84672c);
            char c12 = 6;
            Y b11 = X.b(C5179b.n(f7), InterfaceC6250b.a.l(), interfaceC3967k2, 6);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, a11);
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
            Function2 f12 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f12, I11, interfaceC3967k2, I11);
            }
            Ek.a.g(f11, interfaceC3967k2, 2107842525);
            for (ru.ozon.android.messenger.blocks.chatGroups.a aVar : cVar.f84673d) {
                UniTheme uniTheme = UniTheme.INSTANCE;
                K1.T body300XSmall = uniTheme.getTypography().getBody300XSmall();
                if (aVar.g()) {
                    interfaceC3967k2.o(-716807786);
                    textSecondary = uniTheme.getColors(interfaceC3967k2, UniTheme.$stable).getTextPrimary();
                    interfaceC3967k2.k();
                } else {
                    interfaceC3967k2.o(-716719436);
                    textSecondary = uniTheme.getColors(interfaceC3967k2, UniTheme.$stable).getTextSecondary();
                    interfaceC3967k2.k();
                }
                K1.T c13 = K1.T.c(body300XSmall, textSecondary, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
                e.a aVar2 = androidx.compose.ui.e.f40358c0;
                interfaceC3967k2.o(-161660628);
                Function1<ru.ozon.android.messenger.blocks.chatGroups.a, Unit> function1 = cVar.f84674e;
                boolean n11 = interfaceC3967k2.n(function1) | interfaceC3967k2.F(aVar);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new a(function1, aVar);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                androidx.compose.ui.e c14 = i.c(aVar2, false, null, null, (Function0) C11, 7);
                C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), interfaceC3967k2, 48);
                int I12 = interfaceC3967k2.I();
                A0 d12 = interfaceC3967k2.d();
                androidx.compose.ui.e f13 = androidx.compose.ui.c.f(interfaceC3967k2, c14);
                InterfaceC2801g.f5440U.getClass();
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
                Function2 c15 = P.c(interfaceC3967k2, a13, interfaceC3967k2, d12);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                    Nk.a.d(c15, I12, interfaceC3967k2, I12);
                }
                F1.b(interfaceC3967k2, f13, InterfaceC2801g.a.f());
                G.b(cVar.f84675f, aVar2, null, null, null, a1.c.c(-396523444, new b(aVar), interfaceC3967k2), interfaceC3967k2, 1573254, 28);
                InterfaceC3967k interfaceC3967k3 = interfaceC3967k2;
                u3.b(aVar.getName(), T.j(aVar2, 0.0f, cVar.f84676g, 0.0f, 8, 5), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c13, interfaceC3967k3, 0, 0, 65532);
                interfaceC3967k2 = interfaceC3967k3;
                interfaceC3967k2.o(2047611108);
                if (aVar.g()) {
                    androidx.compose.ui.e r11 = a0.r(a0.f(aVar2, 4), 56);
                    c11 = 6;
                    float f14 = 6;
                    z11 = false;
                    C5185h.a(androidx.compose.foundation.e.b(r11, uniTheme.getColors(interfaceC3967k2, UniTheme.$stable).getBgActionPrimary(), h.d(f14, f14, 0.0f, 0.0f, 12)), interfaceC3967k2, 0);
                } else {
                    c11 = 6;
                    z11 = false;
                }
                interfaceC3967k2.k();
                interfaceC3967k2.f();
                cVar = this;
                c12 = c11;
                z12 = z11;
            }
            interfaceC3967k2.k();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
