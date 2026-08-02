package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import BZ.f;
import Vg.d;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view.CartSplitControlsView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartSplitV2ControlsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CartSplitV2ControlsWidgetViewHolder> {
    final /* synthetic */ CartSplitV2ControlsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ControlsViewMapper$holderProducer$1(CartSplitV2ControlsViewMapper cartSplitV2ControlsViewMapper) {
        super(2);
        this.this$0 = cartSplitV2ControlsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CartSplitV2ControlsWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        BaseSwipeableWrapperView baseSwipeableWrapperView = (BaseSwipeableWrapperView) view;
        View contentView = baseSwipeableWrapperView.getContentView();
        Intrinsics.g(contentView, "null cannot be cast to non-null type ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view.CartSplitControlsView");
        CartSplitControlsView cartSplitControlsView = (CartSplitControlsView) contentView;
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final CartSplitV2ControlsViewMapper cartSplitV2ControlsViewMapper = this.this$0;
        SwipeViewModel swipeViewModel = (SwipeViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SwipeViewModel swipeViewModel2 = CartSplitV2ControlsViewMapper.this.component().getSwipeViewModel();
                Intrinsics.g(swipeViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return swipeViewModel2;
            }
        }).a(SwipeViewModel.class);
        FavoriteProductDelegate favoriteProductDelegate = this.this$0.component().getFavProductMoleculeDelegateProvider().get(ref);
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        CartThrottleNotificationHandler cartThrottleNotificationHandler = this.this$0.component().getCartThrottleNotificationHandler();
        return new CartSplitV2ControlsWidgetViewHolder(baseSwipeableWrapperView, cartSplitControlsView, ref, favoriteProductDelegate, this.this$0.component().getFavProductMoleculeDelegateProvider().provideV4Delegate(ref, this.this$0.component().getTokenizedAnalytics()), customActionHandlersStoreFactory, !Intrinsics.d(f.a(this.this$0.component().getMiniAppConfigHolder()), "supermarket"), this.this$0.component().getAppType(), swipeViewModel.getSwipeGroupCoordinator(), swipeViewModel, this.this$0.component().getFrameBinder(), cartThrottleNotificationHandler, this.this$0.component().getAsyncCartViewModelProvider().get(ref));
    }
}
