package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemViewModel", f = "CartSplitV2CellItemViewModel.kt", l = {77}, m = "onTimerCompleted")
/* loaded from: classes11.dex */
final class CartSplitV2CellItemViewModel$onTimerCompleted$1 extends c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CartSplitV2CellItemViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2CellItemViewModel$onTimerCompleted$1(CartSplitV2CellItemViewModel cartSplitV2CellItemViewModel, d<? super CartSplitV2CellItemViewModel$onTimerCompleted$1> dVar) {
        super(dVar);
        this.this$0 = cartSplitV2CellItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object onTimerCompleted;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        onTimerCompleted = this.this$0.onTimerCompleted(0L, this);
        return onTimerCompleted;
    }
}
