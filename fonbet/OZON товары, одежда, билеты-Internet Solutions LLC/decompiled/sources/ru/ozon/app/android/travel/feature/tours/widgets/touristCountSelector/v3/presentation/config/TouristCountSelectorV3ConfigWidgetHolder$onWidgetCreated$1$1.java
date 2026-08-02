package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.config;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomUpdate;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomsUpdate;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "update", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$1 extends AbstractC7737t implements Function1<TouristCountSelectorV3ViewModel.Update, Unit> {
    final /* synthetic */ TouristCountSelectorV3ConfigWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$1(TouristCountSelectorV3ConfigWidgetHolder touristCountSelectorV3ConfigWidgetHolder) {
        super(1);
        this.this$0 = touristCountSelectorV3ConfigWidgetHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TouristCountSelectorV3ViewModel.Update update) {
        invoke2(update);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TouristCountSelectorV3ViewModel.Update update) {
        InterfaceC7851b interfaceC7851b;
        InterfaceC7851b interfaceC7851b2;
        if (update instanceof TouristCountSelectorV3ViewModel.Update.SingleRoomUpdate) {
            interfaceC7851b2 = this.this$0.composerController;
            interfaceC7851b2.update(new TouristCountSelectorV3RoomUpdate(((TouristCountSelectorV3ViewModel.Update.SingleRoomUpdate) update).getRoom()));
        } else {
            if (!(update instanceof TouristCountSelectorV3ViewModel.Update.RoomsUpdate)) {
                throw new o();
            }
            interfaceC7851b = this.this$0.composerController;
            TouristCountSelectorV3ViewModel.Update.RoomsUpdate roomsUpdate = (TouristCountSelectorV3ViewModel.Update.RoomsUpdate) update;
            interfaceC7851b.update(new TouristCountSelectorV3RoomsUpdate(roomsUpdate.getRooms()));
            this.this$0.shouldScrollToBottom = roomsUpdate.getScrollToBottom();
        }
    }
}
