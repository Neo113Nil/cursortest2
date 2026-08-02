package ru.ozon.app.android.payment.ui.createorder;

import Sc.o;
import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$internalCreateOrder$1", f = "CreateAndPayViewModel.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CreateAndPayViewModel$internalCreateOrder$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ CreateAndPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayViewModel$internalCreateOrder$1(CreateAndPayViewModel createAndPayViewModel, String str, c cVar, d<? super CreateAndPayViewModel$internalCreateOrder$1> dVar) {
        super(2, dVar);
        this.this$0 = createAndPayViewModel;
        this.$actionName = str;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CreateAndPayViewModel$internalCreateOrder$1(this.this$0, this.$actionName, this.$trackingData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CreateAndPayRepository createAndPayRepository;
        CreateAndPayViewModel$internalCreateOrder$1 createAndPayViewModel$internalCreateOrder$1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CreateAndPayViewModel.sendShowLoader$default(this.this$0, null, 1, null);
            createAndPayRepository = this.this$0.repository;
            String str = this.$actionName;
            c cVar = this.$trackingData;
            this.label = 1;
            createAndPayViewModel$internalCreateOrder$1 = this;
            obj = CreateAndPayRepository.createOrderOrPay$default(createAndPayRepository, str, cVar, null, createAndPayViewModel$internalCreateOrder$1, 4, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            createAndPayViewModel$internalCreateOrder$1 = this;
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            createAndPayViewModel$internalCreateOrder$1.this$0.processOrderCreated((OrderDO) ((Result.Success) result).getValue());
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            createAndPayViewModel$internalCreateOrder$1.this$0.sendCriticalError(((Result.Failure) result).getThrowable());
            createAndPayViewModel$internalCreateOrder$1.this$0.sendHideLoader();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CreateAndPayViewModel$internalCreateOrder$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
