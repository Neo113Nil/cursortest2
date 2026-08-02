package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di;

import JS.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerAnalyticsComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data.TransparentNavBarV2Mapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarViewModel;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 (2\u00060\u0001j\u0002`\u0002:\u0001(R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/di/TransparentNavBarV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2Mapper;", "mapper", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getProductFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "getScrollAnchorViewModel", "()Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "scrollAnchorViewModel", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "getFavoriteManager", "()Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarViewModel;", "getTransparentNavBarViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarViewModel;", "transparentNavBarViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "getAuthStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "getFavoriteUnauthorizedAnalytics", "()Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TransparentNavBarV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/di/TransparentNavBarV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/di/TransparentNavBarV2Component;", "create", "(Lk20/g;)Lk20/e;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransparentNavBarV2Component create$lambda$0(final C7475g c7475g) {
            return new TransparentNavBarV2Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component$Companion$create$1$1
                private final AnalyticsComponentApi analyticsApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final FavoriteComponentApi favoriteComponentApi;
                private final FavoriteCoreComponentApi favoriteCoreComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(TransparentNavBarV2Component$Companion$create$1$1$mapper$2.INSTANCE);
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerAnalyticsComponentApi retainAnalyticsApi;
                private final StorageComponentApi storageComponentApi;

                {
                    this.favoriteComponentApi = (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class);
                    this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
                    this.analyticsApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
                    this.retainAnalyticsApi = (RetainComposerAnalyticsComponentApi) c7475g.getComponent(RetainComposerAnalyticsComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public AuthStateStorage getAuthStateStorage() {
                    return this.storageComponentApi.getAuthStateStorage();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public FavoriteManager getFavoriteManager() {
                    return this.favoriteCoreComponentApi.getFavoriteManager();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public HotelFavoriteUnauthorizedAnalytics getFavoriteUnauthorizedAnalytics() {
                    return new HotelFavoriteUnauthorizedAnalytics(this.analyticsApi.getAnalyticsDataLayer(), this.analyticsApi.getPluginsManager(), this.retainAnalyticsApi.getAnalyticsScreenStorage());
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public TransparentNavBarV2Mapper getMapper() {
                    return (TransparentNavBarV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider() {
                    return this.favoriteComponentApi.getFavoriteProductDelegate();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public ScrollAnchorViewModel getScrollAnchorViewModel() {
                    return new ScrollAnchorViewModel();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component
                public TransparentNavBarViewModel getTransparentNavBarViewModel() {
                    return new TransparentNavBarViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<TransparentNavBarV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TransparentNavBarV2Component.class), new a(storage, 1));
        }
    }

    @NotNull
    AuthStateStorage getAuthStateStorage();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FavoriteManager getFavoriteManager();

    @NotNull
    HotelFavoriteUnauthorizedAnalytics getFavoriteUnauthorizedAnalytics();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    TransparentNavBarV2Mapper getMapper();

    @NotNull
    ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider();

    @NotNull
    ScrollAnchorViewModel getScrollAnchorViewModel();

    @NotNull
    TransparentNavBarViewModel getTransparentNavBarViewModel();
}
