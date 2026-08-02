package ru.ozon.app.android.pdp.widgets.outofstock.di;

import GV.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockViewModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/di/OutOfStockComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockViewModel;", "getPViewModel", "()Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockViewModel;", "pViewModel", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OutOfStockComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/di/OutOfStockComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/outofstock/di/OutOfStockComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "createComponent", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OutOfStockComponent createComponent$lambda$0(final C7475g c7475g) {
            return new OutOfStockComponent() { // from class: ru.ozon.app.android.pdp.widgets.outofstock.di.OutOfStockComponent$Companion$createComponent$1$1
                @Override // ru.ozon.app.android.pdp.widgets.outofstock.di.OutOfStockComponent
                public CartService getCartService() {
                    return getCartServiceApi().getCartService();
                }

                public final CartServiceApi getCartServiceApi() {
                    return (CartServiceApi) C7475g.this.getComponent(CartServiceApi.class);
                }

                @Override // ru.ozon.app.android.pdp.widgets.outofstock.di.OutOfStockComponent
                public OutOfStockViewModel getPViewModel() {
                    return new OutOfStockViewModel(getCartServiceApi().getCartService());
                }
            };
        }

        @NotNull
        public final C7473e<OutOfStockComponent> createComponent(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(OutOfStockComponent.class), new a(storage, 7));
        }
    }

    @NotNull
    CartService getCartService();

    @NotNull
    OutOfStockViewModel getPViewModel();
}
