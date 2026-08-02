package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.views.CartSplitHeaderView;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartSplitV2HeaderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CartSplitV2HeaderWidgetViewHolder> {
    final /* synthetic */ CartSplitV2HeaderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2HeaderViewMapper$holderProducer$1(CartSplitV2HeaderViewMapper cartSplitV2HeaderViewMapper) {
        super(2);
        this.this$0 = cartSplitV2HeaderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CartSplitV2HeaderWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        return new CartSplitV2HeaderWidgetViewHolder((CartSplitHeaderView) view, this.this$0.component().getTokenizedAnalytics(), ref, this.this$0.component().getCustomActionHandlersStoreFactory(), this.this$0.component().getCartEventsController(), this.this$0.component().getFrameBinder(), this.this$0.component().getAsyncCartViewModelProvider().get(ref));
    }
}
