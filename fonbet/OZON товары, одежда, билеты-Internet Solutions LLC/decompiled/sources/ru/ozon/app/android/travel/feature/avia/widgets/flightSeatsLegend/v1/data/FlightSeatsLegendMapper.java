package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.data.FlightSeatsLegendDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.presentation.FlightSeatsLegendVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/data/FlightSeatsLegendMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/data/FlightSeatsLegendDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/data/FlightSeatsLegendDTO$SeatType;", "seatType", "", "stateId", "", "isSeparatorInvisible", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO$SeatType;", "mapSeatType", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/data/FlightSeatsLegendDTO$SeatType;Ljava/lang/String;Z)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO$SeatType;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/data/FlightSeatsLegendDTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsLegendMapper implements Function2<FlightSeatsLegendDTO, d, List<? extends FlightSeatsLegendVO>> {
    private final FlightSeatsLegendVO.SeatType mapSeatType(FlightSeatsLegendDTO.SeatType seatType, String stateId, boolean isSeparatorInvisible) {
        OzonSpannableString text = seatType.getDescription().getText();
        return new FlightSeatsLegendVO.SeatType((((Object) text) + "-" + stateId).hashCode(), AirplaneSeatMapperKt.toVo$default(seatType.getSign(), null, 4, 4, 1, null), seatType.getDescription(), seatType.getPriceFromBadge(), isSeparatorInvisible);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlightSeatsLegendVO> invoke(@NotNull FlightSeatsLegendDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        List<FlightSeatsLegendDTO.SeatType> seatTypes = state.getSeatTypes();
        ArrayList arrayList = new ArrayList(C7714v.z(seatTypes, 10));
        int i11 = 0;
        for (Object obj : seatTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapSeatType((FlightSeatsLegendDTO.SeatType) obj, widgetInfo.d(), i11 == C7714v.P(state.getSeatTypes())));
            i11 = i12;
        }
        return C7714v.a0(new FlightSeatsLegendVO(hashCode, title, arrayList));
    }
}
