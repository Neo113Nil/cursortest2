package ru.ozon.app.android.orderdetails.orderSmartAddress.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.orderSmartAddress.viewObject.OrderSmartAddressVO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressMapper;", "", "<init>", "()V", "Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;", "", "stateId", "Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", "toVO", "(Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;Ljava/lang/String;)Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", "state", "Ll20/d;", "widgetInfo", "map", "(Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;Ll20/d;)Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderSmartAddressMapper {
    private final OrderSmartAddressVO toVO(OrderSmartAddressDTO orderSmartAddressDTO, String str) {
        return new OrderSmartAddressVO(str.hashCode(), orderSmartAddressDTO.getTitle(), orderSmartAddressDTO.getAddress(), orderSmartAddressDTO.getDeliveryPlaceCell(), orderSmartAddressDTO.getDeliveryInfoBadge(), orderSmartAddressDTO.getCommon());
    }

    @NotNull
    public final OrderSmartAddressVO map(@NotNull OrderSmartAddressDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return toVO(state, widgetInfo.d());
    }
}
