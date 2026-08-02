package ru.ozon.app.android.search.widgets.insight.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import b20.C5521a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/v$b;", "lifecycleState", "", "<anonymous>", "(Landroidx/lifecycle/v$b;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.insight.presentation.InsightWidgetViewHolder$subscribeToViewholderLifecycle$1", f = "InsightWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class InsightWidgetViewHolder$subscribeToViewholderLifecycle$1 extends j implements Function2<AbstractC5434v.b, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InsightWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsightWidgetViewHolder$subscribeToViewholderLifecycle$1(InsightWidgetViewHolder insightWidgetViewHolder, d<? super InsightWidgetViewHolder$subscribeToViewholderLifecycle$1> dVar) {
        super(2, dVar);
        this.this$0 = insightWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        InsightWidgetViewHolder$subscribeToViewholderLifecycle$1 insightWidgetViewHolder$subscribeToViewholderLifecycle$1 = new InsightWidgetViewHolder$subscribeToViewholderLifecycle$1(this.this$0, dVar);
        insightWidgetViewHolder$subscribeToViewholderLifecycle$1.L$0 = obj;
        return insightWidgetViewHolder$subscribeToViewholderLifecycle$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC5434v.b bVar, d<? super Unit> dVar) {
        return ((InsightWidgetViewHolder$subscribeToViewholderLifecycle$1) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AbstractC5434v.b bVar = (AbstractC5434v.b) this.L$0;
        k kVar = this.this$0.nestedViewHolder;
        if (kVar != null) {
            C5521a.c(kVar, bVar);
        }
        return Unit.f71690a;
    }
}
