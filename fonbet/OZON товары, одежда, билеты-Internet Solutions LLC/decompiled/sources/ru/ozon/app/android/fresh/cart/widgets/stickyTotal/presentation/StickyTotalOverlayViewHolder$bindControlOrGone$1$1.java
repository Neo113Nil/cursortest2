package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class StickyTotalOverlayViewHolder$bindControlOrGone$1$1 extends C7735q implements Function1<CartPickerVO, Unit> {
    StickyTotalOverlayViewHolder$bindControlOrGone$1$1(Object obj) {
        super(1, obj, StickyTotalOverlayViewHolder.class, "countPickerUpdate", "countPickerUpdate(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartPickerVO cartPickerVO) {
        invoke2(cartPickerVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartPickerVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((StickyTotalOverlayViewHolder) this.receiver).countPickerUpdate(p02);
    }
}
