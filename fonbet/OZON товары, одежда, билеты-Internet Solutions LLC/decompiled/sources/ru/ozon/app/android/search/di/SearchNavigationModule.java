package ru.ozon.app.android.search.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.deeplink.AnalogsPopupDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.BrandListDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.CatalogDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.CatalogListDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.CategoryFiltersDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.CommonAspectsDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.DialogSearchDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.FilterCategoryValuesDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.FilterValuesDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.FiltersDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.SearchAiHistoryDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.SearchByImageOnboardingDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.SearchBySharedImageDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.SearchFeedbackDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.SearchSuggestionsDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.SearchTabDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.SelectorDataMobileDeeplinkHandler;
import ru.ozon.app.android.search.deeplink.SellerCatalogDeeplinkHandler;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/di/SearchNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)Ljava/util/Set;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchNavigationModule {

    @NotNull
    public static final SearchNavigationModule INSTANCE = new SearchNavigationModule();

    private SearchNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet(@NotNull FeatureChecker featureChecker, @NotNull AppType appType, @NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        return e0.b(new CatalogDeeplinkHandler(), new SearchTabDeeplinkHandler(), new SearchSuggestionsDeeplinkHandler(featureChecker, appType), new FiltersDeeplinkHandler(featureChecker), new FilterCategoryValuesDeeplinkHandler(), new FilterValuesDeeplinkHandler(featureChecker, appType), new AnalogsPopupDeeplinkHandler(), new CategoryFiltersDeeplinkHandler(), new SelectorDataMobileDeeplinkHandler(), new SellerCatalogDeeplinkHandler(), new CommonAspectsDeeplinkHandler(), new SearchFeedbackDeeplinkHandler(), new DialogSearchDeeplinkHandler(), new SearchByImageOnboardingDeeplinkHandler(), new BrandListDeeplinkHandler(), new SearchAiHistoryDeeplinkHandler(), new CatalogListDeeplinkHandler(), new SearchBySharedImageDeeplinkHandler(authDestinationInterceptor));
    }
}
