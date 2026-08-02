package ru.ozon.app.android.initializers.auth.commands;

import Mc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.cart.common.data.prefetch.state.CartPrefetchState;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.initializers.auth.commands.CartAuthStateCommand;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.utils.rx.RxExtKt;
import uc.i;
import vc.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/CartAuthStateCommand;", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "updateCart", "()V", "", "isAuth", "onChange", "(Z)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$Authentication;", "prefetchState", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$Authentication;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartAuthStateCommand extends AuthStateCommand {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final CartPrefetchState.Authentication prefetchState;

    public CartAuthStateCommand(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        this.disposables = new C8486a();
        this.prefetchState = CartPrefetchState.Authentication.INSTANCE;
    }

    private final void updateCart() {
        C8486a c8486a = this.disposables;
        p k11 = CartService.DefaultImpls.updateCart$default(this.cartService, this.prefetchState, null, 2, null).k(a.b());
        i iVar = new i(new GJ.a(new CartAuthStateCommand$updateCart$2(BxLogger.INSTANCE), 2), new InterfaceC9019a() { // from class: Sy.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                CartAuthStateCommand.updateCart$lambda$0();
            }
        });
        k11.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCart$lambda$0() {
    }

    @Override // ru.ozon.app.android.initializers.auth.commands.AuthStateCommand
    public void onChange(boolean isAuth) {
        if (!isAuth) {
            this.cartService.clearCart(this.prefetchState);
        } else {
            this.disposables.d();
            updateCart();
        }
    }
}
