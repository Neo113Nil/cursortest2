package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.data.OrderTrackingDTO;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004*\b\u0012\u0004\u0012\u00020\t0\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item;", "", "widgetId", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO$Item;", "toVO", "(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item$Timer;", "toEndTimeStamp", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item$Timer;)Ljava/lang/Long;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;Ll20/d;)Ljava/util/List;", "orderTrackingDTO", "mapOrderTrackingDTOToVO", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;Ljava/lang/Long;)Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderTrackingMapper implements Function2<OrderTrackingDTO, d, List<? extends OrderTrackingVO>> {
    private final Long toEndTimeStamp(OrderTrackingDTO.Item.Timer timer) {
        long millis = timer.getDeadlineTimestamp().getMillis() - (timer.getServerTimestamp().getMillis() - new DateTime().getMillis());
        if (millis > 0) {
            return Long.valueOf(millis);
        }
        return null;
    }

    private final List<OrderTrackingVO.Item> toVO(List<OrderTrackingDTO.Item> list, Long l11) {
        List<OrderTrackingDTO.Item> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (OrderTrackingDTO.Item item : list2) {
            Long l12 = null;
            OrderTrackingVO.Item item2 = new OrderTrackingVO.Item(item.getTitle(), item.getSubtitle(), item.getImage(), item.getBadge(), AtomActionMapperKt.toAtomAction(item.getItemClickAction(), item.getTrackingInfo()), TrackingInfoMapperKt.toTokenizedEvent$default(item.getTrackingInfo(), l11, null, 2, null));
            OrderTrackingDTO.Item.Timer timer = item.getTimer();
            if (timer != null) {
                l12 = toEndTimeStamp(timer);
            }
            item2.setEndTimeStamp(l12);
            arrayList.add(item2);
        }
        return arrayList;
    }

    @NotNull
    public final OrderTrackingVO mapOrderTrackingDTOToVO(@NotNull OrderTrackingDTO orderTrackingDTO, Long widgetId) {
        Intrinsics.checkNotNullParameter(orderTrackingDTO, "orderTrackingDTO");
        long longValue = widgetId != null ? widgetId.longValue() : 0L;
        List<OrderTrackingDTO.Item> items = orderTrackingDTO.getItems();
        return new OrderTrackingVO(longValue, items != null ? toVO(items, widgetId) : null, orderTrackingDTO.getWidgetUpdatePeriod(), TrackingInfoMapperKt.toTokenizedEvent$default(orderTrackingDTO.getTrackingInfo(), widgetId, null, 2, null));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderTrackingVO> invoke(@NotNull OrderTrackingDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapOrderTrackingDTOToVO(state, Long.valueOf(ExtentionsKt.getId(widgetInfo))));
    }
}
