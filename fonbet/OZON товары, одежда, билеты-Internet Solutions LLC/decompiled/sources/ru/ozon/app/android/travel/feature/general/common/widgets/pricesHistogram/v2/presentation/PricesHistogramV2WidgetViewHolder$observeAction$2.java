package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "position", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder$observeAction$2", f = "PricesHistogramV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PricesHistogramV2WidgetViewHolder$observeAction$2 extends j implements Function2<Integer, d<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ PricesHistogramV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramV2WidgetViewHolder$observeAction$2(PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder, d<? super PricesHistogramV2WidgetViewHolder$observeAction$2> dVar) {
        super(2, dVar);
        this.this$0 = pricesHistogramV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PricesHistogramV2WidgetViewHolder$observeAction$2 pricesHistogramV2WidgetViewHolder$observeAction$2 = new PricesHistogramV2WidgetViewHolder$observeAction$2(this.this$0, dVar);
        pricesHistogramV2WidgetViewHolder$observeAction$2.I$0 = ((Number) obj).intValue();
        return pricesHistogramV2WidgetViewHolder$observeAction$2;
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((PricesHistogramV2WidgetViewHolder$observeAction$2) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.scrollToPosition(this.I$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
