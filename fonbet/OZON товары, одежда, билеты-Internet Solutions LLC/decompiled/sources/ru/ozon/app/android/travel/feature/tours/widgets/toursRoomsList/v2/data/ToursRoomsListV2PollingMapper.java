package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data;

import Ih.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data.ToursRoomsListV2DTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.polling.ToursRoomsListV2PollingVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2PollingMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursRoomsListV2PollingMapper implements Function2<ToursRoomsListV2DTO, d, List<? extends ToursRoomsListV2PollingVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursRoomsListV2PollingVO> invoke(@NotNull ToursRoomsListV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (state.getLazyRefreshAction() == null) {
            return K.f71697a;
        }
        return C7714v.a0(new ToursRoomsListV2PollingVO(widgetInfo.d().hashCode(), AtomActionMapperKt.toAtomAction(state.getLazyRefreshAction(), state.getTrackingInfo()), a.a("0", widgetInfo.d()), state.getBehaviorType() == ToursRoomsListV2DTO.BehaviorType.EMPTY_FETCH_STATE, null, 16, null));
    }
}
