package ru.ozon.debugMenu.internal.core.ui.widgets.navBar;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.E;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuNavBarKt$DebugMenuNavBar$2$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $endContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebugMenuNavBarKt$DebugMenuNavBar$2$3(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        super(2);
        this.$endContent = function2;
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
        if (this.$endContent != null) {
            interfaceC3967k.o(-1719270810);
            this.$endContent.invoke(interfaceC3967k, 0);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-1719212778);
            E.a(interfaceC3967k, a0.r(e.f40358c0, 8));
            interfaceC3967k.k();
        }
    }
}
