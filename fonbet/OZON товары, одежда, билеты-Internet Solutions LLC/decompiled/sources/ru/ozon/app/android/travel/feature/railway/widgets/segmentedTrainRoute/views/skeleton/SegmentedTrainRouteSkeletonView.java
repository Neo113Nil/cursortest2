package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views.skeleton;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/skeleton/SegmentedTrainRouteSkeletonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "dp16", "dp18", "dp22", "transfer", "Landroid/view/View;", "transferHeader", "transferStops", "bind", "", "hasTransfer", "", "ensureTransferViewsCreated", "addViews", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteSkeletonView extends LinearLayout {
    private final int dp12;
    private final int dp16;
    private final int dp18;
    private final int dp22;
    private final int dp8;
    private View transfer;
    private View transferHeader;
    private View transferStops;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedTrainRouteSkeletonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp18 = ResourceExtKt.toPx(18, context);
        this.dp22 = ResourceExtKt.toPx(22, context);
        setOrientation(1);
        addViews();
    }

    private final void addViews() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View segmentedTrainRouteHeaderSkeletonView = new SegmentedTrainRouteHeaderSkeletonView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = this.dp16;
        layoutParams.rightMargin = i11;
        layoutParams.leftMargin = i11;
        layoutParams.topMargin = this.dp18;
        segmentedTrainRouteHeaderSkeletonView.setLayoutParams(layoutParams);
        addView(segmentedTrainRouteHeaderSkeletonView);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View segmentedTrainRouteStopsSkeletonView = new SegmentedTrainRouteStopsSkeletonView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i12 = this.dp8;
        layoutParams2.rightMargin = i12;
        layoutParams2.leftMargin = i12;
        layoutParams2.topMargin = this.dp12;
        segmentedTrainRouteStopsSkeletonView.setLayoutParams(layoutParams2);
        addView(segmentedTrainRouteStopsSkeletonView);
    }

    private final void ensureTransferViewsCreated() {
        if (this.transfer == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
            Context context2 = roundedShimmerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ResourceExtKt.toPx(44, context2));
            int i11 = this.dp16;
            layoutParams.rightMargin = i11;
            layoutParams.leftMargin = i11;
            layoutParams.topMargin = i11;
            roundedShimmerView.setLayoutParams(layoutParams);
            Context context3 = roundedShimmerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            roundedShimmerView.setCornerRadius(ResourceExtKt.toPxF(16, context3));
            addView(roundedShimmerView);
            this.transfer = roundedShimmerView;
        }
        if (this.transferHeader == null) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            View segmentedTrainRouteHeaderSkeletonView = new SegmentedTrainRouteHeaderSkeletonView(context4);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            int i12 = this.dp16;
            layoutParams2.rightMargin = i12;
            layoutParams2.leftMargin = i12;
            layoutParams2.topMargin = this.dp22;
            segmentedTrainRouteHeaderSkeletonView.setLayoutParams(layoutParams2);
            addView(segmentedTrainRouteHeaderSkeletonView);
            this.transferHeader = segmentedTrainRouteHeaderSkeletonView;
        }
        if (this.transferStops == null) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            View segmentedTrainRouteStopsSkeletonView = new SegmentedTrainRouteStopsSkeletonView(context5);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int i13 = this.dp8;
            layoutParams3.rightMargin = i13;
            layoutParams3.leftMargin = i13;
            layoutParams3.topMargin = this.dp12;
            segmentedTrainRouteStopsSkeletonView.setLayoutParams(layoutParams3);
            addView(segmentedTrainRouteStopsSkeletonView);
            this.transferStops = segmentedTrainRouteStopsSkeletonView;
        }
    }

    public final void bind(boolean hasTransfer) {
        if (hasTransfer) {
            ensureTransferViewsCreated();
        }
        View view = this.transfer;
        if (view != null) {
            view.setVisibility(hasTransfer ? 0 : 8);
        }
        View view2 = this.transferHeader;
        if (view2 != null) {
            view2.setVisibility(hasTransfer ? 0 : 8);
        }
        View view3 = this.transferStops;
        if (view3 != null) {
            view3.setVisibility(hasTransfer ? 0 : 8);
        }
    }
}
