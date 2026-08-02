package ru.ozon.app.android.search.widgets.history.search.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryUiEffect;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryUiEffect;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewHolder$onAttachViewModel$3", f = "HistoryViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HistoryViewHolder$onAttachViewModel$3 extends j implements Function2<HistoryUiEffect, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HistoryViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewHolder$onAttachViewModel$3(HistoryViewHolder historyViewHolder, d<? super HistoryViewHolder$onAttachViewModel$3> dVar) {
        super(2, dVar);
        this.this$0 = historyViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HistoryViewHolder$onAttachViewModel$3 historyViewHolder$onAttachViewModel$3 = new HistoryViewHolder$onAttachViewModel$3(this.this$0, dVar);
        historyViewHolder$onAttachViewModel$3.L$0 = obj;
        return historyViewHolder$onAttachViewModel$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HistoryVO boundData;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        HistoryUiEffect historyUiEffect = (HistoryUiEffect) this.L$0;
        if ((historyUiEffect instanceof HistoryUiEffect.ShowHistoryFiltersOnboarding) && (boundData = this.this$0.getBoundData()) != null) {
            this.this$0.showHistoryFiltersOnboarding(boundData, ((HistoryUiEffect.ShowHistoryFiltersOnboarding) historyUiEffect).getItem().getId());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HistoryUiEffect historyUiEffect, d<? super Unit> dVar) {
        return ((HistoryViewHolder$onAttachViewModel$3) create(historyUiEffect, dVar)).invokeSuspend(Unit.f71690a);
    }
}
