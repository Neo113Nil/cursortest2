package ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsDTO;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsMapperKt;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.flight.FlightRouteDetailsVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/data/FlightRouteDetailsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/data/FlightRouteDetailsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/presentation/flight/FlightRouteDetailsVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/data/FlightRouteDetailsDTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightRouteDetailsMapper implements Function2<FlightRouteDetailsDTO, d, List<? extends FlightRouteDetailsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlightRouteDetailsVO> invoke(@NotNull FlightRouteDetailsDTO state, @NotNull d widgetInfo) {
        Pair pair;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<FlightDetailsDTO> flights = state.getFlights();
        ArrayList arrayList = new ArrayList(C7714v.z(flights, 10));
        int i11 = 0;
        for (Object obj : flights) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FlightDetailsDTO flightDetailsDTO = (FlightDetailsDTO) obj;
            long hashCode = (i11 + widgetInfo.d()).hashCode();
            FlightDetailsVO vo = FlightDetailsMapperKt.toVO(flightDetailsDTO);
            int marginBetweenFlights = i11 != 0 ? state.getMarginBetweenFlights() : 0;
            if (flightDetailsDTO.getFavoriteButton() instanceof FavoriteProductMoleculeV4) {
                Long valueOf = Long.valueOf(((FavoriteProductMoleculeV4) flightDetailsDTO.getFavoriteButton()).getSku());
                CommonControlSettings favoriteModalAction = flightDetailsDTO.getFavoriteModalAction();
                pair = new Pair(valueOf, favoriteModalAction != null ? favoriteModalAction.toAtomAction() : null);
            } else {
                pair = null;
            }
            arrayList.add(new FlightRouteDetailsVO(hashCode, vo, marginBetweenFlights, pair));
            i11 = i12;
        }
        return arrayList;
    }
}
