package ru.ozon.android.messenger.framework.presentation.ai;

import S0.A1;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.initialization.d;
import u0.C9915y;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9437o extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89647b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9437o(C9413c c9413c, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f89647b = c9413c;
        this.f89648c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C9413c c9413c = this.f89647b;
            interfaceC3967k2.o(-2047693121);
            interfaceC3967k2.o(1568770518);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Z1.h.a(0), D1.f25195a);
                interfaceC3967k2.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(1568772502);
            Object C12 = interfaceC3967k2.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Z1.h.a(0), D1.f25195a);
                interfaceC3967k2.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C12;
            interfaceC3967k2.k();
            interfaceC3967k2.o(1568774478);
            Object C13 = interfaceC3967k2.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = n1.e(new C9444s(interfaceC3978p0, interfaceC3978p02));
                interfaceC3967k2.x(C13);
            }
            A1 a12 = (A1) C13;
            interfaceC3967k2.k();
            Z1.d dVar = (Z1.d) interfaceC3967k2.m(androidx.compose.ui.platform.K0.e());
            Unit unit = Unit.f71690a;
            interfaceC3967k2.o(1568779352);
            boolean n11 = interfaceC3967k2.n(dVar) | interfaceC3967k2.F(c9413c);
            Object C14 = interfaceC3967k2.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new r(interfaceC3978p0, interfaceC3978p02, dVar, c9413c);
                interfaceC3967k2.x(C14);
            }
            interfaceC3967k2.k();
            S0.Q.c(unit, (Function1) C14, interfaceC3967k2);
            Pair pair = (Pair) a12.getValue();
            interfaceC3967k2.k();
            float d11 = ((Z1.h) pair.a()).d();
            float d12 = ((Z1.h) pair.b()).d();
            interfaceC3967k2.o(593463054);
            boolean F11 = interfaceC3967k2.F(c9413c);
            Object C15 = interfaceC3967k2.C();
            if (F11 || C15 == InterfaceC3967k.a.a()) {
                C15 = new C9435n(c9413c);
                interfaceC3967k2.x(C15);
            }
            Function0 function0 = (Function0) C15;
            interfaceC3967k2.k();
            C9414c0 A11 = C9413c.A(c9413c);
            ru.ozon.android.messenger.framework.core.initialization.d dVar2 = c9413c.f89421e;
            if (dVar2 == null) {
                Intrinsics.n("messengerConfig");
                throw null;
            }
            d.a aiAssistantCustomSettings = dVar2.getAiAssistantCustomSettings();
            C9915y b11 = androidx.compose.foundation.layout.T.b(0.0f, d11, 0.0f, d12, 5);
            interfaceC3967k2.o(593487564);
            boolean F12 = interfaceC3967k2.F(c9413c);
            Object C16 = interfaceC3967k2.C();
            if (F12 || C16 == InterfaceC3967k.a.a()) {
                C16 = new C9429k(c9413c);
                interfaceC3967k2.x(C16);
            }
            Function0 function02 = (Function0) C16;
            interfaceC3967k2.k();
            interfaceC3967k2.o(593496725);
            boolean F13 = interfaceC3967k2.F(c9413c);
            Object C17 = interfaceC3967k2.C();
            if (F13 || C17 == InterfaceC3967k.a.a()) {
                C17 = new C9431l(c9413c);
                interfaceC3967k2.x(C17);
            }
            Function1 function1 = (Function1) C17;
            interfaceC3967k2.k();
            interfaceC3967k2.o(593527641);
            boolean F14 = interfaceC3967k2.F(c9413c);
            Object C18 = interfaceC3967k2.C();
            if (F14 || C18 == InterfaceC3967k.a.a()) {
                C18 = new C9433m(c9413c);
                interfaceC3967k2.x(C18);
            }
            interfaceC3967k2.k();
            U.a(null, A11, this.f89648c, aiAssistantCustomSettings, b11, function0, function02, function1, (Function1) C18, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
