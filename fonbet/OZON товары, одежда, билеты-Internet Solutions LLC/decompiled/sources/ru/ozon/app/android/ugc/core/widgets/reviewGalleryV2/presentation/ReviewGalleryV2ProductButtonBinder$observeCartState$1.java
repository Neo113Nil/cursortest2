package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.domain.CartState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ReviewGalleryV2ProductButtonBinder$observeCartState$1 extends C7735q implements Function1<CartState, Unit> {
    ReviewGalleryV2ProductButtonBinder$observeCartState$1(Object obj) {
        super(1, obj, ReviewGalleryV2ProductButtonBinder.class, "applyCartState", "applyCartState(Lru/ozon/app/android/cart/common/domain/CartState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartState cartState) {
        invoke2(cartState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartState p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ReviewGalleryV2ProductButtonBinder) this.receiver).applyCartState(p02);
    }
}
