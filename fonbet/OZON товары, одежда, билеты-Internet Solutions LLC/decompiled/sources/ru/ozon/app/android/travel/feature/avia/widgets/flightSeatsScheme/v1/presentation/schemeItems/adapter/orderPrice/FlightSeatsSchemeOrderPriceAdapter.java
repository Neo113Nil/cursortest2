package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.orderPrice;

import kotlin.Metadata;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/adapter/orderPrice/FlightSeatsSchemeOrderPriceAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO$PriceItem;", "<init>", "()V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeOrderPriceAdapter extends AsyncListDifferDelegationAdapter<FlightSeatsSchemeOrderDetailsVO.PriceItem> {
    public FlightSeatsSchemeOrderPriceAdapter() {
        super(new FlightSeatsSchemeOrderPriceAdapterItemCallback());
        this.delegatesManager.addDelegate(FlightSeatsSchemePriceSectionTitleAdapterDelegateKt.flightSeatsSchemePriceSectionTitleAdapterDelegate());
        this.delegatesManager.addDelegate(FlightSeatsSchemeSeatPriceInfoAdapterDelegateKt.flightSeatsSchemeSeatPriceInfoAdapterDelegate());
    }
}
