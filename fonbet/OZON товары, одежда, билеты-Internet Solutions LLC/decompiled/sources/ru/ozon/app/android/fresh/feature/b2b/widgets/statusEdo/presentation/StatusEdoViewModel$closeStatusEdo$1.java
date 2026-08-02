package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.FlashBarErrorWrapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.StatusEdoRepository;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation.StatusEdoViewModel$closeStatusEdo$1", f = "StatusEdoViewModel.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StatusEdoViewModel$closeStatusEdo$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    int label;
    final /* synthetic */ StatusEdoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatusEdoViewModel$closeStatusEdo$1(StatusEdoViewModel statusEdoViewModel, String str, d<? super StatusEdoViewModel$closeStatusEdo$1> dVar) {
        super(2, dVar);
        this.this$0 = statusEdoViewModel;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new StatusEdoViewModel$closeStatusEdo$1(this.this$0, this.$actionName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        StatusEdoRepository statusEdoRepository;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            statusEdoRepository = this.this$0.repository;
            String str = this.$actionName;
            this.label = 1;
            obj = statusEdoRepository.closeStatusEdo(str, this);
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
            x0Var3 = this.this$0._shouldShowStatus;
            x0Var3.setValue(Boolean.FALSE);
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            x0Var = this.this$0._flashbarErrorMessage;
            x0Var.setValue(new FlashBarErrorWrapper(StringProvider.getString(R$string.error_common_message_service_error)));
        }
        x0Var2 = this.this$0._shouldShowStatus;
        x0Var2.setValue(Boolean.TRUE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((StatusEdoViewModel$closeStatusEdo$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
