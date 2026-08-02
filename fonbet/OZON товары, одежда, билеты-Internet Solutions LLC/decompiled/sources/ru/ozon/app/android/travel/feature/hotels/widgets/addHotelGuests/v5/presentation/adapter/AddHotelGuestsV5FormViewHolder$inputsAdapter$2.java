package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "inputId", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AddHotelGuestsV5FormViewHolder$inputsAdapter$2 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ AddHotelGuestsV5FormViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddHotelGuestsV5FormViewHolder$inputsAdapter$2(AddHotelGuestsV5FormViewHolder addHotelGuestsV5FormViewHolder) {
        super(1);
        this.this$0 = addHotelGuestsV5FormViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        AddHotelGuestsV5VO.GuestFormVO guestFormVO;
        Function2 function2;
        guestFormVO = this.this$0.boundedData;
        if (guestFormVO != null) {
            int id2 = guestFormVO.getId();
            function2 = this.this$0.onSelectorClicked;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(id2), Long.valueOf(j11));
            }
        }
    }
}
