package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.header;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.FlightSeatsSchemeV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.FlightSeatsSchemeV2HeaderBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockMapper;", "", "<init>", "()V", "map", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;", "state", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "literalsRow", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2HeaderBlockMapper {
    @NotNull
    public final FlightSeatsSchemeV2HeaderBlockVI map(@NotNull FlightSeatsSchemeV2DTO state, FlightSchemeContentRowV2 literalsRow) {
        Object obj;
        Intrinsics.checkNotNullParameter(state, "state");
        FlightSeatsSchemeV2HeaderBlockDTO headerBlock = state.getHeaderBlock();
        TextDTO title = headerBlock != null ? headerBlock.getTitle() : null;
        FlightSeatsSchemeV2HeaderBlockDTO headerBlock2 = state.getHeaderBlock();
        TextDTO subtitle = headerBlock2 != null ? headerBlock2.getSubtitle() : null;
        Iterator<T> it = state.getFooterBlock().getPassengers().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((FooterBlockV2DTO.PassengerV2DTO) obj).isCurrent()) {
                break;
            }
        }
        FooterBlockV2DTO.PassengerV2DTO passengerV2DTO = (FooterBlockV2DTO.PassengerV2DTO) obj;
        return new FlightSeatsSchemeV2HeaderBlockVI(title, subtitle, passengerV2DTO != null ? passengerV2DTO.getSubtitleName() : null, literalsRow);
    }
}
