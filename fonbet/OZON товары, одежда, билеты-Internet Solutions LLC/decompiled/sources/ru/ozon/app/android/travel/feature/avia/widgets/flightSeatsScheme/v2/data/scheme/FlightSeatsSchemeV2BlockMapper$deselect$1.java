package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "item", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2BlockMapper$deselect$1 extends AbstractC7737t implements Function2<AirplaneSeatTypeV2VI, TextDTO, AirplaneSeatTypeV2VI> {
    final /* synthetic */ String $number;
    final /* synthetic */ Map<String, AirplaneSeatTypeV2VI> $seatTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2BlockMapper$deselect$1(Map<String, AirplaneSeatTypeV2VI> map, String str) {
        super(2);
        this.$seatTypes = map;
        this.$number = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AirplaneSeatTypeV2VI invoke(AirplaneSeatTypeV2VI item, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(item, "item");
        AirplaneSeatTypeV2VI airplaneSeatTypeV2VI = this.$seatTypes.get(item.getId());
        if (airplaneSeatTypeV2VI != null) {
            return AirplaneSeatTypeV2VI.copy$default(airplaneSeatTypeV2VI, null, null, false, null, null, this.$number, textDTO, false, null, 287, null);
        }
        return null;
    }
}
