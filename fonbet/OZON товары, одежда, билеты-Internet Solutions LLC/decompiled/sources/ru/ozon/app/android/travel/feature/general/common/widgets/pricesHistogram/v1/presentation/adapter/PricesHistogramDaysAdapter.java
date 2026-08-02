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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR6\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PricesHistogramDaysAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PriceHistogramDaysViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PriceHistogramDaysViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PriceHistogramDaysViewHolder;I)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "colors", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "getColors", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "setColors", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;)V", "", "haveDirectionTo", "Z", "getHaveDirectionTo", "()Z", "setHaveDirectionTo", "(Z)V", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "newValue", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramDaysAdapter extends RecyclerView.g<PriceHistogramDaysViewHolder> {
    public PricesHistogramVO.AvailableColorsVO colors;
    private boolean haveDirectionTo;

    @NotNull
    private List<PricesHistogramVO.MonthVO.DayVO> items = K.f71697a;

    @NotNull
    public final PricesHistogramVO.AvailableColorsVO getColors() {
        PricesHistogramVO.AvailableColorsVO availableColorsVO = this.colors;
        if (availableColorsVO != null) {
            return availableColorsVO;
        }
        Intrinsics.n("colors");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final void setColors(@NotNull PricesHistogramVO.AvailableColorsVO availableColorsVO) {
        Intrinsics.checkNotNullParameter(availableColorsVO, "<set-?>");
        this.colors = availableColorsVO;
    }

    public final void setHaveDirectionTo(boolean z11) {
        this.haveDirectionTo = z11;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<PricesHistogramVO.MonthVO.DayVO> newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.items = newValue;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PriceHistogramDaysViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), getColors(), this.haveDirectionTo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PriceHistogramDaysViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new PriceHistogramDaysViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_prices_histogram_day));
    }
}
