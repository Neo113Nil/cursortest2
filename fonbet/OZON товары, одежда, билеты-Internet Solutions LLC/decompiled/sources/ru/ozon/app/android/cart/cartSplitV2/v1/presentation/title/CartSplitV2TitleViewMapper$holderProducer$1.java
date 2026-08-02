package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2TitleBinding;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartSplitV2TitleViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CartSplitV2TitleWidgetViewHolder> {
    final /* synthetic */ CartSplitV2TitleViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2TitleViewMapper$holderProducer$1(CartSplitV2TitleViewMapper cartSplitV2TitleViewMapper) {
        super(2);
        this.this$0 = cartSplitV2TitleViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CartSplitV2TitleWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetCartSplitV2TitleBinding bind = WidgetCartSplitV2TitleBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new CartSplitV2TitleWidgetViewHolder(bind, this.this$0.component().getTokenizedAnalytics(), ref, this.this$0.component().getCustomActionHandlersStoreFactory(), this.this$0.component().getCartEventsController());
    }
}
