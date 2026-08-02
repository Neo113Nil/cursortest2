package ru.ozon.app.android.cart.domain.delegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.models.CartInfoUpdate;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/models/CartInfoUpdate;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/models/CartInfoUpdate;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class UpdateCartOnStartDelegate$updateCartDisposable$2 extends AbstractC7737t implements Function1<CartInfoUpdate, Unit> {
    final /* synthetic */ UpdateCartOnStartDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateCartOnStartDelegate$updateCartDisposable$2(UpdateCartOnStartDelegate updateCartOnStartDelegate) {
        super(1);
        this.this$0 = updateCartOnStartDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartInfoUpdate cartInfoUpdate) {
        invoke2(cartInfoUpdate);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartInfoUpdate cartInfoUpdate) {
        CartEventsController cartEventsController;
        cartEventsController = this.this$0.cartEventsController;
        cartEventsController.handleEvent(CartRefreshReason.AppEnterForeground.INSTANCE);
    }
}
