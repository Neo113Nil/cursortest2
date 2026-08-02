package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder$createListeners$1$1$onPlusClickListener$1$1", f = "CartPickerBinder.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CartPickerBinder$createListeners$1$1$onPlusClickListener$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function2<CartPickerBinder.CartPickerActionType, CartPickerVO, Unit> $actionHandler;
    final /* synthetic */ CartPickerVO $newVO;
    final /* synthetic */ int $quantityCount;
    final /* synthetic */ CartPickerVO.QuantityControl.ChangeQuantity $this_with;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartPickerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartPickerBinder$createListeners$1$1$onPlusClickListener$1$1(CartPickerVO.QuantityControl.ChangeQuantity changeQuantity, CartPickerVO cartPickerVO, int i11, Function2<? super CartPickerBinder.CartPickerActionType, ? super CartPickerVO, Unit> function2, CartPickerBinder cartPickerBinder, d<? super CartPickerBinder$createListeners$1$1$onPlusClickListener$1$1> dVar) {
        super(2, dVar);
        this.$this_with = changeQuantity;
        this.$newVO = cartPickerVO;
        this.$quantityCount = i11;
        this.$actionHandler = function2;
        this.this$0 = cartPickerBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartPickerBinder$createListeners$1$1$onPlusClickListener$1$1 cartPickerBinder$createListeners$1$1$onPlusClickListener$1$1 = new CartPickerBinder$createListeners$1$1$onPlusClickListener$1$1(this.$this_with, this.$newVO, this.$quantityCount, this.$actionHandler, this.this$0, dVar);
        cartPickerBinder$createListeners$1$1$onPlusClickListener$1$1.L$0 = obj;
        return cartPickerBinder$createListeners$1$1$onPlusClickListener$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            long changeValueDebounceDelay = this.$this_with.getChangeValueDebounceDelay();
            this.L$0 = m12;
            this.label = 1;
            if (Y.b(changeValueDebounceDelay, this) == aVar) {
                return aVar;
            }
            m11 = m12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        N.e(m11);
        CartPickerVO cartPickerVO = this.$newVO;
        this.$actionHandler.invoke(CartPickerBinder.CartPickerActionType.INCREMENT, CartPickerVO.copy$default(cartPickerVO, null, null, CartPickerVO.QuantityControl.copy$default(cartPickerVO.getQuantity(), this.$quantityCount, 0, 0, 0, 0, null, null, null, null, 510, null), null, null, null, null, null, null, 507, null));
        this.this$0.increaseJob = null;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartPickerBinder$createListeners$1$1$onPlusClickListener$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
