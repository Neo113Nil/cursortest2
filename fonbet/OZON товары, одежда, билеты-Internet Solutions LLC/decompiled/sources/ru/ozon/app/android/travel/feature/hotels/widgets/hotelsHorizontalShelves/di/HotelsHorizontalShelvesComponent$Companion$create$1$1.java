package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerAnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.data.HotelsHorizontalShelvesMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.prefetch.ShelfCardImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000Á\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R!\u00102\u001a\b\u0012\u0004\u0012\u00020.0-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u00101R\u0018\u00107\u001a\u000603j\u0002`48VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0018\u0010@\u001a\u00060<j\u0002`=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"ru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/di/HotelsHorizontalShelvesComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/di/HotelsHorizontalShelvesComponent;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "createImagePrefetcher", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "composerContextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerAnalyticsComponentApi;", "retainAnalyticsApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerAnalyticsComponentApi;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesViewModel;", "widgetViewModelProvider$delegate", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavoriteProductMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductMoleculeDelegateProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "getCoroutineDispatcherProvider", "()Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "getAuthStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "getFavoriteUnauthorizedAnalytics", "()Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsHorizontalShelvesComponent$Companion$create$1$1 implements HotelsHorizontalShelvesComponent {
    private final AnalyticsComponentApi analyticsApi;
    private final ContextComponentDependencies composerContextComponentDependencies;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi customActionComponentApi;
    private final FavoriteComponentApi favoriteComponentApi;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerAnalyticsComponentApi retainAnalyticsApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new HotelsHorizontalShelvesComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: widgetViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j widgetViewModelProvider = k.b(new HotelsHorizontalShelvesComponent$Companion$create$1$1$widgetViewModelProvider$2(this));

    HotelsHorizontalShelvesComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.favoriteComponentApi = (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.composerContextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.customActionComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.analyticsApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.retainAnalyticsApi = (RetainComposerAnalyticsComponentApi) c7475g.getComponent(RetainComposerAnalyticsComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePrefetcher<ShelfCardVO> createImagePrefetcher() {
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ShelfCardVO.class), new ShelfCardImagePrefetchInfoProvider());
        Unit unit = Unit.f71690a;
        return new ImagePrefetcher<>(4, imagePrefetchInfoProviderStorage);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent
    public AuthStateStorage getAuthStateStorage() {
        return this.storageComponentApi.getAuthStateStorage();
    }

    public CoroutineDispatcherProvider getCoroutineDispatcherProvider() {
        return this.coroutineDispatchersComponentApi.getDispatcherProvider();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent
    public ProductFavoriteDelegateProvider getFavoriteProductMoleculeDelegateProvider() {
        return this.favoriteComponentApi.getFavoriteProductDelegate();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent
    public HotelFavoriteUnauthorizedAnalytics getFavoriteUnauthorizedAnalytics() {
        return new HotelFavoriteUnauthorizedAnalytics(this.analyticsApi.getAnalyticsDataLayer(), this.analyticsApi.getPluginsManager(), this.retainAnalyticsApi.getAnalyticsScreenStorage());
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent
    public HotelsHorizontalShelvesMapper getMapper() {
        return (HotelsHorizontalShelvesMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent
    public Pc.a<HotelsHorizontalShelvesViewModel> getWidgetViewModelProvider() {
        return (Pc.a) this.widgetViewModelProvider.getValue();
    }
}
