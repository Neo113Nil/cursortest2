package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AddHotelGuestsV5WidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ AddHotelGuestsV5WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddHotelGuestsV5WidgetViewHolder$actionHandler$1(AddHotelGuestsV5WidgetViewHolder addHotelGuestsV5WidgetViewHolder) {
        super(1);
        this.this$0 = addHotelGuestsV5WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        AddHotelGuestsV5ViewModel addHotelGuestsV5ViewModel;
        AddHotelGuestsV5ViewModel addHotelGuestsV5ViewModel2;
        Intrinsics.checkNotNullParameter(action, "action");
        AddHotelGuestsV5VO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            int roomId = boundData.getRoomId();
            String id2 = action.getId();
            if (Intrinsics.d(id2, "addGuest")) {
                addHotelGuestsV5ViewModel2 = this.this$0.viewModel;
                addHotelGuestsV5ViewModel2.onAddGuestClicked(roomId, action);
            } else if (Intrinsics.d(id2, "removeGuest")) {
                addHotelGuestsV5ViewModel = this.this$0.viewModel;
                addHotelGuestsV5ViewModel.onRemoveGuestClicked(roomId, action);
            }
        }
    }
}
