package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import B0.C2454a;
import D40.c;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0081\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J²\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010'R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b)\u0010'R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b*\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "selectSeatAction", "", "firstSelectedSeatIndex", "", "", "seatNumberToPassengerMap", "passengerToSeatNumberMap", "passengerToSeatPositionMap", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "seatTypes", "selectedSeatTemplate", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "schemeItems", "schemeWidth", "", "switchPassengerOnReservedSeatClick", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;Ljava/util/List;IZ)V", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;Ljava/util/List;IZ)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSelectSeatAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/lang/Integer;", "getFirstSelectedSeatIndex", "()Ljava/lang/Integer;", "Ljava/util/Map;", "getSeatNumberToPassengerMap", "()Ljava/util/Map;", "getPassengerToSeatNumberMap", "getPassengerToSeatPositionMap", "getSeatTypes", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "getSelectedSeatTemplate", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "Ljava/util/List;", "getSchemeItems", "()Ljava/util/List;", "I", "getSchemeWidth", "Z", "getSwitchPassengerOnReservedSeatClick", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeV2BlockVI {
    private final Integer firstSelectedSeatIndex;

    @NotNull
    private final Map<Integer, String> passengerToSeatNumberMap;

    @NotNull
    private final Map<Integer, Integer> passengerToSeatPositionMap;
    private final List<FlightSeatsSchemeV2Item> schemeItems;
    private final int schemeWidth;

    @NotNull
    private final Map<String, Integer> seatNumberToPassengerMap;

    @NotNull
    private final Map<String, AirplaneSeatTypeV2VI> seatTypes;
    private final AtomActionDTO selectSeatAction;
    private final AirplaneSeatTypeV2VI selectedSeatTemplate;
    private final boolean switchPassengerOnReservedSeatClick;

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSeatsSchemeV2BlockVI(AtomActionDTO atomActionDTO, Integer num, @NotNull Map<String, Integer> seatNumberToPassengerMap, @NotNull Map<Integer, String> passengerToSeatNumberMap, @NotNull Map<Integer, Integer> passengerToSeatPositionMap, @NotNull Map<String, AirplaneSeatTypeV2VI> seatTypes, AirplaneSeatTypeV2VI airplaneSeatTypeV2VI, List<? extends FlightSeatsSchemeV2Item> list, int i11, boolean z11) {
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
        this.selectedSeatTemplate = airplaneSeatTypeV2VI;
        this.schemeItems = list;
        this.schemeWidth = i11;
        this.switchPassengerOnReservedSeatClick = z11;
    }

    public static /* synthetic */ FlightSeatsSchemeV2BlockVI copy$default(FlightSeatsSchemeV2BlockVI flightSeatsSchemeV2BlockVI, AtomActionDTO atomActionDTO, Integer num, Map map, Map map2, Map map3, Map map4, AirplaneSeatTypeV2VI airplaneSeatTypeV2VI, List list, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            atomActionDTO = flightSeatsSchemeV2BlockVI.selectSeatAction;
        }
        if ((i12 & 2) != 0) {
            num = flightSeatsSchemeV2BlockVI.firstSelectedSeatIndex;
        }
        if ((i12 & 4) != 0) {
            map = flightSeatsSchemeV2BlockVI.seatNumberToPassengerMap;
        }
        if ((i12 & 8) != 0) {
            map2 = flightSeatsSchemeV2BlockVI.passengerToSeatNumberMap;
        }
        if ((i12 & 16) != 0) {
            map3 = flightSeatsSchemeV2BlockVI.passengerToSeatPositionMap;
        }
        if ((i12 & 32) != 0) {
            map4 = flightSeatsSchemeV2BlockVI.seatTypes;
        }
        if ((i12 & 64) != 0) {
            airplaneSeatTypeV2VI = flightSeatsSchemeV2BlockVI.selectedSeatTemplate;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list = flightSeatsSchemeV2BlockVI.schemeItems;
        }
        if ((i12 & 256) != 0) {
            i11 = flightSeatsSchemeV2BlockVI.schemeWidth;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z11 = flightSeatsSchemeV2BlockVI.switchPassengerOnReservedSeatClick;
        }
        int i13 = i11;
        boolean z12 = z11;
        AirplaneSeatTypeV2VI airplaneSeatTypeV2VI2 = airplaneSeatTypeV2VI;
        List list2 = list;
        Map map5 = map3;
        Map map6 = map4;
        return flightSeatsSchemeV2BlockVI.copy(atomActionDTO, num, map, map2, map5, map6, airplaneSeatTypeV2VI2, list2, i13, z12);
    }

    @NotNull
    public final FlightSeatsSchemeV2BlockVI copy(AtomActionDTO selectSeatAction, Integer firstSelectedSeatIndex, @NotNull Map<String, Integer> seatNumberToPassengerMap, @NotNull Map<Integer, String> passengerToSeatNumberMap, @NotNull Map<Integer, Integer> passengerToSeatPositionMap, @NotNull Map<String, AirplaneSeatTypeV2VI> seatTypes, AirplaneSeatTypeV2VI selectedSeatTemplate, List<? extends FlightSeatsSchemeV2Item> schemeItems, int schemeWidth, boolean switchPassengerOnReservedSeatClick) {
        Intrinsics.checkNotNullParameter(seatNumberToPassengerMap, "seatNumberToPassengerMap");
        Intrinsics.checkNotNullParameter(passengerToSeatNumberMap, "passengerToSeatNumberMap");
        Intrinsics.checkNotNullParameter(passengerToSeatPositionMap, "passengerToSeatPositionMap");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return new FlightSeatsSchemeV2BlockVI(selectSeatAction, firstSelectedSeatIndex, seatNumberToPassengerMap, passengerToSeatNumberMap, passengerToSeatPositionMap, seatTypes, selectedSeatTemplate, schemeItems, schemeWidth, switchPassengerOnReservedSeatClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeV2BlockVI)) {
            return false;
        }
        FlightSeatsSchemeV2BlockVI flightSeatsSchemeV2BlockVI = (FlightSeatsSchemeV2BlockVI) other;
        return Intrinsics.d(this.selectSeatAction, flightSeatsSchemeV2BlockVI.selectSeatAction) && Intrinsics.d(this.firstSelectedSeatIndex, flightSeatsSchemeV2BlockVI.firstSelectedSeatIndex) && Intrinsics.d(this.seatNumberToPassengerMap, flightSeatsSchemeV2BlockVI.seatNumberToPassengerMap) && Intrinsics.d(this.passengerToSeatNumberMap, flightSeatsSchemeV2BlockVI.passengerToSeatNumberMap) && Intrinsics.d(this.passengerToSeatPositionMap, flightSeatsSchemeV2BlockVI.passengerToSeatPositionMap) && Intrinsics.d(this.seatTypes, flightSeatsSchemeV2BlockVI.seatTypes) && Intrinsics.d(this.selectedSeatTemplate, flightSeatsSchemeV2BlockVI.selectedSeatTemplate) && Intrinsics.d(this.schemeItems, flightSeatsSchemeV2BlockVI.schemeItems) && this.schemeWidth == flightSeatsSchemeV2BlockVI.schemeWidth && this.switchPassengerOnReservedSeatClick == flightSeatsSchemeV2BlockVI.switchPassengerOnReservedSeatClick;
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

    public final List<FlightSeatsSchemeV2Item> getSchemeItems() {
        return this.schemeItems;
    }

    public final int getSchemeWidth() {
        return this.schemeWidth;
    }

    @NotNull
    public final Map<String, Integer> getSeatNumberToPassengerMap() {
        return this.seatNumberToPassengerMap;
    }

    @NotNull
    public final Map<String, AirplaneSeatTypeV2VI> getSeatTypes() {
        return this.seatTypes;
    }

    public final AtomActionDTO getSelectSeatAction() {
        return this.selectSeatAction;
    }

    public final AirplaneSeatTypeV2VI getSelectedSeatTemplate() {
        return this.selectedSeatTemplate;
    }

    public final boolean getSwitchPassengerOnReservedSeatClick() {
        return this.switchPassengerOnReservedSeatClick;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.selectSeatAction;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Integer num = this.firstSelectedSeatIndex;
        int a11 = c.a(this.seatTypes, c.a(this.passengerToSeatPositionMap, c.a(this.passengerToSeatNumberMap, c.a(this.seatNumberToPassengerMap, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
        AirplaneSeatTypeV2VI airplaneSeatTypeV2VI = this.selectedSeatTemplate;
        int hashCode2 = (a11 + (airplaneSeatTypeV2VI == null ? 0 : airplaneSeatTypeV2VI.hashCode())) * 31;
        List<FlightSeatsSchemeV2Item> list = this.schemeItems;
        return Boolean.hashCode(this.switchPassengerOnReservedSeatClick) + C2454a.a(this.schemeWidth, (hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        AtomActionDTO atomActionDTO = this.selectSeatAction;
        Integer num = this.firstSelectedSeatIndex;
        Map<String, Integer> map = this.seatNumberToPassengerMap;
        Map<Integer, String> map2 = this.passengerToSeatNumberMap;
        Map<Integer, Integer> map3 = this.passengerToSeatPositionMap;
        Map<String, AirplaneSeatTypeV2VI> map4 = this.seatTypes;
        AirplaneSeatTypeV2VI airplaneSeatTypeV2VI = this.selectedSeatTemplate;
        List<FlightSeatsSchemeV2Item> list = this.schemeItems;
        int i11 = this.schemeWidth;
        boolean z11 = this.switchPassengerOnReservedSeatClick;
        StringBuilder sb2 = new StringBuilder("FlightSeatsSchemeV2BlockVI(selectSeatAction=");
        sb2.append(atomActionDTO);
        sb2.append(", firstSelectedSeatIndex=");
        sb2.append(num);
        sb2.append(", seatNumberToPassengerMap=");
        b.g(sb2, map, ", passengerToSeatNumberMap=", map2, ", passengerToSeatPositionMap=");
        b.g(sb2, map3, ", seatTypes=", map4, ", selectedSeatTemplate=");
        sb2.append(airplaneSeatTypeV2VI);
        sb2.append(", schemeItems=");
        sb2.append(list);
        sb2.append(", schemeWidth=");
        sb2.append(i11);
        sb2.append(", switchPassengerOnReservedSeatClick=");
        sb2.append(z11);
        sb2.append(")");
        return sb2.toString();
    }
}
