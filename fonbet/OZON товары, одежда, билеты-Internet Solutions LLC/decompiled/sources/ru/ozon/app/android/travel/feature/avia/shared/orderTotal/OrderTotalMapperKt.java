package ru.ozon.app.android.travel.feature.avia.shared.orderTotal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVo", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OrderTotalMapperKt {
    @NotNull
    public static final OrderTotalVO toVo(@NotNull OrderTotalDTO orderTotalDTO) {
        Intrinsics.checkNotNullParameter(orderTotalDTO, "<this>");
        return new OrderTotalVO(orderTotalDTO.getCaption(), orderTotalDTO.getPrice(), orderTotalDTO.getSubmitButton(), orderTotalDTO.getInfoButton());
    }
}
