package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons;

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
import n1.C8416i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ButtonsComposableKt$outerRoundedBorder$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $radius;
    final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonsComposableKt$outerRoundedBorder$1(long j11, float f7, float f11) {
        super(3);
        this.$color = j11;
        this.$radius = f7;
        this.$strokeWidth = f11;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        float f7;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(1266937472);
        float v12 = ((d) interfaceC3967k.m(K0.e())).v1(this.$radius);
        float v13 = ((d) interfaceC3967k.m(K0.e())).v1(this.$strokeWidth);
        float f11 = 2;
        float f12 = v13 / f11;
        float f13 = (v12 + f12) * f11;
        interfaceC3967k.o(1810880451);
        boolean s11 = interfaceC3967k.s(this.$color) | interfaceC3967k.q(v13);
        Object C11 = interfaceC3967k.C();
        if (s11 || C11 == InterfaceC3967k.a.a()) {
            f7 = v13;
            Object c8416i = new C8416i(f7, 0.0f, 2, 0, null, 26);
            interfaceC3967k.x(c8416i);
            C11 = c8416i;
        } else {
            f7 = v13;
        }
        C8416i c8416i2 = (C8416i) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(1810886118);
        boolean s12 = interfaceC3967k.s(this.$color) | interfaceC3967k.q(f12) | interfaceC3967k.q(f13) | interfaceC3967k.F(c8416i2) | interfaceC3967k.q(v12) | interfaceC3967k.q(f7);
        long j11 = this.$color;
        Object C12 = interfaceC3967k.C();
        if (s12 || C12 == InterfaceC3967k.a.a()) {
            Object buttonsComposableKt$outerRoundedBorder$1$1$1 = new ButtonsComposableKt$outerRoundedBorder$1$1$1(j11, f12, f13, c8416i2, v12, f7);
            interfaceC3967k.x(buttonsComposableKt$outerRoundedBorder$1$1$1);
            C12 = buttonsComposableKt$outerRoundedBorder$1$1$1;
        }
        interfaceC3967k.k();
        e d11 = c.d(composed, (Function1) C12);
        interfaceC3967k.k();
        return d11;
    }
}
