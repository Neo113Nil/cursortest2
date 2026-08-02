package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.C5239d1;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C7984d;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class MorkovskTabbarTabIndicatorKt$pinAppearanceAnimation$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ Function0<Unit> $onAnimated;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskTabbarTabIndicatorKt$pinAppearanceAnimation$1(Function0<Unit> function0) {
        super(3);
        this.$onAnimated = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> invoke$lambda$1(A1<? extends Function0<Unit>> a12) {
        return a12.getValue();
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(1714582024);
        if (((Boolean) interfaceC3967k.m(C5239d1.a())).booleanValue()) {
            interfaceC3967k.k();
            return composed;
        }
        interfaceC3967k.o(-1226540860);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = C7984d.a(0.0f);
            interfaceC3967k.x(C11);
        }
        C7980b c7980b = (C7980b) C11;
        interfaceC3967k.k();
        InterfaceC3978p0 l11 = n1.l(this.$onAnimated, interfaceC3967k);
        Unit unit = Unit.f71690a;
        interfaceC3967k.o(-1226537023);
        boolean F11 = interfaceC3967k.F(c7980b) | interfaceC3967k.n(l11);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new MorkovskTabbarTabIndicatorKt$pinAppearanceAnimation$1$1$1(c7980b, l11, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, unit, (Function2) C12);
        interfaceC3967k.o(-1226531492);
        boolean F12 = interfaceC3967k.F(c7980b);
        Object C13 = interfaceC3967k.C();
        if (F12 || C13 == InterfaceC3967k.a.a()) {
            C13 = new MorkovskTabbarTabIndicatorKt$pinAppearanceAnimation$1$2$1(c7980b);
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        e a11 = a.a(composed, (Function1) C13);
        interfaceC3967k.k();
        return a11;
    }
}
