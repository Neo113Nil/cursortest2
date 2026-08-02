package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2ViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$NewPosition;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder$observeAction$1", f = "PricesHistogramV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PricesHistogramV2WidgetViewHolder$observeAction$1 extends j implements Function2<PricesHistogramV2ViewModel.NewPosition, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PricesHistogramV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramV2WidgetViewHolder$observeAction$1(PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder, d<? super PricesHistogramV2WidgetViewHolder$observeAction$1> dVar) {
        super(2, dVar);
        this.this$0 = pricesHistogramV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PricesHistogramV2WidgetViewHolder$observeAction$1 pricesHistogramV2WidgetViewHolder$observeAction$1 = new PricesHistogramV2WidgetViewHolder$observeAction$1(this.this$0, dVar);
        pricesHistogramV2WidgetViewHolder$observeAction$1.L$0 = obj;
        return pricesHistogramV2WidgetViewHolder$observeAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PricesHistogramV2ViewModel.NewPosition newPosition = (PricesHistogramV2ViewModel.NewPosition) this.L$0;
        this.this$0.showDaysState(newPosition.getDays(), newPosition.getPosition(), newPosition.getTotalPrice(), newPosition.getSelectedDates(), newPosition.getIsDirect());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PricesHistogramV2ViewModel.NewPosition newPosition, d<? super Unit> dVar) {
        return ((PricesHistogramV2WidgetViewHolder$observeAction$1) create(newPosition, dVar)).invokeSuspend(Unit.f71690a);
    }
}
