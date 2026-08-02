package ru.ozon.app.android.cart.ui.tab;

import BZ.e;
import GZ.g;
import Sc.InterfaceC4008j;
import android.app.Application;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.delegate.ResolveCartTabNavigationActionUseCase;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/ui/tab/CartTabUiControllerFactory;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "create", "(Landroidx/fragment/app/m;)Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService$delegate", "LSc/j;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService$delegate", "getTeensModeService", "()Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;", "resolveCartTabNavigationUseCase$delegate", "getResolveCartTabNavigationUseCase", "()Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;", "resolveCartTabNavigationUseCase", "LGZ/g;", "router$delegate", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator$delegate", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "LBZ/e;", "miniAppConfigHolder$delegate", "getMiniAppConfigHolder", "()LBZ/e;", "miniAppConfigHolder", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartTabUiControllerFactory implements TabUiControllerFactory {

    /* renamed from: cartService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartService;

    /* renamed from: composerNavigator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j composerNavigator;

    /* renamed from: miniAppConfigHolder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j miniAppConfigHolder;

    /* renamed from: resolveCartTabNavigationUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j resolveCartTabNavigationUseCase;

    /* renamed from: router$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j router;

    /* renamed from: teensModeService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j teensModeService;

    public CartTabUiControllerFactory(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.cartService = LazyUtilsKt.unsafeLazy(new CartTabUiControllerFactory$cartService$2(application));
        this.teensModeService = LazyUtilsKt.unsafeLazy(new CartTabUiControllerFactory$teensModeService$2(application));
        this.resolveCartTabNavigationUseCase = LazyUtilsKt.unsafeLazy(new CartTabUiControllerFactory$resolveCartTabNavigationUseCase$2(application));
        this.router = LazyUtilsKt.unsafeLazy(new CartTabUiControllerFactory$router$2(application));
        this.composerNavigator = LazyUtilsKt.unsafeLazy(new CartTabUiControllerFactory$composerNavigator$2(application));
        this.miniAppConfigHolder = LazyUtilsKt.unsafeLazy(new CartTabUiControllerFactory$miniAppConfigHolder$2(application));
    }

    private final CartService getCartService() {
        return (CartService) this.cartService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerNavigator getComposerNavigator() {
        return (ComposerNavigator) this.composerNavigator.getValue();
    }

    private final e getMiniAppConfigHolder() {
        return (e) this.miniAppConfigHolder.getValue();
    }

    private final ResolveCartTabNavigationActionUseCase getResolveCartTabNavigationUseCase() {
        return (ResolveCartTabNavigationActionUseCase) this.resolveCartTabNavigationUseCase.getValue();
    }

    private final g getRouter() {
        return (g) this.router.getValue();
    }

    private final TeensModeService getTeensModeService() {
        return (TeensModeService) this.teensModeService.getValue();
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory
    @NotNull
    public TabUiController create(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        CartService cartService = getCartService();
        TeensModeService teensModeService = getTeensModeService();
        ResolveCartTabNavigationActionUseCase resolveCartTabNavigationUseCase = getResolveCartTabNavigationUseCase();
        return new CartTabUiController(fragment, cartService, teensModeService, getRouter(), resolveCartTabNavigationUseCase, new CartTabUiControllerFactory$create$1(this), getMiniAppConfigHolder());
    }
}
