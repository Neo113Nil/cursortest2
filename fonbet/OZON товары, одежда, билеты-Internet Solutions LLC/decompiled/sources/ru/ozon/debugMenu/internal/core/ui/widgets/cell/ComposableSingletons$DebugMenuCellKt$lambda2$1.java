package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellEndScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellEndScope;", "", "invoke", "(Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellEndScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.debugMenu.internal.core.ui.widgets.cell.ComposableSingletons$DebugMenuCellKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$DebugMenuCellKt$lambda2$1 extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellEndScope, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$DebugMenuCellKt$lambda2$1 INSTANCE = new ComposableSingletons$DebugMenuCellKt$lambda2$1();

    ComposableSingletons$DebugMenuCellKt$lambda2$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(DebugMenuCellEndScope debugMenuCellEndScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(debugMenuCellEndScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(DebugMenuCellEndScope debugMenuCellEndScope, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(debugMenuCellEndScope, "<this>");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        }
    }
}
