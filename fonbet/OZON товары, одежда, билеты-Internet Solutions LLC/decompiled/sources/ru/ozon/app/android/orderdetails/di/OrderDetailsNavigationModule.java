package ru.ozon.app.android.orderdetails.di;

import BZ.e;
import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.orderdetails.deeplink.ChangeDeliveryDateDeeplinkHandler;
import ru.ozon.app.android.orderdetails.deeplink.ClickItemsDeeplinkHandler;
import ru.ozon.app.android.orderdetails.deeplink.DetailsCourierTipsDeeplinkHandler;
import ru.ozon.app.android.orderdetails.deeplink.OrderCommentDeeplinkHandler;
import ru.ozon.app.android.orderdetails.deeplink.OrderDetailsDeeplinkHandler;
import ru.ozon.app.android.orderdetails.deeplink.OrderProductsToPayDeeplinkHandler;
import ru.ozon.app.android.orderdetails.deeplink.PreviewCourierTipsDeeplinkHandler;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.repository.OrderDetailsScrollToShipmentRepository;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orderdetails/di/OrderDetailsNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/repository/OrderDetailsScrollToShipmentRepository;", "orderDetailsScrollToShipmentKeyRepository", "Lru/ozon/app/android/utils/AppType;", "appType", "LBZ/e;", "miniAppConfigHolder", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/repository/OrderDetailsScrollToShipmentRepository;Lru/ozon/app/android/utils/AppType;LBZ/e;)Ljava/util/Set;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDetailsNavigationModule {

    @NotNull
    public static final OrderDetailsNavigationModule INSTANCE = new OrderDetailsNavigationModule();

    private OrderDetailsNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull OrderDetailsScrollToShipmentRepository orderDetailsScrollToShipmentKeyRepository, @NotNull AppType appType, @NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(orderDetailsScrollToShipmentKeyRepository, "orderDetailsScrollToShipmentKeyRepository");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        return e0.b(new OrderCommentDeeplinkHandler(authDestinationInterceptor), new OrderDetailsDeeplinkHandler(orderDetailsScrollToShipmentKeyRepository, appType, miniAppConfigHolder, authDestinationInterceptor), new DetailsCourierTipsDeeplinkHandler(), new PreviewCourierTipsDeeplinkHandler(), new ChangeDeliveryDateDeeplinkHandler(authDestinationInterceptor), new OrderProductsToPayDeeplinkHandler(), new ClickItemsDeeplinkHandler());
    }
}
