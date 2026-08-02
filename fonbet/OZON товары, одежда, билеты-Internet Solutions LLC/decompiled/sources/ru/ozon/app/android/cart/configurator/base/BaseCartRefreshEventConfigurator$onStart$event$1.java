package ru.ozon.app.android.cart.configurator.base;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class BaseCartRefreshEventConfigurator$onStart$event$1 extends C7735q implements Function1<CartRefreshReason, Boolean> {
    BaseCartRefreshEventConfigurator$onStart$event$1(Object obj) {
        super(1, obj, BaseCartRefreshEventConfigurator.class, "isAddToCartRefreshReason", "isAddToCartRefreshReason(Lru/ozon/app/android/cart/common/domain/CartRefreshReason;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CartRefreshReason cartRefreshReason) {
        return Boolean.valueOf(((BaseCartRefreshEventConfigurator) this.receiver).isAddToCartRefreshReason(cartRefreshReason));
    }
}
