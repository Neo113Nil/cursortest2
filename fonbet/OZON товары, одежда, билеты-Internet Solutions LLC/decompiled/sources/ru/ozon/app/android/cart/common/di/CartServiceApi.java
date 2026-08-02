package ru.ozon.app.android.cart.common.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.delegate.CartChangeChecker;
import ru.ozon.app.android.cart.common.domain.delegate.CartItemsChecker;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder;
import ru.ozon.app.android.cart.common.domain.delegate.ResolveCartTabNavigationActionUseCase;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "getCartNavigationService", "()Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;", "getResolveCartTabNavigationActionUseCase", "()Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "getCartScreenStateHolder", "()Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;", "getCartChangeChecker", "()Lru/ozon/app/android/cart/common/domain/delegate/CartChangeChecker;", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "getCartPrefetchController", "()Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "Lru/ozon/app/android/cart/common/domain/delegate/CartItemsChecker;", "getCartItemsChecker", "()Lru/ozon/app/android/cart/common/domain/delegate/CartItemsChecker;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "getCartModeService", "()Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartServiceApi extends InterfaceC6958a {
    @NotNull
    AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider();

    @NotNull
    CartChangeChecker getCartChangeChecker();

    @NotNull
    CartItemsChecker getCartItemsChecker();

    @NotNull
    CartModeManager getCartModeService();

    @NotNull
    CartNavigationService getCartNavigationService();

    @NotNull
    CartPrefetchController getCartPrefetchController();

    @NotNull
    CartScreenStateHolder getCartScreenStateHolder();

    @NotNull
    CartService getCartService();

    @NotNull
    ResolveCartTabNavigationActionUseCase getResolveCartTabNavigationActionUseCase();
}
