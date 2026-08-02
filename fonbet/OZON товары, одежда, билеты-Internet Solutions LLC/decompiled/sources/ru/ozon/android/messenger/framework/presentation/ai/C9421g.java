package ru.ozon.android.messenger.framework.presentation.ai;

import J0.C3326o1;
import J0.EnumC3337r1;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9421g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9421g(C9413c c9413c) {
        super(2);
        this.f89603b = c9413c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3326o1 f7 = androidx.compose.material.I.f(EnumC3337r1.Hidden, interfaceC3967k2);
            interfaceC3967k2.o(513917738);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                interfaceC3967k2.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            interfaceC3967k2.k();
            Unit unit = Unit.f71690a;
            interfaceC3967k2.o(513920183);
            C9413c c9413c = this.f89603b;
            boolean F11 = interfaceC3967k2.F(c9413c) | interfaceC3967k2.F(f7);
            Object C12 = interfaceC3967k2.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C9415d(c9413c, interfaceC3978p0, f7, null);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            S0.Q.e(interfaceC3967k2, unit, (Function2) C12);
            AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo = (AiMessageActionsDTO.SourcesBadge.MenuInfo) interfaceC3978p0.getValue();
            if (menuInfo != null) {
                androidx.compose.ui.e j11 = androidx.compose.foundation.layout.T.j(androidx.compose.ui.e.f40358c0, 0.0f, 0.0f, 0.0f, (int) Math.ceil((c9413c.getContext() != null ? ResourceExtKt.getNavigationBarHeight(r14) : 0) / Resources.getSystem().getDisplayMetrics().density), 7);
                interfaceC3967k2.o(2141726711);
                boolean F12 = interfaceC3967k2.F(c9413c);
                Object C13 = interfaceC3967k2.C();
                if (F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new C9417e(c9413c);
                    interfaceC3967k2.x(C13);
                }
                Function2 function2 = (Function2) C13;
                interfaceC3967k2.k();
                interfaceC3967k2.o(2141733655);
                boolean F13 = interfaceC3967k2.F(c9413c);
                Object C14 = interfaceC3967k2.C();
                if (F13 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new C9419f(c9413c);
                    interfaceC3967k2.x(C14);
                }
                interfaceC3967k2.k();
                P0.a(j11, f7, menuInfo, function2, (Function1) C14, interfaceC3967k2, 64);
            }
        }
        return Unit.f71690a;
    }
}
