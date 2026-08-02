package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee;

import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.data.B2bSelectConsigneeRepository;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.data.B2bSelectConsigneeResponse;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeViewModel$selectConsignee$1", f = "B2bSelectConsigneeViewModel.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bSelectConsigneeViewModel$selectConsignee$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ B2bSelectConsigneeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bSelectConsigneeViewModel$selectConsignee$1(B2bSelectConsigneeViewModel b2bSelectConsigneeViewModel, String str, String str2, d<? super B2bSelectConsigneeViewModel$selectConsignee$1> dVar) {
        super(2, dVar);
        this.this$0 = b2bSelectConsigneeViewModel;
        this.$actionName = str;
        this.$id = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bSelectConsigneeViewModel$selectConsignee$1(this.this$0, this.$actionName, this.$id, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B2bSelectConsigneeRepository b2bSelectConsigneeRepository;
        x0 x0Var;
        x0 x0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            b2bSelectConsigneeRepository = this.this$0.repository;
            String str = this.$actionName;
            String str2 = this.$id;
            this.label = 1;
            obj = b2bSelectConsigneeRepository.selectConsignee(str, str2, this);
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
            x0Var2 = this.this$0._screenState;
            Result.Success success = (Result.Success) result;
            x0Var2.setValue(new B2bSelectConsigneeViewModel.ScreenState.Success(((B2bSelectConsigneeResponse) success.getValue()).isSuccess(), ((B2bSelectConsigneeResponse) success.getValue()).getNotification().getNotificationBar()));
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            x0Var = this.this$0._screenState;
            x0Var.setValue(B2bSelectConsigneeViewModel.ScreenState.Error.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((B2bSelectConsigneeViewModel$selectConsignee$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
