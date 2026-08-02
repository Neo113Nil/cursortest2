package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.di;

import EV.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper.CartSplitV2CellItemMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemViewModel;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/di/CartSplitV2CellItemWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2CellItemMapper;", "getMapper", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2CellItemMapper;", "mapper", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemViewModel;", "getViewModel", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemViewModel;", "viewModel", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartSplitV2CellItemWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/di/CartSplitV2CellItemWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/di/CartSplitV2CellItemWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CartSplitV2CellItemWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new CartSplitV2CellItemWidgetComponent() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.di.CartSplitV2CellItemWidgetComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(CartSplitV2CellItemWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final RetainComposerComponentApi retainComposerComponentApi;

                {
                    this.retainComposerComponentApi = (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                }

                public CartEventsController getCartEventsController() {
                    return ((CartComponentApi) C7475g.this.getComponent(CartComponentApi.class)).getCartEventsController();
                }

                @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.di.CartSplitV2CellItemWidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.di.CartSplitV2CellItemWidgetComponent
                public FrameBinder getFrameBinder() {
                    return ((RetainComposerPerformanceComponentApi) C7475g.this.getComponent(RetainComposerPerformanceComponentApi.class)).getFrameBinder();
                }

                @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.di.CartSplitV2CellItemWidgetComponent
                public CartSplitV2CellItemMapper getMapper() {
                    return (CartSplitV2CellItemMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.di.CartSplitV2CellItemWidgetComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.di.CartSplitV2CellItemWidgetComponent
                public CartSplitV2CellItemViewModel getViewModel() {
                    return new CartSplitV2CellItemViewModel(this.retainComposerComponentApi.getComposerController(), getCartEventsController());
                }
            };
        }

        @NotNull
        public final C7473e<CartSplitV2CellItemWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CartSplitV2CellItemWidgetComponent.class), new a(storage, 12));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    CartSplitV2CellItemMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    CartSplitV2CellItemViewModel getViewModel();
}
