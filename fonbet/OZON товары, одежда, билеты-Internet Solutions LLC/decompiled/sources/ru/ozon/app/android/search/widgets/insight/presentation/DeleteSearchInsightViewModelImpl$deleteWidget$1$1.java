package ru.ozon.app.android.search.widgets.insight.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.insight.presentation.DeleteInsightResult;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightViewModelImpl$deleteWidget$1$1", f = "DeleteSearchInsightWidgetViewModel.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DeleteSearchInsightViewModelImpl$deleteWidget$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $id;
    int label;
    final /* synthetic */ DeleteSearchInsightViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteSearchInsightViewModelImpl$deleteWidget$1$1(DeleteSearchInsightViewModelImpl deleteSearchInsightViewModelImpl, long j11, d<? super DeleteSearchInsightViewModelImpl$deleteWidget$1$1> dVar) {
        super(2, dVar);
        this.this$0 = deleteSearchInsightViewModelImpl;
        this.$id = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DeleteSearchInsightViewModelImpl$deleteWidget$1$1(this.this$0, this.$id, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0.sharedFlow;
            DeleteInsightResult.DeleteInsightSuccess deleteInsightSuccess = new DeleteInsightResult.DeleteInsightSuccess(this.$id);
            this.label = 1;
            if (w0Var.emit(deleteInsightSuccess, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.widgetId = null;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeleteSearchInsightViewModelImpl$deleteWidget$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
