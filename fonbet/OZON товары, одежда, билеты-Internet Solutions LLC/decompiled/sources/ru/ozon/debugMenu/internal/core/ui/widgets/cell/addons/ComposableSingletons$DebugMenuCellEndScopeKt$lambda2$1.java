package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.widgets.icon.DebugMenuIconKt;
import y20.C10833a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.ComposableSingletons$DebugMenuCellEndScopeKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$DebugMenuCellEndScopeKt$lambda2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$DebugMenuCellEndScopeKt$lambda2$1 INSTANCE = new ComposableSingletons$DebugMenuCellEndScopeKt$lambda2$1();

    ComposableSingletons$DebugMenuCellEndScopeKt$lambda2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e n11 = a0.n(e.f40358c0, 24);
        int i12 = C10833a.f105964b;
        interfaceC3967k.o(934981702);
        AbstractC8972b a11 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_copy_filled, interfaceC3967k, 0);
        interfaceC3967k.k();
        DebugMenuIconKt.m1619DebugMenuIconFNF3uiM(a11, n11, C10833a.a(interfaceC3967k).f(), interfaceC3967k, 48, 0);
    }
}
