package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.api.TravelRailwaySeatSelectChangeSchemeV2SeatsResponse;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class TravelRailwaySeatSelectWidgetViewModel$changeSchemeSeatsV2$1 extends C7735q implements Function1<ActionV2Response<TravelRailwaySeatSelectChangeSchemeV2SeatsResponse>, TravelRailwaySeatSelectWidgetViewModel.UpdateWrapper> {
    TravelRailwaySeatSelectWidgetViewModel$changeSchemeSeatsV2$1(Object obj) {
        super(1, obj, TravelRailwaySeatSelectWidgetViewModel.class, "prepareSchemeSeatsUpdatesV2", "prepareSchemeSeatsUpdatesV2(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$UpdateWrapper;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TravelRailwaySeatSelectWidgetViewModel.UpdateWrapper invoke(ActionV2Response<TravelRailwaySeatSelectChangeSchemeV2SeatsResponse> p02) {
        TravelRailwaySeatSelectWidgetViewModel.UpdateWrapper prepareSchemeSeatsUpdatesV2;
        Intrinsics.checkNotNullParameter(p02, "p0");
        prepareSchemeSeatsUpdatesV2 = ((TravelRailwaySeatSelectWidgetViewModel) this.receiver).prepareSchemeSeatsUpdatesV2(p02);
        return prepareSchemeSeatsUpdatesV2;
    }
}
