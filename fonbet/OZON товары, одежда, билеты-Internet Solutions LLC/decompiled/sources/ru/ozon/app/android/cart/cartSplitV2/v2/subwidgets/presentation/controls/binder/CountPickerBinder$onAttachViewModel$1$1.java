package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "enabled", "asyncProcessing"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder$onAttachViewModel$1$1", f = "CountPickerBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CountPickerBinder$onAttachViewModel$1$1 extends j implements InterfaceC6511n<Boolean, Boolean, d<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ CountPickerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountPickerBinder$onAttachViewModel$1$1(CountPickerBinder countPickerBinder, d<? super CountPickerBinder$onAttachViewModel$1$1> dVar) {
        super(3, dVar);
        this.this$0 = countPickerBinder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, d<? super Boolean> dVar) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        ControlsVO.QuantityControl quantityControl;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z12 = this.Z$0;
        boolean z13 = this.Z$1;
        if (!z12) {
            quantityControl = this.this$0.item;
            if ((quantityControl != null ? quantityControl.getDecrementRemove() : null) == null || z13) {
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }
        z11 = true;
        return Boolean.valueOf(z11);
    }

    public final Object invoke(boolean z11, boolean z12, d<? super Boolean> dVar) {
        CountPickerBinder$onAttachViewModel$1$1 countPickerBinder$onAttachViewModel$1$1 = new CountPickerBinder$onAttachViewModel$1$1(this.this$0, dVar);
        countPickerBinder$onAttachViewModel$1$1.Z$0 = z11;
        countPickerBinder$onAttachViewModel$1$1.Z$1 = z12;
        return countPickerBinder$onAttachViewModel$1$1.invokeSuspend(Unit.f71690a);
    }
}
