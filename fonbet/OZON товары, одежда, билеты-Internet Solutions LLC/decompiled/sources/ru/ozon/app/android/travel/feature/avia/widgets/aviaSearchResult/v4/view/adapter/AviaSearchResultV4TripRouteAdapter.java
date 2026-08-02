package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4TripRouteAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute$Transfer;", "<init>", "()V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4TripRouteAdapter extends AsyncListDifferDelegationAdapter<AviaSearchResultV4FlightVO.TripRoute.Transfer> {
    public AviaSearchResultV4TripRouteAdapter() {
        super(new i.d<AviaSearchResultV4FlightVO.TripRoute.Transfer>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.adapter.AviaSearchResultV4TripRouteAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AviaSearchResultV4FlightVO.TripRoute.Transfer oldItem, AviaSearchResultV4FlightVO.TripRoute.Transfer newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AviaSearchResultV4FlightVO.TripRoute.Transfer oldItem, AviaSearchResultV4FlightVO.TripRoute.Transfer newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        this.delegatesManager.addDelegate(R$id.aviaSearchResultV4TripRouteViewType, AviaSearchResultV4TripRouteAdapterDelegateKt.aviaSearchResultV4TripRouteAdapterDelegate());
    }
}
