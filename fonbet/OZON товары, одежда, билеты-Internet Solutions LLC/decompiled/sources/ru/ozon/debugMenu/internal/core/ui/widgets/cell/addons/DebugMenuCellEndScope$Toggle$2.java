package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.debugMenu.internal.core.ui.widgets.toggle.DebugMenuToggleKt;
import t0.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuCellEndScope$Toggle$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isToggled;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebugMenuCellEndScope$Toggle$2(boolean z11, boolean z12, q qVar, Function1<? super Boolean, Unit> function1) {
        super(2);
        this.$isToggled = z11;
        this.$isEnabled = z12;
        this.$interactionSource = qVar;
        this.$onCheckedChange = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            DebugMenuToggleKt.DebugMenuToggle(this.$isToggled, null, this.$isEnabled, this.$interactionSource, this.$onCheckedChange, interfaceC3967k, 0, 2);
        }
    }
}
