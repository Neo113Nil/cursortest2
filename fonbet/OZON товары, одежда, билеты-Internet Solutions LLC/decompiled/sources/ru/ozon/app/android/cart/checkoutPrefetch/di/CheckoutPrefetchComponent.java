package ru.ozon.app.android.cart.checkoutPrefetch.di;

import FD.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.checkoutPrefetch.presentation.viewModel.CheckoutPrefetchViewModel;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/checkoutPrefetch/di/CheckoutPrefetchComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cart/checkoutPrefetch/presentation/viewModel/CheckoutPrefetchViewModel;", "getViewModel", "()Lru/ozon/app/android/cart/checkoutPrefetch/presentation/viewModel/CheckoutPrefetchViewModel;", "viewModel", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CheckoutPrefetchComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/checkoutPrefetch/di/CheckoutPrefetchComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cart/checkoutPrefetch/di/CheckoutPrefetchComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CheckoutPrefetchComponent create$lambda$0(final C7475g c7475g) {
            return new CheckoutPrefetchComponent(c7475g) { // from class: ru.ozon.app.android.cart.checkoutPrefetch.di.CheckoutPrefetchComponent$Companion$create$1$1
                private final CartServiceApi cartServiceApi;
                private final CheckoutPrefetchApi checkoutPrefetchApi;
                private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
                private final CheckoutPrefetchViewModel viewModel;

                {
                    this.checkoutPrefetchApi = (CheckoutPrefetchApi) c7475g.getComponent(CheckoutPrefetchApi.class);
                    this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
                    this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
                    CheckoutPrefetchViewModel viewModel$lambda$0 = viewModel$lambda$0(this);
                    Intrinsics.checkNotNullExpressionValue(viewModel$lambda$0, "get(...)");
                    this.viewModel = viewModel$lambda$0;
                }

                private static final CheckoutPrefetchViewModel viewModel$lambda$0(CheckoutPrefetchComponent$Companion$create$1$1 checkoutPrefetchComponent$Companion$create$1$1) {
                    return new CheckoutPrefetchViewModel(checkoutPrefetchComponent$Companion$create$1$1.cartServiceApi.getCartService(), checkoutPrefetchComponent$Companion$create$1$1.checkoutPrefetchApi.getCheckoutPrefetchController(), checkoutPrefetchComponent$Companion$create$1$1.composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository());
                }

                @Override // ru.ozon.app.android.cart.checkoutPrefetch.di.CheckoutPrefetchComponent
                public CheckoutPrefetchViewModel getViewModel() {
                    return this.viewModel;
                }
            };
        }

        @NotNull
        public final C7473e<CheckoutPrefetchComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CheckoutPrefetchComponent.class), new a(storage, 7));
        }
    }

    @NotNull
    CheckoutPrefetchViewModel getViewModel();
}
