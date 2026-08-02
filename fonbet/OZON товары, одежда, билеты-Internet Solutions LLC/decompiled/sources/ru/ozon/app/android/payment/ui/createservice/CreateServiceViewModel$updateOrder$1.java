package ru.ozon.app.android.payment.ui.createservice;

import Sc.o;
import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.createservice.CreateServiceViewModel$updateOrder$1", f = "CreateServiceViewModel.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CreateServiceViewModel$updateOrder$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $body;
    final /* synthetic */ c $trackingData;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ CreateServiceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateServiceViewModel$updateOrder$1(CreateServiceViewModel createServiceViewModel, String str, c cVar, Map<String, String> map, Long l11, d<? super CreateServiceViewModel$updateOrder$1> dVar) {
        super(2, dVar);
        this.this$0 = createServiceViewModel;
        this.$actionName = str;
        this.$trackingData = cVar;
        this.$body = map;
        this.$widgetId = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CreateServiceViewModel$updateOrder$1(this.this$0, this.$actionName, this.$trackingData, this.$body, this.$widgetId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CreateServiceRepository createServiceRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.sendShowLoader();
            createServiceRepository = this.this$0.repository;
            String str = this.$actionName;
            c cVar = this.$trackingData;
            Map<String, String> map = this.$body;
            this.label = 1;
            obj = createServiceRepository.createService(str, cVar, map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            this.this$0.processCreateService((CreateServiceDO) ((Result.Success) result).getValue(), this.$widgetId);
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            this.this$0.sendCriticalError(((Result.Failure) result).getThrowable());
        }
        this.this$0.sendHideLoader();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CreateServiceViewModel$updateOrder$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
