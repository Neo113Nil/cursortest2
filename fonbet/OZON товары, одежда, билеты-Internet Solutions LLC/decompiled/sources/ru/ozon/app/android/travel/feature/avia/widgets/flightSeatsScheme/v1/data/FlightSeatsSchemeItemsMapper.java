package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatDTO;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatMapperKt;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend.LegendMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend.MobileLegendBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContentRow;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeSeatContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.LegendVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\u0004\u0018\u00010\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeItemsMapper;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/LegendMapper;", "legendMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "schemeBlockMapper", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/LegendMapper;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;", "legend", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;", "schemeBlock", "", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "selectedSeatIds", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "orderDetails", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "mapSchemeItems", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;Ljava/util/Map;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;)Ljava/util/List;", "items", "", "seatNumberToPassengerMap", "findSelectedPassengerSeatPositions", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;", "seatNumber", "findSelectedSeatPosition", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Integer;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;", "state", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/LegendMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeItemsMapper {

    @NotNull
    private final LegendMapper legendMapper;

    @NotNull
    private final FlightSeatsSchemeBlockMapper schemeBlockMapper;

    public FlightSeatsSchemeItemsMapper(@NotNull LegendMapper legendMapper, @NotNull FlightSeatsSchemeBlockMapper schemeBlockMapper) {
        Intrinsics.checkNotNullParameter(legendMapper, "legendMapper");
        Intrinsics.checkNotNullParameter(schemeBlockMapper, "schemeBlockMapper");
        this.legendMapper = legendMapper;
        this.schemeBlockMapper = schemeBlockMapper;
    }

    private final Map<Integer, Integer> findSelectedPassengerSeatPositions(List<? extends FlightSeatsSchemeItem> items, Map<String, Integer> seatNumberToPassengerMap) {
        AirplaneSeatVO seat;
        String number;
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FlightSeatsSchemeItem flightSeatsSchemeItem = (FlightSeatsSchemeItem) obj;
            if (flightSeatsSchemeItem instanceof FlightSchemeContentRow) {
                for (FlightSchemeContent flightSchemeContent : ((FlightSchemeContentRow) flightSeatsSchemeItem).getContentList()) {
                    FlightSchemeSeatContent flightSchemeSeatContent = flightSchemeContent instanceof FlightSchemeSeatContent ? (FlightSchemeSeatContent) flightSchemeContent : null;
                    if (flightSchemeSeatContent != null && (seat = flightSchemeSeatContent.getSeat()) != null && (number = seat.getNumber()) != null && (num = seatNumberToPassengerMap.get(number)) != null) {
                        linkedHashMap.put(num, Integer.valueOf(i11));
                    }
                }
            }
            i11 = i12;
        }
        return linkedHashMap;
    }

    private final Integer findSelectedSeatPosition(List<? extends FlightSeatsSchemeItem> items, String seatNumber) {
        AirplaneSeatVO seat;
        String number;
        if (seatNumber == null) {
            return null;
        }
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FlightSeatsSchemeItem flightSeatsSchemeItem = (FlightSeatsSchemeItem) obj;
            if (flightSeatsSchemeItem instanceof FlightSchemeContentRow) {
                for (FlightSchemeContent flightSchemeContent : ((FlightSchemeContentRow) flightSeatsSchemeItem).getContentList()) {
                    FlightSchemeSeatContent flightSchemeSeatContent = flightSchemeContent instanceof FlightSchemeSeatContent ? (FlightSchemeSeatContent) flightSchemeContent : null;
                    if (flightSchemeSeatContent != null && (seat = flightSchemeSeatContent.getSeat()) != null && (number = seat.getNumber()) != null && number.equals(seatNumber)) {
                        return Integer.valueOf(i11);
                    }
                }
            }
            i11 = i12;
        }
        return null;
    }

    private final List<FlightSeatsSchemeItem> mapSchemeItems(MobileLegendBlockDTO legend, FlightSeatsSchemeBlockDTO schemeBlock, Map<String, TextAtom> selectedSeatIds, FlightSeatsSchemeOrderDetailsDTO orderDetails) {
        ArrayList arrayList = new ArrayList();
        LegendVO map = this.legendMapper.map(legend);
        if (map != null) {
            arrayList.add(map);
        }
        List<FlightSeatsSchemeItem> map2 = this.schemeBlockMapper.map(schemeBlock, selectedSeatIds, orderDetails);
        if (map2 != null) {
            arrayList.addAll(map2);
        }
        return arrayList;
    }

    @NotNull
    public final FlightSeatsSchemeBlockVO map(@NotNull FlightSeatsSchemeDTO state) {
        Map map;
        AirplaneSeatDTO selectedSeatType;
        List<AirplaneSeatDTO> seatTypes;
        FlightSeatsSchemePassengersBlockDTO.SelectedSeat selectedSeat;
        Intrinsics.checkNotNullParameter(state, "state");
        List<FlightSeatsSchemePassengersBlockDTO.Passenger> passengers = state.getPassengersBlock().getPassengers();
        Iterator<FlightSeatsSchemePassengersBlockDTO.Passenger> it = passengers.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().isCurrent()) {
                break;
            }
            i11++;
        }
        FlightSeatsSchemePassengersBlockDTO.Passenger passenger = (FlightSeatsSchemePassengersBlockDTO.Passenger) C7714v.Q(Math.max(0, i11), passengers);
        String number = (passenger == null || (selectedSeat = passenger.getSelectedSeat()) == null) ? null : selectedSeat.getNumber();
        FlightSeatsSchemeBlockDTO schemeBlock = state.getSchemeBlock();
        List<FlightSeatsSchemePassengersBlockDTO.Passenger> list = passengers;
        ArrayList arrayList = new ArrayList();
        for (FlightSeatsSchemePassengersBlockDTO.Passenger passenger2 : list) {
            FlightSeatsSchemePassengersBlockDTO.SelectedSeat selectedSeat2 = passenger2.getSelectedSeat();
            Pair pair = selectedSeat2 != null ? new Pair(selectedSeat2.getNumber(), passenger2.getShortName()) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        List<FlightSeatsSchemeItem> mapSchemeItems = mapSchemeItems(state.getMobileLegendBlock(), schemeBlock, U.s(arrayList), state.getOrderDetailsBlock());
        if (schemeBlock == null || (seatTypes = schemeBlock.getSeatTypes()) == null) {
            map = null;
        } else {
            List<AirplaneSeatDTO> list2 = seatTypes;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AirplaneSeatMapperKt.toVo$default((AirplaneSeatDTO) it2.next(), null, 0, 0, 7, null));
            }
            int h11 = U.h(C7714v.z(arrayList2, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            map = new LinkedHashMap(h11);
            for (Object obj : arrayList2) {
                map.put(((AirplaneSeatVO) obj).getId(), obj);
            }
        }
        if (map == null) {
            map = U.c();
        }
        Map map2 = map;
        ArrayList arrayList3 = new ArrayList();
        for (FlightSeatsSchemePassengersBlockDTO.Passenger passenger3 : list) {
            FlightSeatsSchemePassengersBlockDTO.SelectedSeat selectedSeat3 = passenger3.getSelectedSeat();
            Pair pair2 = selectedSeat3 != null ? new Pair(selectedSeat3.getNumber(), Integer.valueOf(passenger3.getId())) : null;
            if (pair2 != null) {
                arrayList3.add(pair2);
            }
        }
        Map<String, Integer> s11 = U.s(arrayList3);
        ArrayList arrayList4 = new ArrayList(s11.size());
        for (Map.Entry<String, Integer> entry : s11.entrySet()) {
            arrayList4.add(new Pair(entry.getValue(), entry.getKey()));
        }
        Map s12 = U.s(arrayList4);
        FlightSeatsSchemeBlockDTO schemeBlock2 = state.getSchemeBlock();
        return new FlightSeatsSchemeBlockVO(schemeBlock2 != null ? schemeBlock2.getSeatSelectionAction() : null, findSelectedSeatPosition(mapSchemeItems, number), s11, s12, findSelectedPassengerSeatPositions(mapSchemeItems, s11), map2, (schemeBlock == null || (selectedSeatType = schemeBlock.getSelectedSeatType()) == null) ? null : AirplaneSeatMapperKt.toVo$default(selectedSeatType, null, 0, 0, 7, null), schemeBlock != null ? mapSchemeItems : null);
    }
}
