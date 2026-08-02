package ru.ozon.app.android.orders.cml.deliveryOrderList.data;

import Lh.b;
import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.deliveryInfo.data.DeliveryInfoDTO;
import ru.ozon.app.android.orders.cml.deliveryInfo.data.InfoCellDTO;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.DeliveryInfoVO;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.InfoCellVO;
import ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewItem.DeliveryOrderVO;
import ru.ozon.app.android.orders.cml.groupButtons.data.GroupButtonsDTO;
import ru.ozon.app.android.orders.cml.groupButtons.data.TextAndIconButtonDTO;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.viewItem.GroupButtonsVO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u0013\u0010\u000e\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000e\u0010\u0015J\u001b\u0010\u000e\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/viewItem/DeliveryOrderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderDTO;", "", "stateId", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "verticalPadding", "toVO", "(Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderDTO;JLru/ozon/app/android/orders/cml/common/data/VerticalPadding;)Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/viewItem/DeliveryOrderVO;", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "(Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;J)Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/InfoCellDTO;", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/InfoCellVO;", "(Lru/ozon/app/android/orders/cml/deliveryInfo/data/InfoCellDTO;)Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/InfoCellVO;", "Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;", "widgetId", "Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "(Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;J)Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderListDTO;Ll20/d;)Ljava/util/List;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderListMapper implements Function2<DeliveryOrderListDTO, d, List<? extends DeliveryOrderVO>> {
    private final DeliveryOrderVO toVO(DeliveryOrderDTO deliveryOrderDTO, long j11, VerticalPadding verticalPadding) {
        StatusDTO status = deliveryOrderDTO.getStatus();
        TextDTO title = deliveryOrderDTO.getTitle();
        TextDTO subtitle = deliveryOrderDTO.getSubtitle();
        CitiesDTO cities = deliveryOrderDTO.getCities();
        BadgeDTO cityFrom = cities != null ? cities.getCityFrom() : null;
        CitiesDTO cities2 = deliveryOrderDTO.getCities();
        BadgeDTO separator = cities2 != null ? cities2.getSeparator() : null;
        CitiesDTO cities3 = deliveryOrderDTO.getCities();
        List b02 = C7714v.b0(cityFrom, separator, cities3 != null ? cities3.getCityTo() : null);
        InputDTO input = deliveryOrderDTO.getInput();
        DeliveryInfoVO vo = toVO(deliveryOrderDTO.getCellList(), j11);
        GroupButtonsDTO buttons = deliveryOrderDTO.getButtons();
        return new DeliveryOrderVO(j11, status, title, subtitle, b02, input, vo, buttons != null ? toVO(buttons, j11) : null, deliveryOrderDTO.getCommon(), verticalPadding);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryOrderVO> invoke(@NotNull DeliveryOrderListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<DeliveryOrderDTO> orderList = state.getOrderList();
        ArrayList arrayList = new ArrayList(C7714v.z(orderList, 10));
        int i11 = 0;
        for (Object obj : orderList) {
            int i12 = i11 + 1;
            VerticalPadding verticalPadding = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DeliveryOrderDTO deliveryOrderDTO = (DeliveryOrderDTO) obj;
            boolean z11 = i11 == 0;
            boolean z12 = i11 == state.getOrderList().size() - 1;
            if (z11 || z12) {
                verticalPadding = state.getVerticalPadding();
            }
            arrayList.add(toVO(deliveryOrderDTO, b.a(i11, widgetInfo.d(), "_"), verticalPadding));
            i11 = i12;
        }
        return arrayList;
    }

    private final DeliveryInfoVO toVO(DeliveryInfoDTO deliveryInfoDTO, long j11) {
        CornerRadius islandCornerRadius = deliveryInfoDTO.getIslandCornerRadius();
        String backgroundColor = deliveryInfoDTO.getBackgroundColor();
        VerticalPadding verticalPadding = deliveryInfoDTO.getVerticalPadding();
        Map<String, TokenizedTrackingInfo> trackingInfo = deliveryInfoDTO.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null;
        TestInfo testInfo = deliveryInfoDTO.getTestInfo();
        List<InfoCellDTO> cellList = deliveryInfoDTO.getCellList();
        ArrayList arrayList = new ArrayList(C7714v.z(cellList, 10));
        Iterator<T> it = cellList.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((InfoCellDTO) it.next()));
        }
        return new DeliveryInfoVO(j11, islandCornerRadius, backgroundColor, verticalPadding, b11, testInfo, arrayList);
    }

    private final InfoCellVO toVO(InfoCellDTO infoCellDTO) {
        return new InfoCellVO(infoCellDTO.getCell(), infoCellDTO.getButtons(), infoCellDTO.getHasSeparator());
    }

    private final GroupButtonsVO toVO(GroupButtonsDTO groupButtonsDTO, long j11) {
        List<TextAndIconButtonDTO> buttons = groupButtonsDTO.getButtons();
        TestInfo testInfo = groupButtonsDTO.getTestInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo = groupButtonsDTO.getTrackingInfo();
        return new GroupButtonsVO(j11, buttons, testInfo, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, groupButtonsDTO.getVerticalPadding());
    }
}
