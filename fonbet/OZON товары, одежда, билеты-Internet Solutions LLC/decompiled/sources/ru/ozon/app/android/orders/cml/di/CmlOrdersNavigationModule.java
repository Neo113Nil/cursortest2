package ru.ozon.app.android.orders.cml.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.orders.cml.deeplinks.handlers.DeliveryDeeplinkHandler;
import ru.ozon.app.android.orders.cml.deeplinks.handlers.DeliveryDetailsDeeplinkHandler;
import ru.ozon.app.android.orders.cml.deeplinks.handlers.DeliveryListDeeplinkHandler;
import ru.ozon.app.android.orders.cml.deeplinks.handlers.DeliveryListDetailsDeeplinkHandler;
import ru.ozon.app.android.orders.cml.deeplinks.handlers.DeliveryPaySafeDealDeeplinkHandler;
import ru.ozon.app.android.orders.cml.deeplinks.handlers.EditCommentModalDeeplinkHandler;
import ru.ozon.app.android.orders.cml.deeplinks.handlers.SavedDeliveryCardDeeplinkHandler;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orders/cml/di/CmlOrdersNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)Ljava/util/Set;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CmlOrdersNavigationModule {
    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        return e0.b(new EditCommentModalDeeplinkHandler(), new SavedDeliveryCardDeeplinkHandler(authDestinationInterceptor), new DeliveryPaySafeDealDeeplinkHandler(), new DeliveryDeeplinkHandler(), new DeliveryListDeeplinkHandler(), new DeliveryListDetailsDeeplinkHandler(), new DeliveryDetailsDeeplinkHandler());
    }
}
