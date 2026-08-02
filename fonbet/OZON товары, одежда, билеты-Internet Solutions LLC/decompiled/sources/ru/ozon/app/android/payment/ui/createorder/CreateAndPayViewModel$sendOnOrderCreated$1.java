package ru.ozon.app.android.payment.ui.createorder;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.domain.createorder.busevents.RefreshLKScreen;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$sendOnOrderCreated$1", f = "CreateAndPayViewModel.kt", l = {434}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CreateAndPayViewModel$sendOnOrderCreated$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ CreateAndPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayViewModel$sendOnOrderCreated$1(CreateAndPayViewModel createAndPayViewModel, d<? super CreateAndPayViewModel$sendOnOrderCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = createAndPayViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CreateAndPayViewModel$sendOnOrderCreated$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OrderTrackingBus orderTrackingBus;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            orderTrackingBus = this.this$0.orderTrackingBus;
            RefreshLKScreen refreshLKScreen = new RefreshLKScreen(0L, 1, null);
            this.label = 1;
            if (orderTrackingBus.sendEvent(refreshLKScreen, this) == aVar) {
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
        return ((CreateAndPayViewModel$sendOnOrderCreated$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
