package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.FlightSchemeContainerViewV2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "scrollToSeat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$ScrollToSeat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2", f = "FlightSeatsSchemeV2BlockWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2 extends j implements Function2<FlightSeatsSchemeV2ViewModel.ScrollToSeat, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FlightSeatsSchemeV2BlockWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2(FlightSeatsSchemeV2BlockWidgetViewHolder flightSeatsSchemeV2BlockWidgetViewHolder, d<? super FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2> dVar) {
        super(2, dVar);
        this.this$0 = flightSeatsSchemeV2BlockWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2 flightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2 = new FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2(this.this$0, dVar);
        flightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2.L$0 = obj;
        return flightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlightSchemeContainerViewV2 flightSchemeContainerViewV2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FlightSeatsSchemeV2ViewModel.ScrollToSeat scrollToSeat = (FlightSeatsSchemeV2ViewModel.ScrollToSeat) this.L$0;
        flightSchemeContainerViewV2 = this.this$0.schemeContainerView;
        if (flightSchemeContainerViewV2 != null) {
            flightSchemeContainerViewV2.scrollToSchemeRow(scrollToSeat);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlightSeatsSchemeV2ViewModel.ScrollToSeat scrollToSeat, d<? super Unit> dVar) {
        return ((FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$2) create(scrollToSeat, dVar)).invokeSuspend(Unit.f71690a);
    }
}
