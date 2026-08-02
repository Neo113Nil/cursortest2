package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF$hidePopup$1", f = "AddressCommunicationViewHolderFF.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressCommunicationViewHolderFF$hidePopup$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddressCommunicationViewHolderFF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCommunicationViewHolderFF$hidePopup$1(AddressCommunicationViewHolderFF addressCommunicationViewHolderFF, d<? super AddressCommunicationViewHolderFF$hidePopup$1> dVar) {
        super(2, dVar);
        this.this$0 = addressCommunicationViewHolderFF;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressCommunicationViewHolderFF$hidePopup$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddressCommunicationViewModel viewModel;
        P<Boolean> shouldShow;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        viewModel = this.this$0.viewModel();
        if (!((viewModel == null || (shouldShow = viewModel.getShouldShow()) == null) ? false : Intrinsics.d(shouldShow.getValue(), Boolean.TRUE))) {
            this.this$0.popupState = AddressCommunicationViewHolderFF.PopupState.Hidden.INSTANCE;
            this.this$0.dismissPopup();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressCommunicationViewHolderFF$hidePopup$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
