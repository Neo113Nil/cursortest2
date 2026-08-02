package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme;

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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.airplaneSeat.AirplaneSeatTypeMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.airplaneSeat.AirplaneSeatTypeV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeEmptyContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeExitRowV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeOuterItemV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeSeatContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeTextContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u0010J*\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J.\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\fJ:\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\r2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J0\u0010\"\u001a\u00020#2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010%\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0002J\u0098\u0001\u0010'\u001a\u00020\u00122\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(0\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0016\u001a\u00020(2\u0006\u0010)\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002JF\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00102\u0006\u00101\u001a\u000202H\u0002Jn\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00072\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(0\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0016\u001a\u00020(2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00102\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockMapper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "map", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "selectedSeatIds", "", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "schemeWidth", "", "select", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "contentRow", "number", "text", "selectedSeatTemplate", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "deselect", "seatTypes", "helperSelection", "newSeatProvider", "Lkotlin/Function2;", "topItem", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeOuterItemV2;", "radius", "", "bottomItem", "mapExitRow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeExitRowV2;", "items", "exitColor", "topOffset", "mapContentRow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/airplaneSeat/AirplaneSeatTypeV2DTO;", "id", "itemOffset", "itemWidth", "literalHeight", "firstAisleWidth", "secondAisleWidth", "isSticky", "", "fuselageType", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI$FuselageType;", "mapLiterals", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentV2;", "mapSeats", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2BlockMapper {

    @NotNull
    private final Context context;

    public FlightSeatsSchemeV2BlockMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final FlightSchemeOuterItemV2 bottomItem(float radius) {
        return new FlightSchemeOuterItemV2("FlightSchemeOuterItem", 0.0f, radius);
    }

    private final FlightSchemeContentRowV2 helperSelection(FlightSchemeContentRowV2 contentRow, String number, Function2<? super AirplaneSeatTypeV2VI, ? super TextDTO, AirplaneSeatTypeV2VI> newSeatProvider) {
        if (contentRow == null) {
            return null;
        }
        ArrayList W02 = C7714v.W0(contentRow.getContentList());
        Iterator it = W02.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            FlightSchemeContentV2 flightSchemeContentV2 = (FlightSchemeContentV2) it.next();
            if ((flightSchemeContentV2 instanceof FlightSchemeSeatContentV2) && Intrinsics.d(((FlightSchemeSeatContentV2) flightSchemeContentV2).getSeat().getNumber(), number)) {
                break;
            }
            i11++;
        }
        if (i11 < 0) {
            return null;
        }
        Object obj = W02.get(i11);
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeSeatContentV2");
        FlightSchemeSeatContentV2 flightSchemeSeatContentV2 = (FlightSchemeSeatContentV2) obj;
        AirplaneSeatTypeV2VI invoke = newSeatProvider.invoke(flightSchemeSeatContentV2.getSeat(), flightSchemeSeatContentV2.getSeat().getPrice());
        if (invoke == null) {
            return null;
        }
        W02.set(i11, FlightSchemeSeatContentV2.copy$default(flightSchemeSeatContentV2, 0, 0, invoke, null, 11, null));
        return FlightSchemeContentRowV2.copy$default(contentRow, null, 0, 0, 0, W02, false, 47, null);
    }

    private final FlightSchemeContentRowV2 mapContentRow(List<? extends Object> items, Map<String, AirplaneSeatTypeV2DTO> seatTypes, Map<String, TextDTO> selectedSeatIds, AirplaneSeatTypeV2DTO selectedSeatTemplate, String id2, int topOffset, int itemOffset, int schemeWidth, int itemWidth, int literalHeight, int firstAisleWidth, int secondAisleWidth, boolean isSticky, AirplaneSeatTypeV2VI.FuselageType fuselageType) {
        return new FlightSchemeContentRowV2(id2, topOffset, itemOffset, schemeWidth, C7714v.M(items) instanceof TextDTO ? mapLiterals(items, itemWidth, literalHeight, firstAisleWidth, secondAisleWidth, fuselageType) : mapSeats(items, seatTypes, selectedSeatIds, selectedSeatTemplate, itemWidth, firstAisleWidth, secondAisleWidth, fuselageType), isSticky);
    }

    private final FlightSchemeExitRowV2 mapExitRow(List<? extends Object> items, String exitColor, int schemeWidth, int topOffset) {
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : items) {
            if (obj3 instanceof FlightSeatsSchemeV2BlockDTO.ExitV2DTO) {
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
            if (((FlightSeatsSchemeV2BlockDTO.ExitV2DTO) obj).isLeft()) {
                break;
            }
        }
        FlightSeatsSchemeV2BlockDTO.ExitV2DTO exitV2DTO = (FlightSeatsSchemeV2BlockDTO.ExitV2DTO) obj;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (!((FlightSeatsSchemeV2BlockDTO.ExitV2DTO) obj2).isLeft()) {
                break;
            }
        }
        FlightSeatsSchemeV2BlockDTO.ExitV2DTO exitV2DTO2 = (FlightSeatsSchemeV2BlockDTO.ExitV2DTO) obj2;
        return new FlightSchemeExitRowV2("FlightSchemeExitRow", exitV2DTO != null ? exitV2DTO.getText() : null, exitV2DTO2 != null ? exitV2DTO2.getText() : null, schemeWidth, topOffset, exitColor);
    }

    private final List<FlightSchemeContentV2> mapLiterals(List<? extends Object> items, int itemWidth, int literalHeight, int firstAisleWidth, int secondAisleWidth, AirplaneSeatTypeV2VI.FuselageType fuselageType) {
        FlightSchemeContentV2 flightSchemeContentV2;
        ArrayList arrayList = new ArrayList();
        boolean z11 = true;
        for (Object obj : items) {
            if (obj instanceof TextDTO) {
                flightSchemeContentV2 = new FlightSchemeTextContentV2(itemWidth, literalHeight, fuselageType, (TextDTO) obj);
            } else if (obj instanceof FlightSeatsSchemeV2BlockDTO.AisleV2DTO) {
                flightSchemeContentV2 = new FlightSchemeEmptyContentV2(z11 ? firstAisleWidth : secondAisleWidth, literalHeight);
                z11 = false;
            } else {
                flightSchemeContentV2 = null;
            }
            if (flightSchemeContentV2 != null) {
                arrayList.add(flightSchemeContentV2);
            }
        }
        return arrayList;
    }

    private final List<FlightSchemeContentV2> mapSeats(List<? extends Object> items, Map<String, AirplaneSeatTypeV2DTO> seatTypes, Map<String, TextDTO> selectedSeatIds, AirplaneSeatTypeV2DTO selectedSeatTemplate, int itemWidth, int firstAisleWidth, int secondAisleWidth, AirplaneSeatTypeV2VI.FuselageType fuselageType) {
        FlightSchemeContentV2 flightSchemeTextContentV2;
        AirplaneSeatTypeV2DTO airplaneSeatTypeV2DTO;
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof FlightSeatsSchemeV2BlockDTO.AisleV2DTO) {
                FlightSeatsSchemeV2BlockDTO.AisleV2DTO aisleV2DTO = (FlightSeatsSchemeV2BlockDTO.AisleV2DTO) obj;
                flightSchemeTextContentV2 = aisleV2DTO.getNumber() != null ? new FlightSchemeTextContentV2(firstAisleWidth, itemWidth, fuselageType, aisleV2DTO.getNumber()) : new FlightSchemeEmptyContentV2(secondAisleWidth, itemWidth);
            } else if (obj instanceof FlightSeatsSchemeV2BlockDTO.SeatV2DTO) {
                FlightSeatsSchemeV2BlockDTO.SeatV2DTO seatV2DTO = (FlightSeatsSchemeV2BlockDTO.SeatV2DTO) obj;
                TextDTO textDTO = selectedSeatIds.get(seatV2DTO.getNumber());
                if (textDTO == null || (airplaneSeatTypeV2DTO = AirplaneSeatTypeV2DTO.copy$default(selectedSeatTemplate, seatV2DTO.getTypeID(), null, false, textDTO, null, 22, null)) == null) {
                    airplaneSeatTypeV2DTO = seatTypes.get(seatV2DTO.getTypeID());
                }
                if (airplaneSeatTypeV2DTO != null) {
                    AirplaneSeatTypeV2VI vo = AirplaneSeatTypeMapperKt.toVo(airplaneSeatTypeV2DTO, seatV2DTO.getNumber(), seatV2DTO.getPrice(), fuselageType, seatV2DTO.isPriceInvisible());
                    CommonControlSettings common = seatV2DTO.getCommon();
                    flightSchemeTextContentV2 = new FlightSchemeSeatContentV2(itemWidth, itemWidth, vo, common != null ? common.toAtomAction() : null);
                } else {
                    flightSchemeTextContentV2 = null;
                }
            } else if (obj == null) {
                flightSchemeTextContentV2 = new FlightSchemeEmptyContentV2(itemWidth, itemWidth);
            }
            if (flightSchemeTextContentV2 != null) {
                arrayList.add(flightSchemeTextContentV2);
            }
        }
        return arrayList;
    }

    private final FlightSchemeOuterItemV2 topItem(float radius) {
        return new FlightSchemeOuterItemV2("FlightSchemeOuterItem", radius, 0.0f);
    }

    public final FlightSchemeContentRowV2 deselect(FlightSchemeContentRowV2 contentRow, @NotNull String number, @NotNull Map<String, AirplaneSeatTypeV2VI> seatTypes) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return helperSelection(contentRow, number, new FlightSeatsSchemeV2BlockMapper$deselect$1(seatTypes, number));
    }

    public final List<FlightSeatsSchemeV2Item> map(FlightSeatsSchemeV2BlockDTO item, @NotNull Map<String, TextDTO> selectedSeatIds, int schemeWidth) {
        int i11;
        int i12;
        AirplaneSeatTypeV2VI.FuselageType fuselageType;
        Iterator it;
        float f7;
        ArrayList arrayList;
        Object mapContentRow;
        int i13 = schemeWidth;
        Map<String, TextDTO> selectedSeatIds2 = selectedSeatIds;
        Intrinsics.checkNotNullParameter(selectedSeatIds2, "selectedSeatIds");
        Throwable th2 = null;
        if (item == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        float pxF = ResourceExtKt.toPxF(20, this.context);
        arrayList2.add(topItem(pxF));
        int px = ResourceExtKt.toPx((item.getCountOfAisle() == 1 && item.isBusiness()) ? 34 : item.getCountOfAisle() == 1 ? 60 : (item.getCountOfAisle() == 1 || !item.isBusiness()) ? 16 : 24, this.context);
        int i14 = item.getCountOfAisle() == 1 ? 0 : px;
        int px2 = ResourceExtKt.toPx(item.getSeatCountInRow() > 6 ? 4 : 8, this.context);
        int c11 = C6915b.c(((i13 - (((item.getCountOfAisle() + item.getSeatCountInRow()) - 1) * px2)) - (px + i14)) / item.getSeatCountInRow());
        int px3 = ResourceExtKt.toPx(26, this.context);
        List<AirplaneSeatTypeV2DTO> seatTypes = item.getSeatTypes();
        int h11 = U.h(C7714v.z(seatTypes, 10));
        int i15 = h11 >= 16 ? h11 : 16;
        float f11 = pxF;
        LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
        for (Object obj : seatTypes) {
            linkedHashMap.put(((AirplaneSeatTypeV2DTO) obj).getId(), obj);
            th2 = th2;
        }
        Throwable th3 = th2;
        AirplaneSeatTypeV2VI.FuselageType fuselageType2 = item.getSeatCountInRow() > 6 ? AirplaneSeatTypeV2VI.FuselageType.WIDE : item.getSeatCountInRow() <= 4 ? AirplaneSeatTypeV2VI.FuselageType.NARROW : AirplaneSeatTypeV2VI.FuselageType.DEFAULT;
        Iterator it2 = item.getRows().iterator();
        int i16 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i17 = i16 + 1;
            if (i16 < 0) {
                C7714v.O0();
                throw th3;
            }
            FlightSeatsSchemeV2BlockDTO.RowV2DTO rowV2DTO = (FlightSeatsSchemeV2BlockDTO.RowV2DTO) next;
            if (C7714v.M(rowV2DTO.getSeats()) instanceof FlightSeatsSchemeV2BlockDTO.ExitV2DTO) {
                mapContentRow = mapExitRow(rowV2DTO.getSeats(), item.getExitMarkingColor(), i13, i16 == 0 ? 0 : px2);
                i11 = c11;
                f7 = f11;
                it = it2;
                arrayList = arrayList2;
                i12 = px2;
                fuselageType = fuselageType2;
            } else {
                ArrayList arrayList3 = arrayList2;
                List<? extends Object> seats = rowV2DTO.getSeats();
                i11 = c11;
                i12 = px2;
                float f12 = f11;
                fuselageType = fuselageType2;
                it = it2;
                f7 = f12;
                arrayList = arrayList3;
                mapContentRow = mapContentRow(seats, linkedHashMap, selectedSeatIds2, item.getSelectedSeatType(), String.valueOf(i17), i12, i12, i13, i11, px3, px, i14, rowV2DTO.isSticky(), fuselageType);
            }
            arrayList.add(mapContentRow);
            selectedSeatIds2 = selectedSeatIds;
            i13 = schemeWidth;
            px2 = i12;
            c11 = i11;
            fuselageType2 = fuselageType;
            arrayList2 = arrayList;
            i16 = i17;
            it2 = it;
            f11 = f7;
        }
        ArrayList arrayList4 = arrayList2;
        arrayList4.add(bottomItem(f11));
        return arrayList4;
    }

    public final FlightSchemeContentRowV2 select(FlightSchemeContentRowV2 contentRow, @NotNull String number, @NotNull TextDTO text, @NotNull AirplaneSeatTypeV2VI selectedSeatTemplate) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(selectedSeatTemplate, "selectedSeatTemplate");
        return helperSelection(contentRow, number, new FlightSeatsSchemeV2BlockMapper$select$1(selectedSeatTemplate, text, number));
    }
}
