package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.debugMenu.internal.core.ui.widgets.radio.DebugMenuRadioKt;
import t0.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuCellStartScope$Radio$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuCellStartScope$Radio$2(Function0<Unit> function0, boolean z11, boolean z12, q qVar) {
        super(2);
        this.$onClick = function0;
        this.$selected = z11;
        this.$enabled = z12;
        this.$interactionSource = qVar;
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
            DebugMenuRadioKt.DebugMenuRadio(this.$onClick, this.$selected, null, this.$enabled, this.$interactionSource, interfaceC3967k, 0, 4);
        }
    }
}
