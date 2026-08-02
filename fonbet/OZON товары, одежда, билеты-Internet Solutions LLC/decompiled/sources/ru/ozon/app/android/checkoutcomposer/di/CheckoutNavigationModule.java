package ru.ozon.app.android.checkoutcomposer.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository;
import ru.ozon.app.android.checkoutcomposer.deeplink.CheckoutComposerDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.ClickOrderDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.CourierCommentDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.DiscountCodeDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.LargeOrdersLiftingDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.OutOfStockDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.ReducibleSplitDetailDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.SBPCheckAccountLinkDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.SberPayDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.TotalExpandedDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.deeplink.ZipcodeFormDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.sbp.search.navigation.SearchBankListDeeplinkHandler;
import ru.ozon.app.android.checkoutcomposer.sbp.top.navigation.PopularBankListDeeplinkHandler;
import ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/di/CheckoutNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;", "localGoodsRepo", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;", "checkoutScrollToWidgetKeyRepository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "LIZ/a;", "provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;Lru/ozon/app/android/network/abtool/FeatureChecker;)Ljava/util/Set;", "provideDeeplinkHandlersSet", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutNavigationModule {

    @NotNull
    public static final CheckoutNavigationModule INSTANCE = new CheckoutNavigationModule();

    private CheckoutNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsRelease(@NotNull LocalGoodsForCheckoutRepository localGoodsRepo, @NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(localGoodsRepo, "localGoodsRepo");
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(checkoutScrollToWidgetKeyRepository, "checkoutScrollToWidgetKeyRepository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        return e0.b(new CheckoutComposerDeeplinkHandler(localGoodsRepo, checkoutScrollToWidgetKeyRepository, featureChecker), new OutOfStockDeeplinkHandler(), new PopularBankListDeeplinkHandler(authDestinationInterceptor), new SearchBankListDeeplinkHandler(authDestinationInterceptor), new LargeOrdersLiftingDeeplinkHandler(), new ZipcodeFormDeeplinkHandler(), new CourierCommentDeeplinkHandler(), new ReducibleSplitDetailDeeplinkHandler(), new SberPayDeeplinkHandler(), new DiscountCodeDeeplinkHandler(), new ClickOrderDeeplinkHandler(), new TotalExpandedDeeplinkHandler(), new SBPCheckAccountLinkDeeplinkHandler());
    }
}
