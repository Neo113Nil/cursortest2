package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "formId", "", "inputId", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AddHotelGuestsV5WidgetViewHolder$formsAdapter$2 extends AbstractC7737t implements Function2<Integer, Long, Unit> {
    final /* synthetic */ AddHotelGuestsV5WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddHotelGuestsV5WidgetViewHolder$formsAdapter$2(AddHotelGuestsV5WidgetViewHolder addHotelGuestsV5WidgetViewHolder) {
        super(2);
        this.this$0 = addHotelGuestsV5WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l11) {
        invoke(num.intValue(), l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, long j11) {
        AddHotelGuestsV5ViewModel addHotelGuestsV5ViewModel;
        AddHotelGuestsV5VO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            int roomId = boundData.getRoomId();
            addHotelGuestsV5ViewModel = this.this$0.viewModel;
            addHotelGuestsV5ViewModel.onSelectorClicked(roomId, i11, j11);
        }
    }
}
