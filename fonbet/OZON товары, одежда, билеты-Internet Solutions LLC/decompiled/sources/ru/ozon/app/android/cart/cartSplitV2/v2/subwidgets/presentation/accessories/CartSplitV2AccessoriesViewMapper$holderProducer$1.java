package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import Vg.d;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemAccessoriesBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartSplitV2AccessoriesViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CartSplitV2AccessoriesWidgetViewHolder> {
    final /* synthetic */ CartSplitV2AccessoriesViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2AccessoriesViewMapper$holderProducer$1(CartSplitV2AccessoriesViewMapper cartSplitV2AccessoriesViewMapper) {
        super(2);
        this.this$0 = cartSplitV2AccessoriesViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CartSplitV2AccessoriesWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetCartSplitV2ItemAccessoriesBinding bind = WidgetCartSplitV2ItemAccessoriesBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        FrameBinder frameBinder = this.this$0.component().getFrameBinder();
        B0 b11 = ref.getViewModelOwnerProvider().b();
        final CartSplitV2AccessoriesViewMapper cartSplitV2AccessoriesViewMapper = this.this$0;
        w0 a11 = new z0(b11, new z0.c() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddToCartViewModel addToCartViewModel = CartSplitV2AccessoriesViewMapper.this.component().getAddToCartViewModelProvider().get();
                Intrinsics.g(addToCartViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return addToCartViewModel;
            }
        }).a(AddToCartViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        AddToCartViewModel addToCartViewModel = (AddToCartViewModel) a11;
        B0 a12 = ref.getViewModelOwnerProvider().a();
        final CartSplitV2AccessoriesViewMapper cartSplitV2AccessoriesViewMapper2 = this.this$0;
        w0 a13 = new z0(a12, new z0.c() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AccessoriesViewModelV2 accessoriesViewModelV2 = CartSplitV2AccessoriesViewMapper.this.component().getAccessoriesViewModelProvider().get();
                Intrinsics.g(accessoriesViewModelV2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return accessoriesViewModelV2;
            }
        }).a(AccessoriesViewModelV2.class);
        Intrinsics.checkNotNullExpressionValue(a13, "viewModel(...)");
        return new CartSplitV2AccessoriesWidgetViewHolder(bind, addToCartViewModel, (AccessoriesViewModelV2) a13, ref, frameBinder, customActionHandlersStoreFactory);
    }
}
