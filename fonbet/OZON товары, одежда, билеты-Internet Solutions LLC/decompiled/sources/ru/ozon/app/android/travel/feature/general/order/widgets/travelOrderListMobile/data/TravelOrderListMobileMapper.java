package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data.TravelOrderListMobileDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.TravelOrderListMobileVO;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v1.TravelBadgeDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO;", "orderItem", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/TravelOrderListMobileVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderListMobileMapper implements Function2<TravelOrderListMobileDTO, d, List<? extends TravelOrderListMobileVO>> {
    private final TravelOrderListMobileVO mapToVO(TravelOrderListMobileDTO.OrderItemDTO orderItem, String stateId) {
        ArrayList arrayList;
        long hashCode = (orderItem.getHeader().getNumber() + "-" + stateId).hashCode();
        String title = orderItem.getHeader().getTitle();
        String number = orderItem.getHeader().getNumber();
        String subtitle = orderItem.getHeader().getSubtitle();
        Icon icon = orderItem.getHeader().getIcon();
        String title2 = orderItem.getSection().getTitle();
        if (title2 == null) {
            title2 = "";
        }
        String str = title2;
        String name = orderItem.getSection().getStatus().getName();
        String color = orderItem.getSection().getStatus().getColor();
        List<AtomDTO> content = orderItem.getSection().getContent();
        List<TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.TravelBadgeDTO> travelBadgesList = orderItem.getSection().getTravelBadgesList();
        if (travelBadgesList != null) {
            List<TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.TravelBadgeDTO> list = travelBadgesList;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.TravelBadgeDTO travelBadgeDTO : list) {
                arrayList.add(new TravelBadgeDTO(C7714v.a0(travelBadgeDTO.getImageLink()), travelBadgeDTO.getText()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        DisclaimerAtom debtAlert = orderItem.getSection().getDebtAlert();
        String deeplink = orderItem.getDeeplink();
        Integer stars = orderItem.getSection().getStars();
        boolean z11 = false;
        int intValue = stars != null ? stars.intValue() : 0;
        if (orderItem.getSection().getStars() != null && orderItem.getSection().getStars().intValue() > 0) {
            z11 = true;
        }
        return new TravelOrderListMobileVO(hashCode, title, number, subtitle, icon, str, name, color, content, arrayList2, debtAlert, deeplink, intValue, z11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelOrderListMobileVO> invoke(@NotNull TravelOrderListMobileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<TravelOrderListMobileDTO.OrderItemDTO> orders = state.getOrders();
        ArrayList arrayList = new ArrayList(C7714v.z(orders, 10));
        Iterator<T> it = orders.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToVO((TravelOrderListMobileDTO.OrderItemDTO) it.next(), widgetInfo.d()));
        }
        return arrayList;
    }
}
