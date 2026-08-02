package ru.ozon.app.android.account.orders.orderlist.v2.data.mapper;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.OrderDTO;
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.SectionDTO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.OrderProgressVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.OrderVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.ProgressiveDiscountVO;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"toVo", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO;", "context", "Landroid/content/Context;", "uniqueApplicationId", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header$Status;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderProgressVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Progress;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrdersKt {
    @NotNull
    public static final OrderVO toVo(@NotNull OrderDTO orderDTO, @NotNull Context context, @NotNull String uniqueApplicationId) {
        Intrinsics.checkNotNullParameter(orderDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uniqueApplicationId, "uniqueApplicationId");
        long hashCode = orderDTO.getHeader().getNumber().hashCode();
        String icon = orderDTO.getHeader().getIcon();
        String title = orderDTO.getHeader().getTitle();
        String deeplink = orderDTO.getDeeplink();
        String number = orderDTO.getHeader().getNumber();
        CommonText.TextMedium subtitle = orderDTO.getHeader().getSubtitle();
        OrderDTO.Header.Status status = orderDTO.getHeader().getStatus();
        ArrayList arrayList = null;
        Badge vo = status != null ? toVo(status) : null;
        OrderDTO.Progress orderProgress = orderDTO.getHeader().getOrderProgress();
        OrderProgressVO vo2 = orderProgress != null ? toVo(orderProgress) : null;
        OrderDTO.ProgressiveDiscount progressiveDiscount = orderDTO.getProgressiveDiscount();
        ProgressiveDiscountVO vo3 = progressiveDiscount != null ? ProgressiveDiscountsKt.toVO(progressiveDiscount, context) : null;
        List<SectionDTO> sections = orderDTO.getSections();
        if (sections != null) {
            List<SectionDTO> list = sections;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SectionsKt.toVO((SectionDTO) it.next(), context, uniqueApplicationId));
            }
        }
        return new OrderVO(hashCode, title, subtitle, number, deeplink, icon, vo, arrayList, vo3, vo2);
    }

    private static final Badge toVo(OrderDTO.Header.Status status) {
        Badge.StyleType styleType = Badge.StyleType.STYLE_TYPE_DISCOUNT;
        return new Badge(status.getName(), null, null, null, status.getColor(), null, null, styleType, null, null, null, null, null, 8000, null);
    }

    private static final OrderProgressVO toVo(OrderDTO.Progress progress) {
        return new OrderProgressVO(progress.getDescription(), progress.getProgressBar());
    }
}
