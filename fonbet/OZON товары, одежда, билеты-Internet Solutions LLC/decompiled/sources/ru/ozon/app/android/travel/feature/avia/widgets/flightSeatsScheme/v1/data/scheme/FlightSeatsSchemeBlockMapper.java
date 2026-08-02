package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme;

import android.content.Context;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatDTO;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatMapperKt;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContentRow;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeEmptyContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeExitRow;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeOuterItem;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeSeatContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeTextContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J*\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J.\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u000eJ2\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J0\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002J\u0088\u0001\u0010+\u001a\u00020\u00142\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020,0\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0018\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020)H\u0002J>\u00103\u001a\b\u0012\u0004\u0012\u0002040\t2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020)H\u0002Jf\u00105\u001a\b\u0012\u0004\u0012\u0002040\t2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020,0\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0018\u001a\u00020,2\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020)H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "", "context", "Landroid/content/Context;", "orderDetailsMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsMapper;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsMapper;)V", "map", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;", "selectedSeatIds", "", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "orderDetails", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "select", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "contentRow", "number", "text", "selectedSeatTemplate", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "deselect", "seatTypes", "helperSelection", "newSeatProvider", "Lkotlin/Function1;", "topItem", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeOuterItem;", "radius", "", "bottomItem", "mapExitRow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeExitRow;", "items", "exitColor", "schemeWidth", "", "topOffset", "mapContentRow", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;", "id", "itemOffset", "itemWidth", "literalHeight", "firstAisleWidth", "secondAisleWidth", "mapLiterals", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContent;", "mapSeats", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeBlockMapper {

    @NotNull
    private final Context context;

    @NotNull
    private final FlightSeatsSchemeOrderDetailsMapper orderDetailsMapper;

    public FlightSeatsSchemeBlockMapper(@NotNull Context context, @NotNull FlightSeatsSchemeOrderDetailsMapper orderDetailsMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orderDetailsMapper, "orderDetailsMapper");
        this.context = context;
        this.orderDetailsMapper = orderDetailsMapper;
    }

    private final FlightSchemeOuterItem bottomItem(float radius) {
        return new FlightSchemeOuterItem("FlightSchemeOuterItem", 0.0f, radius);
    }

    private final FlightSchemeContentRow helperSelection(FlightSchemeContentRow contentRow, String number, Function1<? super AirplaneSeatVO, AirplaneSeatVO> newSeatProvider) {
        if (contentRow == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(contentRow.getContentList());
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            FlightSchemeContent flightSchemeContent = (FlightSchemeContent) it.next();
            if ((flightSchemeContent instanceof FlightSchemeSeatContent) && Intrinsics.d(((FlightSchemeSeatContent) flightSchemeContent).getSeat().getNumber(), number)) {
                break;
            }
            i11++;
        }
        if (i11 < 0) {
            return null;
        }
        Object obj = arrayList.get(i11);
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeSeatContent");
        FlightSchemeSeatContent flightSchemeSeatContent = (FlightSchemeSeatContent) obj;
        AirplaneSeatVO invoke = newSeatProvider.invoke(flightSchemeSeatContent.getSeat());
        if (invoke == null) {
            return null;
        }
        arrayList.set(i11, FlightSchemeSeatContent.copy$default(flightSchemeSeatContent, 0, 0, invoke, 3, null));
        return FlightSchemeContentRow.copy$default(contentRow, null, 0, 0, 0, arrayList, 15, null);
    }

    private final FlightSchemeContentRow mapContentRow(List<? extends Object> items, Map<String, AirplaneSeatDTO> seatTypes, Map<String, TextAtom> selectedSeatIds, AirplaneSeatDTO selectedSeatTemplate, String id2, int topOffset, int itemOffset, int schemeWidth, int itemWidth, int literalHeight, int firstAisleWidth, int secondAisleWidth) {
        return new FlightSchemeContentRow(id2, topOffset, itemOffset, schemeWidth, C7714v.M(items) instanceof TextAtom ? mapLiterals(items, itemWidth, literalHeight, firstAisleWidth, secondAisleWidth) : mapSeats(items, seatTypes, selectedSeatIds, selectedSeatTemplate, itemWidth, firstAisleWidth, secondAisleWidth));
    }

    private final FlightSchemeExitRow mapExitRow(List<? extends Object> items, String exitColor, int schemeWidth, int topOffset) {
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : items) {
            if (obj3 instanceof FlightSeatsSchemeBlockDTO.ExitDTO) {
                arrayList.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((FlightSeatsSchemeBlockDTO.ExitDTO) obj).isLeft()) {
                break;
            }
        }
        FlightSeatsSchemeBlockDTO.ExitDTO exitDTO = (FlightSeatsSchemeBlockDTO.ExitDTO) obj;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (!((FlightSeatsSchemeBlockDTO.ExitDTO) obj2).isLeft()) {
                break;
            }
        }
        FlightSeatsSchemeBlockDTO.ExitDTO exitDTO2 = (FlightSeatsSchemeBlockDTO.ExitDTO) obj2;
        return new FlightSchemeExitRow("FlightSchemeExitRow", exitDTO != null ? exitDTO.getText() : null, exitDTO2 != null ? exitDTO2.getText() : null, schemeWidth, topOffset, exitColor);
    }

    private final List<FlightSchemeContent> mapLiterals(List<? extends Object> items, int itemWidth, int literalHeight, int firstAisleWidth, int secondAisleWidth) {
        Object flightSchemeTextContent;
        ArrayList arrayList = new ArrayList();
        boolean z11 = true;
        for (Object obj : items) {
            if (obj instanceof TextAtom) {
                flightSchemeTextContent = new FlightSchemeTextContent(itemWidth, literalHeight, (TextAtom) obj);
            } else if (obj instanceof FlightSeatsSchemeBlockDTO.AisleDTO) {
                flightSchemeTextContent = new FlightSchemeEmptyContent(z11 ? firstAisleWidth : secondAisleWidth, literalHeight);
                z11 = false;
            }
            arrayList.add(flightSchemeTextContent);
        }
        return arrayList;
    }

    private final List<FlightSchemeContent> mapSeats(List<? extends Object> items, Map<String, AirplaneSeatDTO> seatTypes, Map<String, TextAtom> selectedSeatIds, AirplaneSeatDTO selectedSeatTemplate, int itemWidth, int firstAisleWidth, int secondAisleWidth) {
        Object flightSchemeTextContent;
        AirplaneSeatDTO airplaneSeatDTO;
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof FlightSeatsSchemeBlockDTO.AisleDTO) {
                FlightSeatsSchemeBlockDTO.AisleDTO aisleDTO = (FlightSeatsSchemeBlockDTO.AisleDTO) obj;
                flightSchemeTextContent = aisleDTO.getNumber() != null ? new FlightSchemeTextContent(firstAisleWidth, itemWidth, aisleDTO.getNumber()) : new FlightSchemeEmptyContent(secondAisleWidth, itemWidth);
            } else if (obj instanceof FlightSeatsSchemeBlockDTO.SeatDTO) {
                FlightSeatsSchemeBlockDTO.SeatDTO seatDTO = (FlightSeatsSchemeBlockDTO.SeatDTO) obj;
                TextAtom textAtom = selectedSeatIds.get(seatDTO.getNumber());
                if (textAtom == null || (airplaneSeatDTO = AirplaneSeatDTO.copy$default(selectedSeatTemplate, seatDTO.getTypeID(), null, false, textAtom, null, 22, null)) == null) {
                    airplaneSeatDTO = seatTypes.get(seatDTO.getTypeID());
                }
                AirplaneSeatDTO airplaneSeatDTO2 = airplaneSeatDTO;
                flightSchemeTextContent = airplaneSeatDTO2 != null ? new FlightSchemeSeatContent(itemWidth, itemWidth, AirplaneSeatMapperKt.toVo$default(airplaneSeatDTO2, seatDTO.getNumber(), 0, 0, 6, null)) : null;
            } else if (obj == null) {
                flightSchemeTextContent = new FlightSchemeEmptyContent(itemWidth, itemWidth);
            }
            if (flightSchemeTextContent != null) {
                arrayList.add(flightSchemeTextContent);
            }
        }
        return arrayList;
    }

    private final FlightSchemeOuterItem topItem(float radius) {
        return new FlightSchemeOuterItem("FlightSchemeOuterItem", radius, 0.0f);
    }

    public final FlightSchemeContentRow deselect(FlightSchemeContentRow contentRow, @NotNull String number, @NotNull Map<String, AirplaneSeatVO> seatTypes) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return helperSelection(contentRow, number, new FlightSeatsSchemeBlockMapper$deselect$1(seatTypes, number));
    }

    public final List<FlightSeatsSchemeItem> map(FlightSeatsSchemeBlockDTO item, @NotNull Map<String, TextAtom> selectedSeatIds, FlightSeatsSchemeOrderDetailsDTO orderDetails) {
        int i11;
        Object mapContentRow;
        Map<String, TextAtom> selectedSeatIds2 = selectedSeatIds;
        Intrinsics.checkNotNullParameter(selectedSeatIds2, "selectedSeatIds");
        if (item == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float pxF = ResourceExtKt.toPxF(20, this.context);
        arrayList.add(topItem(pxF));
        int px = ResourceExtKt.toPx(item.getSchemeWidth(), this.context);
        int i12 = item.getSeatCountInRow() > 6 ? 2 : 1;
        int px2 = ResourceExtKt.toPx(i12 == 1 ? 54 : 16, this.context);
        int px3 = ResourceExtKt.toPx(i12 == 1 ? 0 : 8, this.context);
        int px4 = ResourceExtKt.toPx(item.getSeatCountInRow() > 6 ? 4 : 8, this.context);
        int c11 = C6915b.c(((px - (((item.getSeatCountInRow() + i12) - 1) * px4)) - (px2 + px3)) / item.getSeatCountInRow());
        int px5 = ResourceExtKt.toPx(20, this.context);
        List<AirplaneSeatDTO> seatTypes = item.getSeatTypes();
        int h11 = U.h(C7714v.z(seatTypes, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 >= 16 ? h11 : 16);
        for (Object obj : seatTypes) {
            linkedHashMap.put(((AirplaneSeatDTO) obj).getId(), obj);
        }
        int i13 = 0;
        for (Object obj2 : item.getRows()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            FlightSeatsSchemeBlockDTO.RowDTO rowDTO = (FlightSeatsSchemeBlockDTO.RowDTO) obj2;
            if (C7714v.M(rowDTO.getSeats()) instanceof FlightSeatsSchemeBlockDTO.ExitDTO) {
                mapContentRow = mapExitRow(rowDTO.getSeats(), item.getExitMarkingColor(), px, i13 == 0 ? 0 : px4);
                i11 = px4;
            } else {
                i11 = px4;
                mapContentRow = mapContentRow(rowDTO.getSeats(), linkedHashMap, selectedSeatIds2, item.getSelectedSeatType(), String.valueOf(i14), i11, i11, px, c11, px5, px2, px3);
            }
            arrayList.add(mapContentRow);
            selectedSeatIds2 = selectedSeatIds;
            px4 = i11;
            i13 = i14;
        }
        arrayList.add(bottomItem(pxF));
        FlightSeatsSchemeOrderDetailsVO map = this.orderDetailsMapper.map(orderDetails);
        if (map != null) {
            arrayList.add(map);
        }
        return arrayList;
    }

    public final FlightSchemeContentRow select(FlightSchemeContentRow contentRow, @NotNull String number, @NotNull TextAtom text, @NotNull AirplaneSeatVO selectedSeatTemplate) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(selectedSeatTemplate, "selectedSeatTemplate");
        return helperSelection(contentRow, number, new FlightSeatsSchemeBlockMapper$select$1(selectedSeatTemplate, text, number));
    }
}
