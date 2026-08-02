package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemViewModel$startTimerIfNotStarted$timerJob$1", f = "CartSplitV2CellItemViewModel.kt", l = {59, 60}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartSplitV2CellItemViewModel$startTimerIfNotStarted$timerJob$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ CartSplitV2CellItemViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2CellItemViewModel$startTimerIfNotStarted$timerJob$1(CartSplitV2CellItemViewModel cartSplitV2CellItemViewModel, d<? super CartSplitV2CellItemViewModel$startTimerIfNotStarted$timerJob$1> dVar) {
        super(2, dVar);
        this.this$0 = cartSplitV2CellItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartSplitV2CellItemViewModel$startTimerIfNotStarted$timerJob$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (xe.Y.b(r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j11;
        long j12;
        Object onTimerCompleted;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            j11 = this.this$0.configuredTimerDurationMs;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        CartSplitV2CellItemViewModel cartSplitV2CellItemViewModel = this.this$0;
        j12 = cartSplitV2CellItemViewModel.configuredAnimationDuration;
        this.label = 2;
        onTimerCompleted = cartSplitV2CellItemViewModel.onTimerCompleted(j12, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartSplitV2CellItemViewModel$startTimerIfNotStarted$timerJob$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
