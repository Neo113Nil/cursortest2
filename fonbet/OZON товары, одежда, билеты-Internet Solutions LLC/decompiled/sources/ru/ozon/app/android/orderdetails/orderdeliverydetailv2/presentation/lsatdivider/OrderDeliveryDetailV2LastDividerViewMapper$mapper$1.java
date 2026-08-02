package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.lsatdivider;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.lsatdivider.OrderDeliveryDetailBottomDividerVO;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data.OrderDeliveryDetailV2DTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;", "<unused var>", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/lsatdivider/OrderDeliveryDetailBottomDividerVO;", "invoke", "(Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class OrderDeliveryDetailV2LastDividerViewMapper$mapper$1 extends AbstractC7737t implements Function2<OrderDeliveryDetailV2DTO, d, List<? extends OrderDeliveryDetailBottomDividerVO>> {
    public static final OrderDeliveryDetailV2LastDividerViewMapper$mapper$1 INSTANCE = new OrderDeliveryDetailV2LastDividerViewMapper$mapper$1();

    OrderDeliveryDetailV2LastDividerViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<OrderDeliveryDetailBottomDividerVO> invoke(OrderDeliveryDetailV2DTO orderDeliveryDetailV2DTO, d dVar) {
        Intrinsics.checkNotNullParameter(orderDeliveryDetailV2DTO, "<unused var>");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        return C7714v.a0(new OrderDeliveryDetailBottomDividerVO(1081300602, false, 2, null));
    }
}
