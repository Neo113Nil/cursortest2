package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$7 extends C7735q implements Function1<FlightSeatsSchemeViewModel.SchemeUpdate, Unit> {
    FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$7(Object obj) {
        super(1, obj, FlightSeatsSchemeBlockWidgetViewHolder.class, "updateScheme", "updateScheme(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$SchemeUpdate;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlightSeatsSchemeViewModel.SchemeUpdate schemeUpdate) {
        invoke2(schemeUpdate);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FlightSeatsSchemeViewModel.SchemeUpdate p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FlightSeatsSchemeBlockWidgetViewHolder) this.receiver).updateScheme(p02);
    }
}
