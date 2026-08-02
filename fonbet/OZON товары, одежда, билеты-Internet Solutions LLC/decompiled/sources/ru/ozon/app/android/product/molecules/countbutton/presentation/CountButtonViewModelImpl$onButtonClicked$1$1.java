package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModelImpl$onButtonClicked$1$1", f = "CountButtonViewModelImpl.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CountButtonViewModelImpl$onButtonClicked$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CountButtonVO $it;
    final /* synthetic */ CountButtonVO.UpdateCart $updateCart;
    final /* synthetic */ UpdateCartStrategy $updateCartBehavior;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountButtonViewModelImpl$onButtonClicked$1$1(UpdateCartStrategy updateCartStrategy, CountButtonVO countButtonVO, CountButtonVO.UpdateCart updateCart, d<? super CountButtonViewModelImpl$onButtonClicked$1$1> dVar) {
        super(2, dVar);
        this.$updateCartBehavior = updateCartStrategy;
        this.$it = countButtonVO;
        this.$updateCart = updateCart;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CountButtonViewModelImpl$onButtonClicked$1$1(this.$updateCartBehavior, this.$it, this.$updateCart, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            UpdateCartStrategy updateCartStrategy = this.$updateCartBehavior;
            long sku = this.$it.getSku();
            CountButtonVO.UpdateCart updateCart = this.$updateCart;
            Long l11 = new Long(this.$it.getWidgetId());
            this.label = 1;
            if (updateCartStrategy.updateCart(sku, updateCart, l11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CountButtonViewModelImpl$onButtonClicked$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
