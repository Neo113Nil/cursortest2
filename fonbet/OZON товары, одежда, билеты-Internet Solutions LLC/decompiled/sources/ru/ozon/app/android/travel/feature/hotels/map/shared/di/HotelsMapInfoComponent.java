package ru.ozon.app.android.travel.feature.hotels.map.shared.di;

import BZ.f;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerAnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons.PolygonsRepository;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4Mapper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.PinMapperDelegate;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapLastParamsHelper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.UpdateHotelsManager;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.AnalyticsHelper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.PinManager;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.ViewedPinsStorage;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.data.HotelsMapInfoV5Mapper;
import ru.ozon.app.android.travel.map.di.TravelMapApi;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u00107\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u0010RR\u0015\u0010X\u001a\u00060Tj\u0002`U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0015\u0010]\u001a\u00060Yj\u0002`Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010a\u001a\u00020^8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0011\u0010e\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010i\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010m\u001a\u00020j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0011\u0010q\u001a\u00020n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0011\u0010t\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010x\u001a\u00020u8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0011\u0010|\u001a\u00020y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0012\u0010\u0080\u0001\u001a\u00020}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0084\u0001\u001a\u00030\u0081\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/di/HotelsMapInfoComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/travel/map/di/TravelMapApi;", "travelMapApi", "Lru/ozon/app/android/travel/map/di/TravelMapApi;", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "", "miniApp", "Ljava/lang/String;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerAnalyticsComponentApi;", "retainAnalyticsApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerAnalyticsComponentApi;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PinManager;", "pinManagerV4$delegate", "LSc/j;", "getPinManagerV4", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PinManager;", "pinManagerV4", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;", "analyticsHelperV4$delegate", "getAnalyticsHelperV4", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/AnalyticsHelper;", "analyticsHelperV4", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ViewedPinsStorage;", "viewedPinsStorage$delegate", "getViewedPinsStorage", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ViewedPinsStorage;", "viewedPinsStorage", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;", "pinMapperDelegate$delegate", "getPinMapperDelegate", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;", "pinMapperDelegate", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4Mapper;", "hotelsMapInfoV4Mapper$delegate", "getHotelsMapInfoV4Mapper", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4Mapper;", "hotelsMapInfoV4Mapper", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5Mapper;", "hotelsMapInfoV5Mapper$delegate", "getHotelsMapInfoV5Mapper", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5Mapper;", "hotelsMapInfoV5Mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "getTravelGeoProviderStorage", "()Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProviderStorage", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavoriteProductMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductMoleculeDelegateProvider", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "getFavoriteManager", "()Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "getOnBoardingViewModel", "()Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;", "getHotelsMapInfoV4ViewModel", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;", "hotelsMapInfoV4ViewModel", "getMiniAppName", "()Ljava/lang/String;", "miniAppName", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "getDispatchersProvider", "()Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "getAuthStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "getFavoriteUnauthorizedAnalytics", "()Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsMapInfoComponent implements InterfaceC6958a {

    @NotNull
    private final AccountComponentApi accountComponentApi;

    @NotNull
    private final ActionComponentApi actionComponentApi;

    @NotNull
    private final AnalyticsComponentApi analyticsApi;

    /* renamed from: analyticsHelperV4$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j analyticsHelperV4;

    @NotNull
    private final ContextComponentDependencies contextComponentDependencies;

    @NotNull
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    @NotNull
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    @NotNull
    private final FavoriteComponentApi favoriteComponentApi;

    @NotNull
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;

    /* renamed from: hotelsMapInfoV4Mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hotelsMapInfoV4Mapper;

    /* renamed from: hotelsMapInfoV5Mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hotelsMapInfoV5Mapper;

    @NotNull
    private final String miniApp;

    @NotNull
    private final NetworkComponentApi networkComponentApi;

    @NotNull
    private final OnBoardingComponentApi onBoardingComponentApi;

    /* renamed from: pinManagerV4$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pinManagerV4;

    /* renamed from: pinMapperDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pinMapperDelegate;

    @NotNull
    private final RetainComposerAnalyticsComponentApi retainAnalyticsApi;

    @NotNull
    private final RetainComposerComponentApi retainComposerComponentApi;

    @NotNull
    private final StorageComponentApi storageComponentApi;

    @NotNull
    private final TravelMapApi travelMapApi;

    /* renamed from: viewedPinsStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewedPinsStorage;

    public HotelsMapInfoComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
        this.travelMapApi = (TravelMapApi) storage.getComponent(TravelMapApi.class);
        this.favoriteComponentApi = (FavoriteComponentApi) storage.getComponent(FavoriteComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) storage.getComponent(FavoriteCoreComponentApi.class);
        this.onBoardingComponentApi = (OnBoardingComponentApi) storage.getComponent(OnBoardingComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) storage.getComponent(StorageComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) storage.getComponent(ContextComponentDependencies.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class);
        this.miniApp = f.a(((NavigationComponentApi) storage.getComponent(NavigationComponentApi.class)).getMiniAppConfigHolder());
        this.accountComponentApi = (AccountComponentApi) storage.getComponent(AccountComponentApi.class);
        this.analyticsApi = (AnalyticsComponentApi) storage.getComponent(AnalyticsComponentApi.class);
        this.retainAnalyticsApi = (RetainComposerAnalyticsComponentApi) storage.getComponent(RetainComposerAnalyticsComponentApi.class);
        this.pinManagerV4 = k.b(new HotelsMapInfoComponent$pinManagerV4$2(this));
        this.analyticsHelperV4 = k.b(new HotelsMapInfoComponent$analyticsHelperV4$2(this));
        this.viewedPinsStorage = k.b(HotelsMapInfoComponent$viewedPinsStorage$2.INSTANCE);
        this.pinMapperDelegate = k.b(new HotelsMapInfoComponent$pinMapperDelegate$2(this));
        this.hotelsMapInfoV4Mapper = k.b(new HotelsMapInfoComponent$hotelsMapInfoV4Mapper$2(this));
        this.hotelsMapInfoV5Mapper = k.b(new HotelsMapInfoComponent$hotelsMapInfoV5Mapper$2(this));
    }

    private final AnalyticsHelper getAnalyticsHelperV4() {
        return (AnalyticsHelper) this.analyticsHelperV4.getValue();
    }

    private final PinManager getPinManagerV4() {
        return (PinManager) this.pinManagerV4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PinMapperDelegate getPinMapperDelegate() {
        return (PinMapperDelegate) this.pinMapperDelegate.getValue();
    }

    @NotNull
    public final AuthStateStorage getAuthStateStorage() {
        return this.storageComponentApi.getAuthStateStorage();
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final CoroutineDispatcherProvider getDispatchersProvider() {
        return this.coroutineDispatchersComponentApi.getDispatcherProvider();
    }

    @NotNull
    public final FavoriteManager getFavoriteManager() {
        return this.favoriteCoreComponentApi.getFavoriteManager();
    }

    @NotNull
    public final ProductFavoriteDelegateProvider getFavoriteProductMoleculeDelegateProvider() {
        return this.favoriteComponentApi.getFavoriteProductDelegate();
    }

    @NotNull
    public final HotelFavoriteUnauthorizedAnalytics getFavoriteUnauthorizedAnalytics() {
        return new HotelFavoriteUnauthorizedAnalytics(this.analyticsApi.getAnalyticsDataLayer(), this.analyticsApi.getPluginsManager(), this.retainAnalyticsApi.getAnalyticsScreenStorage());
    }

    @NotNull
    public final FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @NotNull
    public final HotelsMapInfoV4Mapper getHotelsMapInfoV4Mapper() {
        return (HotelsMapInfoV4Mapper) this.hotelsMapInfoV4Mapper.getValue();
    }

    @NotNull
    public final HotelsMapInfoV4ViewModel getHotelsMapInfoV4ViewModel() {
        FavoriteManager favoriteManager = getFavoriteManager();
        PinManager pinManagerV4 = getPinManagerV4();
        UpdateHotelsManager updateHotelsManager = new UpdateHotelsManager(getHotelsMapInfoV4Mapper(), this.actionComponentApi.getActionRepository(), this.coroutineDispatchersComponentApi.getDispatcherProvider());
        PolygonsRepository polygonsRepository = new PolygonsRepository(this.storageComponentApi.getSharedPreferences());
        AnalyticsHelper analyticsHelperV4 = getAnalyticsHelperV4();
        MapLastParamsHelper mapLastParamsHelper = new MapLastParamsHelper();
        return new HotelsMapInfoV4ViewModel(favoriteManager, this.coroutineDispatchersComponentApi.getDispatcherProvider(), this.accountComponentApi.getUserManager().getUserIdChangedFlow(), pinManagerV4, updateHotelsManager, polygonsRepository, analyticsHelperV4, mapLastParamsHelper, getViewedPinsStorage());
    }

    @NotNull
    public final HotelsMapInfoV5Mapper getHotelsMapInfoV5Mapper() {
        return (HotelsMapInfoV5Mapper) this.hotelsMapInfoV5Mapper.getValue();
    }

    @NotNull
    /* renamed from: getMiniAppName, reason: from getter */
    public final String getMiniApp() {
        return this.miniApp;
    }

    @NotNull
    public final TravelOnboardingViewModel getOnBoardingViewModel() {
        return new TravelOnboardingViewModel(this.onBoardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @NotNull
    public final TravelGeoProvidersStorage getTravelGeoProviderStorage() {
        return this.travelMapApi.getTravelGeoProviderStorage();
    }

    @NotNull
    public final ViewedPinsStorage getViewedPinsStorage() {
        return (ViewedPinsStorage) this.viewedPinsStorage.getValue();
    }
}
