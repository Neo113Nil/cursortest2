package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.price;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view.TravelRailwaySearchResultsV4TypePriceView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/price/TravelRailwaySearchResultsV4TypePriceAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/price/TravelRailwaySearchResultsV4TypePriceViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/price/TravelRailwaySearchResultsV4TypePriceViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/price/TravelRailwaySearchResultsV4TypePriceViewHolder;I)V", "getItemViewType", "(I)I", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4TypePriceAdapter extends t<TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO, TravelRailwaySearchResultsV4TypePriceViewHolder> {
    public TravelRailwaySearchResultsV4TypePriceAdapter() {
        super(new i.d<TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO>() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.price.TravelRailwaySearchResultsV4TypePriceAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO oldItem, TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO oldItem, TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.travelRailwaySearchResultsV4TypePrice;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TravelRailwaySearchResultsV4TypePriceViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TravelRailwaySearchResultsV4TypePriceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelRailwaySearchResultsV4TypePriceView travelRailwaySearchResultsV4TypePriceView = new TravelRailwaySearchResultsV4TypePriceView(context);
        travelRailwaySearchResultsV4TypePriceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new TravelRailwaySearchResultsV4TypePriceViewHolder(travelRailwaySearchResultsV4TypePriceView);
    }
}
