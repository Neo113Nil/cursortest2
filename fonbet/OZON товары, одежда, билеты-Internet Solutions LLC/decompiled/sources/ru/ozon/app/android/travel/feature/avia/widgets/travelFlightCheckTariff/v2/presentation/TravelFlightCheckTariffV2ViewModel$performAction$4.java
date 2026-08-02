package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2ViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TravelFlightCheckTariffV2ViewModel$performAction$4 extends C7735q implements Function1<TravelFlightCheckTariffV2ViewModel.Result, Unit> {
    TravelFlightCheckTariffV2ViewModel$performAction$4(Object obj) {
        super(1, obj, SingleLiveEvent.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelFlightCheckTariffV2ViewModel.Result result) {
        invoke2(result);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelFlightCheckTariffV2ViewModel.Result result) {
        ((SingleLiveEvent) this.receiver).setValue(result);
    }
}
