package ru.ozon.app.android.account.orders.orderProduct.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderProduct.core.OrderProductsConfig;
import ru.ozon.app.android.account.orders.orderProduct.presentation.item.OrderProductItemViewMapper;
import ru.ozon.app.android.account.orders.orderProduct.presentation.separator.OrderProductSeparatorViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/di/OrderProductsWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/account/orders/orderProduct/core/OrderProductsConfig;", "mapper", "Lru/ozon/app/android/account/orders/orderProduct/presentation/item/OrderProductItemViewMapper;", "separatorMapper", "Lru/ozon/app/android/account/orders/orderProduct/presentation/separator/OrderProductSeparatorViewMapper;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderProductsWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull OrderProductsConfig config, @NotNull OrderProductItemViewMapper mapper, @NotNull OrderProductSeparatorViewMapper separatorMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(separatorMapper, "separatorMapper");
        return new Widget2("csma", "orderProducts", config, new ViewMapper2[]{mapper, separatorMapper});
    }
}
