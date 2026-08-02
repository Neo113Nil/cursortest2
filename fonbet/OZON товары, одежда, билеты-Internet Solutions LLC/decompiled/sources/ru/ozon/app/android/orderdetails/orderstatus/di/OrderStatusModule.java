package ru.ozon.app.android.orderdetails.orderstatus.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderstatus.OrderStatusConfig;
import ru.ozon.app.android.orderdetails.orderstatus.OrderStatusViewMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/orderdetails/orderstatus/di/OrderStatusModule;", "", "<init>", "()V", "provideOrderStatusWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/orderdetails/orderstatus/OrderStatusConfig;", "orderStatusViewMapper", "Lru/ozon/app/android/orderdetails/orderstatus/OrderStatusViewMapper;", "provideOrderStatusWidget$orderdetails_prodGoogleAllVendorsRelease", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderStatusModule {
    @NotNull
    public final Widget2 provideOrderStatusWidget$orderdetails_prodGoogleAllVendorsRelease(@NotNull OrderStatusConfig config, @NotNull OrderStatusViewMapper orderStatusViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(orderStatusViewMapper, "orderStatusViewMapper");
        return new Widget2("csma", "orderStatus", config, new ViewMapper2[]{orderStatusViewMapper});
    }
}
