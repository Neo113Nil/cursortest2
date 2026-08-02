package ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryOrderViewHolder$badgeInRowAdapter$2 extends AbstractC7737t implements Function0<AtomsAdapter> {
    final /* synthetic */ DeliveryOrderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryOrderViewHolder$badgeInRowAdapter$2(DeliveryOrderViewHolder deliveryOrderViewHolder) {
        super(0);
        this.this$0 = deliveryOrderViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AtomsAdapter invoke() {
        Function1<? super AtomAction, Unit> function1;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        function1 = this.this$0.actionHandler;
        atomsAdapter.setOnAction(function1);
        return atomsAdapter;
    }
}
