package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$firstPlaceable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> $firstButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$firstPlaceable$2(InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
        super(2);
        this.$firstButton = interfaceC6511n;
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
            this.$firstButton.invoke(a0.e(e.f40358c0, 1.0f), interfaceC3967k, 6);
        }
    }
}
