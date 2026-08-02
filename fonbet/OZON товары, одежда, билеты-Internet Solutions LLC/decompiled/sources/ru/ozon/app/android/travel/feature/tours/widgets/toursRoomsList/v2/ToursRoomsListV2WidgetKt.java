package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2;

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
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data.ToursRoomsListV2Config;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di.ToursRoomsListV2Component;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.polling.ToursRoomsListV2PollingViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.ToursRoomsListV2RoomViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.skeleton.ToursRoomsListV2SkeletonViewMapper;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;", "listTrackingViewMapper", "Ln20/i;", "ToursRoomsListV2Widget", "(Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;)Ln20/i;", "tours_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToursRoomsListV2WidgetKt {
    @NotNull
    public static final i ToursRoomsListV2Widget(@NotNull final ListTrackingViewMapper listTrackingViewMapper) {
        Intrinsics.checkNotNullParameter(listTrackingViewMapper, "listTrackingViewMapper");
        final long[] jArr = {2};
        final String str = "travel";
        final String str2 = "toursRoomsList";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.ToursRoomsListV2WidgetKt$ToursRoomsListV2Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ToursRoomsListV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                ToursRoomsListV2Component toursRoomsListV2Component = (ToursRoomsListV2Component) storage.getComponent(ToursRoomsListV2Component.class);
                return new d[]{new ToursRoomsListV2PollingViewMapper(toursRoomsListV2Component), new ToursRoomsListV2RoomViewMapper(toursRoomsListV2Component), new ToursRoomsListV2SkeletonViewMapper(toursRoomsListV2Component), listTrackingViewMapper};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{ToursRoomsListV2Component.Companion.create(storage)};
            }
        };
    }
}
