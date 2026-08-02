package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ToursRoomsListV2RoomWidgetViewHolder$imagesAdapter$1 extends C7735q implements Function1<Integer, Unit> {
    ToursRoomsListV2RoomWidgetViewHolder$imagesAdapter$1(Object obj) {
        super(1, obj, ToursRoomsListV2RoomWidgetViewHolder.class, "onImageClicked", "onImageClicked(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((ToursRoomsListV2RoomWidgetViewHolder) this.receiver).onImageClicked(i11);
    }
}
