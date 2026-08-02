package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter;

import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "inputId", "", "oldValue", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AddHotelGuestsV5FormViewHolder$inputsAdapter$1 extends AbstractC7737t implements InterfaceC6511n<Long, String, CharSequence, Unit> {
    final /* synthetic */ AddHotelGuestsV5FormViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddHotelGuestsV5FormViewHolder$inputsAdapter$1(AddHotelGuestsV5FormViewHolder addHotelGuestsV5FormViewHolder) {
        super(3);
        this.this$0 = addHotelGuestsV5FormViewHolder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, String str, CharSequence charSequence) {
        invoke(l11.longValue(), str, charSequence);
        return Unit.f71690a;
    }

    public final void invoke(long j11, String oldValue, CharSequence charSequence) {
        AddHotelGuestsV5VO.GuestFormVO guestFormVO;
        InterfaceC6512o interfaceC6512o;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        guestFormVO = this.this$0.boundedData;
        if (guestFormVO != null) {
            int id2 = guestFormVO.getId();
            interfaceC6512o = this.this$0.onTextInputChanged;
            if (interfaceC6512o != null) {
                interfaceC6512o.invoke(Integer.valueOf(id2), Long.valueOf(j11), oldValue, charSequence);
            }
        }
    }
}
