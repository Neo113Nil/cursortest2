package ru.ozon.app.android.cart.configurator.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class BaseCartOnScreenEventHandlerConfigurator$onComposerInitialized$1 extends C7719a implements Function2<CartRefreshReason, d<? super Unit>, Object> {
    BaseCartOnScreenEventHandlerConfigurator$onComposerInitialized$1(Object obj) {
        super(2, obj, BaseCartOnScreenEventHandlerConfigurator.class, "handleEvents", "handleEvents(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartRefreshReason cartRefreshReason, d<? super Unit> dVar) {
        Object onComposerInitialized$handleEvents;
        onComposerInitialized$handleEvents = BaseCartOnScreenEventHandlerConfigurator.onComposerInitialized$handleEvents((BaseCartOnScreenEventHandlerConfigurator) this.receiver, cartRefreshReason, dVar);
        return onComposerInitialized$handleEvents;
    }
}
