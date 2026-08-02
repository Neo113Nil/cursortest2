package ru.ozon.app.android.cart.ui.cartActionProcessor;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.domain.NotificationDelegate;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/domain/NotificationDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartActionsProcessorConfigurator$notification$2 extends AbstractC7737t implements Function0<NotificationDelegate> {
    final /* synthetic */ a<AddToCartViewModel> $addToCartProvider;
    final /* synthetic */ CartActionsProcessorConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartActionsProcessorConfigurator$notification$2(CartActionsProcessorConfigurator cartActionsProcessorConfigurator, a<AddToCartViewModel> aVar) {
        super(0);
        this.this$0 = cartActionsProcessorConfigurator;
        this.$addToCartProvider = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationDelegate invoke() {
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references != null) {
            return new NotificationDelegate(references, this.$addToCartProvider);
        }
        throw new IllegalStateException("Composer is not initialized");
    }
}
