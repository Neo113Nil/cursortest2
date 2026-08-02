package ru.ozon.app.android.ordertracking.v4;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderVO;
import ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4ItemsAdapter;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OrderTrackingV4ViewHolder$onAttach$1 extends C7719a implements Function2<List<? extends OrderVO>, d<? super Unit>, Object> {
    OrderTrackingV4ViewHolder$onAttach$1(Object obj) {
        super(2, obj, OrderTrackingV4ItemsAdapter.class, "updateOrderItems", "updateOrderItems(Ljava/util/List;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends OrderVO> list, d<? super Unit> dVar) {
        return invoke2((List<OrderVO>) list, dVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<OrderVO> list, d<? super Unit> dVar) {
        Object onAttach$updateOrderItems;
        onAttach$updateOrderItems = OrderTrackingV4ViewHolder.onAttach$updateOrderItems((OrderTrackingV4ItemsAdapter) this.receiver, list, dVar);
        return onAttach$updateOrderItems;
    }
}
