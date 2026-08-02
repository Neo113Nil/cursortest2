package ru.ozon.app.android.payment.ui.createorder;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.payment.ui.createOrderV2.CreateOrderV2Response;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$processPooling$1", f = "CreateAndPayViewModel.kt", l = {298}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CreateAndPayViewModel$processPooling$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CreateOrderV2Response.Pooling $poolingDetails;
    int label;
    final /* synthetic */ CreateAndPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayViewModel$processPooling$1(CreateOrderV2Response.Pooling pooling, CreateAndPayViewModel createAndPayViewModel, d<? super CreateAndPayViewModel$processPooling$1> dVar) {
        super(2, dVar);
        this.$poolingDetails = pooling;
        this.this$0 = createAndPayViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CreateAndPayViewModel$processPooling$1(this.$poolingDetails, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long delay = this.$poolingDetails.getDelay();
            this.label = 1;
            if (Y.b(delay, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.handleAction(this.$poolingDetails.getAction());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CreateAndPayViewModel$processPooling$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
