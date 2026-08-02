package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "formId", "", "inputId", "", "oldValue", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AddHotelGuestsV5WidgetViewHolder$formsAdapter$1 extends AbstractC7737t implements InterfaceC6512o<Integer, Long, String, CharSequence, Unit> {
    final /* synthetic */ AddHotelGuestsV5WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddHotelGuestsV5WidgetViewHolder$formsAdapter$1(AddHotelGuestsV5WidgetViewHolder addHotelGuestsV5WidgetViewHolder) {
        super(4);
        this.this$0 = addHotelGuestsV5WidgetViewHolder;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l11, String str, CharSequence charSequence) {
        invoke(num.intValue(), l11.longValue(), str, charSequence);
        return Unit.f71690a;
    }

    public final void invoke(int i11, long j11, String oldValue, CharSequence charSequence) {
        AddHotelGuestsV5ViewModel addHotelGuestsV5ViewModel;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        AddHotelGuestsV5VO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            int roomId = boundData.getRoomId();
            addHotelGuestsV5ViewModel = this.this$0.viewModel;
            addHotelGuestsV5ViewModel.onTextInputChanged(roomId, i11, j11, oldValue, charSequence);
        }
    }
}
