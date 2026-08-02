package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsMapperExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.FetchPinsActionResponseVO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VOKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.ViewedPinsStorage;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import we0.m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinMapperDelegate;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ViewedPinsStorage;", "viewedPinsStorage", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ViewedPinsStorage;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;", "dto", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;", "mapPinsResponse", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;Ljava/lang/Long;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "mapPin", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "Lwe0/m;", "point", "encode", "(Lwe0/m;)J", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ViewedPinsStorage;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PinMapperDelegate {

    @NotNull
    private final ViewedPinsStorage viewedPinsStorage;

    public PinMapperDelegate(@NotNull ViewedPinsStorage viewedPinsStorage) {
        Intrinsics.checkNotNullParameter(viewedPinsStorage, "viewedPinsStorage");
        this.viewedPinsStorage = viewedPinsStorage;
    }

    public final long encode(@NotNull m point) {
        Intrinsics.checkNotNullParameter(point, "point");
        double d11 = -90.0d;
        double d12 = 90.0d;
        double d13 = -180.0d;
        double d14 = 180.0d;
        long j11 = 0;
        for (int i11 = 0; i11 < 43; i11++) {
            if (i11 % 2 == 0) {
                double d15 = (d13 + d14) / 2;
                if (point.getLongitude() >= d15) {
                    j11 = MapExtKt.writeTrueAtPosition(j11, i11);
                    d13 = d15;
                } else {
                    d14 = d15;
                }
            } else {
                double d16 = (d11 + d12) / 2;
                if (point.getLatitude() >= d16) {
                    j11 = MapExtKt.writeTrueAtPosition(j11, i11);
                    d11 = d16;
                } else {
                    d12 = d16;
                }
            }
        }
        return j11;
    }

    @NotNull
    public final HotelsMapInfoV4VO.Pin mapPin(@NotNull PinDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        m latLng = MapExtKt.toLatLng(dto.getCoords());
        String id2 = dto.getId();
        float rank = dto.getRank();
        long encode = encode(latLng);
        String title = dto.getTitle();
        Integer price = dto.getPrice();
        Boolean hasDiscount = dto.getHasDiscount();
        boolean booleanValue = hasDiscount != null ? hasDiscount.booleanValue() : dto.getRightIconId() != null;
        Boolean isFavorite = dto.isFavorite();
        HotelsMapInfoV4VO.Pin pin = new HotelsMapInfoV4VO.Pin(id2, rank, latLng, encode, title, price, booleanValue, isFavorite != null ? isFavorite.booleanValue() : false, this.viewedPinsStorage.isPinViewed(dto.getId()), false, false, dto.getSku(), dto.getRightIconId(), dto.getLeftIconId(), false, null, 50176, null);
        HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(pin);
        return pin;
    }

    @NotNull
    public final FetchPinsActionResponseVO mapPinsResponse(@NotNull FetchPinsActionResponse dto, Long widgetId) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        List<PinDTO> pins = dto.getPins();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PinDTO pinDTO : pins) {
            linkedHashMap.put(pinDTO.getId(), mapPin(pinDTO));
        }
        ConcurrentHashMap<String, DistrictsVO.Polygon> mapDistricts = DistrictsMapperExtKt.mapDistricts(dto.getPolygons(), widgetId);
        AtomActionDTO nextAction = dto.getNextAction();
        return new FetchPinsActionResponseVO(linkedHashMap, mapDistricts, nextAction != null ? AtomActionMapperKt.toAtomAction(nextAction, null) : null, dto.getNextFetchInterval(), dto.getNotification());
    }
}
