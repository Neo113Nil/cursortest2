package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.adapter.shimmer;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.view.RailwayScrollPriceCalendarShimmerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/shimmer/RailwayScrollPriceCalendarShimmerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/shimmer/RailwayScrollPriceCalendarShimmerItemViewViewHolder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/view/RailwayScrollPriceCalendarShimmerView;", "getOrCreateView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/view/RailwayScrollPriceCalendarShimmerView;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/shimmer/RailwayScrollPriceCalendarShimmerItemViewViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/adapter/shimmer/RailwayScrollPriceCalendarShimmerItemViewViewHolder;I)V", "dp10", "I", "dp12", "dp56", "dp100", "shimmersCount", "getShimmersPositionInCenter", "shimmersPositionInCenter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayScrollPriceCalendarShimmerAdapter extends RecyclerView.g<RailwayScrollPriceCalendarShimmerItemViewViewHolder> {
    private final int dp10;
    private final int dp100;
    private final int dp12;
    private final int dp56;
    private final int shimmersCount;

    public RailwayScrollPriceCalendarShimmerAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(10, context);
        this.dp10 = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        this.dp56 = ResourceExtKt.toPx(56, context);
        int px3 = ResourceExtKt.toPx(100, context);
        this.dp100 = px3;
        this.shimmersCount = ((context.getResources().getDisplayMetrics().widthPixels - (px2 * 2)) / (px3 + px)) + 2;
    }

    private final RailwayScrollPriceCalendarShimmerView getOrCreateView(Context context) {
        RailwayScrollPriceCalendarShimmerView railwayScrollPriceCalendarShimmerView = (RailwayScrollPriceCalendarShimmerView) q.f64554a.i(N.b(RailwayScrollPriceCalendarShimmerView.class), context);
        return railwayScrollPriceCalendarShimmerView == null ? new RailwayScrollPriceCalendarShimmerView(context) : railwayScrollPriceCalendarShimmerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount, reason: from getter */
    public int getShimmersCount() {
        return this.shimmersCount;
    }

    public final int getShimmersPositionInCenter() {
        return this.shimmersCount / 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RailwayScrollPriceCalendarShimmerItemViewViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RailwayScrollPriceCalendarShimmerItemViewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.f(context);
        RailwayScrollPriceCalendarShimmerView orCreateView = getOrCreateView(context);
        orCreateView.setLayoutParams(new LinearLayout.LayoutParams(this.dp100, this.dp56));
        int i11 = this.dp12;
        int i12 = this.dp10;
        orCreateView.setPadding(i11, i12, i11, i12);
        return new RailwayScrollPriceCalendarShimmerItemViewViewHolder(orCreateView);
    }
}
