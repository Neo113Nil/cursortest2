package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "cart", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartQuantViewModel$updateCart$2 extends AbstractC7737t implements Function1<CartAddItemDTO, Unit> {
    final /* synthetic */ AtomAction $additionalAction;
    final /* synthetic */ Boolean $forStars;
    final /* synthetic */ CartQuantViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartQuantViewModel$updateCart$2(AtomAction atomAction, Boolean bool, CartQuantViewModel cartQuantViewModel) {
        super(1);
        this.$additionalAction = atomAction;
        this.$forStars = bool;
        this.this$0 = cartQuantViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartAddItemDTO cartAddItemDTO) {
        invoke2(cartAddItemDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartAddItemDTO cartAddItemDTO) {
        SingleLiveEvent singleLiveEvent;
        AtomAction atomAction = this.$additionalAction;
        if (atomAction != null) {
            singleLiveEvent = this.this$0._action;
            singleLiveEvent.setValue(new CartQuantViewModel.Action.DoAction(atomAction));
        }
        if (Intrinsics.d(this.$forStars, Boolean.TRUE) && cartAddItemDTO.getSuccess()) {
            this.this$0.handleLastCartState(true);
        }
    }
}
