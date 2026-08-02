package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.legend;

import kotlin.Metadata;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.LegendV2VI;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/LegendMapperV2;", "", "<init>", "()V", "map", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/LegendV2VI;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/MobileLegendBlockV2DTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LegendMapperV2 {
    public final LegendV2VI map(MobileLegendBlockV2DTO item) {
        if (item == null) {
            return null;
        }
        return new LegendV2VI("MobileLegendBlock", item.getTitle(), item.getPrice(), MapperExtKt.toVO(item.getImage()), item.getSelectionIcon(), item.getCommon().toAtomAction());
    }
}
