package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5State;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ViewModel$showTooltip$1", f = "CartButtonV5ViewModel.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CartButtonV5ViewModel$showTooltip$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirst;
    final /* synthetic */ boolean $isSecond;
    final /* synthetic */ CartButtonV5DTO.CartButton.Button.Tooltip $tooltip;
    int label;
    final /* synthetic */ CartButtonV5ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ViewModel$showTooltip$1(CartButtonV5DTO.CartButton.Button.Tooltip tooltip, CartButtonV5ViewModel cartButtonV5ViewModel, boolean z11, boolean z12, d<? super CartButtonV5ViewModel$showTooltip$1> dVar) {
        super(2, dVar);
        this.$tooltip = tooltip;
        this.this$0 = cartButtonV5ViewModel;
        this.$isFirst = z11;
        this.$isSecond = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartButtonV5ViewModel$showTooltip$1(this.$tooltip, this.this$0, this.$isFirst, this.$isSecond, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BroadcastSingleLiveEvent broadcastSingleLiveEvent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long tooltipDelay = this.$tooltip.getTooltipDelay();
            this.label = 1;
            if (Y.b(tooltipDelay, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        broadcastSingleLiveEvent = this.this$0._action;
        broadcastSingleLiveEvent.postValue(new CartButtonV5State.ShowTooltip(this.$isFirst, this.$isSecond));
        this.this$0.onTooltipShown(this.$tooltip.getTooltipKey());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartButtonV5ViewModel$showTooltip$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
