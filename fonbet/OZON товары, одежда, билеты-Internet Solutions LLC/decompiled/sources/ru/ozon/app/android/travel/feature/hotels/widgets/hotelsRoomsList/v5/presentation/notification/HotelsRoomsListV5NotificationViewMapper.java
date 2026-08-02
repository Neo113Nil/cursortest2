package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.notification;

import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/notification/HotelsRoomsListV5NotificationViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/notification/HotelsRoomsListV5NotificationVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/di/HotelsRoomsListV5Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/di/HotelsRoomsListV5Component;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/di/HotelsRoomsListV5Component;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5NotificationViewMapper extends r<HotelsRoomsListV5DTO, HotelsRoomsListV5NotificationVO> {

    @NotNull
    private final HotelsRoomsListV5Component component;

    public HotelsRoomsListV5NotificationViewMapper(@NotNull HotelsRoomsListV5Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof HotelsRoomsListV5DTO) && ((HotelsRoomsListV5DTO) state).getNotification() != null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HotelsRoomsListV5NotificationVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(container.Z(), null, 1, null);
        if (asNotificationLayoutManager$default != null) {
            return new HotelsRoomsListV5NotificationWidgetViewHolder(asNotificationLayoutManager$default, container);
        }
        AbstractC6065b.INSTANCE.getClass();
        return AbstractC6065b.Companion.a();
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsRoomsListV5NotificationVO> map(@NotNull HotelsRoomsListV5DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getNotificationMapper().invoke(state, info);
    }
}
