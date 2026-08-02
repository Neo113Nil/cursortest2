package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$6 extends C7719a implements Function2<FlightSeatsSchemeV2ViewModel.SchemeUpdate, d<? super Unit>, Object> {
    FlightSeatsSchemeV2BlockWidgetViewHolder$observeFlows$1$6(Object obj) {
        super(2, obj, FlightSeatsSchemeV2BlockWidgetViewHolder.class, "updateScheme", "updateScheme(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$SchemeUpdate;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlightSeatsSchemeV2ViewModel.SchemeUpdate schemeUpdate, d<? super Unit> dVar) {
        Object observeFlows$lambda$6$updateScheme;
        observeFlows$lambda$6$updateScheme = FlightSeatsSchemeV2BlockWidgetViewHolder.observeFlows$lambda$6$updateScheme((FlightSeatsSchemeV2BlockWidgetViewHolder) this.receiver, schemeUpdate, dVar);
        return observeFlows$lambda$6$updateScheme;
    }
}
