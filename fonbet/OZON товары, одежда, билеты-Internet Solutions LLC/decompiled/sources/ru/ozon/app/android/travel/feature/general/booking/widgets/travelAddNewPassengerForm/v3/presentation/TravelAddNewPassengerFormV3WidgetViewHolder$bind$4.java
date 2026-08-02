package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class TravelAddNewPassengerFormV3WidgetViewHolder$bind$4 extends C7735q implements InterfaceC6511n<Integer, String, CharSequence, Unit> {
    TravelAddNewPassengerFormV3WidgetViewHolder$bind$4(Object obj) {
        super(3, obj, TravelAddNewPassengerFormV3ViewModel.class, "onTextInputFocusLost", "onTextInputFocusLost(ILjava/lang/String;Ljava/lang/CharSequence;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, CharSequence charSequence) {
        invoke(num.intValue(), str, charSequence);
        return Unit.f71690a;
    }

    public final void invoke(int i11, String p12, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((TravelAddNewPassengerFormV3ViewModel) this.receiver).onTextInputFocusLost(i11, p12, charSequence);
    }
}
