package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.header;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.OrderDeliveryDetailDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toHeader", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/header/OrderDeliveryDetailHeaderVO;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/OrderDeliveryDetailDTO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryDetailHeaderVOKt {
    @NotNull
    public static final OrderDeliveryDetailHeaderVO toHeader(@NotNull OrderDeliveryDetailDTO orderDeliveryDetailDTO) {
        Intrinsics.checkNotNullParameter(orderDeliveryDetailDTO, "<this>");
        return new OrderDeliveryDetailHeaderVO(orderDeliveryDetailDTO.getHeader().hashCode(), orderDeliveryDetailDTO.getHeader());
    }
}
