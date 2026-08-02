package ru.ozon.app.android.cart.ui.cartActionProcessor;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cart.common.models.CartAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class CartActionsProcessorConfigurator$onComposerInitialized$1 extends C7719a implements Function2<CartAction, d<? super Unit>, Object> {
    CartActionsProcessorConfigurator$onComposerInitialized$1(Object obj) {
        super(2, obj, CartActionsProcessorConfigurator.class, "observeActions", "observeActions(Lru/ozon/app/android/cart/common/models/CartAction;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartAction cartAction, d<? super Unit> dVar) {
        Object onComposerInitialized$observeActions;
        onComposerInitialized$observeActions = CartActionsProcessorConfigurator.onComposerInitialized$observeActions((CartActionsProcessorConfigurator) this.receiver, cartAction, dVar);
        return onComposerInitialized$observeActions;
    }
}
