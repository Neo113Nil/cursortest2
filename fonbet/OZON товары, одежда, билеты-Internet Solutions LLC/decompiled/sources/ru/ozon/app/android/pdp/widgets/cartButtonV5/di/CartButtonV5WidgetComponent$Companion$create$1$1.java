package ru.ozon.app.android.pdp.widgets.cartButtonV5.di;

import At.b;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingRepository;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.QuantTypeRepository;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5BottomSheetViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import wD.C10455b;

@Metadata(d1 = {"\u0000µ\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R(\u00103\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u000102020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&R(\u00106\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u000105050 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0018\u0010@\u001a\u00060<j\u0002`=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010I\u001a\u00060Ej\u0002`F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"ru/ozon/app/android/pdp/widgets/cartButtonV5/di/CartButtonV5WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/di/CartButtonV5WidgetComponent;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "storefrontCommonComponentApi", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "LPc/a;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "kotlin.jvm.PlatformType", "subscribeViewModelProvider", "LPc/a;", "getSubscribeViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "onBoardingRepository$delegate", "LSc/j;", "getOnBoardingRepository", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "onBoardingRepository", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/QuantTypeRepository;", "quantTypeRepository$delegate", "getQuantTypeRepository", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/QuantTypeRepository;", "quantTypeRepository", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ViewModel;", "viewModelProvider", "getViewModelProvider", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5BottomSheetViewModel;", "bottomSheetViewModelProvider", "getBottomSheetViewModelProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "getPdpOnBoardingViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "pdpOnBoardingViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "getTeensModeService", "()Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5WidgetComponent$Companion$create$1$1 implements CartButtonV5WidgetComponent {
    private final AccountComponentApi accountComponentApi;
    private final ActionComponentApi actionComponentApi;
    private final ComposerComponentApi composerComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final OnBoardingComponentApi onboardingComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final StorageComponentApi storageComponentApi;
    private final StorefrontCommonComponentApi storefrontCommonComponentApi;
    private final a<CartButtonV5ViewModel> viewModelProvider;
    private final a<SubscribeViewModel> subscribeViewModelProvider = new b(this, 1);

    /* renamed from: onBoardingRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onBoardingRepository = k.b(new CartButtonV5WidgetComponent$Companion$create$1$1$onBoardingRepository$2(this));

    /* renamed from: quantTypeRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j quantTypeRepository = k.b(CartButtonV5WidgetComponent$Companion$create$1$1$quantTypeRepository$2.INSTANCE);
    private final a<CartButtonV5BottomSheetViewModel> bottomSheetViewModelProvider = new C10455b();

    CartButtonV5WidgetComponent$Companion$create$1$1(final C7475g c7475g) {
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.composerComponentApi = (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.storefrontCommonComponentApi = (StorefrontCommonComponentApi) c7475g.getComponent(StorefrontCommonComponentApi.class);
        this.viewModelProvider = new a() { // from class: wD.a
            @Override // Pc.a
            public final Object get() {
                CartButtonV5ViewModel viewModelProvider$lambda$1;
                viewModelProvider$lambda$1 = CartButtonV5WidgetComponent$Companion$create$1$1.viewModelProvider$lambda$1(C7475g.this, this);
                return viewModelProvider$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartButtonV5BottomSheetViewModel bottomSheetViewModelProvider$lambda$2() {
        return new CartButtonV5BottomSheetViewModel();
    }

    private final PDPOnBoardingRepository getOnBoardingRepository() {
        return (PDPOnBoardingRepository) this.onBoardingRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubscribeViewModel subscribeViewModelProvider$lambda$0(CartButtonV5WidgetComponent$Companion$create$1$1 cartButtonV5WidgetComponent$Companion$create$1$1) {
        return new SubscribeViewModel(cartButtonV5WidgetComponent$Companion$create$1$1.accountComponentApi.getSubscriptionServiceProvider(), cartButtonV5WidgetComponent$Companion$create$1$1.favoriteCoreComponentApi.getFavoriteInteractor(), cartButtonV5WidgetComponent$Companion$create$1$1.storageComponentApi.getAuthStateStorage(), cartButtonV5WidgetComponent$Companion$create$1$1.composerComponentApi.getComposerNavigator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartButtonV5ViewModel viewModelProvider$lambda$1(C7475g c7475g, CartButtonV5WidgetComponent$Companion$create$1$1 cartButtonV5WidgetComponent$Companion$create$1$1) {
        return new CartButtonV5ViewModel(((CartServiceApi) c7475g.getComponent(CartServiceApi.class)).getCartService(), cartButtonV5WidgetComponent$Companion$create$1$1.actionComponentApi.getActionRepository(), cartButtonV5WidgetComponent$Companion$create$1$1.getQuantTypeRepository(), cartButtonV5WidgetComponent$Companion$create$1$1.storageComponentApi.getSharedPreferences());
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public a<CartButtonV5BottomSheetViewModel> getBottomSheetViewModelProvider() {
        return this.bottomSheetViewModelProvider;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public PDPOnBoardingViewModel getPdpOnBoardingViewModel() {
        return new PDPOnBoardingViewModel(getOnBoardingRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public QuantTypeRepository getQuantTypeRepository() {
        return (QuantTypeRepository) this.quantTypeRepository.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public a<SubscribeViewModel> getSubscribeViewModelProvider() {
        return this.subscribeViewModelProvider;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public TeensModeService getTeensModeService() {
        return this.storefrontCommonComponentApi.getTeensModeService();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent
    public a<CartButtonV5ViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
