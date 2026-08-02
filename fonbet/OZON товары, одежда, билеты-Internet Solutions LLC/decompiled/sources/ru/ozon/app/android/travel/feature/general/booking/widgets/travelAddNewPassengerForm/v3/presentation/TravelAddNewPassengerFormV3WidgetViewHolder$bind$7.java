package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class TravelAddNewPassengerFormV3WidgetViewHolder$bind$7 extends C7735q implements Function2<Integer, Boolean, Unit> {
    TravelAddNewPassengerFormV3WidgetViewHolder$bind$7(Object obj) {
        super(2, obj, TravelAddNewPassengerFormV3ViewModel.class, "onCheckboxChanged", "onCheckboxChanged(IZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        invoke(num.intValue(), bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, boolean z11) {
        ((TravelAddNewPassengerFormV3ViewModel) this.receiver).onCheckboxChanged(i11, z11);
    }
}
