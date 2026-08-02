package ru.ozon.app.android.fresh.main.ui.atoms.cartPrice;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceFreshView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartPriceFreshHolder$onBind$1$2 extends AbstractC7737t implements Function1<CartPriceFreshView, Unit> {
    final /* synthetic */ CartPriceFreshHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartPriceFreshHolder$onBind$1$2(CartPriceFreshHolder cartPriceFreshHolder) {
        super(1);
        this.this$0 = cartPriceFreshHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartPriceFreshView cartPriceFreshView) {
        invoke2(cartPriceFreshView);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartPriceFreshView it) {
        AtomAction clickAction;
        Intrinsics.checkNotNullParameter(it, "it");
        CartPriceFreshHolder cartPriceFreshHolder = this.this$0;
        clickAction = cartPriceFreshHolder.getClickAction((CartPriceFreshAtom) cartPriceFreshHolder.getData(), "minusButtonClick");
        cartPriceFreshHolder.handleAction(clickAction);
    }
}
