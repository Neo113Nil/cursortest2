package ru.ozon.app.android.account.orders.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.deeplink.BarcodeFullScreenDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.CancelReasonsDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.ChangePaymentMethodDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.ChangePaymentTipsDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.CourierInformationDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.DeliveryDateChangedComplaintFormDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.ECheckDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.ExtendDeliveryDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.MapSelectorDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.OrderDetailsMoreDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.OrderGalleryDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.OrderListDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.OrderReceiptsDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.PostPaymentDescriptionDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.PostingContentsDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.PurchasesDeeplinkHandler;
import ru.ozon.app.android.account.orders.deeplink.ReplyToCourierDeeplinkHandler;
import ru.ozon.app.android.account.orders.emptyscreen.CsmaCopyTextDeeplinkHandler;
import ru.ozon.app.android.account.orders.recipientWidget.deeplink.ChangeOrderRecipientModalDeeplinkHandler;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/orders/di/OrderNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/utils/AppType;", "appType", "", "LIZ/a;", "provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/utils/AppType;)Ljava/util/Set;", "provideDeeplinkHandlersSet", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderNavigationModule {

    @NotNull
    public static final OrderNavigationModule INSTANCE = new OrderNavigationModule();

    private OrderNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsRelease(@NotNull FeatureChecker featureChecker, @NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return e0.b(new PurchasesDeeplinkHandler(authDestinationInterceptor), new OrderGalleryDeeplinkHandler(), new CancelReasonsDeeplinkHandler(authDestinationInterceptor), new MapSelectorDeeplinkHandler(), new ECheckDeeplinkHandler(), new CourierInformationDeeplinkHandler(), new ChangeOrderRecipientModalDeeplinkHandler(), new DeliveryDateChangedComplaintFormDeeplinkHandler(), new OrderDetailsMoreDeeplinkHandler(), new OrderListDeeplinkHandler(appType, authDestinationInterceptor), new ChangePaymentMethodDeeplinkHandler(featureChecker, authDestinationInterceptor), new ChangePaymentTipsDeeplinkHandler(), new ExtendDeliveryDeeplinkHandler(authDestinationInterceptor, featureChecker), new ReplyToCourierDeeplinkHandler(authDestinationInterceptor), new PostingContentsDeeplinkHandler(), new PostPaymentDescriptionDeeplinkHandler(featureChecker), new OrderReceiptsDeeplinkHandler(), new BarcodeFullScreenDeeplinkHandler(), new CsmaCopyTextDeeplinkHandler());
    }
}
