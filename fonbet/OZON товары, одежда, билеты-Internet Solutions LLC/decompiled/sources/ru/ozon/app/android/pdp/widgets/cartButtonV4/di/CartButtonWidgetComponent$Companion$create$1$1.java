package ru.ozon.app.android.pdp.widgets.cartButtonV4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.SharedPreferences;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingRepository;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonNotificationHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonPreCreateVHStateHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.plain.PlainV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000Ý\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010.R\u001b\u00107\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\"\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\"\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\"\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\"\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0018\u0010i\u001a\u00060ej\u0002`f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"ru/ozon/app/android/pdp/widgets/cartButtonV4/di/CartButtonWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/di/CartButtonWidgetComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;", "notificationHandler$delegate", "LSc/j;", "getNotificationHandler", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;", "notificationHandler", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "onBoardingRepository$delegate", "getOnBoardingRepository", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "onBoardingRepository", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder$Default;", "cartPreCreateVHStateHolder$delegate", "getCartPreCreateVHStateHolder", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder$Default;", "cartPreCreateVHStateHolder", "doubleCartPreCreateVHStateHolder$delegate", "getDoubleCartPreCreateVHStateHolder", "doubleCartPreCreateVHStateHolder", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartV4Mapper;", "cartMapper$delegate", "getCartMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartV4Mapper;", "cartMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartV4Mapper;", "doubleCartMapper$delegate", "getDoubleCartMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartV4Mapper;", "doubleCartMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/plain/PlainV4Mapper;", "plainMapper$delegate", "getPlainMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/plain/PlainV4Mapper;", "plainMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeV4Mapper;", "subscribeMapper$delegate", "getSubscribeMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeV4Mapper;", "subscribeMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "actionHandlerFactory$delegate", "getActionHandlerFactory", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "actionHandlerFactory", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "subscribeViewModel$delegate", "getSubscribeViewModel", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "subscribeViewModel", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "getCartViewModel", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "cartViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewBinder;", "getCartViewBinder", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewBinder;", "cartViewBinder", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "getDoubleCartViewBinder", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "doubleCartViewBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "getPdpOnBoardingViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "pdpOnBoardingViewModel", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonWidgetComponent$Companion$create$1$1 implements CartButtonWidgetComponent {
    private final AccountComponentApi accountComponentApi;
    private final CartServiceApi cartServiceApi;
    private final ComposerComponentApi composerComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;
    private final NavigationComponentApi navigationComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final OnBoardingComponentApi onboardingComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: notificationHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j notificationHandler = k.b(CartButtonWidgetComponent$Companion$create$1$1$notificationHandler$2.INSTANCE);

    /* renamed from: onBoardingRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onBoardingRepository = k.b(new CartButtonWidgetComponent$Companion$create$1$1$onBoardingRepository$2(this));

    /* renamed from: cartPreCreateVHStateHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cartPreCreateVHStateHolder = k.b(CartButtonWidgetComponent$Companion$create$1$1$cartPreCreateVHStateHolder$2.INSTANCE);

    /* renamed from: doubleCartPreCreateVHStateHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j doubleCartPreCreateVHStateHolder = k.b(CartButtonWidgetComponent$Companion$create$1$1$doubleCartPreCreateVHStateHolder$2.INSTANCE);

    /* renamed from: cartMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cartMapper = k.b(CartButtonWidgetComponent$Companion$create$1$1$cartMapper$2.INSTANCE);

    /* renamed from: doubleCartMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j doubleCartMapper = k.b(CartButtonWidgetComponent$Companion$create$1$1$doubleCartMapper$2.INSTANCE);

    /* renamed from: plainMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j plainMapper = k.b(CartButtonWidgetComponent$Companion$create$1$1$plainMapper$2.INSTANCE);

    /* renamed from: subscribeMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j subscribeMapper = k.b(CartButtonWidgetComponent$Companion$create$1$1$subscribeMapper$2.INSTANCE);

    /* renamed from: actionHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionHandlerFactory = k.b(new CartButtonWidgetComponent$Companion$create$1$1$actionHandlerFactory$2(this));

    /* renamed from: subscribeViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j subscribeViewModel = k.b(new CartButtonWidgetComponent$Companion$create$1$1$subscribeViewModel$2(this));

    CartButtonWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.composerComponentApi = (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
    }

    private final CartViewModel getCartViewModel() {
        return new CartViewModel(this.cartServiceApi.getCartService());
    }

    private final CartButtonNotificationHandler getNotificationHandler() {
        return (CartButtonNotificationHandler) this.notificationHandler.getValue();
    }

    private final PDPOnBoardingRepository getOnBoardingRepository() {
        return (PDPOnBoardingRepository) this.onBoardingRepository.getValue();
    }

    private final SharedPreferences getSharedPreferences() {
        return this.storageComponentApi.getSharedPreferences();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public CartButtonActionHandlerFactory getActionHandlerFactory() {
        return (CartButtonActionHandlerFactory) this.actionHandlerFactory.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public CartV4Mapper getCartMapper() {
        return (CartV4Mapper) this.cartMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public CartViewBinder getCartViewBinder() {
        return new CartViewBinder(getCartViewModel(), getActionHandlerFactory(), new SaleBlockViewModel(), getSharedPreferences(), getNotificationHandler(), this.composerComponentApi.getComposerNavigator());
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public DoubleCartV4Mapper getDoubleCartMapper() {
        return (DoubleCartV4Mapper) this.doubleCartMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public DoubleCartViewBinder getDoubleCartViewBinder() {
        return new DoubleCartViewBinder(getCartViewModel(), getActionHandlerFactory(), this.navigationComponentApi.getOzonRouter(), this.cartServiceApi.getCartService(), getSharedPreferences(), getNotificationHandler(), this.composerComponentApi.getComposerNavigator());
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public PDPOnBoardingViewModel getPdpOnBoardingViewModel() {
        return new PDPOnBoardingViewModel(getOnBoardingRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public PlainV4Mapper getPlainMapper() {
        return (PlainV4Mapper) this.plainMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public SubscribeV4Mapper getSubscribeMapper() {
        return (SubscribeV4Mapper) this.subscribeMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public SubscribeViewModel getSubscribeViewModel() {
        return (SubscribeViewModel) this.subscribeViewModel.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public CartButtonPreCreateVHStateHolder.Default getCartPreCreateVHStateHolder() {
        return (CartButtonPreCreateVHStateHolder.Default) this.cartPreCreateVHStateHolder.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent
    public CartButtonPreCreateVHStateHolder.Default getDoubleCartPreCreateVHStateHolder() {
        return (CartButtonPreCreateVHStateHolder.Default) this.doubleCartPreCreateVHStateHolder.getValue();
    }
}
