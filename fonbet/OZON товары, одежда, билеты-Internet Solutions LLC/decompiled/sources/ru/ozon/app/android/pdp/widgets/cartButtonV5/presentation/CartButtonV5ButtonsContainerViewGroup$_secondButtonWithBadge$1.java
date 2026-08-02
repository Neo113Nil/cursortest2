package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5WithBadgeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5ButtonsContainerViewGroup$_secondButtonWithBadge$1 extends AbstractC7737t implements Function0<CartButtonV5WithBadgeView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CartButtonV5ButtonsContainerViewGroup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ButtonsContainerViewGroup$_secondButtonWithBadge$1(Context context, CartButtonV5ButtonsContainerViewGroup cartButtonV5ButtonsContainerViewGroup) {
        super(0);
        this.$context = context;
        this.this$0 = cartButtonV5ButtonsContainerViewGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CartButtonV5WithBadgeView invoke() {
        CartButtonV5Configuration cartButtonV5Configuration;
        Context context = this.$context;
        cartButtonV5Configuration = this.this$0.buttonConfiguration;
        return new CartButtonV5WithBadgeView(context, cartButtonV5Configuration, false);
    }
}
