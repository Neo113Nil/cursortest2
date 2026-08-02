package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.notification.HotelsRoomsListV5NotificationVO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5NotificationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/notification/HotelsRoomsListV5NotificationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5NotificationMapper implements Function2<HotelsRoomsListV5DTO, d, List<? extends HotelsRoomsListV5NotificationVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsRoomsListV5NotificationVO> invoke(@NotNull HotelsRoomsListV5DTO state, @NotNull d widgetInfo) {
        List<HotelsRoomsListV5NotificationVO> a02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        NotificationDTO notification = state.getNotification();
        return (notification == null || (a02 = C7714v.a0(new HotelsRoomsListV5NotificationVO((long) c.a(widgetInfo.d(), notification.getTitle()), notification))) == null) ? K.f71697a : a02;
    }
}
