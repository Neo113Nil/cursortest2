package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter;

import I.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.view.PricesHistogramV2ItemView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2DaysAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2DaysViewHolder;", "Lkotlin/Function1;", "", "", "onDayClickCallback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2DaysViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2DaysViewHolder;I)V", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "newList", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "submitList", "(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "colors", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "getColors", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "setColors", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;)V", "", "isDirect", "Z", "()Z", "setDirect", "(Z)V", "items", "Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramV2DaysAdapter extends RecyclerView.g<PricesHistogramV2DaysViewHolder> {
    public PricesHistogramV2VO.AvailableColorsVO colors;
    private boolean isDirect;

    @NotNull
    private List<PricesHistogramV2VO.DayVO> items;

    @NotNull
    private final Function1<Integer, Unit> onDayClickCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public PricesHistogramV2DaysAdapter(@NotNull Function1<? super Integer, Unit> onDayClickCallback) {
        Intrinsics.checkNotNullParameter(onDayClickCallback, "onDayClickCallback");
        this.onDayClickCallback = onDayClickCallback;
        this.items = K.f71697a;
    }

    @NotNull
    public final PricesHistogramV2VO.AvailableColorsVO getColors() {
        PricesHistogramV2VO.AvailableColorsVO availableColorsVO = this.colors;
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

    public final void setColors(@NotNull PricesHistogramV2VO.AvailableColorsVO availableColorsVO) {
        Intrinsics.checkNotNullParameter(availableColorsVO, "<set-?>");
        this.colors = availableColorsVO;
    }

    public final void setDirect(boolean z11) {
        this.isDirect = z11;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<PricesHistogramV2VO.DayVO> newList, @NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.items = newList;
        recyclerView.post(new j(this, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PricesHistogramV2DaysViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), getColors(), this.isDirect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PricesHistogramV2DaysViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        linearLayout.setGravity(81);
        Intrinsics.f(context);
        PricesHistogramV2ItemView pricesHistogramV2ItemView = new PricesHistogramV2ItemView(context, null, 0, 0, 14, null);
        pricesHistogramV2ItemView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(pricesHistogramV2ItemView);
        return new PricesHistogramV2DaysViewHolder(linearLayout, this.onDayClickCallback);
    }
}
