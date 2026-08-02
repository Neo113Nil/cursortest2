package ru.ozon.app.android.cml.delivery.widgets.order.data.mapper;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.data.model.OrderItem;
import ru.ozon.app.android.cml.delivery.widgets.order.data.model.OrderParamsModel;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderParamsGroupVOMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderParamsModel;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;", "cellListGroupMapper", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderParamsModel;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderParamsGroupVOMapper implements Function2<OrderParamsModel, d, List<? extends OrderParamsVO>> {

    @NotNull
    private final CellListGroupMapper cellListGroupMapper;

    public OrderParamsGroupVOMapper(@NotNull CellListGroupMapper cellListGroupMapper) {
        Intrinsics.checkNotNullParameter(cellListGroupMapper, "cellListGroupMapper");
        this.cellListGroupMapper = cellListGroupMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderParamsVO> invoke(@NotNull OrderParamsModel state, @NotNull d widgetInfo) {
        OrderParamsItem secureDeal;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<OrderItem> orderItems = state.getOrderItems();
        ArrayList arrayList = new ArrayList(C7714v.z(orderItems, 10));
        Iterator<T> it = orderItems.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new OrderParamsVO(widgetId, arrayList, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            OrderItem orderItem = (OrderItem) next;
            if (orderItem instanceof OrderItem.CellListGroup) {
                OrderItem.CellListGroup cellListGroup = (OrderItem.CellListGroup) orderItem;
                secureDeal = new OrderParamsItem.ParamsGroup((((Object) cellListGroup.getDto().getTitle().getText()) + " " + i11).hashCode(), this.cellListGroupMapper.map(cellListGroup.getDto()));
            } else {
                if (!(orderItem instanceof OrderItem.SecureDeal)) {
                    throw new o();
                }
                OrderItem.SecureDeal secureDeal2 = (OrderItem.SecureDeal) orderItem;
                secureDeal = new OrderParamsItem.SecureDeal((((Object) secureDeal2.getDto().getTitle().getText()) + " " + i11).hashCode(), secureDeal2.getDto());
            }
            arrayList.add(secureDeal);
            i11 = i12;
        }
    }
}
