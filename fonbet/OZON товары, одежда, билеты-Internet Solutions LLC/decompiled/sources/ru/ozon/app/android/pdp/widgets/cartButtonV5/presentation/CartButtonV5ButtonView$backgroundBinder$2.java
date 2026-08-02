package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonBackgroundBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5ButtonView$backgroundBinder$2 extends AbstractC7737t implements Function0<CartButtonV5ButtonBackgroundBinder> {
    final /* synthetic */ CartButtonV5ButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ButtonView$backgroundBinder$2(CartButtonV5ButtonView cartButtonV5ButtonView) {
        super(0);
        this.this$0 = cartButtonV5ButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CartButtonV5ButtonBackgroundBinder invoke() {
        CartButtonV5Configuration cartButtonV5Configuration;
        CartButtonV5ButtonView cartButtonV5ButtonView = this.this$0;
        cartButtonV5Configuration = cartButtonV5ButtonView.configuration;
        return new CartButtonV5ButtonBackgroundBinder(cartButtonV5ButtonView, cartButtonV5Configuration);
    }
}
