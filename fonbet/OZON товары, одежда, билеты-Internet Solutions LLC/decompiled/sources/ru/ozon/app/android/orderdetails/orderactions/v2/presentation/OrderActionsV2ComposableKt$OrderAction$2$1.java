package ru.ozon.app.android.orderdetails.orderactions.v2.presentation;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.orderdetails.orderactions.v2.presentation.OrderActionsV2VO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class OrderActionsV2ComposableKt$OrderAction$2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ OrderActionsV2VO.OrderActionV2VO $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderActionsV2ComposableKt$OrderAction$2$1(OrderActionsV2VO.OrderActionV2VO orderActionV2VO) {
        super(2);
        this.$action = orderActionV2VO;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        float f7;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e.a aVar = e.f40358c0;
        f7 = OrderActionsV2ComposableKt.ICON_SIZE;
        DsIconAtomKt.DsIconAtom(this.$action.getIcon(), a0.n(aVar, f7), interfaceC3967k, IconDTO.$stable | 48, 0);
        DsTextAtomKt.DsTextAtom(this.$action.getTitle(), null, interfaceC3967k, 0, 2);
    }
}
