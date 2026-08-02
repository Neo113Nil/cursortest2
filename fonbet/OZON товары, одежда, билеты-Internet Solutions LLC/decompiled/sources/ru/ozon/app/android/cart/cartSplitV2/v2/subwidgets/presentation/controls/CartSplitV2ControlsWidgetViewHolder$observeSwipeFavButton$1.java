package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "groupId", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1", f = "CartSplitV2ControlsWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartSplitV2ControlsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder, d<? super CartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1> dVar) {
        super(2, dVar);
        this.this$0 = cartSplitV2ControlsWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1 cartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1 = new CartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1(this.this$0, dVar);
        cartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1.L$0 = obj;
        return cartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BaseSwipeableWrapperView baseSwipeableWrapperView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (Intrinsics.d((String) this.L$0, this.this$0.getSwipeGroupId())) {
            baseSwipeableWrapperView = this.this$0.containerView;
            baseSwipeableWrapperView.getFavButton().revertAndRebindViewState();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((CartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
