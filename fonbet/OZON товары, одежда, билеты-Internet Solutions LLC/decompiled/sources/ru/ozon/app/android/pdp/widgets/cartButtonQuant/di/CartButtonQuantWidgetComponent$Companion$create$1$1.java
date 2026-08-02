package ru.ozon.app.android.pdp.widgets.cartButtonQuant.di;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.SharedPreferences;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonPreCreateVHStateHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantNotificationHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.plain.PlainQuantMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000¹\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010#R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001c\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u001c\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001c\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"ru/ozon/app/android/pdp/widgets/cartButtonQuant/di/CartButtonQuantWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/di/CartButtonQuantWidgetComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantNotificationHandler;", "notificationHandler$delegate", "LSc/j;", "getNotificationHandler", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantNotificationHandler;", "notificationHandler", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonPreCreateVHStateHolder$Default;", "cartPreCreateVHStateHolder$delegate", "getCartPreCreateVHStateHolder", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonPreCreateVHStateHolder$Default;", "cartPreCreateVHStateHolder", "doubleCartPreCreateVHStateHolder$delegate", "getDoubleCartPreCreateVHStateHolder", "doubleCartPreCreateVHStateHolder", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartV4Mapper;", "cartMapper$delegate", "getCartMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartV4Mapper;", "cartMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantMapper;", "doubleCartMapper$delegate", "getDoubleCartMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantMapper;", "doubleCartMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantMapper;", "plainMapper$delegate", "getPlainMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantMapper;", "plainMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantMapper;", "subscribeMapper$delegate", "getSubscribeMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantMapper;", "subscribeMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandlerFactory;", "actionHandlerFactory$delegate", "getActionHandlerFactory", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandlerFactory;", "actionHandlerFactory", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel;", "subscribeQuantViewModel$delegate", "getSubscribeQuantViewModel", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel;", "subscribeQuantViewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator$delegate", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "getCartQuantViewModel", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "cartQuantViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantViewBinder;", "getCartQuantViewBinder", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantViewBinder;", "cartQuantViewBinder", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewBinder;", "getDoubleCartQuantViewBinder", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewBinder;", "doubleCartQuantViewBinder", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantWidgetComponent$Companion$create$1$1 implements CartButtonQuantWidgetComponent {
    private final AccountComponentApi accountComponentApi;
    private final CartServiceApi cartServiceApi;
    private final ComposerComponentApi composerComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;
    private final NavigationComponentApi navigationComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: notificationHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j notificationHandler = k.b(CartButtonQuantWidgetComponent$Companion$create$1$1$notificationHandler$2.INSTANCE);

    /* renamed from: cartPreCreateVHStateHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cartPreCreateVHStateHolder = k.b(CartButtonQuantWidgetComponent$Companion$create$1$1$cartPreCreateVHStateHolder$2.INSTANCE);

    /* renamed from: doubleCartPreCreateVHStateHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j doubleCartPreCreateVHStateHolder = k.b(CartButtonQuantWidgetComponent$Companion$create$1$1$doubleCartPreCreateVHStateHolder$2.INSTANCE);

    /* renamed from: cartMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cartMapper = k.b(CartButtonQuantWidgetComponent$Companion$create$1$1$cartMapper$2.INSTANCE);

    /* renamed from: doubleCartMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j doubleCartMapper = k.b(CartButtonQuantWidgetComponent$Companion$create$1$1$doubleCartMapper$2.INSTANCE);

    /* renamed from: plainMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j plainMapper = k.b(CartButtonQuantWidgetComponent$Companion$create$1$1$plainMapper$2.INSTANCE);

    /* renamed from: subscribeMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j subscribeMapper = k.b(CartButtonQuantWidgetComponent$Companion$create$1$1$subscribeMapper$2.INSTANCE);

    /* renamed from: actionHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionHandlerFactory = k.b(new CartButtonQuantWidgetComponent$Companion$create$1$1$actionHandlerFactory$2(this));

    /* renamed from: subscribeQuantViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j subscribeQuantViewModel = k.b(new CartButtonQuantWidgetComponent$Companion$create$1$1$subscribeQuantViewModel$2(this));

    /* renamed from: composerNavigator$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j composerNavigator = k.b(new CartButtonQuantWidgetComponent$Companion$create$1$1$composerNavigator$2(this));

    CartButtonQuantWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.composerComponentApi = (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
    }

    private final CartQuantViewModel getCartQuantViewModel() {
        return new CartQuantViewModel(this.cartServiceApi.getCartService());
    }

    private final CartButtonQuantNotificationHandler getNotificationHandler() {
        return (CartButtonQuantNotificationHandler) this.notificationHandler.getValue();
    }

    private final SharedPreferences getSharedPreferences() {
        return this.storageComponentApi.getSharedPreferences();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public CartButtonQuantActionHandlerFactory getActionHandlerFactory() {
        return (CartButtonQuantActionHandlerFactory) this.actionHandlerFactory.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public CartV4Mapper getCartMapper() {
        return (CartV4Mapper) this.cartMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public CartQuantViewBinder getCartQuantViewBinder() {
        return new CartQuantViewBinder(getCartQuantViewModel(), getActionHandlerFactory(), new SaleBlockViewModel(), getSharedPreferences(), getNotificationHandler(), this.composerComponentApi.getComposerNavigator());
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public ComposerNavigator getComposerNavigator() {
        return (ComposerNavigator) this.composerNavigator.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public DoubleCartQuantMapper getDoubleCartMapper() {
        return (DoubleCartQuantMapper) this.doubleCartMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public DoubleCartQuantViewBinder getDoubleCartQuantViewBinder() {
        return new DoubleCartQuantViewBinder(getCartQuantViewModel(), getActionHandlerFactory(), this.navigationComponentApi.getOzonRouter(), this.cartServiceApi.getCartService(), getSharedPreferences(), getNotificationHandler(), this.composerComponentApi.getComposerNavigator());
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public PlainQuantMapper getPlainMapper() {
        return (PlainQuantMapper) this.plainMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public SubscribeQuantMapper getSubscribeMapper() {
        return (SubscribeQuantMapper) this.subscribeMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public SubscribeQuantViewModel getSubscribeQuantViewModel() {
        return (SubscribeQuantViewModel) this.subscribeQuantViewModel.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public CartButtonPreCreateVHStateHolder.Default getCartPreCreateVHStateHolder() {
        return (CartButtonPreCreateVHStateHolder.Default) this.cartPreCreateVHStateHolder.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent
    public CartButtonPreCreateVHStateHolder.Default getDoubleCartPreCreateVHStateHolder() {
        return (CartButtonPreCreateVHStateHolder.Default) this.doubleCartPreCreateVHStateHolder.getValue();
    }
}
