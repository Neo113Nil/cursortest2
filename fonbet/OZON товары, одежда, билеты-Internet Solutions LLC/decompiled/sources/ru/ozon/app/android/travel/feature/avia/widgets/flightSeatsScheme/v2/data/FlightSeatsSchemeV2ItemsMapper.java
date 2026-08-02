package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data;

import android.content.Context;
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
import ru.ozon.app.android.product.R$dimen;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.airplaneSeat.AirplaneSeatTypeMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.airplaneSeat.AirplaneSeatTypeV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.legend.LegendMapperV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.legend.MobileLegendBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeSeatContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2BlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.LegendV2VI;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001d\u001a\u0004\u0018\u00010\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2ItemsMapper;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/LegendMapperV2;", "legendMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "schemeBlockMapper", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/LegendMapperV2;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/MobileLegendBlockV2DTO;", "legend", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "schemeBlock", "", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "selectedSeatIds", "", "schemeWidth", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "mapSchemeItems", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/MobileLegendBlockV2DTO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;Ljava/util/Map;I)Ljava/util/List;", "items", "seatNumberToPassengerMap", "findSelectedPassengerSeatPositions", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/Map;", "seatNumber", "findSelectedSeatPosition", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Integer;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "state", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/LegendMapperV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2ItemsMapper {

    @NotNull
    private final Context context;

    @NotNull
    private final LegendMapperV2 legendMapper;

    @NotNull
    private final FlightSeatsSchemeV2BlockMapper schemeBlockMapper;

    public FlightSeatsSchemeV2ItemsMapper(@NotNull LegendMapperV2 legendMapper, @NotNull FlightSeatsSchemeV2BlockMapper schemeBlockMapper, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(legendMapper, "legendMapper");
        Intrinsics.checkNotNullParameter(schemeBlockMapper, "schemeBlockMapper");
        Intrinsics.checkNotNullParameter(context, "context");
        this.legendMapper = legendMapper;
        this.schemeBlockMapper = schemeBlockMapper;
        this.context = context;
    }

    private final Map<Integer, Integer> findSelectedPassengerSeatPositions(List<? extends FlightSeatsSchemeV2Item> items, Map<String, Integer> seatNumberToPassengerMap) {
        AirplaneSeatTypeV2VI seat;
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
            FlightSeatsSchemeV2Item flightSeatsSchemeV2Item = (FlightSeatsSchemeV2Item) obj;
            if (flightSeatsSchemeV2Item instanceof FlightSchemeContentRowV2) {
                for (FlightSchemeContentV2 flightSchemeContentV2 : ((FlightSchemeContentRowV2) flightSeatsSchemeV2Item).getContentList()) {
                    FlightSchemeSeatContentV2 flightSchemeSeatContentV2 = flightSchemeContentV2 instanceof FlightSchemeSeatContentV2 ? (FlightSchemeSeatContentV2) flightSchemeContentV2 : null;
                    if (flightSchemeSeatContentV2 != null && (seat = flightSchemeSeatContentV2.getSeat()) != null && (number = seat.getNumber()) != null && (num = seatNumberToPassengerMap.get(number)) != null) {
                        linkedHashMap.put(num, Integer.valueOf(i11));
                    }
                }
            }
            i11 = i12;
        }
        return linkedHashMap;
    }

    private final Integer findSelectedSeatPosition(List<? extends FlightSeatsSchemeV2Item> items, String seatNumber) {
        AirplaneSeatTypeV2VI seat;
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
            FlightSeatsSchemeV2Item flightSeatsSchemeV2Item = (FlightSeatsSchemeV2Item) obj;
            if (flightSeatsSchemeV2Item instanceof FlightSchemeContentRowV2) {
                for (FlightSchemeContentV2 flightSchemeContentV2 : ((FlightSchemeContentRowV2) flightSeatsSchemeV2Item).getContentList()) {
                    FlightSchemeSeatContentV2 flightSchemeSeatContentV2 = flightSchemeContentV2 instanceof FlightSchemeSeatContentV2 ? (FlightSchemeSeatContentV2) flightSchemeContentV2 : null;
                    if (flightSchemeSeatContentV2 != null && (seat = flightSchemeSeatContentV2.getSeat()) != null && (number = seat.getNumber()) != null && number.equals(seatNumber)) {
                        return Integer.valueOf(i11);
                    }
                }
            }
            i11 = i12;
        }
        return null;
    }

    private final List<FlightSeatsSchemeV2Item> mapSchemeItems(MobileLegendBlockV2DTO legend, FlightSeatsSchemeV2BlockDTO schemeBlock, Map<String, TextDTO> selectedSeatIds, int schemeWidth) {
        ArrayList arrayList = new ArrayList();
        LegendV2VI map = this.legendMapper.map(legend);
        if (map != null) {
            arrayList.add(map);
        }
        List<FlightSeatsSchemeV2Item> map2 = this.schemeBlockMapper.map(schemeBlock, selectedSeatIds, schemeWidth);
        if (map2 != null) {
            arrayList.addAll(map2);
        }
        return arrayList;
    }

    @NotNull
    public final FlightSeatsSchemeV2BlockVI map(@NotNull FlightSeatsSchemeV2DTO state) {
        int px;
        Integer schemeWidth;
        Map map;
        AirplaneSeatTypeV2DTO selectedSeatType;
        List<AirplaneSeatTypeV2DTO> seatTypes;
        Integer schemeWidth2;
        Intrinsics.checkNotNullParameter(state, "state");
        List<FooterBlockV2DTO.PassengerV2DTO> passengers = state.getFooterBlock().getPassengers();
        Iterator<FooterBlockV2DTO.PassengerV2DTO> it = passengers.iterator();
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
        FooterBlockV2DTO.PassengerV2DTO passengerV2DTO = (FooterBlockV2DTO.PassengerV2DTO) C7714v.Q(Math.max(0, i11), passengers);
        String selectedSeatNumber = passengerV2DTO != null ? passengerV2DTO.getSelectedSeatNumber() : null;
        FlightSeatsSchemeV2BlockDTO schemeBlock = state.getSchemeBlock();
        List<FooterBlockV2DTO.PassengerV2DTO> list = passengers;
        ArrayList arrayList = new ArrayList();
        for (FooterBlockV2DTO.PassengerV2DTO passengerV2DTO2 : list) {
            String selectedSeatNumber2 = passengerV2DTO2.getSelectedSeatNumber();
            Pair pair = selectedSeatNumber2 != null ? new Pair(selectedSeatNumber2, passengerV2DTO2.getShortName()) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map<String, TextDTO> s11 = U.s(arrayList);
        int px2 = ResourceExtKt.toPx(16, this.context);
        int dimensionPixelSize = this.context.getResources().getDimensionPixelSize(R$dimen.composer_list_tablet_padding);
        if (this.context.getResources().getConfiguration().orientation == 2) {
            FlightSeatsSchemeV2BlockDTO schemeBlock2 = state.getSchemeBlock();
            px = (schemeBlock2 == null || (schemeWidth2 = schemeBlock2.getSchemeWidth()) == null) ? (this.context.getResources().getDisplayMetrics().widthPixels - (dimensionPixelSize * 2)) - px2 : ResourceExtKt.toPx(schemeWidth2.intValue(), this.context);
        } else {
            FlightSeatsSchemeV2BlockDTO schemeBlock3 = state.getSchemeBlock();
            px = (schemeBlock3 == null || (schemeWidth = schemeBlock3.getSchemeWidth()) == null) ? this.context.getResources().getDisplayMetrics().widthPixels - px2 : ResourceExtKt.toPx(schemeWidth.intValue(), this.context);
        }
        List<FlightSeatsSchemeV2Item> mapSchemeItems = mapSchemeItems(state.getMobileLegendBlock(), schemeBlock, s11, px);
        FlightSeatsSchemeV2BlockDTO schemeBlock4 = state.getSchemeBlock();
        int seatCountInRow = schemeBlock4 != null ? schemeBlock4.getSeatCountInRow() : 6;
        AirplaneSeatTypeV2VI.FuselageType fuselageType = seatCountInRow > 6 ? AirplaneSeatTypeV2VI.FuselageType.WIDE : seatCountInRow <= 4 ? AirplaneSeatTypeV2VI.FuselageType.NARROW : AirplaneSeatTypeV2VI.FuselageType.DEFAULT;
        if (schemeBlock == null || (seatTypes = schemeBlock.getSeatTypes()) == null) {
            map = null;
        } else {
            List<AirplaneSeatTypeV2DTO> list2 = seatTypes;
            int i12 = 10;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(AirplaneSeatTypeMapperKt.toVo$default((AirplaneSeatTypeV2DTO) it2.next(), null, null, fuselageType, false, 11, null));
                arrayList2 = arrayList3;
                i12 = i12;
            }
            ArrayList arrayList4 = arrayList2;
            int h11 = U.h(C7714v.z(arrayList4, i12));
            map = new LinkedHashMap(h11 >= 16 ? h11 : 16);
            for (Object obj : arrayList4) {
                map.put(((AirplaneSeatTypeV2VI) obj).getId(), obj);
            }
        }
        if (map == null) {
            map = U.c();
        }
        ArrayList arrayList5 = new ArrayList();
        for (FooterBlockV2DTO.PassengerV2DTO passengerV2DTO3 : list) {
            String selectedSeatNumber3 = passengerV2DTO3.getSelectedSeatNumber();
            Pair pair2 = selectedSeatNumber3 != null ? new Pair(selectedSeatNumber3, Integer.valueOf(passengerV2DTO3.getId())) : null;
            if (pair2 != null) {
                arrayList5.add(pair2);
            }
        }
        Map<String, Integer> s12 = U.s(arrayList5);
        ArrayList arrayList6 = new ArrayList(s12.size());
        for (Map.Entry<String, Integer> entry : s12.entrySet()) {
            arrayList6.add(new Pair(entry.getValue(), entry.getKey()));
        }
        return new FlightSeatsSchemeV2BlockVI(schemeBlock != null ? schemeBlock.getSeatSelectionAction() : null, findSelectedSeatPosition(mapSchemeItems, selectedSeatNumber), s12, U.s(arrayList6), findSelectedPassengerSeatPositions(mapSchemeItems, s12), map, (schemeBlock == null || (selectedSeatType = schemeBlock.getSelectedSeatType()) == null) ? null : AirplaneSeatTypeMapperKt.toVo$default(selectedSeatType, null, null, fuselageType, false, 11, null), schemeBlock != null ? mapSchemeItems : null, px, schemeBlock != null ? schemeBlock.getSwitchPassengerOnReservedSeatClick() : false);
    }
}
