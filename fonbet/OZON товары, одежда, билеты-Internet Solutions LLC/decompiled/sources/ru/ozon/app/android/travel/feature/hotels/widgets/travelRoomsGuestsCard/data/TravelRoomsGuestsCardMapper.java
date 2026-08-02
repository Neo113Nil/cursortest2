package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.data.TravelRoomAndGuestsDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.TravelRoomAndGuestsVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.TravelRoomsGuestsCardVO;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomsGuestsCardMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomsGuestsCardDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomsGuestsCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO;", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO;", "mapRoom", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO$CancellationInfoDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO$CancellationInfoVO;", "mapCancellationInfo", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO$CancellationInfoDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO$CancellationInfoVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomsGuestsCardDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRoomsGuestsCardMapper implements Function2<TravelRoomsGuestsCardDTO, d, List<? extends TravelRoomsGuestsCardVO>> {
    private final TravelRoomAndGuestsVO.CancellationInfoVO mapCancellationInfo(TravelRoomAndGuestsDTO.CancellationInfoDTO item) {
        return new TravelRoomAndGuestsVO.CancellationInfoVO(item.getTitle(), item.getShowCancellationButton());
    }

    private final TravelRoomAndGuestsVO mapRoom(TravelRoomAndGuestsDTO item) {
        String obj = item.getTitle().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        TextAtom title = item.getTitle();
        TextAtom feedInfo = item.getFeedInfo();
        TravelRoomAndGuestsVO.CancellationInfoVO mapCancellationInfo = mapCancellationInfo(item.getCancellationInfo());
        List<TravelRoomAndGuestsDTO.GuestDTO> guests = item.getGuests();
        ArrayList arrayList = new ArrayList(C7714v.z(guests, 10));
        Iterator<T> it = guests.iterator();
        while (it.hasNext()) {
            arrayList.add(((TravelRoomAndGuestsDTO.GuestDTO) it.next()).getNameString());
        }
        return new TravelRoomAndGuestsVO(obj, title, feedInfo, mapCancellationInfo, arrayList, item.getPriceForMobile(), item.getPriceDescription());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelRoomsGuestsCardVO> invoke(@NotNull TravelRoomsGuestsCardDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom mobileTitle = state.getMobileTitle();
        InfoBadgeDTO infoBadge = state.getInfoBadge();
        InfoBadgeVO vo = infoBadge != null ? MapperExtKt.toVO(infoBadge) : null;
        boolean z11 = !state.getRooms().isEmpty();
        List<TravelRoomAndGuestsDTO> rooms = state.getRooms();
        ArrayList arrayList = new ArrayList(C7714v.z(rooms, 10));
        Iterator<T> it = rooms.iterator();
        while (it.hasNext()) {
            arrayList.add(mapRoom((TravelRoomAndGuestsDTO) it.next()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new TravelRoomsGuestsCardVO(hashCode, mobileTitle, vo, z11, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
