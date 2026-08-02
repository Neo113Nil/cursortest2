package ru.ozon.app.android.search.widgets.insight.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;
import ru.ozon.app.android.search.widgets.insight.presentation.DeleteInsightResult;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.insight.presentation.InsightWidgetViewHolder$subscribeDeleteInsightEvents$1", f = "InsightWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class InsightWidgetViewHolder$subscribeDeleteInsightEvents$1 extends j implements Function2<DeleteInsightResult, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InsightWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsightWidgetViewHolder$subscribeDeleteInsightEvents$1(InsightWidgetViewHolder insightWidgetViewHolder, d<? super InsightWidgetViewHolder$subscribeDeleteInsightEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = insightWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        InsightWidgetViewHolder$subscribeDeleteInsightEvents$1 insightWidgetViewHolder$subscribeDeleteInsightEvents$1 = new InsightWidgetViewHolder$subscribeDeleteInsightEvents$1(this.this$0, dVar);
        insightWidgetViewHolder$subscribeDeleteInsightEvents$1.L$0 = obj;
        return insightWidgetViewHolder$subscribeDeleteInsightEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DeleteInsightResult deleteInsightResult = (DeleteInsightResult) this.L$0;
        if (deleteInsightResult instanceof DeleteInsightResult.DeleteInsightSuccess) {
            InsightWidgetVO boundData = this.this$0.getBoundData();
            if (boundData != null && ((DeleteInsightResult.DeleteInsightSuccess) deleteInsightResult).getWidgetId() == boundData.getId()) {
                iVar = this.this$0.screenContainer;
                iVar.M().m(((DeleteInsightResult.DeleteInsightSuccess) deleteInsightResult).getWidgetId());
            }
        } else {
            if (!(deleteInsightResult instanceof DeleteInsightResult.DeleteInsightError)) {
                throw new o();
            }
            InsightWidgetVO boundData2 = this.this$0.getBoundData();
            if (boundData2 != null && ((DeleteInsightResult.DeleteInsightError) deleteInsightResult).getWidgetId() == boundData2.getId()) {
                this.this$0.showNotification();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeleteInsightResult deleteInsightResult, d<? super Unit> dVar) {
        return ((InsightWidgetViewHolder$subscribeDeleteInsightEvents$1) create(deleteInsightResult, dVar)).invokeSuspend(Unit.f71690a);
    }
}
