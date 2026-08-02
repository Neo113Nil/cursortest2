package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class CustomerContactsV2WidgetViewHolder$inputsListAdapter$1 extends C7735q implements InterfaceC6511n<Long, String, CharSequence, Unit> {
    CustomerContactsV2WidgetViewHolder$inputsListAdapter$1(Object obj) {
        super(3, obj, CustomerContactsV2ViewModel.class, "onTextInputChanged", "onTextInputChanged(JLjava/lang/String;Ljava/lang/CharSequence;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, String str, CharSequence charSequence) {
        invoke(l11.longValue(), str, charSequence);
        return Unit.f71690a;
    }

    public final void invoke(long j11, String p12, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((CustomerContactsV2ViewModel) this.receiver).onTextInputChanged(j11, p12, charSequence);
    }
}
