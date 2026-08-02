package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class TravelAddNewPassengerFormV3WidgetViewHolder$bind$2 extends C7735q implements InterfaceC6512o<Integer, String, CharSequence, Boolean, Unit> {
    TravelAddNewPassengerFormV3WidgetViewHolder$bind$2(Object obj) {
        super(4, obj, TravelAddNewPassengerFormV3ViewModel.class, "onTextInputChanged", "onTextInputChanged(ILjava/lang/String;Ljava/lang/CharSequence;Z)V", 0);
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, CharSequence charSequence, Boolean bool) {
        invoke(num.intValue(), str, charSequence, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, String p12, CharSequence charSequence, boolean z11) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((TravelAddNewPassengerFormV3ViewModel) this.receiver).onTextInputChanged(i11, p12, charSequence, z11);
    }
}
