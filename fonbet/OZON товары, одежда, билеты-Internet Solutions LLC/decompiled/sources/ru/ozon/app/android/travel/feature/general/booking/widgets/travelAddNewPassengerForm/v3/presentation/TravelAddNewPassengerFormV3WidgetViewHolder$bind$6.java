package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class TravelAddNewPassengerFormV3WidgetViewHolder$bind$6 extends C7735q implements Function1<Integer, Unit> {
    TravelAddNewPassengerFormV3WidgetViewHolder$bind$6(Object obj) {
        super(1, obj, TravelAddNewPassengerFormV3ViewModel.class, "onSelectorClicked", "onSelectorClicked(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((TravelAddNewPassengerFormV3ViewModel) this.receiver).onSelectorClicked(i11);
    }
}
