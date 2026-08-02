package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class TravelAddNewPassengerFormV2WidgetViewHolder$inputsListAdapter$4 extends C7735q implements Function2<Long, Boolean, Unit> {
    TravelAddNewPassengerFormV2WidgetViewHolder$inputsListAdapter$4(Object obj) {
        super(2, obj, TravelAddNewPassengerFormV2ViewModel.class, "onCheckboxChanged", "onCheckboxChanged(JZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, Boolean bool) {
        invoke(l11.longValue(), bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11, boolean z11) {
        ((TravelAddNewPassengerFormV2ViewModel) this.receiver).onCheckboxChanged(j11, z11);
    }
}
