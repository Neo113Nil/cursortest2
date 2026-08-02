package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.adapter;

import Bl.b;
import Nk.a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view.RailwaySearchResultsV3TypePriceView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/adapter/RailwaySearchResultsV3TypePriceAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$CarriageTypeVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/adapter/RailwaySearchResultsV3TypePriceViewHolder;", "<init>", "()V", "Landroid/content/Context;", "parentContext", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TypePriceView;", "getView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/view/RailwaySearchResultsV3TypePriceView;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/adapter/RailwaySearchResultsV3TypePriceViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/adapter/RailwaySearchResultsV3TypePriceViewHolder;I)V", "getItemViewType", "(I)I", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwaySearchResultsV3TypePriceAdapter extends t<TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO, RailwaySearchResultsV3TypePriceViewHolder> {
    public RailwaySearchResultsV3TypePriceAdapter() {
        super(new i.d<TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO>() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.adapter.RailwaySearchResultsV3TypePriceAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO oldItem, TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO oldItem, TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    private final RailwaySearchResultsV3TypePriceView getView(Context parentContext) {
        RailwaySearchResultsV3TypePriceView railwaySearchResultsV3TypePriceView = (RailwaySearchResultsV3TypePriceView) b.a(RailwaySearchResultsV3TypePriceView.class, "type", q.f64554a, null);
        return railwaySearchResultsV3TypePriceView == null ? new RailwaySearchResultsV3TypePriceView(parentContext) : railwaySearchResultsV3TypePriceView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.travelRailwaySearchResultsV3TypePrice;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RailwaySearchResultsV3TypePriceViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelRailwaySearchResultsV3TrainVO.CarriageTypeVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RailwaySearchResultsV3TypePriceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        RailwaySearchResultsV3TypePriceView view = getView(a.a(parent, "parent", "getContext(...)"));
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new RailwaySearchResultsV3TypePriceViewHolder(view);
    }
}
