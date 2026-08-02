package ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.TravelModalPersonalManagerVO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/adapter/TravelModalPersonalManagerAdvantageAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO$AdvantageVO;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelModalPersonalManagerAdvantageAdapter extends AsyncListDifferDelegationAdapter<TravelModalPersonalManagerVO.AdvantageVO> {
    public TravelModalPersonalManagerAdvantageAdapter() {
        super(new i.d<TravelModalPersonalManagerVO.AdvantageVO>() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.adapter.TravelModalPersonalManagerAdvantageAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelModalPersonalManagerVO.AdvantageVO oldItem, TravelModalPersonalManagerVO.AdvantageVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelModalPersonalManagerVO.AdvantageVO oldItem, TravelModalPersonalManagerVO.AdvantageVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        this.delegatesManager.addDelegate(TravelModalPersonalManagerAdvantageAdapterDelegateKt.travelModalPersonalManagerAdapterDelegate());
    }
}
