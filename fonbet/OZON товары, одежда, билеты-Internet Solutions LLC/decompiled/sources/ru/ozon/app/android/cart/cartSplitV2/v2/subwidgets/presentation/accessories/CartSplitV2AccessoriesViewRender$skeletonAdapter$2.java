package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesSkeletonAdapter;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemAccessoriesBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2AccessoriesViewRender$skeletonAdapter$2 extends AbstractC7737t implements Function0<AccessoriesSkeletonAdapter> {
    final /* synthetic */ CartSplitV2AccessoriesViewRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2AccessoriesViewRender$skeletonAdapter$2(CartSplitV2AccessoriesViewRender cartSplitV2AccessoriesViewRender) {
        super(0);
        this.this$0 = cartSplitV2AccessoriesViewRender;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AccessoriesSkeletonAdapter invoke() {
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding;
        widgetCartSplitV2ItemAccessoriesBinding = this.this$0.binding;
        Context context = widgetCartSplitV2ItemAccessoriesBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new AccessoriesSkeletonAdapter(context);
    }
}
