package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5;

import I00.d;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5Config;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.expandButton.HotelsRoomsListV5ButtonViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader.HotelsRoomsListV5LoaderViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.notification.HotelsRoomsListV5NotificationViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.HotelsRoomsListV5RoomViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.updater.HotelsRoomsListV5UpdaterOverlayViewMapper;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;", "listTrackingViewMapper", "Ln20/i;", "HotelsRoomsListV5Widget", "(Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;)Ln20/i;", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsRoomsListV5WidgetKt {
    @NotNull
    public static final i HotelsRoomsListV5Widget(@NotNull final ListTrackingViewMapper listTrackingViewMapper) {
        Intrinsics.checkNotNullParameter(listTrackingViewMapper, "listTrackingViewMapper");
        final long[] jArr = {5};
        final String str = "travel";
        final String str2 = "hotelsRoomsList";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.HotelsRoomsListV5WidgetKt$HotelsRoomsListV5Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HotelsRoomsListV5Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                HotelsRoomsListV5Component hotelsRoomsListV5Component = (HotelsRoomsListV5Component) storage.getComponent(HotelsRoomsListV5Component.class);
                return new d[]{new HotelsRoomsListV5RoomViewMapper(hotelsRoomsListV5Component), new HotelsRoomsListV5NotificationViewMapper(hotelsRoomsListV5Component), new HotelsRoomsListV5LoaderViewMapper(hotelsRoomsListV5Component), new HotelsRoomsListV5ButtonViewMapper(hotelsRoomsListV5Component), new HotelsRoomsListV5UpdaterOverlayViewMapper(hotelsRoomsListV5Component), listTrackingViewMapper};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{HotelsRoomsListV5Component.INSTANCE.create(storage)};
            }
        };
    }
}
