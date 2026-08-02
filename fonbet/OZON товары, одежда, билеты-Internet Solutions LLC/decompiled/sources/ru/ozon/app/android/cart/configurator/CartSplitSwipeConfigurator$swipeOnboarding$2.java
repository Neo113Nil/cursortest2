package ru.ozon.app.android.cart.configurator;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeOnboarding;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeOnboarding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitSwipeConfigurator$swipeOnboarding$2 extends AbstractC7737t implements Function0<SwipeOnboarding> {
    final /* synthetic */ CartSplitSwipeConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitSwipeConfigurator$swipeOnboarding$2(CartSplitSwipeConfigurator cartSplitSwipeConfigurator) {
        super(0);
        this.this$0 = cartSplitSwipeConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SwipeOnboarding invoke() {
        SharedPreferences sharedPreferences;
        SwipeViewModel swipeViewModel;
        sharedPreferences = this.this$0.getSharedPreferences();
        swipeViewModel = this.this$0.swipeViewModel;
        return new SwipeOnboarding(sharedPreferences, swipeViewModel != null ? swipeViewModel.getSwipeGroupCoordinator() : null);
    }
}
