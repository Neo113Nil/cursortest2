package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import A0.h;
import G1.b;
import S0.InterfaceC3967k;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.R$color;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class MorkovskTabbarTabBackgroundKt$tabBackground$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    public static final MorkovskTabbarTabBackgroundKt$tabBackground$1 INSTANCE = new MorkovskTabbarTabBackgroundKt$tabBackground$1();

    MorkovskTabbarTabBackgroundKt$tabBackground$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(-1897177869);
        float f7 = 18;
        long a11 = b.a(interfaceC3967k, R$color.tabbar_back_layer_background);
        long a12 = b.a(interfaceC3967k, R$color.tabbar_back_layer_dark_shadow);
        long a13 = b.a(interfaceC3967k, R$color.tabbar_back_layer_light_shadow);
        float f11 = 15;
        long a14 = b.a(interfaceC3967k, R$color.tabbar_second_layer_background_gradient_start);
        long a15 = b.a(interfaceC3967k, R$color.tabbar_second_layer_background_gradient_end);
        long a16 = b.a(interfaceC3967k, R$color.tabbar_second_layer_border_gradient_start);
        long a17 = b.a(interfaceC3967k, R$color.tabbar_second_layer_border_gradient_end);
        e a18 = C6988h.a(composed, h.b(f7));
        interfaceC3967k.o(997048070);
        boolean s11 = interfaceC3967k.s(a12) | interfaceC3967k.s(a13) | interfaceC3967k.s(a14) | interfaceC3967k.s(a15) | interfaceC3967k.s(a16) | interfaceC3967k.s(a17) | interfaceC3967k.s(a11);
        Object C11 = interfaceC3967k.C();
        if (s11 || C11 == InterfaceC3967k.a.a()) {
            MorkovskTabbarTabBackgroundKt$tabBackground$1$1$1 morkovskTabbarTabBackgroundKt$tabBackground$1$1$1 = new MorkovskTabbarTabBackgroundKt$tabBackground$1$1$1(f7, a12, a13, a14, a15, f11, a16, a17, a11);
            interfaceC3967k.x(morkovskTabbarTabBackgroundKt$tabBackground$1$1$1);
            C11 = morkovskTabbarTabBackgroundKt$tabBackground$1$1$1;
        }
        interfaceC3967k.k();
        e c11 = c.c(a18, (Function1) C11);
        interfaceC3967k.k();
        return c11;
    }
}
