package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms;

import Vg.d;
import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsRoomsListV5RoomViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HotelsRoomsListV5RoomWidgetViewHolder> {
    final /* synthetic */ HotelsRoomsListV5RoomViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsRoomsListV5RoomViewMapper$holderProducer$1(HotelsRoomsListV5RoomViewMapper hotelsRoomsListV5RoomViewMapper) {
        super(2);
        this.this$0 = hotelsRoomsListV5RoomViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final HotelsRoomsListV5RoomWidgetViewHolder invoke(View view, ComposerReferences refs) {
        HotelsRoomsListV5Component hotelsRoomsListV5Component;
        HotelsRoomsListV5Component hotelsRoomsListV5Component2;
        HotelsRoomsListV5Component hotelsRoomsListV5Component3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        HotelsRoomsListV5View hotelsRoomsListV5View = (HotelsRoomsListV5View) view;
        hotelsRoomsListV5Component = this.this$0.component;
        d customActionHandlersStoreFactory = hotelsRoomsListV5Component.getCustomActionHandlersStoreFactory();
        hotelsRoomsListV5Component2 = this.this$0.component;
        l tokenizedAnalytics = hotelsRoomsListV5Component2.getTokenizedAnalytics();
        hotelsRoomsListV5Component3 = this.this$0.component;
        return new HotelsRoomsListV5RoomWidgetViewHolder(hotelsRoomsListV5View, refs, customActionHandlersStoreFactory, tokenizedAnalytics, hotelsRoomsListV5Component3.getFontScaleProvider());
    }
}
