package ru.ozon.app.android.storefront.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.storefront.deeplinkhandlers.BloggerLandingDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.FaqDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.FashionTabOnboardingDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.HighlightBoutiqueDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.HighlightGlobalDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.NpsRatingDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.ReviewDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.SuperEconomDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.TeensModeDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.ThemeSelectorDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDeeplinkHandler;
import ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDestinationFactory;
import ru.ozon.app.android.storefront.screens.about.AboutDeeplinkHandler;
import ru.ozon.app.android.storefront.widgets.appOnboarding.deeplinkhandler.AppOnboardingDeeplinkHandler;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.data.TabConfigManager;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/di/StoreFrontNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "tabConfigManager", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "Lru/ozon/app/android/push/OzonPushManager;", "ozonPushManager", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "homeDestinationFactory", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;", "failedExternalLinkRetryFeatureChecker", "", "LIZ/a;", "provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/tabbar/data/TabConfigManager;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;Lru/ozon/app/android/push/OzonPushManager;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;)Ljava/util/Set;", "provideDeeplinkHandlers", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoreFrontNavigationModule {

    @NotNull
    public static final StoreFrontNavigationModule INSTANCE = new StoreFrontNavigationModule();

    private StoreFrontNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease(@NotNull TabConfigManager tabConfigManager, @NotNull TeensModeService teensModeService, @NotNull OzonPushManager ozonPushManager, @NotNull ActionV2Repository actionV2Repository, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, @NotNull HomeDestinationFactory homeDestinationFactory, @NotNull FailedExternalLinkRetryFeatureChecker failedExternalLinkRetryFeatureChecker) {
        Intrinsics.checkNotNullParameter(tabConfigManager, "tabConfigManager");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        Intrinsics.checkNotNullParameter(ozonPushManager, "ozonPushManager");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(homeDestinationFactory, "homeDestinationFactory");
        Intrinsics.checkNotNullParameter(failedExternalLinkRetryFeatureChecker, "failedExternalLinkRetryFeatureChecker");
        return e0.b(new NpsRatingDeeplinkHandler(), new ReviewDeeplinkHandler(), new HighlightGlobalDeeplinkHandler(), new SuperEconomDeeplinkHandler(), new HighlightBoutiqueDeeplinkHandler(), new FashionTabOnboardingDeeplinkHandler(tabConfigManager), new AboutDeeplinkHandler(), new ThemeSelectorDeeplinkHandler(), new HomeDeeplinkHandler(homeDestinationFactory, failedExternalLinkRetryFeatureChecker), new FaqDeeplinkHandler(), new AppOnboardingDeeplinkHandler(), new BloggerLandingDeeplinkHandler(), new TeensModeDeeplinkHandler(teensModeService, ozonPushManager, actionV2Repository, atMostQaUserDestinationInterceptor));
    }
}
