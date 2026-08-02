package ru.ozon.app.android.cart.ui.tab;

import BZ.e;
import GZ.g;
import Sc.o;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.delegate.ResolveCartTabNavigationActionUseCase;
import ru.ozon.app.android.cart.common.domain.delegate.model.CartNavigationAction;
import ru.ozon.app.android.cart.ui.customActionHandler.navigateToRootCart.NavigateToRootCartDestination;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/ui/tab/CartTabUiController;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "LGZ/g;", "router", "Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;", "cartTabNavigationActionUseCase", "Lkotlin/Function0;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LBZ/e;", "miniAppConfigHolder", "<init>", "(Landroidx/fragment/app/m;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;LGZ/g;Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;Lkotlin/jvm/functions/Function0;LBZ/e;)V", "", "onInit", "()V", "", "wasTheSame", "onTabSelected", "(Z)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "LGZ/g;", "Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;", "Lkotlin/jvm/functions/Function0;", "LBZ/e;", "Lxe/B0;", "job", "Lxe/B0;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartTabUiController extends TabUiController {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final ResolveCartTabNavigationActionUseCase cartTabNavigationActionUseCase;
    private B0 job;

    @NotNull
    private final e miniAppConfigHolder;

    @NotNull
    private final Function0<ComposerNavigator> navigator;

    @NotNull
    private final g router;

    @NotNull
    private final TeensModeService teensModeService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CartTabUiController(@NotNull ComponentCallbacksC5392m fragment, @NotNull CartService cartService, @NotNull TeensModeService teensModeService, @NotNull g router, @NotNull ResolveCartTabNavigationActionUseCase cartTabNavigationActionUseCase, @NotNull Function0<? extends ComposerNavigator> navigator, @NotNull e miniAppConfigHolder) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(cartTabNavigationActionUseCase, "cartTabNavigationActionUseCase");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.cartService = cartService;
        this.teensModeService = teensModeService;
        this.router = router;
        this.cartTabNavigationActionUseCase = cartTabNavigationActionUseCase;
        this.navigator = navigator;
        this.miniAppConfigHolder = miniAppConfigHolder;
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onInit() {
        super.onInit();
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        J viewLifecycleOwner = getFragment().getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.job = C10727i.c(K.a(viewLifecycleOwner), null, null, new CartTabUiController$onInit$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onTabSelected(boolean wasTheSame) {
        super.onTabSelected(wasTheSame);
        if (Intrinsics.d(this.miniAppConfigHolder.g().b(), "main")) {
            CartNavigationAction resolve = this.cartTabNavigationActionUseCase.resolve();
            if (resolve instanceof CartNavigationAction.OpenRootCart) {
                this.navigator.invoke().navigate(new NavigateToRootCartDestination(true), 0);
            } else if (resolve instanceof CartNavigationAction.OpenDeeplink) {
                g.a.a(this.router, ((CartNavigationAction.OpenDeeplink) resolve).getDeeplink(), null, null, 6);
            } else if (!(resolve instanceof CartNavigationAction.EmptyAction)) {
                throw new o();
            }
        }
    }
}
