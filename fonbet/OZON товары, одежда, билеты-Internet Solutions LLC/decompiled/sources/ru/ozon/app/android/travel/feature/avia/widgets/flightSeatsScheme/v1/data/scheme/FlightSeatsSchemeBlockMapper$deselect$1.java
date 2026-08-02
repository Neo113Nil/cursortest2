package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeBlockMapper$deselect$1 extends AbstractC7737t implements Function1<AirplaneSeatVO, AirplaneSeatVO> {
    final /* synthetic */ String $number;
    final /* synthetic */ Map<String, AirplaneSeatVO> $seatTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeBlockMapper$deselect$1(Map<String, AirplaneSeatVO> map, String str) {
        super(1);
        this.$seatTypes = map;
        this.$number = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AirplaneSeatVO invoke(AirplaneSeatVO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AirplaneSeatVO airplaneSeatVO = this.$seatTypes.get(it.getId());
        if (airplaneSeatVO != null) {
            return AirplaneSeatVO.copy$default(airplaneSeatVO, null, null, false, 0, 0, null, null, this.$number, 127, null);
        }
        return null;
    }
}
