package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.adapter;

import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AdapterDelegatesManager;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.TravelModalPriceDetailInformationV3VO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/adapter/TravelModalPriceDetailInformationV3Adapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceItem;", "<init>", "()V", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelModalPriceDetailInformationV3Adapter extends AsyncListDifferDelegationAdapter<TravelModalPriceDetailInformationV3VO.PriceItem> {
    public TravelModalPriceDetailInformationV3Adapter() {
        super(new i.d<TravelModalPriceDetailInformationV3VO.PriceItem>() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.adapter.TravelModalPriceDetailInformationV3Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelModalPriceDetailInformationV3VO.PriceItem oldItem, TravelModalPriceDetailInformationV3VO.PriceItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelModalPriceDetailInformationV3VO.PriceItem oldItem, TravelModalPriceDetailInformationV3VO.PriceItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        AdapterDelegatesManager<List<T>> adapterDelegatesManager = this.delegatesManager;
        adapterDelegatesManager.addDelegate(TravelModalPriceDetailInformationV3SectionAdapterDelegateKt.travelModalPriceDetailInformationV3SectionAdapterDelegate());
        adapterDelegatesManager.addDelegate(TravelModalPriceDetailInformationV3DetailsAdapterDelegateKt.travelModalPriceDetailInformationV3DetailsAdapterDelegate());
        adapterDelegatesManager.addDelegate(TravelModalPriceDetailInformationV3PriceAdapterDelegateKt.travelModalPriceDetailInformationV3PriceAdapterDelegate());
    }
}
