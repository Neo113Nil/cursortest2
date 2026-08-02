package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.data;

import WZ.x;
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
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.data.FlightSeatsLegendV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.presentation.FlightSeatsLegendV2VI;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/data/FlightSeatsLegendV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/data/FlightSeatsLegendV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/data/FlightSeatsLegendV2DTO$SeatTypeV2DTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI$SeatTypeV2VI;", "toVI", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/data/FlightSeatsLegendV2DTO$SeatTypeV2DTO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI$SeatTypeV2VI;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/data/FlightSeatsLegendV2DTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsLegendV2Mapper implements Function2<FlightSeatsLegendV2DTO, d, List<? extends FlightSeatsLegendV2VI>> {
    private final FlightSeatsLegendV2VI.SeatTypeV2VI toVI(FlightSeatsLegendV2DTO.SeatTypeV2DTO seatTypeV2DTO) {
        return new FlightSeatsLegendV2VI.SeatTypeV2VI(seatTypeV2DTO.getCell().hashCode(), seatTypeV2DTO.getSeatText(), seatTypeV2DTO.getSeatBackgroundColor(), seatTypeV2DTO.getSeatBackrestColor(), seatTypeV2DTO.getCell());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlightSeatsLegendV2VI> invoke(@NotNull FlightSeatsLegendV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        List<FlightSeatsLegendV2DTO.SeatTypeV2DTO> seatTypes = state.getSeatTypes();
        ArrayList arrayList = new ArrayList(C7714v.z(seatTypes, 10));
        Iterator<T> it = seatTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(toVI((FlightSeatsLegendV2DTO.SeatTypeV2DTO) it.next()));
        }
        Map<String, TokenizedTrackingInfo> viewTracking = state.getViewTracking();
        return C7714v.a0(new FlightSeatsLegendV2VI(hashCode, title, arrayList, viewTracking != null ? x.b(viewTracking, Long.valueOf(hashCode), null) : null));
    }
}
