package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TravelFlightCheckTariffV2WidgetViewHolder$tariffAdapter$1 extends C7735q implements Function2<AtomActionDTO, Integer, Unit> {
    TravelFlightCheckTariffV2WidgetViewHolder$tariffAdapter$1(Object obj) {
        super(2, obj, TravelFlightCheckTariffV2ViewModel.class, "selectTariff", "selectTariff(Lru/ozon/uni/atoms/data/AtomActionDTO;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomActionDTO atomActionDTO, Integer num) {
        invoke(atomActionDTO, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(AtomActionDTO atomActionDTO, int i11) {
        ((TravelFlightCheckTariffV2ViewModel) this.receiver).selectTariff(atomActionDTO, i11);
    }
}
