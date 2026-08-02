package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.viewHolder;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.util.CollapseAnimationHelper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.view.CartCellItemView;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.viewHolder.timer.TimerState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "timerState", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.viewHolder.CartSplitV2CellItemViewHolder$setupTimerStateListener$1", f = "CartSplitV2CellItemViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartSplitV2CellItemViewHolder$setupTimerStateListener$1 extends j implements Function2<TimerState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartSplitV2CellItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2CellItemViewHolder$setupTimerStateListener$1(CartSplitV2CellItemViewHolder cartSplitV2CellItemViewHolder, d<? super CartSplitV2CellItemViewHolder$setupTimerStateListener$1> dVar) {
        super(2, dVar);
        this.this$0 = cartSplitV2CellItemViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartSplitV2CellItemViewHolder$setupTimerStateListener$1 cartSplitV2CellItemViewHolder$setupTimerStateListener$1 = new CartSplitV2CellItemViewHolder$setupTimerStateListener$1(this.this$0, dVar);
        cartSplitV2CellItemViewHolder$setupTimerStateListener$1.L$0 = obj;
        return cartSplitV2CellItemViewHolder$setupTimerStateListener$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartCellItemView cartCellItemView;
        CollapseAnimationHelper collapseAnimationHelper;
        CartCellItemView cartCellItemView2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TimerState timerState = (TimerState) this.L$0;
        if (timerState instanceof TimerState.AnimationRequested) {
            cartCellItemView = this.this$0.view;
            if (cartCellItemView.isAttachedToWindow() && !((TimerState.AnimationRequested) timerState).getIsLast()) {
                collapseAnimationHelper = this.this$0.animationHelper;
                cartCellItemView2 = this.this$0.view;
                CollapseAnimationHelper.collapse$default(collapseAnimationHelper, cartCellItemView2, null, 2, null);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TimerState timerState, d<? super Unit> dVar) {
        return ((CartSplitV2CellItemViewHolder$setupTimerStateListener$1) create(timerState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
