package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import Sc.o;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewModel;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel$RoomEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AddHotelGuestsV5WidgetViewHolder$subscribeToLiveData$1 extends AbstractC7737t implements Function1<AddHotelGuestsV5ViewModel.RoomEvent, Unit> {
    final /* synthetic */ AddHotelGuestsV5WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddHotelGuestsV5WidgetViewHolder$subscribeToLiveData$1(AddHotelGuestsV5WidgetViewHolder addHotelGuestsV5WidgetViewHolder) {
        super(1);
        this.this$0 = addHotelGuestsV5WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddHotelGuestsV5ViewModel.RoomEvent roomEvent) {
        invoke2(roomEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddHotelGuestsV5ViewModel.RoomEvent roomEvent) {
        l lVar;
        AddHotelGuestsV5VO boundData = this.this$0.getBoundData();
        if (boundData == null || roomEvent.getRoomId() != boundData.getRoomId()) {
            return;
        }
        AddHotelGuestsV5ViewModel.RoomEvent.Action action = roomEvent.getAction();
        if (action instanceof AddHotelGuestsV5ViewModel.RoomEvent.Action.UpdateForms) {
            this.this$0.sendRoomUpdate(roomEvent.getRoomId(), ((AddHotelGuestsV5ViewModel.RoomEvent.Action.UpdateForms) roomEvent.getAction()).getForms(), ((AddHotelGuestsV5ViewModel.RoomEvent.Action.UpdateForms) roomEvent.getAction()).getIsAddGuestButtonVisible());
            return;
        }
        if (action instanceof AddHotelGuestsV5ViewModel.RoomEvent.Action.ShowSelector) {
            this.this$0.showSelector(((AddHotelGuestsV5ViewModel.RoomEvent.Action.ShowSelector) roomEvent.getAction()).getTitle(), ((AddHotelGuestsV5ViewModel.RoomEvent.Action.ShowSelector) roomEvent.getAction()).getSelectorItems());
        } else {
            if (!(action instanceof AddHotelGuestsV5ViewModel.RoomEvent.Action.TrackEvent)) {
                throw new o();
            }
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, ((AddHotelGuestsV5ViewModel.RoomEvent.Action.TrackEvent) roomEvent.getAction()).getTokenizedEvent(), null, 2, null);
        }
    }
}
