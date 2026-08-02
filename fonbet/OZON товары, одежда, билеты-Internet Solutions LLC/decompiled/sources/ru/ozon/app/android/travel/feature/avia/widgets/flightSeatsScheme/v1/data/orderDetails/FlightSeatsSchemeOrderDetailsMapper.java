package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsMapper;", "", "<init>", "()V", "map", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "mapFlightPrices", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$PriceItem;", "items", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO$FlightPrice;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeOrderDetailsMapper {
    private final List<FlightSeatsSchemeOrderDetailsVO.PriceItem> mapFlightPrices(List<FlightSeatsSchemeOrderDetailsDTO.FlightPrice> items) {
        ArrayList arrayList = new ArrayList();
        Iterator<FlightSeatsSchemeOrderDetailsDTO.FlightPrice> it = items.iterator();
        while (it.hasNext()) {
            int i11 = 0;
            for (Object obj : it.next().getPrices()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                FlightSeatsSchemeOrderDetailsDTO.ItemWithPrice itemWithPrice = (FlightSeatsSchemeOrderDetailsDTO.ItemWithPrice) obj;
                String obj2 = itemWithPrice.getItem().getText().toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                arrayList.add(i11 == 0 ? new FlightSeatsSchemeOrderDetailsVO.SectionTitle(obj2, itemWithPrice.getItem()) : new FlightSeatsSchemeOrderDetailsVO.SeatPriceInfo(obj2, itemWithPrice.getItem(), itemWithPrice.getPrice()));
                i11 = i12;
            }
        }
        return arrayList;
    }

    public final FlightSeatsSchemeOrderDetailsVO map(FlightSeatsSchemeOrderDetailsDTO item) {
        if (item == null) {
            return null;
        }
        return new FlightSeatsSchemeOrderDetailsVO("FlightSeatsSchemeOrderDetailsVO", item.getHeader(), item.getTotalPriceTitle(), item.getTotalPrice(), item.getSubmitButton(), mapFlightPrices(item.getFlightPrices()));
    }
}
