package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view.CartCountPickerView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "enabled", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder$onAttachViewModel$1$2", f = "CountPickerBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CountPickerBinder$onAttachViewModel$1$2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CountPickerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountPickerBinder$onAttachViewModel$1$2(CountPickerBinder countPickerBinder, d<? super CountPickerBinder$onAttachViewModel$1$2> dVar) {
        super(2, dVar);
        this.this$0 = countPickerBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CountPickerBinder$onAttachViewModel$1$2 countPickerBinder$onAttachViewModel$1$2 = new CountPickerBinder$onAttachViewModel$1$2(this.this$0, dVar);
        countPickerBinder$onAttachViewModel$1$2.Z$0 = ((Boolean) obj).booleanValue();
        return countPickerBinder$onAttachViewModel$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartCountPickerView cartCountPickerView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        CountPickerBinder countPickerBinder = this.this$0;
        cartCountPickerView = countPickerBinder.countPickerView;
        countPickerBinder.setButtonEnabled(cartCountPickerView.getDecreaseBtn(), z11);
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((CountPickerBinder$onAttachViewModel$1$2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
