package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainListItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate.TravelTrainRouteDropDownAdapterDelegateKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate.TravelTrainRouteFooterAdapterDelegateKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate.TravelTrainRouteHeaderAdapterDelegateKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate.TravelTrainRouteTrainAdapterDelegateKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate.TravelTrainRouteTrainStationAdapterDelegateKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate.TravelTrainRouteTransferAdapterDelegateKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/adapter/trains/TravelTrainRouteTrainListAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainListItem;", "onDropDownClick", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainRouteTrainListAdapter extends AsyncListDifferDelegationAdapter<TrainListItem> {
    public /* synthetic */ TravelTrainRouteTrainListAdapter(Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : function0);
    }

    public TravelTrainRouteTrainListAdapter(Function0<Unit> function0) {
        super(new i.d<TrainListItem>() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.TravelTrainRouteTrainListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TrainListItem oldItem, TrainListItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TrainListItem oldItem, TrainListItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        this.delegatesManager.addDelegate(R$id.travelTrainRouteTrainViewType, TravelTrainRouteTrainAdapterDelegateKt.travelTrainRouteTrainAdapterDelegate());
        this.delegatesManager.addDelegate(R$id.travelTrainRouteTransferViewType, TravelTrainRouteTransferAdapterDelegateKt.travelTrainRouteTransferAdapterDelegate());
        this.delegatesManager.addDelegate(R$id.travelTrainRouteTrainStationViewType, TravelTrainRouteTrainStationAdapterDelegateKt.travelTrainRouteTrainStationAdapterDelegate());
        this.delegatesManager.addDelegate(R$id.travelTrainRouteHeaderViewType, TravelTrainRouteHeaderAdapterDelegateKt.travelTrainRouteHeaderAdapterDelegate());
        this.delegatesManager.addDelegate(R$id.travelTrainRouteFooterViewType, TravelTrainRouteFooterAdapterDelegateKt.travelTrainRouteFooterAdapterDelegate());
        this.delegatesManager.addDelegate(R$id.travelTrainRouteDropDownViewType, TravelTrainRouteDropDownAdapterDelegateKt.travelTrainRouteDropDownAdapterDelegate(function0));
    }
}
