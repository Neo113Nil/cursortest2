package ru.ozon.app.android.cart.domain.delegate;

import AF.a;
import Ae.B0;
import Fn.C3055d;
import Ge.l;
import He.b;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.data.prefetch.state.CartPrefetchState;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.ResetCartModesReason;
import ru.ozon.app.android.cart.common.models.CartInfoUpdate;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import sc.C9656b;
import xe.C10720e0;
import yc.C10880a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/domain/delegate/UpdateCartOnStartDelegate;", "", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;)V", "Lnc/b;", "updateCartDisposable", "()Lnc/b;", "", "init", "()V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateCartOnStartDelegate {

    @NotNull
    private final CartEventsController cartEventsController;

    @NotNull
    private final CartModeManager cartModeManager;

    @NotNull
    private final CartService cartService;

    public UpdateCartOnStartDelegate(@NotNull CartService cartService, @NotNull CartEventsController cartEventsController, @NotNull CartModeManager cartModeManager) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        this.cartService = cartService;
        this.cartEventsController = cartEventsController;
        this.cartModeManager = cartModeManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8487b updateCartDisposable() {
        int i11 = 2;
        AbstractC7094b updateCart$default = CartService.DefaultImpls.updateCart$default(this.cartService, CartPrefetchState.CartUpdate.INSTANCE, null, 2, null);
        B0<CartInfoUpdate> cartInfoUpdateSharedFlow = this.cartService.getCartInfoUpdateSharedFlow();
        C10720e0 c10720e0 = C10720e0.f105451a;
        p take = p.create(new l(cartInfoUpdateSharedFlow, b.f10879b)).take(1L);
        updateCart$default.getClass();
        C9656b.c(take, "next is null");
        InterfaceC8487b subscribe = new C10880a(updateCart$default, take).filter(new a(UpdateCartOnStartDelegate$updateCartDisposable$1.INSTANCE, i11)).subscribeOn(Mc.a.b()).subscribe(new AF.b(new UpdateCartOnStartDelegate$updateCartDisposable$2(this), i11), new C3055d(new UpdateCartOnStartDelegate$updateCartDisposable$3(Lm0.a.f17149a), 1));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        return subscribe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateCartDisposable$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    public final void init() {
        ProcessLifecycleOwner processLifecycleOwner;
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.cart.domain.delegate.UpdateCartOnStartDelegate$init$1
            private boolean appStart = true;
            private InterfaceC8487b disposable;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                CartModeManager cartModeManager;
                InterfaceC8487b updateCartDisposable;
                Intrinsics.checkNotNullParameter(owner, "owner");
                cartModeManager = UpdateCartOnStartDelegate.this.cartModeManager;
                cartModeManager.resetCartModes(ResetCartModesReason.START_APP);
                if (this.appStart) {
                    this.appStart = false;
                    return;
                }
                InterfaceC8487b interfaceC8487b = this.disposable;
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
                updateCartDisposable = UpdateCartOnStartDelegate.this.updateCartDisposable();
                this.disposable = updateCartDisposable;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                InterfaceC8487b interfaceC8487b = this.disposable;
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
            }
        });
    }
}
