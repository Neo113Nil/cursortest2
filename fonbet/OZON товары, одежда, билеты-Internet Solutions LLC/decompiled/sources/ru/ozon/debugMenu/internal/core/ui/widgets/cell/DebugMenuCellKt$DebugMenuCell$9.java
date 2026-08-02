package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import t0.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuCellKt$DebugMenuCell$9 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ q $endInteractionSource;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ Function0<Unit> $onEndClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuCellKt$DebugMenuCell$9(Function0<Unit> function0, q qVar, boolean z11) {
        super(2);
        this.$onEndClick = function0;
        this.$endInteractionSource = qVar;
        this.$isEnabled = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else if (this.$onEndClick != null) {
            C5185h.a(i.b(a0.d(e.f40358c0), this.$endInteractionSource, null, this.$isEnabled, null, null, this.$onEndClick, 24), interfaceC3967k, 0);
        }
    }
}
