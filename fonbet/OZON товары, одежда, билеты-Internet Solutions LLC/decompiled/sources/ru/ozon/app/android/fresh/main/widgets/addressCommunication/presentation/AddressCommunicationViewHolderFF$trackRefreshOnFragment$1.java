package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$u$b;", "it", "", "<anonymous>", "(LA00/a$u$b;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF$trackRefreshOnFragment$1", f = "AddressCommunicationViewHolderFF.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressCommunicationViewHolderFF$trackRefreshOnFragment$1 extends j implements Function2<a.u.b, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddressCommunicationViewHolderFF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCommunicationViewHolderFF$trackRefreshOnFragment$1(AddressCommunicationViewHolderFF addressCommunicationViewHolderFF, d<? super AddressCommunicationViewHolderFF$trackRefreshOnFragment$1> dVar) {
        super(2, dVar);
        this.this$0 = addressCommunicationViewHolderFF;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressCommunicationViewHolderFF$trackRefreshOnFragment$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.u.b bVar, d<? super Unit> dVar) {
        return ((AddressCommunicationViewHolderFF$trackRefreshOnFragment$1) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.clearPopup();
        this.this$0.setWidgetInvisible();
        return Unit.f71690a;
    }
}
