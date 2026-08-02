package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListFlightVI;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/adapter/AviaFavoriteListTripRouteAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI$TransferVI;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/adapter/AviaFavoriteListTransferViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/adapter/AviaFavoriteListTransferViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/adapter/AviaFavoriteListTransferViewHolder;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListTripRouteAdapter extends t<AviaFavoriteListFlightVI.TripRouteVI.TransferVI, AviaFavoriteListTransferViewHolder> {
    public AviaFavoriteListTripRouteAdapter() {
        super(new i.d<AviaFavoriteListFlightVI.TripRouteVI.TransferVI>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view.adapter.AviaFavoriteListTripRouteAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AviaFavoriteListFlightVI.TripRouteVI.TransferVI oldItem, AviaFavoriteListFlightVI.TripRouteVI.TransferVI newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AviaFavoriteListFlightVI.TripRouteVI.TransferVI oldItem, AviaFavoriteListFlightVI.TripRouteVI.TransferVI newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AviaFavoriteListTransferViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AviaFavoriteListFlightVI.TripRouteVI.TransferVI item = getItem(position);
        Intrinsics.f(item);
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AviaFavoriteListTransferViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        horizontalAtomsLayout.setGravity(8388629);
        return new AviaFavoriteListTransferViewHolder(horizontalAtomsLayout);
    }
}
