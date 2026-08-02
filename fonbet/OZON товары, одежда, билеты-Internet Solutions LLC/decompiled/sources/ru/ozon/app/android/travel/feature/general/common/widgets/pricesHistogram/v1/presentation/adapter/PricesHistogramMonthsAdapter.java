package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.adapter;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$layout;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PricesHistogramMonthsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PriceHistogramMonthsViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PriceHistogramMonthsViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PriceHistogramMonthsViewHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO;", "newValue", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramMonthsAdapter extends RecyclerView.g<PriceHistogramMonthsViewHolder> {

    @NotNull
    private List<PricesHistogramVO.MonthVO> items = K.f71697a;

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<PricesHistogramVO.MonthVO> newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.items = newValue;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PriceHistogramMonthsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (position == 0 || position == getCardsCount() - 1) {
            holder.bind(this.items.get(position), true);
        } else {
            holder.bind(this.items.get(position), false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PriceHistogramMonthsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new PriceHistogramMonthsViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_prices_histogram_month));
    }
}
