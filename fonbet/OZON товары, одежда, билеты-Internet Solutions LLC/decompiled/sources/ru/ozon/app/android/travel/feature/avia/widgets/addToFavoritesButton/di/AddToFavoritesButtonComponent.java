package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainAnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.data.AddToFavoritesButtonMapper;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0015\u00107\u001a\u000603j\u0002`48F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/di/AddToFavoritesButtonComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainAnalyticsComponentApi;", "retainAnalyticsApi", "Lru/ozon/app/android/composer/di/composer/RetainAnalyticsComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/data/AddToFavoritesButtonMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/data/AddToFavoritesButtonMapper;", "mapper", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "getFavoriteManager", "()Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getProductFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "getOnBoardingViewModel", "()Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddToFavoritesButtonComponent implements InterfaceC6958a {

    @NotNull
    private final ActionComponentApi actionComponentApi;

    @NotNull
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    @NotNull
    private final FavoriteComponentApi favoriteComponentApi;

    @NotNull
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final NavigationComponentApi navigationComponentApi;

    @NotNull
    private final OnBoardingComponentApi onBoardingComponentApi;

    @NotNull
    private final RetainAnalyticsComponentApi retainAnalyticsApi;

    public AddToFavoritesButtonComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.favoriteComponentApi = (FavoriteComponentApi) storage.getComponent(FavoriteComponentApi.class);
        this.onBoardingComponentApi = (OnBoardingComponentApi) storage.getComponent(OnBoardingComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) storage.getComponent(FavoriteCoreComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
        this.navigationComponentApi = (NavigationComponentApi) storage.getComponent(NavigationComponentApi.class);
        this.retainAnalyticsApi = (RetainAnalyticsComponentApi) storage.getComponent(RetainAnalyticsComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.mapper = k.b(AddToFavoritesButtonComponent$mapper$2.INSTANCE);
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final FavoriteManager getFavoriteManager() {
        return this.favoriteCoreComponentApi.getFavoriteManager();
    }

    @NotNull
    public final AddToFavoritesButtonMapper getMapper() {
        return (AddToFavoritesButtonMapper) this.mapper.getValue();
    }

    @NotNull
    public final TravelOnboardingViewModel getOnBoardingViewModel() {
        return new TravelOnboardingViewModel(this.onBoardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onBoardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @NotNull
    public final ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider() {
        return this.favoriteComponentApi.getFavoriteProductDelegate();
    }

    @NotNull
    public final AddToFavoritesViewModel getViewModel() {
        return new AddToFavoritesViewModel(getFavoriteManager(), this.actionComponentApi.getActionRepository(), this.navigationComponentApi.getMiniAppConfigHolder(), this.retainAnalyticsApi.getAnalyticsScreenStorage());
    }
}
