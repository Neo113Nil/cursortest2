package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core.OrderDoneTotalConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core.OrderDoneTotalElementViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/di/OrderDoneTotalWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/core/OrderDoneTotalConfig;", "viewMapper", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/core/OrderDoneTotalElementViewMapper;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDoneTotalWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull OrderDoneTotalConfig config, @NotNull OrderDoneTotalElementViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget2("csma", "orderDoneTotal", config, new ViewMapper2[]{viewMapper});
    }
}
