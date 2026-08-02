package ru.ozon.app.android.geo.addressBookBarV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AddressBookBarWidgetV2ViewHolder$onAttachViewModel$1 extends C7735q implements Function1<Boolean, Unit> {
    AddressBookBarWidgetV2ViewHolder$onAttachViewModel$1(Object obj) {
        super(1, obj, AddressBookBarWidgetV2ViewHolder.class, "isNeedShowPopup", "isNeedShowPopup(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((AddressBookBarWidgetV2ViewHolder) this.receiver).isNeedShowPopup(z11);
    }
}
