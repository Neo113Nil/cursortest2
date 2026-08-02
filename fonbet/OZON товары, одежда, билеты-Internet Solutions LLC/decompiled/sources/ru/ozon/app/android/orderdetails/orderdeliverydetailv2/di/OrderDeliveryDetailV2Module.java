package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data.OrderDeliveryDetailV2Config;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.actions.OrderDeliveryDetailV2ActionsViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.header.OrderDeliveryDetailV2HeaderViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.leaveatdoor.OrderDeliveryDetailV2LeaveAtDoorViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.lsatdivider.OrderDeliveryDetailV2LastDividerViewMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/di/OrderDeliveryDetailV2Module;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2Config;", "orderDeliveryDetailV2HeaderViewMapper", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/header/OrderDeliveryDetailV2HeaderViewMapper;", "orderDeliveryDetailV2ActionsVM", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/actions/OrderDeliveryDetailV2ActionsViewMapper;", "orderDeliveryDetailV2LeaveAtDoorVM", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/leaveatdoor/OrderDeliveryDetailV2LeaveAtDoorViewMapper;", "orderDeliveryDetailV2LastDividerViewMapper", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/lsatdivider/OrderDeliveryDetailV2LastDividerViewMapper;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDeliveryDetailV2Module {
    @NotNull
    public final Widget2 provideWidget(@NotNull OrderDeliveryDetailV2Config config, @NotNull OrderDeliveryDetailV2HeaderViewMapper orderDeliveryDetailV2HeaderViewMapper, @NotNull OrderDeliveryDetailV2ActionsViewMapper orderDeliveryDetailV2ActionsVM, @NotNull OrderDeliveryDetailV2LeaveAtDoorViewMapper orderDeliveryDetailV2LeaveAtDoorVM, @NotNull OrderDeliveryDetailV2LastDividerViewMapper orderDeliveryDetailV2LastDividerViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailV2HeaderViewMapper, "orderDeliveryDetailV2HeaderViewMapper");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailV2ActionsVM, "orderDeliveryDetailV2ActionsVM");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailV2LeaveAtDoorVM, "orderDeliveryDetailV2LeaveAtDoorVM");
        Intrinsics.checkNotNullParameter(orderDeliveryDetailV2LastDividerViewMapper, "orderDeliveryDetailV2LastDividerViewMapper");
        return new Widget2("csma", "orderDeliveryDetails", config, new ViewMapper2[]{orderDeliveryDetailV2HeaderViewMapper, orderDeliveryDetailV2LeaveAtDoorVM, orderDeliveryDetailV2ActionsVM, orderDeliveryDetailV2LastDividerViewMapper});
    }
}
