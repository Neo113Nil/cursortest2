package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action;

import Vg.f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.delivery.customActionsHandlers.getDirections.GetDirectionsActionHandler;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ljava/lang/Class;", "LVg/f;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ActionOrderShipmentViewMapper$supportedHandlers$2 extends AbstractC7737t implements Function0<Set<? extends Class<? extends f>>> {
    final /* synthetic */ ActionOrderShipmentViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionOrderShipmentViewMapper$supportedHandlers$2(ActionOrderShipmentViewMapper actionOrderShipmentViewMapper) {
        super(0);
        this.this$0 = actionOrderShipmentViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends Class<? extends f>> invoke() {
        return e0.f(e0.h(GetDirectionsActionHandler.class), this.this$0.component().getButtonWidgetCustomActionHandlers().getActionHandlers());
    }
}
