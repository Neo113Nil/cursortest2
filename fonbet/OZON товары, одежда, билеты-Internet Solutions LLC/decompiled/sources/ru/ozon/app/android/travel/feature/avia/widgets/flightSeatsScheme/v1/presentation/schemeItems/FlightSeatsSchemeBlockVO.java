package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import D40.c;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u009e\u0001\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b'\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "selectSeatAction", "", "firstSelectedSeatIndex", "", "", "seatNumberToPassengerMap", "passengerToSeatNumberMap", "passengerToSeatPositionMap", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "seatTypes", "selectedSeatTemplate", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "schemeItems", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;Ljava/util/List;)V", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;Ljava/util/List;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSelectSeatAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/lang/Integer;", "getFirstSelectedSeatIndex", "()Ljava/lang/Integer;", "Ljava/util/Map;", "getSeatNumberToPassengerMap", "()Ljava/util/Map;", "getPassengerToSeatNumberMap", "getPassengerToSeatPositionMap", "getSeatTypes", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "getSelectedSeatTemplate", "()Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "Ljava/util/List;", "getSchemeItems", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeBlockVO {
    private final Integer firstSelectedSeatIndex;

    @NotNull
    private final Map<Integer, String> passengerToSeatNumberMap;

    @NotNull
    private final Map<Integer, Integer> passengerToSeatPositionMap;
    private final List<FlightSeatsSchemeItem> schemeItems;

    @NotNull
    private final Map<String, Integer> seatNumberToPassengerMap;

    @NotNull
    private final Map<String, AirplaneSeatVO> seatTypes;
    private final AtomActionDTO selectSeatAction;
    private final AirplaneSeatVO selectedSeatTemplate;

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSeatsSchemeBlockVO(AtomActionDTO atomActionDTO, Integer num, @NotNull Map<String, Integer> seatNumberToPassengerMap, @NotNull Map<Integer, String> passengerToSeatNumberMap, @NotNull Map<Integer, Integer> passengerToSeatPositionMap, @NotNull Map<String, AirplaneSeatVO> seatTypes, AirplaneSeatVO airplaneSeatVO, List<? extends FlightSeatsSchemeItem> list) {
        Intrinsics.checkNotNullParameter(seatNumberToPassengerMap, "seatNumberToPassengerMap");
        Intrinsics.checkNotNullParameter(passengerToSeatNumberMap, "passengerToSeatNumberMap");
        Intrinsics.checkNotNullParameter(passengerToSeatPositionMap, "passengerToSeatPositionMap");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.selectSeatAction = atomActionDTO;
        this.firstSelectedSeatIndex = num;
        this.seatNumberToPassengerMap = seatNumberToPassengerMap;
        this.passengerToSeatNumberMap = passengerToSeatNumberMap;
        this.passengerToSeatPositionMap = passengerToSeatPositionMap;
        this.seatTypes = seatTypes;
        this.selectedSeatTemplate = airplaneSeatVO;
        this.schemeItems = list;
    }

    public static /* synthetic */ FlightSeatsSchemeBlockVO copy$default(FlightSeatsSchemeBlockVO flightSeatsSchemeBlockVO, AtomActionDTO atomActionDTO, Integer num, Map map, Map map2, Map map3, Map map4, AirplaneSeatVO airplaneSeatVO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = flightSeatsSchemeBlockVO.selectSeatAction;
        }
        if ((i11 & 2) != 0) {
            num = flightSeatsSchemeBlockVO.firstSelectedSeatIndex;
        }
        if ((i11 & 4) != 0) {
            map = flightSeatsSchemeBlockVO.seatNumberToPassengerMap;
        }
        if ((i11 & 8) != 0) {
            map2 = flightSeatsSchemeBlockVO.passengerToSeatNumberMap;
        }
        if ((i11 & 16) != 0) {
            map3 = flightSeatsSchemeBlockVO.passengerToSeatPositionMap;
        }
        if ((i11 & 32) != 0) {
            map4 = flightSeatsSchemeBlockVO.seatTypes;
        }
        if ((i11 & 64) != 0) {
            airplaneSeatVO = flightSeatsSchemeBlockVO.selectedSeatTemplate;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list = flightSeatsSchemeBlockVO.schemeItems;
        }
        AirplaneSeatVO airplaneSeatVO2 = airplaneSeatVO;
        List list2 = list;
        Map map5 = map3;
        Map map6 = map4;
        return flightSeatsSchemeBlockVO.copy(atomActionDTO, num, map, map2, map5, map6, airplaneSeatVO2, list2);
    }

    @NotNull
    public final FlightSeatsSchemeBlockVO copy(AtomActionDTO selectSeatAction, Integer firstSelectedSeatIndex, @NotNull Map<String, Integer> seatNumberToPassengerMap, @NotNull Map<Integer, String> passengerToSeatNumberMap, @NotNull Map<Integer, Integer> passengerToSeatPositionMap, @NotNull Map<String, AirplaneSeatVO> seatTypes, AirplaneSeatVO selectedSeatTemplate, List<? extends FlightSeatsSchemeItem> schemeItems) {
        Intrinsics.checkNotNullParameter(seatNumberToPassengerMap, "seatNumberToPassengerMap");
        Intrinsics.checkNotNullParameter(passengerToSeatNumberMap, "passengerToSeatNumberMap");
        Intrinsics.checkNotNullParameter(passengerToSeatPositionMap, "passengerToSeatPositionMap");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return new FlightSeatsSchemeBlockVO(selectSeatAction, firstSelectedSeatIndex, seatNumberToPassengerMap, passengerToSeatNumberMap, passengerToSeatPositionMap, seatTypes, selectedSeatTemplate, schemeItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeBlockVO)) {
            return false;
        }
        FlightSeatsSchemeBlockVO flightSeatsSchemeBlockVO = (FlightSeatsSchemeBlockVO) other;
        return Intrinsics.d(this.selectSeatAction, flightSeatsSchemeBlockVO.selectSeatAction) && Intrinsics.d(this.firstSelectedSeatIndex, flightSeatsSchemeBlockVO.firstSelectedSeatIndex) && Intrinsics.d(this.seatNumberToPassengerMap, flightSeatsSchemeBlockVO.seatNumberToPassengerMap) && Intrinsics.d(this.passengerToSeatNumberMap, flightSeatsSchemeBlockVO.passengerToSeatNumberMap) && Intrinsics.d(this.passengerToSeatPositionMap, flightSeatsSchemeBlockVO.passengerToSeatPositionMap) && Intrinsics.d(this.seatTypes, flightSeatsSchemeBlockVO.seatTypes) && Intrinsics.d(this.selectedSeatTemplate, flightSeatsSchemeBlockVO.selectedSeatTemplate) && Intrinsics.d(this.schemeItems, flightSeatsSchemeBlockVO.schemeItems);
    }

    public final Integer getFirstSelectedSeatIndex() {
        return this.firstSelectedSeatIndex;
    }

    @NotNull
    public final Map<Integer, String> getPassengerToSeatNumberMap() {
        return this.passengerToSeatNumberMap;
    }

    @NotNull
    public final Map<Integer, Integer> getPassengerToSeatPositionMap() {
        return this.passengerToSeatPositionMap;
    }

    public final List<FlightSeatsSchemeItem> getSchemeItems() {
        return this.schemeItems;
    }

    @NotNull
    public final Map<String, Integer> getSeatNumberToPassengerMap() {
        return this.seatNumberToPassengerMap;
    }

    @NotNull
    public final Map<String, AirplaneSeatVO> getSeatTypes() {
        return this.seatTypes;
    }

    public final AtomActionDTO getSelectSeatAction() {
        return this.selectSeatAction;
    }

    public final AirplaneSeatVO getSelectedSeatTemplate() {
        return this.selectedSeatTemplate;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.selectSeatAction;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Integer num = this.firstSelectedSeatIndex;
        int a11 = c.a(this.seatTypes, c.a(this.passengerToSeatPositionMap, c.a(this.passengerToSeatNumberMap, c.a(this.seatNumberToPassengerMap, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
        AirplaneSeatVO airplaneSeatVO = this.selectedSeatTemplate;
        int hashCode2 = (a11 + (airplaneSeatVO == null ? 0 : airplaneSeatVO.hashCode())) * 31;
        List<FlightSeatsSchemeItem> list = this.schemeItems;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AtomActionDTO atomActionDTO = this.selectSeatAction;
        Integer num = this.firstSelectedSeatIndex;
        Map<String, Integer> map = this.seatNumberToPassengerMap;
        Map<Integer, String> map2 = this.passengerToSeatNumberMap;
        Map<Integer, Integer> map3 = this.passengerToSeatPositionMap;
        Map<String, AirplaneSeatVO> map4 = this.seatTypes;
        AirplaneSeatVO airplaneSeatVO = this.selectedSeatTemplate;
        List<FlightSeatsSchemeItem> list = this.schemeItems;
        StringBuilder sb2 = new StringBuilder("FlightSeatsSchemeBlockVO(selectSeatAction=");
        sb2.append(atomActionDTO);
        sb2.append(", firstSelectedSeatIndex=");
        sb2.append(num);
        sb2.append(", seatNumberToPassengerMap=");
        b.g(sb2, map, ", passengerToSeatNumberMap=", map2, ", passengerToSeatPositionMap=");
        b.g(sb2, map3, ", seatTypes=", map4, ", selectedSeatTemplate=");
        sb2.append(airplaneSeatVO);
        sb2.append(", schemeItems=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }
}
