package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.di;

import EV.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5CardsMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5LoadingNoUiMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5MapNoUiMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5NotificationMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5OnboardingNoUiMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5SkeletonMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5ViewStateBinder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.HotelsSearchResultsV5LoadingWidgetViewModel;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 U2\u00060\u0001j\u0002`\u0002:\u0001UR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00108\u001a\u000604j\u0002`58&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/di/HotelsSearchResultsV5Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5CardsMapper;", "getHotelsSearchResultsV5CardsMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5CardsMapper;", "hotelsSearchResultsV5CardsMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5LoadingNoUiMapper;", "getHotelsSearchResultsV5LoadingNoUiMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5LoadingNoUiMapper;", "hotelsSearchResultsV5LoadingNoUiMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5SkeletonMapper;", "getHotelsSearchResultsV5SkeletonMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5SkeletonMapper;", "hotelsSearchResultsV5SkeletonMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5MapNoUiMapper;", "getHotelsSearchResultsV5MapNoUiMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5MapNoUiMapper;", "hotelsSearchResultsV5MapNoUiMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5OnboardingNoUiMapper;", "getHotelsSearchResultsV5OnboardingMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5OnboardingNoUiMapper;", "hotelsSearchResultsV5OnboardingMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5NotificationMapper;", "getHotelsSearchResultsV5NotificationMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5NotificationMapper;", "hotelsSearchResultsV5NotificationMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5LoadingWidgetViewModel;", "getHotelsSearchResultsV5LoadingWidgetViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5LoadingWidgetViewModel;", "hotelsSearchResultsV5LoadingWidgetViewModel", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;", "getHotelsSearchResultsV5CardViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;", "hotelsSearchResultsV5CardViewModel", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "getPerformanceTrackerDelegate", "()Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "getTravelGeoProvidersStorage", "()Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProvidersStorage", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getProductFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "getOnboardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5ViewStateBinder;", "getStateBinder", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5ViewStateBinder;", "stateBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "getAuthStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "getFavoriteUnauthorizedAnalytics", "()Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "getWidgetLayoutTimeMetricsStorage", "()Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "widgetLayoutTimeMetricsStorage", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HotelsSearchResultsV5Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/di/HotelsSearchResultsV5Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/di/HotelsSearchResultsV5Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HotelsSearchResultsV5Component create$lambda$0(C7475g c7475g) {
            return new HotelsSearchResultsV5Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<HotelsSearchResultsV5Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HotelsSearchResultsV5Component.class), new a(storage, 6));
        }
    }

    @NotNull
    AuthStateStorage getAuthStateStorage();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HotelFavoriteUnauthorizedAnalytics getFavoriteUnauthorizedAnalytics();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    HotelsSearchResultsV5CardViewModel getHotelsSearchResultsV5CardViewModel();

    @NotNull
    HotelsSearchResultsV5CardsMapper getHotelsSearchResultsV5CardsMapper();

    @NotNull
    HotelsSearchResultsV5LoadingNoUiMapper getHotelsSearchResultsV5LoadingNoUiMapper();

    @NotNull
    HotelsSearchResultsV5LoadingWidgetViewModel getHotelsSearchResultsV5LoadingWidgetViewModel();

    @NotNull
    HotelsSearchResultsV5MapNoUiMapper getHotelsSearchResultsV5MapNoUiMapper();

    @NotNull
    HotelsSearchResultsV5NotificationMapper getHotelsSearchResultsV5NotificationMapper();

    @NotNull
    HotelsSearchResultsV5OnboardingNoUiMapper getHotelsSearchResultsV5OnboardingMapper();

    @NotNull
    HotelsSearchResultsV5SkeletonMapper getHotelsSearchResultsV5SkeletonMapper();

    @NotNull
    BaseOnBoardingViewModel getOnboardingViewModel();

    @NotNull
    PerformanceTrackerDelegate getPerformanceTrackerDelegate();

    @NotNull
    ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider();

    @NotNull
    HotelsSearchResultsV5ViewStateBinder getStateBinder();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    TravelGeoProvidersStorage getTravelGeoProvidersStorage();

    @NotNull
    WidgetLayoutTimeMetricsStorage getWidgetLayoutTimeMetricsStorage();
}
