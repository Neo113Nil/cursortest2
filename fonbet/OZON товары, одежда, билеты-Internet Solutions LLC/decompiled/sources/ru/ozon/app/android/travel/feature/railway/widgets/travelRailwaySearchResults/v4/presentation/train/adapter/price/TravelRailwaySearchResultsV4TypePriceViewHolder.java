package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.adapter.price;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view.TravelRailwaySearchResultsV4TypePriceView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/adapter/price/TravelRailwaySearchResultsV4TypePriceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TypePriceView;", "priceView", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TypePriceView;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TypePriceView;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4TypePriceViewHolder extends RecyclerView.C {

    @NotNull
    private final TravelRailwaySearchResultsV4TypePriceView priceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySearchResultsV4TypePriceViewHolder(@NotNull TravelRailwaySearchResultsV4TypePriceView priceView) {
        super(priceView);
        Intrinsics.checkNotNullParameter(priceView, "priceView");
        this.priceView = priceView;
    }

    public final void bind(@NotNull TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.priceView.bind(item);
    }
}
