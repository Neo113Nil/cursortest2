package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.FlightSchemeContainerView;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "seatSelection", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SeatSelection;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SeatSelection;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$1 extends AbstractC7737t implements Function1<FlightSeatsSchemeViewModel.SeatSelection, Unit> {
    final /* synthetic */ FlightSeatsSchemeBlockWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$1(FlightSeatsSchemeBlockWidgetViewHolder flightSeatsSchemeBlockWidgetViewHolder) {
        super(1);
        this.this$0 = flightSeatsSchemeBlockWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlightSeatsSchemeViewModel.SeatSelection seatSelection) {
        invoke2(seatSelection);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FlightSeatsSchemeViewModel.SeatSelection seatSelection) {
        FlightSchemeContainerView flightSchemeContainerView;
        flightSchemeContainerView = this.this$0.schemeContainerView;
        if (flightSchemeContainerView != null) {
            Intrinsics.f(seatSelection);
            flightSchemeContainerView.selectSeat(seatSelection);
        }
    }
}
