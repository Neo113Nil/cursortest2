package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.view.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.presentation.FlightSeatsLegendV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.view.FlightSeatsLegendV2SeatTypeView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/view/adapter/FlightSeatsLegendV2SeatTypeAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI$SeatTypeV2VI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/view/adapter/FlightSeatsLegendV2SeatTypeViewHolder;", "<init>", "()V", "holder", "", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/view/adapter/FlightSeatsLegendV2SeatTypeViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/view/adapter/FlightSeatsLegendV2SeatTypeViewHolder;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsLegendV2SeatTypeAdapter extends t<FlightSeatsLegendV2VI.SeatTypeV2VI, FlightSeatsLegendV2SeatTypeViewHolder> {
    public FlightSeatsLegendV2SeatTypeAdapter() {
        super(new i.d<FlightSeatsLegendV2VI.SeatTypeV2VI>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.view.adapter.FlightSeatsLegendV2SeatTypeAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(FlightSeatsLegendV2VI.SeatTypeV2VI oldItem, FlightSeatsLegendV2VI.SeatTypeV2VI newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(FlightSeatsLegendV2VI.SeatTypeV2VI oldItem, FlightSeatsLegendV2VI.SeatTypeV2VI newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FlightSeatsLegendV2SeatTypeViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FlightSeatsLegendV2VI.SeatTypeV2VI item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FlightSeatsLegendV2SeatTypeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FlightSeatsLegendV2SeatTypeView flightSeatsLegendV2SeatTypeView = new FlightSeatsLegendV2SeatTypeView(context);
        flightSeatsLegendV2SeatTypeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new FlightSeatsLegendV2SeatTypeViewHolder(flightSeatsLegendV2SeatTypeView);
    }
}
