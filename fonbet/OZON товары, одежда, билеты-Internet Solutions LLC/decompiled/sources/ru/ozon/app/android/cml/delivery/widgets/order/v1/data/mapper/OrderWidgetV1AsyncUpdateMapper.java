package ru.ozon.app.android.cml.delivery.widgets.order.v1.data.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupDTO;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.data.mapper.OrderWidgetStickyButtonVOMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.OrderWidgetUpdate;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsVO;
import ru.ozon.app.android.cml.delivery.widgets.order.v1.data.OrderWidgetV1DTO;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.StickyButtonVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/v1/data/mapper/OrderWidgetV1AsyncUpdateMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/order/v1/data/OrderWidgetV1DTO;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/OrderWidgetUpdate;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;", "cellListGroupMapper", "Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderWidgetStickyButtonVOMapper;", "orderWidgetStickyButtonVOMapper", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderWidgetStickyButtonVOMapper;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/order/v1/data/OrderWidgetV1DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;", "Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderWidgetStickyButtonVOMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderWidgetV1AsyncUpdateMapper implements Function2<OrderWidgetV1DTO, d, List<? extends OrderWidgetUpdate>> {

    @NotNull
    private final CellListGroupMapper cellListGroupMapper;

    @NotNull
    private final OrderWidgetStickyButtonVOMapper orderWidgetStickyButtonVOMapper;

    public OrderWidgetV1AsyncUpdateMapper(@NotNull CellListGroupMapper cellListGroupMapper, @NotNull OrderWidgetStickyButtonVOMapper orderWidgetStickyButtonVOMapper) {
        Intrinsics.checkNotNullParameter(cellListGroupMapper, "cellListGroupMapper");
        Intrinsics.checkNotNullParameter(orderWidgetStickyButtonVOMapper, "orderWidgetStickyButtonVOMapper");
        this.cellListGroupMapper = cellListGroupMapper;
        this.orderWidgetStickyButtonVOMapper = orderWidgetStickyButtonVOMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderWidgetUpdate> invoke(@NotNull OrderWidgetV1DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<CellListGroupDTO> cellListGroups = state.getCellListGroups();
        ArrayList arrayList = new ArrayList(C7714v.z(cellListGroups, 10));
        Iterator<T> it = cellListGroups.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                OrderParamsVO orderParamsVO = new OrderParamsVO(widgetId, arrayList, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null);
                StickyButtonVO stickyButtonVO = (StickyButtonVO) C7714v.M(this.orderWidgetStickyButtonVOMapper.invoke(state.getButton(), widgetInfo));
                return stickyButtonVO == null ? K.f71697a : C7714v.a0(new OrderWidgetUpdate(orderParamsVO, stickyButtonVO));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CellListGroupDTO cellListGroupDTO = (CellListGroupDTO) next;
            arrayList.add(new OrderParamsItem.ParamsGroup((((Object) cellListGroupDTO.getTitle().getText()) + " " + i11).hashCode(), this.cellListGroupMapper.map(cellListGroupDTO)));
            i11 = i12;
        }
    }
}
