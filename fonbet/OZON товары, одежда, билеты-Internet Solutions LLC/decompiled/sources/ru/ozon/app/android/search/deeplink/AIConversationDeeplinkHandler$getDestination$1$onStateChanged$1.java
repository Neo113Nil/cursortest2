package ru.ozon.app.android.search.deeplink;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.models.CartAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class AIConversationDeeplinkHandler$getDestination$1$onStateChanged$1 extends C7735q implements Function1<CartAction, Unit> {
    AIConversationDeeplinkHandler$getDestination$1$onStateChanged$1(Object obj) {
        super(1, obj, AIConversationDeeplinkHandler.class, "handleCartAction", "handleCartAction(Lru/ozon/app/android/cart/common/models/CartAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartAction cartAction) {
        invoke2(cartAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AIConversationDeeplinkHandler) this.receiver).handleCartAction(p02);
    }
}
