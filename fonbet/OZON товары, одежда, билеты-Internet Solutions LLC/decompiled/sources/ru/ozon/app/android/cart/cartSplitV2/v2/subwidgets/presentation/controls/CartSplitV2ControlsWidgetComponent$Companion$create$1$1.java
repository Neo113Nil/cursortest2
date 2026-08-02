package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import BZ.e;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper.CartSplitControlsV2Mapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CartSplitV2ViewModelV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000}\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001b\u0010\u001e\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010'\u001a\u00060#j\u0002`$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u00104\u001a\u000600j\u0002`18VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"ru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsWidgetComponent;", "LPc/a;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CartSplitV2ViewModelV2;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "LBZ/e;", "miniAppConfigHolder$delegate", "LSc/j;", "getMiniAppConfigHolder", "()LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "groupSwipeCoordinator", "getGroupSwipeCoordinator", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "getHandlersInhibitor", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitControlsV2Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitControlsV2Mapper;", "mapper", "Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "getCartThrottleNotificationHandler", "()Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "cartThrottleNotificationHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavProductMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favProductMoleculeDelegateProvider", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "getSwipeViewModel", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "swipeViewModel", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ControlsWidgetComponent$Companion$create$1$1 implements CartSplitV2ControlsWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AppType appType;

    /* renamed from: miniAppConfigHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j miniAppConfigHolder;
    private final a<CartSplitV2ViewModelV2> viewModelProvider = new Pv.a(1);
    private final a<GroupSwipeCoordinator> groupSwipeCoordinator = new Tt.a(1);
    private final a<HandlersInhibitor> handlersInhibitor = new It.a(1);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CartSplitV2ControlsWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

    CartSplitV2ControlsWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.miniAppConfigHolder = k.b(new CartSplitV2ControlsWidgetComponent$Companion$create$1$1$miniAppConfigHolder$2(c7475g));
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupSwipeCoordinator groupSwipeCoordinator$lambda$1() {
        return new GroupSwipeCoordinator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlersInhibitor handlersInhibitor$lambda$2() {
        return new HandlersInhibitor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartSplitV2ViewModelV2 viewModelProvider$lambda$0() {
        return new CartSplitV2ViewModelV2();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public AppType getAppType() {
        return this.appType;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider() {
        return ((CartServiceApi) this.$storage.getComponent(CartServiceApi.class)).getAsyncCartViewModelProvider();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public CartThrottleNotificationHandler getCartThrottleNotificationHandler() {
        return ((CartComponentApi) this.$storage.getComponent(CartComponentApi.class)).getCartThrottleNotificationHandler();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public ProductFavoriteDelegateProvider getFavProductMoleculeDelegateProvider() {
        return ((FavoriteComponentApi) this.$storage.getComponent(FavoriteComponentApi.class)).getFavoriteProductDelegate();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public FrameBinder getFrameBinder() {
        return ((RetainComposerPerformanceComponentApi) this.$storage.getComponent(RetainComposerPerformanceComponentApi.class)).getFrameBinder();
    }

    public a<GroupSwipeCoordinator> getGroupSwipeCoordinator() {
        return this.groupSwipeCoordinator;
    }

    public a<HandlersInhibitor> getHandlersInhibitor() {
        return this.handlersInhibitor;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public CartSplitControlsV2Mapper getMapper() {
        return (CartSplitControlsV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public e getMiniAppConfigHolder() {
        return (e) this.miniAppConfigHolder.getValue();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public SwipeViewModel getSwipeViewModel() {
        HandlersInhibitor handlersInhibitor = getHandlersInhibitor().get();
        Intrinsics.checkNotNullExpressionValue(handlersInhibitor, "get(...)");
        GroupSwipeCoordinator groupSwipeCoordinator = getGroupSwipeCoordinator().get();
        Intrinsics.checkNotNullExpressionValue(groupSwipeCoordinator, "get(...)");
        return new SwipeViewModel(handlersInhibitor, groupSwipeCoordinator);
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent
    public a<CartSplitV2ViewModelV2> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
