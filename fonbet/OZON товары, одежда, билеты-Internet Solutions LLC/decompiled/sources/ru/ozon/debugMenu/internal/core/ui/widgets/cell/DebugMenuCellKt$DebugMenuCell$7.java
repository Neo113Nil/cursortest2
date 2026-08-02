package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.separator.SeparatorKt;
import y20.C10833a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuCellKt$DebugMenuCell$7 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $showSeparator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuCellKt$DebugMenuCell$7(boolean z11) {
        super(2);
        this.$showSeparator = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else if (this.$showSeparator) {
            SeparatorKt.m1641SeparatoraMcp0Q(b.a(e.f40358c0, DebugMenuCellTestTags.Separator), C10833a.a(interfaceC3967k).e(), 1, interfaceC3967k, 384, 0);
        }
    }
}
