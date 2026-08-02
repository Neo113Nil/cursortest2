package ru.ozon.app.android.checkoutcomposer.couriersteps.presentation;

import S0.InterfaceC3967k;
import Z1.d;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CourierStepsWidgetKt$semiBorder$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $cornerRadiusDp;
    final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierStepsWidgetKt$semiBorder$1(long j11, float f7, float f11) {
        super(3);
        this.$color = j11;
        this.$strokeWidth = f7;
        this.$cornerRadiusDp = f11;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(-944821900);
        d dVar = (d) interfaceC3967k.m(K0.e());
        float v12 = dVar.v1(this.$strokeWidth);
        float v13 = dVar.v1(this.$cornerRadiusDp);
        e.a aVar = e.f40358c0;
        interfaceC3967k.o(1036800297);
        boolean s11 = interfaceC3967k.s(this.$color) | interfaceC3967k.q(v13) | interfaceC3967k.q(v12);
        long j11 = this.$color;
        Object C11 = interfaceC3967k.C();
        if (s11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new CourierStepsWidgetKt$semiBorder$1$1$1(j11, v13, v12);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e d11 = c.d(aVar, (Function1) C11);
        interfaceC3967k.k();
        return d11;
    }
}
