package ru.ozon.app.android.search.widgets.history.search.presentation;

import Sc.s;
import WZ.l;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewHolder$onAttachViewModel$1", f = "HistoryViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HistoryViewHolder$onAttachViewModel$1 extends j implements Function2<ComposerAsyncWidgetResponse<HistoryDTO>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HistoryViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewHolder$onAttachViewModel$1(HistoryViewHolder historyViewHolder, d<? super HistoryViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = historyViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HistoryViewHolder$onAttachViewModel$1 historyViewHolder$onAttachViewModel$1 = new HistoryViewHolder$onAttachViewModel$1(this.this$0, dVar);
        historyViewHolder$onAttachViewModel$1.L$0 = obj;
        return historyViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Map<String, String> trackingPayloads = ((ComposerAsyncWidgetResponse) this.L$0).getTrackingPayloads();
        if (trackingPayloads != null) {
            lVar = this.this$0.tokenizedAnalytics;
            lVar.e(trackingPayloads);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ComposerAsyncWidgetResponse<HistoryDTO> composerAsyncWidgetResponse, d<? super Unit> dVar) {
        return ((HistoryViewHolder$onAttachViewModel$1) create(composerAsyncWidgetResponse, dVar)).invokeSuspend(Unit.f71690a);
    }
}
