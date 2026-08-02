package ru.ozon.app.android.marketing.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.deeplink.BundleDetailsDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.BuyAgainDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.CouponDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.CouponLegalAgreementDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.FlashSaleDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.FoundCheaperTermsDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.InfoDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.PersonalHighlightsDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.PromocodesDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.SubscriptionDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.WannaDiscountDeeplinkHandler;
import ru.ozon.app.android.marketing.deeplink.WannaDiscountTermsDeeplinkHandler;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/marketing/di/MarketingNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)Ljava/util/Set;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MarketingNavigationModule {

    @NotNull
    public static final MarketingNavigationModule INSTANCE = new MarketingNavigationModule();

    private MarketingNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        return e0.b(new CouponDeeplinkHandler(), new PromocodesDeeplinkHandler(authDestinationInterceptor), new PersonalHighlightsDeeplinkHandler(), new FoundCheaperTermsDeeplinkHandler(), new BuyAgainDeeplinkHandler(), new BundleDetailsDeeplinkHandler(), new WannaDiscountDeeplinkHandler(), new WannaDiscountTermsDeeplinkHandler(), new FlashSaleDeeplinkHandler(), new InfoDeeplinkHandler(), new SubscriptionDeeplinkHandler(authDestinationInterceptor), new CouponLegalAgreementDeeplinkHandler());
    }
}
