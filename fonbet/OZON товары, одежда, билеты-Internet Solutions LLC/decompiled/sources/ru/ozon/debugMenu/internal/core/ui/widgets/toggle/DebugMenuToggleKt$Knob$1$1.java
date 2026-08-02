package ru.ozon.debugMenu.internal.core.ui.widgets.toggle;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import q1.AbstractC8972b;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.icon.DebugMenuIconKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/H;", "", "invoke", "(Ll0/H;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuToggleKt$Knob$1$1 extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuToggleKt$Knob$1$1(e eVar, AbstractC8972b abstractC8972b, long j11) {
        super(3);
        this.$iconModifier = eVar;
        this.$icon = abstractC8972b;
        this.$iconColor = j11;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(h11, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        DebugMenuIconKt.m1619DebugMenuIconFNF3uiM(this.$icon, a0.n(b.a(this.$iconModifier, DebugMenuToggleTestTags.Icon), 16), this.$iconColor, interfaceC3967k, 0, 0);
    }
}
