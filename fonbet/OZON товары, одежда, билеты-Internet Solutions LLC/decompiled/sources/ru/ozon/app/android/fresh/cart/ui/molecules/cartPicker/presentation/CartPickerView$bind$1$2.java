package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CartPickerView$bind$1$2 extends C7735q implements Function2<CartPickerView, CartPickerVO, Unit> {
    CartPickerView$bind$1$2(Object obj) {
        super(2, obj, CartPickerView.CartPickerListeners.class, "onMinusClickListener", "onMinusClickListener(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CartPickerView cartPickerView, CartPickerVO cartPickerVO) {
        invoke2(cartPickerView, cartPickerVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartPickerView p02, CartPickerVO cartPickerVO) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CartPickerView.CartPickerListeners) this.receiver).onMinusClickListener(p02, cartPickerVO);
    }
}
