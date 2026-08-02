package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.TravelRoomAndGuestsVO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/compactVersion/adapter/TravelRoomAndGuestsCompactAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO;", "<init>", "()V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRoomAndGuestsCompactAdapter extends AsyncListDifferDelegationAdapter<TravelRoomAndGuestsVO> {
    public TravelRoomAndGuestsCompactAdapter() {
        super(new i.d<TravelRoomAndGuestsVO>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion.adapter.TravelRoomAndGuestsCompactAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelRoomAndGuestsVO oldItem, TravelRoomAndGuestsVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelRoomAndGuestsVO oldItem, TravelRoomAndGuestsVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getId(), newItem.getId());
            }
        });
        this.delegatesManager.addDelegate(TravelRoomAndGuestsCompactAdapterDelegateKt.travelRoomAndGuestsCompactAdapterDelegate());
    }
}
