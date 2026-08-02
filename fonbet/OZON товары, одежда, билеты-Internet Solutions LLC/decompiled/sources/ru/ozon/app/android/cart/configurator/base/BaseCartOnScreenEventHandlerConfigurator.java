package ru.ozon.app.android.cart.configurator.base;

import A00.e;
import Ae.C2399j;
import Ae.C2408n0;
import BZ.e;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ImagesContract;
import i10.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.common.utils.link.CartDeeplinkValidationRules;
import ru.ozon.app.android.cart.configurator.base.BaseCartOnScreenEventHandlerConfigurator;
import ru.ozon.app.android.cart.ui.customActionHandler.navigateToRootCart.NavigateToRootCartDestination;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 P2\u00020\u0001:\u0001PB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020%H\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020%H\u0004¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020%H\u0014¢\u0006\u0004\b+\u0010'J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020,H\u0004¢\u0006\u0004\b-\u0010.J3\u0010/\u001a\u00020\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0004¢\u0006\u0004\b/\u00100J?\u00101\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0004¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8$X¤\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lru/ozon/app/android/cart/configurator/base/BaseCartOnScreenEventHandlerConfigurator;", "Lru/ozon/app/android/cart/configurator/base/AbstractCartConfigurator;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "LBZ/e;", "miniAppConfigHolder", "<init>", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;Lru/ozon/app/android/cart/common/domain/CartNavigationService;LBZ/e;)V", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$BackToCart;", "event", "", "handleBackToCart", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason$BackToCart;)V", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$RemoveCartSplit;", "handleRemoveSplit", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason$RemoveCartSplit;)V", "", ImagesContract.URL, "LA00/e;", "saveScrollParams", "", "", "postParams", "saveScrollComposerRefresh", "(Ljava/lang/String;LA00/e;Ljava/util/Map;)V", "getDeeplinkAuthority", "(Ljava/lang/String;)Ljava/lang/String;", "onComposerInitialized", "()V", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "handleEvents", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)V", "", "handleDefaultEvent", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)Z", "handleCustomEvent", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCart;", "handleAddToCart", "(Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCart;)V", "refreshWithScrollUp", "(Ljava/lang/String;Ljava/util/Map;)V", "refreshWithSaveScroll", "(LA00/e;Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "getCartEventsController", "()Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "getCartModeManager", "()Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "getCartNavigationService", "()Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "getFormattedRefreshUrl", "()Ljava/lang/String;", "formattedRefreshUrl", "getCartSelectModeClosePerAction", "()Z", "cartSelectModeClosePerAction", "Landroid/net/Uri;", "getRefreshUri", "()Landroid/net/Uri;", "refreshUri", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseCartOnScreenEventHandlerConfigurator extends AbstractCartConfigurator {

    @NotNull
    private final CartEventsController cartEventsController;

    @NotNull
    private final CartModeManager cartModeManager;

    @NotNull
    private final CartNavigationService cartNavigationService;

    @NotNull
    private final Handler handler;

    @NotNull
    private final e miniAppConfigHolder;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/configurator/base/BaseCartOnScreenEventHandlerConfigurator$Companion;", "", "<init>", "()V", "DEEPLINK_PREFIX", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BaseCartOnScreenEventHandlerConfigurator(@NotNull CartEventsController cartEventsController, @NotNull CartModeManager cartModeManager, @NotNull CartNavigationService cartNavigationService, @NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.cartEventsController = cartEventsController;
        this.cartModeManager = cartModeManager;
        this.cartNavigationService = cartNavigationService;
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final boolean getCartSelectModeClosePerAction() {
        return this.cartModeManager.enabledResetPerAction();
    }

    private final String getDeeplinkAuthority(String str) {
        return Uri.parse("ozon:/" + str).getAuthority();
    }

    private final String getFormattedRefreshUrl() {
        String uri = (getInstanceIsMainMiniApp() ? getRefreshUri() : getRefreshUri().buildUpon().appendQueryParameter("miniapp", getMiniAppName()).build()).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final RecyclerView getRecyclerView() {
        View view;
        View rootView;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView);
    }

    private final void handleBackToCart(CartRefreshReason.BackToCart event) {
        String pendingTab = this.cartNavigationService.getPendingTab();
        String currentTab = this.cartNavigationService.getCurrentTab();
        String str = (CartDeeplinkValidationRules.INSTANCE.isReserveCartTab(currentTab != null ? Uri.parse(currentTab) : null) && Intrinsics.d(pendingTab, currentTab) && MiniAppExtKt.isMain(this.miniAppConfigHolder)) ? currentTab : null;
        if (event.getIsScrollUp()) {
            refreshWithScrollUp$default(this, str, null, 2, null);
        } else {
            refreshWithSaveScroll$default(this, null, str, null, 5, null);
        }
    }

    private final void handleRemoveSplit(CartRefreshReason.RemoveCartSplit event) {
        Integer widgetKey = event.getWidgetKey();
        Integer offset = event.getOffset();
        if (offset == null || widgetKey == null) {
            refreshWithScrollUp(event.getLink(), event.getPostParams());
            return;
        }
        e.a aVar = new e.a();
        aVar.a(new BaseCartOnScreenEventHandlerConfigurator$handleRemoveSplit$1(widgetKey));
        aVar.e(false, true);
        aVar.d(offset.intValue());
        aVar.h();
        refreshWithSaveScroll(aVar.b(), event.getLink(), event.getPostParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onComposerInitialized$handleEvents(BaseCartOnScreenEventHandlerConfigurator baseCartOnScreenEventHandlerConfigurator, CartRefreshReason cartRefreshReason, d dVar) {
        baseCartOnScreenEventHandlerConfigurator.handleEvents(cartRefreshReason);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshWithSaveScroll$default(BaseCartOnScreenEventHandlerConfigurator baseCartOnScreenEventHandlerConfigurator, A00.e eVar, String str, Map map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshWithSaveScroll");
        }
        if ((i11 & 1) != 0) {
            eVar = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            map = null;
        }
        baseCartOnScreenEventHandlerConfigurator.refreshWithSaveScroll(eVar, str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshWithSaveScroll$lambda$0(A00.e eVar, BaseCartOnScreenEventHandlerConfigurator baseCartOnScreenEventHandlerConfigurator, String str, Map map) {
        if (eVar != null) {
            baseCartOnScreenEventHandlerConfigurator.saveScrollComposerRefresh(str, eVar, map);
            return;
        }
        RecyclerView recyclerView = baseCartOnScreenEventHandlerConfigurator.getRecyclerView();
        A00.e b11 = recyclerView != null ? M10.d.b(recyclerView) : null;
        if (b11 != null) {
            baseCartOnScreenEventHandlerConfigurator.saveScrollComposerRefresh(str, b11, map);
        } else {
            baseCartOnScreenEventHandlerConfigurator.refreshWithScrollUp(str, map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshWithScrollUp$default(BaseCartOnScreenEventHandlerConfigurator baseCartOnScreenEventHandlerConfigurator, String str, Map map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshWithScrollUp");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            map = null;
        }
        baseCartOnScreenEventHandlerConfigurator.refreshWithScrollUp(str, map);
    }

    private final void saveScrollComposerRefresh(String url, A00.e saveScrollParams, Map<String, ? extends Object> postParams) {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, url, postParams, null, new h.b(saveScrollParams), 4);
    }

    @NotNull
    protected abstract Uri getRefreshUri();

    protected final void handleAddToCart(@NotNull CartRefreshReason.AddToCart event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String screenDeeplink = event.getScreenDeeplink();
        if (Intrinsics.d(screenDeeplink != null ? getDeeplinkAuthority(screenDeeplink) : null, "recoms_in_cart")) {
            refreshWithScrollUp$default(this, null, null, 3, null);
        } else {
            refreshWithSaveScroll$default(this, null, null, null, 7, null);
        }
    }

    protected void handleCustomEvent(@NotNull CartRefreshReason event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    protected final boolean handleDefaultEvent(@NotNull CartRefreshReason event) {
        ComposerNavigator navigator;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof CartRefreshReason.BackToCart) {
            handleBackToCart((CartRefreshReason.BackToCart) event);
            return true;
        }
        if (event instanceof CartRefreshReason.BackToCartFromFamilyCart) {
            ConfiguratorReferences references = getReferences();
            if (references != null && (navigator = references.getNavigator()) != null) {
                navigator.navigate(new NavigateToRootCartDestination(true), 0);
            }
            return true;
        }
        if (event instanceof CartRefreshReason.RemoveCartSplit) {
            handleRemoveSplit((CartRefreshReason.RemoveCartSplit) event);
            return true;
        }
        if (event instanceof CartRefreshReason.BackToCartByAnchor) {
            refreshWithScrollUp$default(this, ((CartRefreshReason.BackToCartByAnchor) event).getLink(), null, 2, null);
            return true;
        }
        if ((event instanceof CartRefreshReason.MinCheckAddMore) || Intrinsics.d(event, CartRefreshReason.CancelOrder.INSTANCE)) {
            refreshWithScrollUp$default(this, null, null, 3, null);
            return true;
        }
        if (event instanceof CartRefreshReason.AddToCartFromAnotherTab) {
            refreshWithScrollUp$default(this, this.cartNavigationService.getPendingTab(), null, 2, null);
            CartNavigationService cartNavigationService = this.cartNavigationService;
            cartNavigationService.onRefreshed(cartNavigationService.getPendingTab());
            return true;
        }
        if ((event instanceof CartRefreshReason.CloseCartShareModal) || Intrinsics.d(event, CartRefreshReason.AppEnterForeground.INSTANCE) || Intrinsics.d(event, CartRefreshReason.RemoveRfbsSplit.INSTANCE) || Intrinsics.d(event, CartRefreshReason.CheckoutItemQuantityChanged.INSTANCE) || Intrinsics.d(event, CartRefreshReason.RemoveRestoreCartSplit.INSTANCE) || Intrinsics.d(event, CartRefreshReason.AddToCartFromFreshTab.INSTANCE)) {
            refreshWithSaveScroll$default(this, null, null, null, 7, null);
            return true;
        }
        if (!(event instanceof CartRefreshReason.AddressChanged)) {
            if (!(event instanceof CartRefreshReason.CartShared)) {
                return false;
            }
            if (getCartSelectModeClosePerAction()) {
                this.cartModeManager.setCartViewMode();
                refreshWithSaveScroll$default(this, null, null, null, 7, null);
            }
            return true;
        }
        if (!Intrinsics.d(this.cartNavigationService.getPendingTab(), this.cartNavigationService.getCurrentTab())) {
            refreshWithSaveScroll$default(this, null, this.cartNavigationService.getPendingTab(), null, 5, null);
            CartNavigationService cartNavigationService2 = this.cartNavigationService;
            cartNavigationService2.onRefreshed(cartNavigationService2.getPendingTab());
        } else if (!MiniAppExtKt.isMain(this.miniAppConfigHolder)) {
            refreshWithSaveScroll$default(this, null, null, null, 7, null);
        }
        return true;
    }

    protected final void handleEvents(@NotNull CartRefreshReason event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!getCurrentLifecycleState().a(AbstractC5434v.b.STARTED) || handleDefaultEvent(event)) {
            return;
        }
        handleCustomEvent(event);
    }

    @Override // ru.ozon.app.android.cart.configurator.base.AbstractCartConfigurator, ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        C2399j.C(new C2408n0(this.cartEventsController.getCartEventsSharedFlow(), new BaseCartOnScreenEventHandlerConfigurator$onComposerInitialized$1(this)), K.a(getOwner()));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.handler.removeCallbacksAndMessages(null);
    }

    protected final void refreshWithSaveScroll(final A00.e saveScrollParams, final String url, final Map<String, ? extends Object> postParams) {
        if (url == null) {
            url = getFormattedRefreshUrl();
        }
        this.handler.post(new Runnable() { // from class: Bn.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseCartOnScreenEventHandlerConfigurator.refreshWithSaveScroll$lambda$0(A00.e.this, this, url, postParams);
            }
        });
    }

    protected final void refreshWithScrollUp(String url, Map<String, ? extends Object> postParams) {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        if (url == null) {
            url = getFormattedRefreshUrl();
        }
        String str = url;
        e.a aVar = new e.a();
        aVar.g(0);
        InterfaceC7851b.a.a(controller, str, postParams, null, new h.b(aVar.b()), 4);
    }
}
